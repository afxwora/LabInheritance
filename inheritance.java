
class inheritance{
    public static void main(String[] args){
        Manager manager = new Manager("John Doe", 40, 123, 50000, "IT");
        Programmer programmer = new Programmer("Jane Smith", 30, 456, 40000, "Java");
        Security security = new Security("Adam Jonse", 45, 789, 18000, "Night");

        manager.DisplayDetails();
        manager.Work();
        manager.CallMeeting();

        programmer.DisplayDetails();
        programmer.Work();
        programmer.Coding();

        security.DisplayDetails();
        security.Work();
        security.Patrol();
    }
}
class Employee{
    public int Employee_ID;
    public String Name;
    public int Age;
    public int Salary;


    Employee(String Name , int Age , int Employee_ID , int Salary){
        this.Name = Name;
        this.Age = Age;
        this.Employee_ID = Employee_ID;
        this.Salary = Salary;
    }

    public void Work(){
        System.out.println(this.Name +"is working");
    }
    public void DisplayDetails(){
        System.out.println("**************************************");
        System.out.println("Name : " + this.Name);
        System.out.println("Age : " + this.Age);
        System.out.println("Employee ID : " + this.Employee_ID);
        System.out.println("Salary : " + this.Salary);
    }
}

class Manager extends Employee{
    public String Department;
    Manager(String Name , int Age , int Employee_ID , int Salary , String Department){
        super(Name, Age, Employee_ID, Salary);
        this.Department = Department;
    }
    public void CallMeeting(){
        System.out.println(this.Name + " is scheduling a meeting");
    }
    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Department : " + this.Department);
    }
}

class Programmer extends Employee{
    public String Language;
    Programmer(String Name , int Age , int Employee_ID , int Salary , String Language){
        super(Name, Age, Employee_ID, Salary);
        this.Language = Language;
    }
    public void Coding(){
        System.out.println(this.Name + " is coding");
    }
    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Language : " + this.Language);
    }
}

class Security extends Employee{
    public String Shift;
    Security(String Name , int Age , int Employee_ID , int Salary , String Shift){
        super(Name, Age, Employee_ID, Salary);
        this.Shift = Shift;
    }
    public void Patrol(){
        System.out.println(this.Name + " is patroling");
    }
    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Avaliable at " + this.Shift + " Shift");
    }
}