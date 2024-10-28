public class MaximumCal {

    public int getMax(int n, int m) {
        return checkIsGreater(n, n,n,m);
    }

    public Object[] getMax(Object[] o1, Object[] o2) {
       return checkIsGreater(o1, o2, o1.length, o2.length);
    }

    public String getMax(String number1, String number2) {
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        return checkIsGreater(number1,number2,n1,n2);
    }
    public static <T> T checkIsGreater(T first, T second, int o1, int o2) {
        if(o1>o2) {
            return first;
        } else{
            return second;
        }
    }
}