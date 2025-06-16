public class Door {
    String door;
    boolean isDoorOpen;

    void openDoor(){
        isDoorOpen = true;
        int test;
    }

    void closeDoor(){
        isDoorOpen = false;
    }

    void printStatus(){
        if (isDoorOpen){
            System.out.println(door + " door is open");
        }
        else {
            System.out.println(door + " door is closed");
        }
    }
}
