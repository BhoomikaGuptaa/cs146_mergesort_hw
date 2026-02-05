import java.util.*;
public class mergesort {
     public static int[] merge(int[] a, int[] b) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = 0;
        int right = 0;
        while (left < a.length && right < b.length) {
            if (a[left] <= b[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(b[right]);
                right++;
            }
        }
        while (left < a.length) {
            temp.add(a[left]);
            left++;
        }
        while (right < b.length) {
            temp.add(b[right]);
            right++;
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }

        return result;
    }
}
