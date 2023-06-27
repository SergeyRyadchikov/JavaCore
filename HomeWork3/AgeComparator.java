
import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

        if (o1.getAge() < o2.getAge()) {
            return -1;

        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        } else {
            return 0;

        }
    }

    public void comparison(Employee o1, Employee o2) {
        if (compare(o1, o2) > 0) {
            System.out.println(o1.getFirstName() + " старше, чем " + o2.getFirstName());
        } else if (compare(o1, o2) < 0) {
            System.out.println(o1.getFirstName() + " моложе, чем " + o2.getFirstName());
        } else {
            System.out.println(o1.getFirstName() + " и " + o2.getFirstName() + " одинакового возраста!");
        }
    }
}
