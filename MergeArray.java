public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arrMerged = mergeArray(arr1,arr2);
        for (int i = 0; i < arrMerged.length; i++) {
            System.out.print(arrMerged[i]+" ");
        }
    }
    public static int[] mergeArray(int[] arr1,int[] arr2){
        int[] arrMerged = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrMerged[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrMerged[i+arr1.length]=arr2[i];
        }
        return arrMerged;
    }
}
