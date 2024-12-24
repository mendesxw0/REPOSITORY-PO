package exercises;

public class Employee {
    private String nameEmployee;
    private Integer idEmployee;
    private Double salaryEmployee;

    public String getNameEmployee() {
        return nameEmployee;
    }

    public Double getSalaryEmployee() {
        return salaryEmployee;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setSalaryEmployee(Double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public Employee(String nameEmployee, Double salaryEmployee, Integer idEmployee) {
        this.nameEmployee = nameEmployee;
        this.salaryEmployee = salaryEmployee;
        this.idEmployee = idEmployee;
    }
    
    public void increaseSalary(double percentage) {
        salaryEmployee += salaryEmployee * percentage / 100.0;
    }

    public String toString() {
        return idEmployee + ", " + idEmployee + ", " + String.format("%.2f", salaryEmployee);
    }
}
