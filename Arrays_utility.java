import java.util.Arrays;

public class Arrays_utility {
    public static void main(String[] args) {
        int[] arrFill = new int[5];
        Arrays.fill(arrFill, 42);
        System.out.println("Filled array: " + Arrays.toString(arrFill));

        // 2. sort() Method
        int[] arrSort = {5, 2, 8, 1, 6};
        Arrays.sort(arrSort);
        System.out.println("Sorted array: " + Arrays.toString(arrSort));

        // 3. compare() Method
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        int compareResult = Arrays.compare(arr1, arr2);
        System.out.println("Compare result: " + compareResult);

        // 4. binarySearch() Method
        int[] arrBinarySearch = {1, 2, 3, 4, 5,6};
        int index = Arrays.binarySearch(arrBinarySearch, 3);
        System.out.println("Index of 3: " + index);

        // 5. copyOf() Method
        int[] arrCopy = {1, 2, 3};
        int[] copy = Arrays.copyOf(arrCopy, 5);
        System.out.println("Copied array: " + Arrays.toString(copy));
    }
}
