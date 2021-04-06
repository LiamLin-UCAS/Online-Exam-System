package Question;

public class subjectQuestion extends Question{
    public subjectQuestion(String theID,int theScore,double theDiff,String theContent,String theAnswer){
        super(theID,theScore,theDiff,theContent,theAnswer);
        this.type=false;
    }
}
