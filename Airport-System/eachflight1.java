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
public class eachflight1 {
    private String flight_num;
    private String DOD;
    private String DOA;
    private String sched_TOD;
    private String sched_TOA;
    private String act_TOD;
    private String act_TOA;
    private String destination;
    private String gate_no;
    private String status;
    
   public eachflight1(String flight_num,String DOD,String DOA,String sched_TOD,String sched_TOA,String act_TOD,String act_TOA,String destination,String gate_no,String status)
   {
       this.flight_num =flight_num;
       this.DOD =DOD;
       this.DOA=DOA;
       this.sched_TOD=sched_TOD;
       this.sched_TOA = sched_TOA;
       this.act_TOD=act_TOD;
       this.act_TOA=act_TOA;
       this.destination = destination;
       this.gate_no=gate_no;
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
    public String getsched_TOD()
    {
        return sched_TOD;
    }
    public String getsched_TOA()
    {
        return sched_TOA;
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
      public String getgate_no()
      {
          return gate_no;
      }
      public String getstatus()
      {
          return status;
      }
}
