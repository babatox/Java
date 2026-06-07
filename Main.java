 class Employee{
    int Id_no;
    String name;
    float salary;

    //Constructor Method
    Employee(){
        System.out.println("****************");
        Id_no=2314;
        name="Penguin";
        salary=20000;

    }
    void display(){
        System.out.println(Id_no + " | " + name + " | " + salary);
    }
 }
 class Main{
    public static void main(String[] args){
        //Object creation
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();
        Employee emp4=new Employee();

        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
          
    }
 }