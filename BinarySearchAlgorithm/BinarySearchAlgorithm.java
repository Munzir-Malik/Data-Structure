import java.util.ArrayList;
import java.util.Collections;
public class BinarySearchAlgorithm {
  public int binarySearch(ArrayList<Integer> arrayList, int target){ 
    Collections.sort(arrayList);  //Sort the array
    int middleElem;
    int start = 0; 
    int end = arrayList.size() - 1;

    // Show array elements to help you check the answer
    System.out.println(arrayList);

    if(arrayList.size() == 0) {
      System.out.print("ArrayList is empty. ");
        return -1;
    }

    //Searching for the key number starting from the middle
    while(start <= end) {
      middleElem = (start + end) / 2;
      
      if(arrayList.get(middleElem) == target){ //Checks if the element in the middle = the element we are searching for it
        System.out.print("The key element found at index: ");
        return middleElem;
      }
      
      else if(arrayList.get(middleElem) > target){
        end = middleElem - 1;
      }
      
      else {
        start = middleElem + 1;
      }
    }
    System.out.print("The key element not found. ");
    return -1;
    
  }
  public static void main(String[] args) {
    BinarySearchAlgorithm search = new BinarySearchAlgorithm();

    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    arr.add(5);
    arr.add(6);
    System.out.println( search.binarySearch(arr, 6));
  }
}
