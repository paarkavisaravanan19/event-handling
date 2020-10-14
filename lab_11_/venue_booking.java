/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_11_;

/**
 *
 * @author Paarkavi Saravanan
 */
public class venue_booking {
    public static void main(String args[]) throws InterruptedException{
        booking obj=new booking();
        cse c=new cse(obj);
        ece e=new ece(obj);
        eee e1=new eee(obj);
        civil c1=new civil(obj);
        mech m=new mech(obj);
        it i1=new it(obj);
        c.start();
        e.start();
        e1.start();
        c1.start();
        m.start();
        i1.start();
        
        
    }
    
}
class booking
{
    int count=0;
   synchronized public void seminar_hall()
    {
        
       if(count<3)
        {
        System.out.println("Booked successfully..:)!!!");
        count++;
        }
        else
        {
            
            System.out.println("Sorry!Halls are already booked:( !!Halls are not available");
        }
             
    }
}
class cse extends Thread
{
    booking b;
    public cse(booking b) {
        this.b = b;
   
}
    public void run()
    {
    b.seminar_hall();
    }
    
}
class ece extends Thread
{
    booking b;
    public ece(booking b) 
    {
        this.b = b;
        
      
    }
    public void run()
    {
        b.seminar_hall();
       
    }
    
}
class eee extends Thread
{
    booking b;
    public eee(booking b) {
        this.b = b;
    }
    public void run()
    {
     
        b.seminar_hall();
   }
    
}
class civil extends Thread
{
   booking b;
    public civil(booking b) {
        this.b = b;
    
    }
    public void run()
    {
        b.seminar_hall();
    }
    
}
class mech extends Thread
{
  
    booking b;
    public mech(booking b) {
        this.b = b;
        
    }
    public void run()
    {
        b.seminar_hall();
     
    }
    
}
class it extends Thread
{
    booking b;
    public it(booking b) {
        this.b = b;
       
    }
    public void run()
    {
       
        b.seminar_hall();
        
    }
    
}



