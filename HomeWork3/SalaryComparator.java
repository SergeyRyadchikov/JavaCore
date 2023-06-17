
import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

        if( o1.getSalary() < o2.getSalary()) {
            return -1;

        } else if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else {
            return  0;

        }
    }

    public void comparison(Employee o1, Employee o2){
        if (compare(o1, o2) > 0){
            System.out.println(o1.getFirstName() + " зарабатывает больше, чем " + o2.getFirstName());
        } else if (compare(o1, o2) < 0){
            System.out.println(o1.getFirstName() + " зарабатывает меньше, чем " + o2.getFirstName());
        } else {
            System.out.println(o1.getFirstName() + " и " + o2.getFirstName() + " зарабатывают одинаково!");
        }
    }
}
