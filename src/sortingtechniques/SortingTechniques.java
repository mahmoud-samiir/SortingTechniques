package sortingtechniques;
import java.util.Scanner;
public class SortingTechniques {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int maxsize = input.nextInt();
    ArrayBub arr1 = new ArrayBub(maxsize);
    ArraySel arr2 =new ArraySel(maxsize);
    ArrayIns arr3 = new ArrayIns(maxsize);
    ArraySh arr4 = new ArraySh (maxsize);
    ArrayQui arr5 = new ArrayQui(maxsize);
    ArrayCou arr6 = new ArrayCou(maxsize);
    
    System.out.println("Enter the number of elements and is lower than "+maxsize);
    int number = input.nextInt();
    System.out.println("\tThe Bubble Technique");
    System.out.println("Before sorting random numbers");
    arr1.insert(number);
    arr1.display();
    long start = System.nanoTime();
    arr1.bubbleSort();
    long duration = (System.nanoTime()- start);
    System.out.println("After sorting random numbers");
    System.out.println("The duration is: "+duration+" ns");
    arr1.display();
    System.out.println("The number of comparisons is "+arr1.getComparisonCount());
    System.out.println("The number of interchanges is "+arr1.getInterchangeCount());
    System.out.println("Before sorting ascending numbers");
    //Best Case: The best case occurs when the array is already sorted 
    //So the number of comparisons required is N-1 and the number of swaps required = 0. Hence the best case complexity is O(N).
    arr1.insertAsc(number);
    arr1.display();
    System.out.println("After sorting ascending numbers");
    start = System.nanoTime();
    arr1.bubbleSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr1.display();
    System.out.println("The number of comparisons is "+arr1.getComparisonCount());
    System.out.println("The number of interchanges is "+arr1.getInterchangeCount());
    System.out.println("Before sorting descending numbers");
    arr1.insertDesc(number);
    arr1.display();
    //Worst Case: The worst-case condition for bubble sort occurs when elements of the array are arranged in decreasing order.
    //In worst case, Total number of swaps = Total number of comparison
    //Total number of comparison (Worst case) = N(N-1)/2
    //Total number of swaps (Worst case) = N(N-1)/2
    //So worst case time complexity is O(N2) 
    System.out.println("After sorting descending numbers");
    start = System.nanoTime();
    arr1.bubbleSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr1.display();
    System.out.println("The number of comparisons is "+arr1.getComparisonCount());
    System.out.println("The number of interchanges is "+arr1.getInterchangeCount());
    
    //#######################################################################################################
    
