package DAO;

import Question.*;
import java.sql.*;

public class DatabaseMethod {
    private static Connection con;
    private static PreparedStatement pStmt;
    private static ResultSet rs;
    public static int login(String ID,String password){
        int identity=-1;
        try {
            con=JDBC.getConnection();
            String sql="select * from login where ID = ? and password = ?;";
            pStmt=con.prepareStatement(sql);
            pStmt.setString(1,ID);
            pStmt.setString(2,password);
            rs=pStmt.executeQuery();
            if(rs.next())
                identity=rs.getInt("identity");

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Database Driver Error!\n"+e);
        }finally {
            try {
                JDBC.close(rs,pStmt,con);
            } catch (SQLException e) {
                System.err.println("Database Close Error!");
            }
        }
        return identity;
    }
    public static Question[] displayRepo(){//展示全部题目
        int num,count=0;
        Question[] questions;
        try {
            con=JDBC.getConnection();
            String sql="select count(*) from repository";
            pStmt=con.prepareStatement(sql);
            rs=pStmt.executeQuery();
            num=rs.getInt(1);
            questions=new Question[num];
            sql="select * from repository;";
            pStmt=con.prepareStatement(sql);
            rs=pStmt.executeQuery();
            while(rs.next()){
                Question temp;
                String quesID=rs.getString("quesID");
                int score=rs.getInt("score");
                double diffIndex=rs.getDouble("diffIndex");
                String content=rs.getString("content");
                String answer=rs.getString("answer");
                String sType=rs.getString("type");
                if(sType.equals("true")){
                    temp=new subjectQuestion(quesID,score,diffIndex,content,answer);
                }
                else {
                    temp=new multiChoice(quesID,score,diffIndex,content,answer);
                }
                questions[count++]=temp;
            }
            return questions;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Database Driver Error!\n"+e);
        }finally {
            try {
                JDBC.close(rs,pStmt,con);
            } catch (SQLException e) {
                System.err.println("Database Close Error!");
            }
        }
        return null;
    }
    public static Question[] searchQues(String keyWord){//模糊搜索题目
        int num,count=0;
        Question[] questions;
        try {
            con=JDBC.getConnection();
            String sql="select count(*) from repository where content like '%"+keyWord+"%';";
            pStmt=con.prepareStatement(sql);
            rs=pStmt.executeQuery();
            num=rs.getInt(1);
            questions=new Question[num];
            sql="select * from repository where content like '%"+keyWord+"%';";
            pStmt=con.prepareStatement(sql);
            rs=pStmt.executeQuery();
            while(rs.next()){
                Question temp;
                String quesID=rs.getString("quesID");
                int score=rs.getInt("score");
                double diffIndex=rs.getDouble("diffIndex");
                String content=rs.getString("content");
                String answer=rs.getString("answer");
                String sType=rs.getString("type");
                if(sType.equals("true")){
                    temp=new subjectQuestion(quesID,score,diffIndex,content,answer);
                }
                else {
                    temp=new multiChoice(quesID,score,diffIndex,content,answer);
                }
                questions[count++]=temp;
            }
            return questions;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Database Driver Error!\n"+e);
        }finally {
            try {
                JDBC.close(rs,pStmt,con);
            } catch (SQLException e) {
                System.err.println("Database Close Error!");
            }
        }
        return null;
    }
}