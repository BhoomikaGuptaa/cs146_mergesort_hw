import java.util.*;
public class mergesort {
     public static int[] merge(int[] a, int[] b) {
        ArrayList<Integer> temp = new ArrayList<>(); // Using ArrayList to build result because we don't know final size yet and it's easier to add elements one by one
        int left = 0;// pointer for array a
        int right = 0;// pointer for array b
        while (left < a.length && right < b.length) { //erge logic: compare elements from both arrays and keep going until we reach the end of at least one array
            if (a[left] <= b[right]) {  // Pick the smaller element and add it to result 
                temp.add(a[left]);
                left++; // move pointer forward in array a
            } else {
                temp.add(b[right]); 
                right++; // move pointer forward in array b
            }
        }

        // if one array is exhausted but the other might have leftover elements we have to add any remaining elements from array a
        while (left < a.length) {
            temp.add(a[left]);
            left++;
        }

        //adding any remaining elements from array a
        while (right < b.length) {
            temp.add(b[right]);
            right++;
        }

        // Convert ArrayList back to a regular int array because the method returns int[] and not ArrayList
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }

        return result;
    }
}
