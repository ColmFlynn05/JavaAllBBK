public class ArrayChecker {
    public static boolean isSymmetrical(int[] arr) {
        if(arr.length % 2 == 0){
            for(int i = 0; i < (arr.length/2) ; i++){
                if(arr[i] != arr[(i * -1) -2]){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static int[] reverse(int[] arr){
        int[] reverseArr = new int[arr.length];
        for(int i = 0; i < arr.length/2; i++){
            reverseArr[i] = arr[arr.length - i - 1];
        }
        return reverseArr;
    }
}
