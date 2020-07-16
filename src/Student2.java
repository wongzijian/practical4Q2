/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author End User
 */
public class Student2 {
    public static void main(String[] args) {
       
        Student s1 = new Student();
        s1.setName("Abu");
        s1.setStudentID("1988888");
        System.out.println("Name: "+ s1.getName() + "\nStudent ID: " + s1.getStudentID());
          
        Student s2 = new Student("19WNM8888","MKwen");
        System.out.println("Name: "+ s2.getName() + "\nStudent ID: " + s2.getStudentID());
        
        s1.addQuiz(10);
        
        s2.addQuiz(8);
        
        s1.addQuiz(9);
        
        s2.addQuiz(8);
        
        System.out.printf("%-15s %3d %3d %5.2f \n",s1.getName(),s1.getQuizTaken(),s1.getTotalScore(),s1.getAverageScore());     
        System.out.printf("%-15s %3d %3d %5.2f \n",s2.getName(),s2.getQuizTaken(),s2.getTotalScore(),s2.getAverageScore());
    }
}
