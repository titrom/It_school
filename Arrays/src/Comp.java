import java.util.Comparator;

public class Comp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int a1=o1%10;
        int a2=o2%10;
        if (a1<a2){
            return -1;

        }
        else if (a1>a2){
            return 1;
        }
        else return 0;
    }

    @Override
    public Comparator<Integer> reversed() {
        return null;
    }
}
