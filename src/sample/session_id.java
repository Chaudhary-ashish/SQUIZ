package sample;

public class Session_Id {
    private static String user_id;
    private static String test_id;
    private static int no_of_questions;
    private static int no_of_sections;
    private static String section_id;
    private static int marks;
    private static String[] sections;
    private static int section_no;
    private static int marksgainedpersection[];
    private static int questionspersection[];
    public static String[] getSections(){
        return Session_Id.sections;
    }
    public static void setSections(String []sections){
        Session_Id.sections = sections;
    }
    public static void setMarksgainedpersection(int a[]){
        Session_Id.marksgainedpersection = a;
    }
    public static int[] getMarksgainedpersection(){
        return Session_Id.marksgainedpersection;
    }
    public static void setmarksforsection(int m,int section_no){
        Session_Id.marksgainedpersection[section_no] = m;
    }
    public static void setquestionsforsection(int q,int section_no){
        Session_Id.questionspersection[section_no] = q;
    }

    public static void setQuestionspersection(int a[]){
        Session_Id.questionspersection = a;
    }
    public static int[] getQuestionspersection(){
        return Session_Id.questionspersection;
    }

    public static int getMarks(){
        return Session_Id.marks;

    }
    public static int getSection_No(){
        return Session_Id.section_no;
    }
    public static void setSection_no(int x){
        Session_Id.section_no = x;
    }
    public static void setMarks(int marks){
        Session_Id.marks = marks;
    }
    public static void setUsername(String username){
        Session_Id.user_id= username;
    }

    public static String getUsername(){
        return Session_Id.user_id;
    }
    public static String getTest_id(){
        return Session_Id.test_id;
    }
    public static void setTest_id(String test_id){
        Session_Id.test_id = test_id;
    }
    public static void setNo_of_questions(int no_of_questions){
        Session_Id.no_of_questions = no_of_questions;
    }
    public static int getNo_of_questions(){
        return Session_Id.no_of_questions;
    }
    public static int getNo_of_sections(){
        return Session_Id.no_of_sections;
    }
    public static void setNo_of_sections(int no_of_sections){
        Session_Id.no_of_sections = no_of_sections;
    }
    public static String getSection_id(){
        return Session_Id.section_id;
    }
    public static void setSection_id(String section_id){
        Session_Id.section_id = section_id;
    }
}
