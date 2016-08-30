/**
 * Created by sgundann on 3/9/2016.
 */
public class QuickSort {

    public int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;


        while (true) {
            while (less(a[++i], a[lo])) {
                if (i == hi) {
                    break;
                }
                i++;
            }

            while (less(a[lo], a[--j])) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }
            exch(a, i, j);


        }
        exch(a, lo, j);
        return j;
    }

    private boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;

    }

    private void exch(Comparable[] a, int i, int j) {
        Comparable c = a[i];
        a[i] = a[j];
        a[j] = c;
    }

    public void sort(Comparable[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("Begin End ");
        if (lo >= hi)
            return;
        int mid = partition(a, lo, hi);
        sort(a, lo, mid - 1);
        sort(a, mid + 1, hi);


        System.out.println(" ");

        for (Comparable i : a) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

}
