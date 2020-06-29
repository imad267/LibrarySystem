
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imad9
 */
public class Book extends Subjects{

    conn con = new conn();
    PreparedStatement st ;
    ResultSet rs ;   
    
    public String Book_ID ;
    
    public String Name; 
    public String Edition;
    public String Publicher;
    public String Price ;
    public String Pages;
    public String Student_ID;
    public String FName;
    public String LName;
    public String Course;
    public String Branch;
    public String Year;
    public String Semester;
    public String DateOfIssue;
    public String DOR;

    @Override
    public void Create() {
        String sql = "insert into Book(Book_ID,Name,Edition,Publicher,Price,Pages) values (?,?,?,?,?,?)";
        try{
            st = con.c.prepareStatement(sql);
            st.setString(1,Book_ID); 
            st.setString(2,Name);
            st.setString(3,Edition);
            st.setString(4,Publicher);
            st.setString(5,Price);
            st.setString(6,Pages);
            st.execute();
            JOptionPane.showMessageDialog(null,"New book registered");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void Issue(){
        String sql = "insert into IssueBook (Book_ID,Name,Edition,Publicher,Price,Pages,Student_ID,FName,LName,Course,Branch,Year,Semester,DateOfIssue) values"
                + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            st = con.c.prepareStatement(sql);
            st.setString(1,Book_ID); 
            st.setString(2,Name);
            st.setString(3,Edition);
            st.setString(4,Publicher);
            st.setString(5,Price);
            st.setString(6,Pages);
            st.setString(7,Student_ID);
            st.setString(8,FName);
            st.setString(9,LName);
            st.setString(10,Course);
            st.setString(11,Branch);
            st.setString(12,Year);
            st.setString(13,Semester);
            st.setString(14,DateOfIssue);
            st.execute();
            JOptionPane.showMessageDialog(null,"Book Issued");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } //To change body of generated methods, choose Tools | Templates.
        
    }
    
    @Override
    public void Delete() {
        String sql = "delete from IssueBook where Student_ID=?";
        try{
            st=con.c.prepareStatement(sql);
            st.setString(1,Student_ID);
            st.execute();
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, e);
        } //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void Update(){
        String sql = "insert into ReturnBook (Student_ID,FName,LName,Course,Branch,Year,Semester,Book_ID,Name,Edition,Publicher,Price,Pages,DOI,DOR) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            st= con.c.prepareStatement(sql);
            st.setString(1, Student_ID);
            st.setString(2, FName);
            st.setString(3, LName);
            st.setString(4, Course);
            st.setString(5, Branch);
            st.setString(6, Year);
            st.setString(7, Semester);
            st.setString(8,Book_ID);
            st.setString(9, Name);
            st.setString(10, Edition);
            st.setString(11, Publicher);
            st.setString(12, Price);
            st.setString(13, Pages);
            st.setString(14, DateOfIssue);
            st.setString(15,DOR);
            st.execute();
            JOptionPane.showMessageDialog(null, "Book has been returned");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
}
