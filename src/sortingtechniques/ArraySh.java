package sortingtechniques;
public class ArraySh {
private long a[];
private int nElems;
private int interchangeCount;
private int comparisonCount;

public ArraySh(int max)
    {
 a = new long[max];
 nElems=0;
 interchangeCount = 0;
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
public void shellSort()
    {
        int inner , outer;
        long temp;
        int h=1;
        interchangeCount = 0;
        comparisonCount = 0;
        while(h<=nElems/3)
            h=h*3+1;
        while(h>0)
        {
            for(outer=h;outer<nElems;outer++)
            {
                temp=a[outer];
                inner = outer;
                if(!(inner>h-1 && a[inner-h] >= temp))
                    comparisonCount++;
                while(inner>h-1 && a[inner-h] >= temp)
                {
                    a[inner] = a[inner-h];
                    inner -= h;
                    interchangeCount++;
                    comparisonCount++;
                }
                a[inner] = temp;
            }
            h=(h-1)/3;
        }
    }
public int getInterchangeCount() {
        return interchangeCount;
    }
 public int getComparisonCount() {
        return comparisonCount;
    }
}
