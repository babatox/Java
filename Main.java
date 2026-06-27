class Person{
    String name;
    int id;

    Person(String name,int id){
        this.name = name;
        this.id = id;
    }

    void register(){
        System.out.println("Person" + name +"with ID" + id + "is registered.");
    }
}

class Teacher extends Person{
    float salary;
    Teacher(String name, int id, float salary){
        super(name,id);
        this.salary=salary;
    }

@Override
    void register(){
        System.out.println("Teacher" + name +"with ID" + id + "is registered with salary💵💵" + salary);
    }
}class Student extends Person{
    String grade;
    Student(String name, int id, String grade){
        super(name,id);
        this.grade=grade;
    }

@Override
    void register(){
        System.out.println("Student" + name +"with ID" + id + "is registered with grade💯" + grade);

    }
}
public class Main {
    public static void main(String[] args) {
        Person p1 = new Student() ("John", 1, "B");
        Person p2 = new Teacher ("Alice", 2, 50000.0f);

        p1.register();
        p2.register();

    }
}