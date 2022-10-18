
/*Galina Krüger, qa_36m
      Создать класс "Employee", имеющий:
     - конструктор, который принимает переменные salary,
      number of  employee's working hours в качестве параметров

     - следующие методы:
      addSalary() , который добавляет 10 евро
      к зарплате сотрудника если она меньше 500     и addWork() ,
      добавляющий 5 евро к зарплате сотрудника если количество часов  больше 6.
    - создать несколько сотрудников и применить к ним методы*/

public class Main {
    public static void main(String[] args) {

        Employee n1 = new Employee("Jon",200,5);
        Employee n2 = new Employee("Ann", 600,2);
        Employee n3 = new Employee("Done",400,8);


        Employee[] employee = {n1,n2,n3};
        for (int i = 0; i < employee.length; i++) {
            employee[i].print();
        }

        n1.addSalary();
        n2.addSalary();
        n3.addSalary();

        n1.addWork();
        n2.addWork();
        n3.addWork();

        n1.print();
        n2.print();
        n3.print();
    }

}