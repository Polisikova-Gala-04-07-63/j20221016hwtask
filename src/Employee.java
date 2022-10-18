public class Employee {
   String employee;
   double salary;
   double numberOfEmployeesWorkingHours;

   public Employee(String employee,double salary,double numberOfEmployeesWorkingHours){
      this.employee = employee;
      this.salary = salary;
      this.numberOfEmployeesWorkingHours =numberOfEmployeesWorkingHours ;
   }
   public void addSalary(){
      if (salary < 500){
         salary += 10;
      }
   }
   public void addWork(){
      if(numberOfEmployeesWorkingHours > 6){
         salary += 5;
      }
   }



   public void print(){
      System.out.println(employee + "-" + salary +
              "(" + numberOfEmployeesWorkingHours + ")" );
   }
}
