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
public class employee {
   private String eid;
    private String name;
    private String DOB;
    private String salary;
    private String address;
    private String dept_id;
    private String password;
    public employee(String eid,String name,String DOB,String salary,String address,String dept_id,String password)
    {
        this.eid = eid;
        this.name = name;
        this.DOB = DOB;
        this.salary=salary;
        this.address=address;
        this.dept_id =dept_id;
        this.password=password;
        
    }
    public String geteid()
    {
        return eid;
    }
    public String getname()
    {
        return name;
    }
    public String getDOB()
    {
        return DOB;
    }
    public String getsalary()
    {
        return salary;
    }
    public String getaddress()
    {
        return address;
    }
    public String getdept_id()
    {
        return dept_id;
    }
    public String getpassword()
    {
        return password;
    }
}
