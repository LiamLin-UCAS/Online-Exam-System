package Person;

public class Student extends Person{
    private String stuClass;
    public Student(String theID, String theName, String thePassword,String theStuClass){
        super(theID,theName,thePassword);
        this.stuClass=theStuClass;
    }
}
