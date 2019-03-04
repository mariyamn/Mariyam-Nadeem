public class Main {

    public static void main(String[]args) {

        Employee E1 = new Employee("  Bob Duncan", 001, 100);
        System.out.println("Employee ID: " + E1.getId() + "  Name: " + E1.getName()+ "  Salary: "+E1.getSalary());
        E1.raiseSalary(10);

       

    }



}



