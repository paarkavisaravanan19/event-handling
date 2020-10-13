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
        int temp=0;
        booking obj=new booking();
        cse c=new cse(obj,temp);
        ece e=new ece(obj,temp);
        eee e1=new eee(obj,temp);
        civil c1=new civil(obj,temp);
        mech m=new mech(obj,temp);
        it i1=new it(obj,temp);
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
    cse cs;
    int getcount()
    {
        return count;
    }
   synchronized public void seminar_hall(int c)
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
    int temp=0;
    
    public cse(booking b,int temp) {
        this.b = b;
       this.temp=temp;
   
}
    public void run()
    {
     
        
       b.getcount();
        int c=temp+1;
        b.seminar_hall(c);
       
       
        
    }
    
}
class ece extends Thread
{
    booking b;
    int temp=0;
  
    public ece(booking b,int temp) 
    {
        this.b = b;
        this.temp=temp;
      
    }
    public void run()
    {
     
        int c=temp+1;
        b.seminar_hall(c);
       
    }
    
}
class eee extends Thread
{
    booking b;
    int temp=0;
    public eee(booking b,int temp) {
        this.b = b;
        this.temp=temp;
        
    }
    public void run()
    {
        int c=temp+1;
        b.seminar_hall(c);
       
    }
    
}
class civil extends Thread
{
   
    booking b;
    int temp=0;
    public civil(booking b,int temp) {
        this.b = b;
        this.temp=temp;
    
    }
    public void run()
    {
    
       
       int c=temp+1;
        b.seminar_hall(c);
        
    }
    
}
class mech extends Thread
{
  
    booking b;
  int temp=0;
    public mech(booking b,int temp) {
        this.b = b;
        this.temp=temp;
        
    }
    public void run()
    {
     
        int c=temp+1;
        b.seminar_hall(c);
     
    }
    
}
class it extends Thread
{
    booking b;
int temp=0;
    public it(booking b,int temp) {
        this.b = b;
        this.temp=temp;
       
    }
    public void run()
    {
        int c=temp+1;
        b.seminar_hall(c);
        
    }
    
}



