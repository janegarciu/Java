package Lab1.task1;

public class Comparator {
    int i;
    int j;
    public void compare(int i, int j) {
        if (i < j) {
            System.out.println(" monitor 1 <  monitor 2");
        } else if (i > j) {
            System.out.println(" monitor 1 >  monitor 2");
        } else {
            System.out.println("equal values");
        }
    }
}
