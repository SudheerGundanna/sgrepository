
/**
 * Created by sgundann on 2/29/2016.
 */
public class MergeSort {
    private Comparable[] aux;

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private void Merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {


        //Comparable []aux = new Comparable[a.length];
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }

    }

    private void Sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        Sort(a, aux, lo, mid);
        Sort(a, aux, mid + 1, hi);
        Merge(a, aux, lo, mid, hi);

    }

    public void SortMe(Comparable[] a) {
        aux = new Comparable[a.length];

        Sort(a, aux, 0, a.length - 1);

        for (Comparable i : aux) {
            System.out.print(i + " ");

        }
        System.out.println("");
        for (Comparable k : a) {
            System.out.print(k + " ");

        }
    }


}


