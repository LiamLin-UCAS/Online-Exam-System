package Person;

public abstract class Person {
    protected String ID;
    protected String name;
    protected String password;
    public Person(String theID, String theName, String thePassword){
        this.ID=theID;
        this.name=theName;
        this.password=thePassword;
    }
}
