public class Employee {

    private String name;
    private int Id;
    private int Salary;

    public Employee(String name, int Id, int Salary) {
        this.name = name;
        this.Id = Id;
        this.Salary = Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void raiseSalary(int percent) {
       Salary=Salary+ percent * 12 *Salary;
        //Salary += (Salary * 12);

    }
        public String toString(){
            return "Employee ID: "+ getId()+ " Name : " + getName()+ "\t"+" Salary: " +getSalary();



    }


}
