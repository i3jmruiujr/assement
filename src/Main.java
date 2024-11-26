//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Employee  obj=new Employee("erer","rAd","FFAF",3.87);

       double weeklySalary= obj.weeklySalary();
       System.out.println(weeklySalary);
       obj.setFirstName("gsg");
    }

    }