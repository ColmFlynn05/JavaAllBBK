public class ArrayCopier {
    public static int[] copyArray(int[] src, int[] copy) {
        if (src.length > copy.length) {
            for(int i=0; i<copy.length; i++) {
                copy[i] = src[i];
            }
            return copy;
        }
        else if (src.length < copy.length) {
            for(int i=0; i<src.length; i++) {
                if(i>src.length-1){
                    copy[i] = 0;
                }
                else {
                    copy[i] = src[i];
                }
            }
            return copy;
        }
        else { copy = src; return copy;}
    }

}
