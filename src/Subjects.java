
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imad9
 */
public abstract class Subjects {
    public int ID;
    
    public int set_ID(){
        Random rd=new Random();
        this.ID = rd.nextInt(1000+1);
        return ID;
        
    }
    
    
    public abstract void Create();
    
    public abstract void Delete();
    
    public void Update(){}
    
    public void Issue(){}
    public void Return(){
        Delete();
        Update();
    }
    
    
    
    
}
