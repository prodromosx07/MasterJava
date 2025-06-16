package Composition;

public class Student {
    //Composition.Student name
    private String name;
    private String dateOfBirth;
    private boolean hasStudentHousing;
    public StudentCourse course;

    /*public Composition (int test){
        if(test == 1){
            hasStudentHousing = true;
        }
    }*/

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setHasStudentHousing(boolean hasStudentHousing){
        this.hasStudentHousing = hasStudentHousing;
    }

    public boolean getHasStudentHousing(){
        return hasStudentHousing;
    }

}
