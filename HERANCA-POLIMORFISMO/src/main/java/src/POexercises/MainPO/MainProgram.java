package src.POexercises.MainPO;
import src.POexercises.Employee;
import src.POexercises.OutsourceEmploee;
import  java.util.Scanner;
import  java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a quantidade de funcionarios: ");
        Integer newInteger = sc.nextInt();

        ArrayList<Employee> listN = new ArrayList<>();

        for (int i = 1; i <= newInteger; i++) {
            System.out.print("O funcionario é terceirzado?  ");
            char caractereUnique = sc.next().charAt(0);
            System.out.println("Nome do funcionario: ");
            String nameEmploy = sc.next();
            System.out.println("Quantidade de horas trabalhadas: ");
            Integer hoursEmployee = sc.nextInt();
            System.out.println("Valor por hora trabalhada: ");
            Double hours = sc.nextDouble();

            if (caractereUnique == 'y') {
                System.out.println("Custo adicional do funcionario: ");
                Double valueAddEmployee =  sc.nextDouble();
                Employee emp = new OutsourceEmploee(nameEmploy, hoursEmployee, hours, valueAddEmployee);
                listN.add(emp);
            }

            Employee emp = new Employee(nameEmploy, hoursEmployee, hours);
            listN.add(emp);
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : listN) {
            System.out.println(emp.getNameEmploy() + " - $ " + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}
