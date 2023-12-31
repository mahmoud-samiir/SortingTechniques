package sortingtechniques;
public class ArrayQui {
    private long a[];
    private int nElems;
    private int interchangeCount;
    private int comparisonCount;

    public ArrayQui(int max) {
        a = new long[max];
        nElems = 0;
        interchangeCount=0;
        comparisonCount = 0;
    }

    public void insert(int number) {
        for (int i = 1; i <= number; i++) {
            long value = (long) (Math.random() * 100);
            a[nElems] = value;
            nElems++;
        }
    }
    public void insertAsc(int number) {
        nElems=0;
        for (int i = 0; i < number; i++) {
            a[i] = i;
            nElems++;
        }
    }
    public void insertDesc(int number) {
        nElems=0;
    for (int i = number - 1; i >= 0; i--) {
        a[nElems] = i;
        nElems++;
    }
}
    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public void quickSort() {
        interchangeCount=0;
        comparisonCount = 0;
        quickSort(0, nElems - 1);
    }

    private void quickSort(int l, int h) {
        if (l < h) {
            int piv = partition(l, h);
            quickSort(l, piv - 1);   // Recursive call for the left partition
            quickSort(piv + 1, h);   // Recursive call for the right partition
        }
    }

    private int partition(int l, int h) {
        long p = a[l];
        int i = l;
        int j = h;
        while (i < j) {
            do {
                i++;
                comparisonCount++;
            } while (i <= h && a[i] <= p);
            do {
                j--;
                comparisonCount++;
            } while (j >= l && a[j] > p);
            if (i < j&& a[i] != a[j]){
                swap(i, j);
                 interchangeCount++;}
        }
        swap(l, j);
        interchangeCount++;
        return j;
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    public int getInterchangeCount() {
        return interchangeCount;
    }
    public int getComparisonCount() {
        return comparisonCount;
    }
}
