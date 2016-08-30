/**
 * Created by sgundann on 2/12/2016.
 */
public class MS {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};

        System.out.print(MM(a, b));
    }

    // 1234  //1345
    public static int[] MM(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        for (int k = 0; k <= (a.length + b.length); k++) {
            {
                if (a[i] < b[j]) {
                    res[k] = a[i++];
                } else if (a[i] == b[j]) {
                    res[k] = a[i++];
                    res[k] = b[j++];
                } else if (a[i] > b[j]) {
                    res[k] = b[j++];
                }

            }
        }

        return res;
    }

}
