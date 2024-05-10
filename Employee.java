public class Employee {

    //data
    private int empNo;
    private String empName;
    private float basicSalary;
    
    //methods
    public void setData (int e,String en, float bs)
    {
    empNo=e;
    empName=en;
    basicSalary=bs;
    }
    public void displayData()
    {
    System.out.println("employee Number"+empNo);
    System.out.println("Employee name"+empName);
    System.out.println("Emmployee salary"+basicSalary);
            }        
    }

