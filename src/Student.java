
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imad9
 */
public class Student extends Subjects {
    conn con = new conn();
    PreparedStatement st ;
    ResultSet rs ;
    public String Student_ID;
    public String Name;
    public String Surname;
    public String Course;
    public String Branch;
    public String Year;
    public String Semester;
    

    @Override
    public void Create() {
        String sql = "insert into Student(Student_ID,Name,Surname,Course,Branch,Year,Semester) values(?,?,?,?,?,?,?)";
        try{
            st = con.c.prepareStatement(sql);
            st.setString(1,Student_ID); 
            st.setString(2,Name);
            st.setString(3,Surname);
            st.setString(4,Course);
            st.setString(5,Branch);
            st.setString(6,Year);
            st.setString(7,Semester);
            st.execute();
            JOptionPane.showMessageDialog(null,"New Student registered");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Some Fields are missing");
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete() {
        String sql = "Delete from Student where Student_ID=?";
        try{
            st=con.c.prepareStatement(sql);
            st.setString(1,Student_ID);
            st.execute();
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, e);
        }//To change body of generated methods, choose Tools | Templates.
    }
    
}
