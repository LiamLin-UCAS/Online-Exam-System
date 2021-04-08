package Person;

public class Teacher extends Person{
    private String teachClass;
    public Teacher(String theID, String theName, String thePassword,String theTeachClass){
        super(theID,theName,thePassword);
        this.teachClass=theTeachClass;
    }
}
