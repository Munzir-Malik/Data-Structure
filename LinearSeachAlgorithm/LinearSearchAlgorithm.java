public class LinearSearchAlgorithm{
  // Search for target element
  public int linearSearch(int[] arr, int target) {
    if(arr.length == 0) {
      System.out.println("Array is empty");
      return -1;
    }

    for(int i = 0; i < arr.length; i++){
      //Checks if the element found
      if(arr[i] == target){
        System.out.print("The key number found in index: ");
        return i; 
      }
    }
    // If the key element not found
    System.out.print("The key number wasn't found.");
    return -1;
  }

  public static void main(String [] args){
  LinearSearchAlgorithm search = new LinearSearchAlgorithm();

  int[] array = {1,6,3,9,4,0,-30};
  int result = search.linearSearch(array, -2);

  System.out.println(result);
  }
}