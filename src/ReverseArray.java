public class ReverseArray {
    public static void main (String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50, 60,70,80,90,100};

        int n = arr.length;

        // Reverse using a for loop
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // Print reversed array using a for loop
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }

