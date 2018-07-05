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
public class passenger {
     private String pid;
    private String a_no;
    private String pname;
    private String no_lug;
    private String flight_no;
    private String age;
    
    public passenger(String pid,String a_no,String pname,String no_lug,String flight_no,String age)
    {
        this.pid= pid;
        this.a_no = a_no;
        this.pname= pname;
        this.no_lug=no_lug;
        this.flight_no=flight_no;
        this.age=age;
       
        
    }
    public String getpid()
    {
        return pid;
    }
    public String geta_no()
    {
        return a_no;
    }
    public String getpname()
    {
        return pname;
    }
      
    public String getno_lug()
    {
        return no_lug;
    }
    public String getflight_no()
    {
        return flight_no;
    }
    public String getage()
    {
        return age;
    }
    
}
