package Question;

public class MultiChoice extends Question{
    public MultiChoice(String theID,int theScore,double theDiff,String theContent,String theAnswer){
        super(theID,theScore,theDiff,theContent,theAnswer);
        this.type=false;
    }
}
