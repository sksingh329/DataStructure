public class SockMerchantTest {
    public static void main(String[] args) {
        //int[] arr = {1,2,1,2,1,3,2};
        //int[] arr = {10,20,20,10,10,30,50,10,20};
        int[] arr = {10,20};
        SockMerchant sockMerchant = new SockMerchant(arr.length);
        int count = sockMerchant.pairedSocks(arr);
        System.out.println("Number of paired socks are:"+count);
    }
}
