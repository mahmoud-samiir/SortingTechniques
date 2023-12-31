package sortingtechniques;
public class ArrayCou {
    private long a[];
    private int nElems;
    private int interchangeCount;
    private int comparisonCount;

    public ArrayCou(int max) {
        a = new long[max];
        nElems = 0;
        interchangeCount = 0;
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

    public void countingSort() {
        interchangeCount = 0; 
        comparisonCount = 0;
        long max = findMax();
        countingSort(max);
    }

    private void countingSort(long max) {
        int[] countArray = new int[(int) (max + 1)];

        // Count occurrences of each element
        for (int i = 0; i < nElems; i++) {
            int value = (int) a[i];
            countArray[value]++;
        }

        // Build the sorted result array
        int currentIndex = 0 ;
        for (int i = 0; i < countArray.length; i++) {
            int count = countArray[i];
            while (count > 0) {
                if (a[currentIndex] != i) {
                    interchangeCount++;  // Increment interchange count
                }
                a[currentIndex] = i;
                currentIndex++;
                count--;
                comparisonCount++;
            }
        }
    }

    private long findMax() {
        long max = Long.MIN_VALUE;
        for (int i = 0; i < nElems; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    public int getInterchangeCount() {
        return interchangeCount;
    }
    public int getComparisonCount() {
        return comparisonCount;
    }
}

