package Question;

public class multiChoice extends Question{
    public multiChoice(String theID,int theScore,double theDiff,String theContent,String theAnswer){
        super(theID,theScore,theDiff,theContent,theAnswer);
        this.type=false;
    }
    @Override
    public boolean display() {
        return false;//在这里重写
    }
}
