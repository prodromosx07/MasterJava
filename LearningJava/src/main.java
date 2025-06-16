import Composition.Student;
import Composition.StudentCourse;
import Enmus.IdentifySeason;
import Enmus.Month;

public class main {
    public static void main(String[] args) {
        //call anyclass alongside a method you want here
        Season();
    }

    public static void Season(){
        IdentifySeason.whichSeason(6);
        IdentifySeason.whichSeasonUsingEnum(Month.JUNE);
    }

    public static void Student(){
        Student student = new Student();
        student.setName("Joe Doe");
        student.setHasStudentHousing(false);
        student.setDateOfBirth("10/12/2003");

        //enroll the "student"
        student.course = new StudentCourse();
        student.course.title = "Computer Science";
        student.course.level = "Undergraduate";
        student.course.startDate = "10/10/2024";


        System.out.println("Composition.Student: " + student.getName() + " who was born on " + student.getDateOfBirth() + (student.getHasStudentHousing() ? " has student housing" : " doesn't have student housing"));
        System.out.println("The student with the name of " + student.getName() + " is enrolled in the course of " + student.course.title + " that is anticipated to start on " + student.course.startDate + ". The course level is " + student.course.level + ".");
    }

    public static void Rectangle(){
        Rectangle r1  = new Rectangle(5, 10);
        Rectangle r2  = new Rectangle(20, 25);

        System.out.println(r1.getHeight() + " " + r1.getWidth());
        System.out.println(r2.getHeight() + " " + r2.getWidth());

    }

    public void DoorExample(){
        Door driversDoor = new Door();
        driversDoor.door = "Driver's Door";
        driversDoor.openDoor();
        driversDoor.printStatus();

        Door passengerDoor = new Door();
        passengerDoor.door = "Passenger's Door";
        passengerDoor.closeDoor();
        passengerDoor.printStatus();
    }
}



