public class recussion {
    static int n=1;
    public static void main(String[] args) {
        m();
    }
    static void m(){
        if(n>100)
         return;
        else{
            int i=n;
            n++;
            m();
            System.out.println(i);
            
        }
    }
}
