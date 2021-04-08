package Question;

import java.io.Serializable;

public abstract class Question implements Serializable {//林弘毅编辑于2021.4.8//下次修改记得删掉这个
    protected String questionID;
    protected int score;
    protected double difficulty;
    protected String content;
    protected String answer;
    protected boolean type;//type为true时，为做答题；为false时为客观题
    public abstract boolean display();//前端考虑添加这样的方法（这个方法仲深来写，因为需要前端的展示）
    public Question(String theID,int theScore,double theDiff,String theContent,String theAnswer){
        this.questionID=theID;
        this.score=theScore;
        this.difficulty=theDiff;
        this.content=theContent;
        this.answer=theAnswer;
    }
}
