package com.company;

public class Main {
    public static void main(String[] args) {
int []nums={23,4,56,78789,90,-34,787};
int target=23;
int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    /*search in the array:return the index if item found
    if the item not found return -1
     */


static int linearSearch(int[]arr,int target){
    if (arr.length==0){
        return -1;
    }
    /*
    run a for loop
     */
    for (int index = 0; index < arr.length; index++) {
      //check for element at every index if it is =target
      int element=arr[index];
      if (element==target){
          return index;
      }
    }
    // this line will execute if nono of hte return statement above have executed hence the target not found
    return -1;
}

}
