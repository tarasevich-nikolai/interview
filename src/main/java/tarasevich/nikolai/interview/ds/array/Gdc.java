package tarasevich.nikolai.interview.ds.array;

/**
 * @author Nikolai Tarasevich
 */
public class Gdc {

    public int gdc1(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gdc1(b, a % b);
    }

    public static void main(String args[]) {
        int a =8, b = 5;
        Gdc gdc = new Gdc();
        System.out.println();
        System.out.println(gdc.gdc1(a, b));
    }
}
