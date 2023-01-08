public class PrimeUsingRecussion {
    static int i=2,j=2;;
    public static void main(String[] args) {
        oneToN(100);
    }
    public static void oneToN(int n){
        if(i>n){
            j=2;
          return;
        }
        else{
            boolean b=checkPrime(i);
            if (b==true){
                System.out.println(i);
            }
            i++;
            j=2;
            oneToN(n);
        }    
    }
    private static boolean checkPrime(int i) {
        if (j<=i/2){
            if(i%j==0){
                return false;
            }
            j++;
            return (checkPrime(i));
        }
        
        else{
            return true;
        }
    }
   
}
