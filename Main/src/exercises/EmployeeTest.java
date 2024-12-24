package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.print("Quantos funcionarios deseja cadastrar? ");
        int n = sc.nextInt();

        // pegar ID, NameEmployee, salary, mandar para a lista e fazer a iteração/verificação
        // do id digitado com o for().
        for(int i = 1; i <= n; i++) {
            System.out.println("Employee: #"+i+":");
            System.out.println();

            System.out.print("id: ");
            int idEmployee = sc.nextInt();

            while (hasId(list, n)) {
                System.out.println("ID já foi obtido: ");
                idEmployee = sc.nextInt();
            }

            // pegando o nome e salario
            System.out.print("name: ");
            String nameEmployee = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            // mandando para a lista
            list.add(new Employee(nameEmployee, salary, idEmployee));

        }

        System.out.println();
        System.out.println("Informe o ID do funcionário que terá aumento salarial");
        int idd = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getIdEmployee() == idd).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Esse ID não existe. ");
        } else {
            System.out.print("Informe a porcentagem de aumento: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }
        System.out.println();
        System.out.println("Lista de funcionarios: ");
        for (Employee obj: list) {
            System.out.println(obj);
        }
        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getIdEmployee() == id).findFirst().orElse(null);
        return emp != null;
    }
}
