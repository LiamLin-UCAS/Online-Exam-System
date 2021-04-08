package Person;

public abstract class Person {
    protected String ID;
    protected String name;
    protected String password;
    protected boolean loginStatus;
    public Person(String theID, String theName, String thePassword){
        this.ID=theID;
        this.name=theName;
        this.password=thePassword;
        this.loginStatus=false;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getPassword(){
        return password;
    }
    public boolean checkStatus(){
        return loginStatus;
    }
    public void setID(String newID){
        this.ID=newID;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public void setPassword(String newPassword){
        this.password=newPassword;
    }
    public void changeStatus(boolean newStatus){
        this.loginStatus=newStatus;
    }
}
