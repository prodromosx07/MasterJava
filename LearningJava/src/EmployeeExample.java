public class EmployeeExample {
    String name;
    int age;
    String jobTitle;

    public static void Employees(){
        EmployeeExample employee1 = new EmployeeExample();
        EmployeeExample employee2 = new EmployeeExample();
        EmployeeExample employee3 = new EmployeeExample();

        employee1.name = "Mike";
        employee1.age = 43;
        employee1.jobTitle = "Popular Youtube Streamer";

        employee2.name = "Red Dragon";
        employee2.age = 60;
        employee2.jobTitle = "Content Creator";

        employee3.name = "Dog";
        employee3.age = 3;
        employee3.jobTitle = "Barking";

        bar(employee1);
    }
    static void bar(EmployeeExample employee){
        System.out.println(employee.name + " is " + employee.age + " years old and he is a " + employee.jobTitle );
    }
}
