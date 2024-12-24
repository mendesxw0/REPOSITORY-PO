

package src.exercise;
import src.ENUMS.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Digite sua profissão: ");
        String profissaoUser = sc.nextLine();

        System.out.println("Insira os dados do "+profissaoUser+": ");
        System.out.print("Nome do trabalhador: ");
        String nameUser = sc.nextLine();

        System.out.println("nivel doo carg ocupado: ");
        String workerLevel = sc.nextLine();

        System.out.print("Salario base: ");
        double salaryBase = sc.nextDouble();

        Worker newWorker = new Worker(nameUser, salaryBase, WorkerLevel.valueOf(workerLevel), new Departament(profissaoUser));
        System.out.println("Quantos contratos para este trabalhador? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Entre com o contrato #"+i+" :" );
            System.out.println("Digite uma data (xx/yy/xxxx): ");
            Date contratoUserDate = sfd.parse(sc.next());

            System.out.println("Valor por hora: ");
            double resultValueHors = sc.nextDouble();

            System.out.println("Quantidade de horas: ");
            int quantidadeDeHoras = sc.nextInt();

            ContratoPorHora contratoPorHora = new ContratoPorHora(contratoUserDate, quantidadeDeHoras, resultValueHors);
            newWorker.addContract(contratoPorHora);

        }

            System.out.println("Insira o mês e o ano para calcular a renda (dd/MM/yyyy)");
            String montf = sc.next();

            int month = Integer.parseInt(montf.substring(0,2));
            int month2 = Integer.parseInt(montf.substring(3));

            System.out.println("Name: " + newWorker.getName());
            System.out.println("Departamento: " + newWorker.getDepartament().getName());

        sc.close();

    }
}
