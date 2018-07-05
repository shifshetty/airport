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
public class eachflight {
     private String flight_num;
    private String DOD;
    private String DOA;
    private String act_TOD;
    private String act_TOA;
    private String destination;
    private String status;
    
   public eachflight(String flight_num,String DOD,String DOA,String act_TOD,String act_TOA,String destination,String status)
   {
       this.flight_num =flight_num;
       this.DOD =DOD;
       this.DOA=DOA;
       this.act_TOD=act_TOD;
       this.act_TOA=act_TOA;
       this.destination = destination;
       this.status = status;
   }
    public String getflight_num()
    {
        return flight_num;
    }
    public String getDOD()
    {
        return DOD;
    }
    public String getDOA()
    {
        return DOA;
    }
    public String getact_TOD()
    {
        return act_TOD;
    }
     public String getact_TOA()
    {
        return act_TOA;
    }
      public String getdestination()
    {
        return destination;
    }
       public String getstatus()
    {
        return status;
    }
}
