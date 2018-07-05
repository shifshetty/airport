/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shifu;

/**
 *
 * @author harshitha
 */
public class flightdisplay {
      private int id;
    private String name;
    private float price;
    private String addDate; 
   
    
    public flightdisplay(int pid, String pname, float pprice, String pAddDate, byte[] pimg)
    {
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.addDate = pAddDate;
      
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public String getAddDate()
    {
        return  addDate;
    }
    
    
}