    System.out.println("\tThe Selection Technique");
//    Selection sort is not difficult to analyze compared to other sorting algorithms since none of the loops depend on the data in the array.
//Selecting the lowest element requires scanning all n elements (this takes n − 1 comparisons) and then swapping it into the first position.
//Finding the next lowest element requires scanning the remaining n − 1 elements and so on,
//for (n − 1) + (n − 2) + ... + 2 + 1 = n(n − 1) / 2 ∈ Θ(n^2) comparisons.
    System.out.println("Before sorting random numbers");    
    arr2.insert(number);
    arr2.display();
    //Average-case: O(n2), the average case arises when the elements of the array are in a disordered or random order, 
    //without a clear ascending or descending pattern.
    System.out.println("After sorting random numbers");
    start = System.nanoTime();
    arr2.SelectionSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr2.display();
    System.out.println("The number of comparisons is "+arr2.getComparisonCount());
    System.out.println("The number of interchanges is "+arr2.getInterchangeCount());
    System.out.println("Before sorting ascending numbers");
    arr2.insertAsc(number);
    arr2.display();
    System.out.println("After sorting ascending numbers");
//    Best-case: O(n2), best case occurs when the array is already sorted. (where n is the number of integers in an array)
    start = System.nanoTime();
    arr2.SelectionSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr2.display();
    System.out.println("The number of comparisons is "+arr2.getComparisonCount());
    System.out.println("The number of interchanges is "+arr2.getInterchangeCount());
    System.out.println("Before sorting descending numbers");
    //Worst-case: O(n2), The worst-case scenario arises when we need to sort an array in ascending order, 
    //but the array is initially in descending order.
    arr2.insertDesc(number);
    arr2.display();
    System.out.println("After sorting descending numbers");
    start = System.nanoTime();
    arr2.SelectionSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr2.display();
    System.out.println("The number of comparisons is "+arr2.getComparisonCount());
    System.out.println("The number of interchanges is "+arr2.getInterchangeCount());
    
    
//############################################################################################################################    
    
    
    System.out.println("\tThe Insertion Technique");
//    Worst case time complexity: Θ(n^2)
//    Average case time complexity: Θ(n^2)
//    Best case time complexity: Θ(n)
//    Space complexity: Θ(1)
    System.out.println("Before sorting random numbers");
    arr3.insert(number);
    arr3.display();
    System.out.println("After sorting random numbers");
    start = System.nanoTime();
    arr3.insertionSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr3.display();
    System.out.println("The number of comparisons is "+arr3.getComparisonCount());
    System.out.println("The number of interchanges is "+arr3.getInterchangeCount());
    System.out.println("Before sorting ascending numbers");
    arr3.insertAsc(number);
    arr3.display();
    System.out.println("After sorting ascending numbers");
    start = System.nanoTime();
    arr3.insertionSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr3.display();
    System.out.println("The number of comparisons is "+arr3.getComparisonCount());
    System.out.println("The number of interchanges is "+arr3.getInterchangeCount());
    System.out.println("Before sorting descending numbers");
//    When the input sequence is in reverse order,
//    that's the worst case for insertion sort because each new item added to the sorted partition has to sink all the way to the bottom,
//    having to be compared to every other item in the partition.
//    The number of comparisons in this case is given by the good old formula:
//    n(n−1)2
    arr3.insertDesc(number);
    arr3.display();
    System.out.println("After sorting descending numbers");
    start = System.nanoTime();
    arr3.insertionSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr3.display();
    System.out.println("The number of comparisons is "+arr3.getComparisonCount());
    System.out.println("The number of interchanges is "+arr3.getInterchangeCount());
    
//#######################################################################################################

    
    System.out.println("\tThe Shell Technique");
    //Complexity in the Worst-Case Scenario: Less Than or Equal to O (n2)
    System.out.println("Before sorting random numbers");
    arr4.insert(number);
    arr4.display();
    System.out.println("After sorting random numbers");
    start = System.nanoTime();
    arr4.shellSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr4.display();
    System.out.println("The number of comparisons is "+arr4.getComparisonCount());
    System.out.println("The number of interchanges is "+arr4.getInterchangeCount());
    System.out.println("Before sorting ascending numbers");
    //Complexity in the Best Case: O(n*Log n) 
    arr4.insertAsc(number);
    arr4.display();
    System.out.println("After sorting ascending numbers");
    start = System.nanoTime();
    arr4.shellSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr4.display();
    //The total number of comparisons for each interval (or increment) is equal to the size of the array when it is already sorted.
    System.out.println("The number of comparisons is "+arr4.getComparisonCount());
    System.out.println("The number of interchanges is "+arr4.getInterchangeCount());
    System.out.println("Before sorting descending numbers");
//    Complexity in the Worst-Case Scenario: Less Than or Equal to O (n2)
    arr4.insertDesc(number);
    arr4.display();
    System.out.println("After sorting descending numbers");
    start = System.nanoTime();
    arr4.shellSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr4.display();
    System.out.println("The number of comparisons is "+arr4.getComparisonCount());
    System.out.println("The number of interchanges is "+arr4.getInterchangeCount());
    
    
//#######################################################################################################

    
    
    System.out.println("\tThe Quick Technique");
    System.out.println("Before sorting");
    arr5.insert(number);
    arr5.display();
    System.out.println("After sorting");
    start = System.nanoTime();
    arr5.quickSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr5.display();
    System.out.println("The number of comparisons is "+arr5.getComparisonCount());
    System.out.println("The number of interchanges is "+arr5.getInterchangeCount());
    System.out.println("Before sorting ascending numbers");
    arr5.insertAsc(number);
    arr5.display();
    System.out.println("After sorting ascending numbers");
    start = System.nanoTime();
    arr5.quickSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr5.display();
    System.out.println("The number of comparisons is "+arr5.getComparisonCount());
    System.out.println("The number of interchanges is "+arr5.getInterchangeCount());
    System.out.println("Before sorting descending numbers");
    arr5.insertDesc(number);
    arr5.display();
    System.out.println("After sorting descending numbers");
    start = System.nanoTime();
    arr5.quickSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr5.display();
    System.out.println("The number of comparisons is "+arr5.getComparisonCount());
    System.out.println("The number of interchanges is "+arr5.getInterchangeCount());
   
    
//#######################################################################################################
    
    
    
    System.out.println("\tThe Counting Technique");
    System.out.println("Before sorting");
    arr6.insert(number);
    arr6.display();
    System.out.println("After sorting");
    start = System.nanoTime();
    arr6.countingSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr6.display();
    System.out.println("The number of comparisons is "+arr6.getComparisonCount());
    System.out.println("The number of interchanges is "+arr6.getInterchangeCount());
    System.out.println("Before sorting ascending numbers");
    arr6.insertAsc(number);
    arr6.display();
    System.out.println("After sorting ascending numbers");
    start = System.nanoTime();
    arr6.countingSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr6.display();
    System.out.println("The number of comparisons is "+arr6.getComparisonCount());
    System.out.println("The number of interchanges is "+arr6.getInterchangeCount());
    System.out.println("Before sorting descending numbers");
    arr6.insertDesc(number);
    arr6.display();
    System.out.println("After sorting descending numbers");
    start = System.nanoTime();
    arr6.countingSort();
    duration = (System.nanoTime()- start);
    System.out.println("The duration is: "+duration+" ns");
    arr6.display();
    System.out.println("The number of comparisons is "+arr6.getComparisonCount());
    System.out.println("The number of interchanges is "+arr6.getInterchangeCount());
    }
    
}
