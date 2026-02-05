public class demo {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] merged =  mergesort.merge(a, b);

        for (int i = 0 ; i <merged.length;i++) {
            System.out.print(merged[i]+ " ");
        }
    }
}

    
