package Question;

public class SubjectQuestion extends Question{
    public SubjectQuestion(String theID,int theScore,double theDiff,String theContent,String theAnswer){
        super(theID,theScore,theDiff,theContent,theAnswer);
        this.type=true;
    }
}
