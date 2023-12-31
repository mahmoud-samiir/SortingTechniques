package sortingtechniques;
public class ArrayIns {
    private long a[];
    private int nElems;
    private int interchangeCount;
    private int comparisonCount;
public ArrayIns(int max)
    {
    a = new long[max];
    nElems=0;
    interchangeCount=0;
    comparisonCount = 0;
    }
public void insert(int number)
    {
        for(int i=1 ; i<=number;i++)
        {
        long value=(long) (Math.random()*100);
        a[nElems]=value;
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
public void display()
    {
    for(int i=0 ;i<nElems;i++)
        {
            System.out.print(a[i]+" ");
        }
    System.out.println("");
    }
public void insertionSort()
    {
     int in , out ;
     interchangeCount=0;
     comparisonCount = 0;
     for(out=1;out<nElems;out++)
     {
         long temp=a[out];
         in=out;
         if(!(in > 0 && a[in-1] > temp))
            comparisonCount++;
         while( in > 0 && a[in-1] > temp)
         {
             a[in] = a[in-1];
             --in;
             interchangeCount++;
             comparisonCount++;
         }
         a[in]=temp;
     }
    }
    public int getInterchangeCount() {
        return interchangeCount;
    }
    public int getComparisonCount() {
        return comparisonCount;
    }
}
