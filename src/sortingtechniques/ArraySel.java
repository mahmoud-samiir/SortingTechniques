package sortingtechniques;
public class ArraySel {
private long a[] ;
private int nElems;
private int interchangeCount;
private int comparisonCount;
public ArraySel(int max)
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
public void SelectionSort()
{
    int out , in , min ;
    interchangeCount = 0;
    comparisonCount = 0;
    for(out = 0;out<nElems-1;out++)
    {
        min = out ;
        for(in=out+1 ;in<nElems;in++)
        {
            comparisonCount++;
            if(a[in]<a[min])
                min=in;}
        
        if (min != out) {
            swap(out, min);
            interchangeCount++;
        }
    }
}
public void swap(int one , int two)
{
    long temp = a[one];
    a[one]=a[two];
    a[two]=temp;
} 
public int getInterchangeCount() {
        return interchangeCount;
    }
 public int getComparisonCount() {
        return comparisonCount;
    }
}
