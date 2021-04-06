package Question;

import java.io.Serializable;

public abstract class Question implements Serializable {
    protected String questionID;
    protected int score;
    protected double difficulty;
    protected String content;
    protected String answer;
    protected boolean type;//type为true时，为做答题；为false时为客观题
    //public abstract boolean display();前端考虑添加这样的方法
    public Question(String theID,int theScore,double theDiff,String theContent,String theAnswer){
        this.questionID=theID;
        this.score=theScore;
        this.difficulty=theDiff;
        this.content=theContent;
        this.answer=theAnswer;
    }
}
