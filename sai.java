public class sai {
    public static void main(String[] args) {
        
        String s="12_4_9";
        char s1[]=s.toCharArray();
        int i1=0,i2=0;
        for(int i=0;i<s.length();i++){
            if(s1[i]=='_')
               {
                i1=i2;
                i2=i; 
               } 
        }
        for (int i=9;i>=0;i--){
            s1[i1]=(char)(i+48);
           boolean b=true;
            for (int j=9;j>=0;j--){
                s1[i2]=(char)(j+48);
                String f=new String(s1);
                int n=Integer.parseInt(f);
                double sqrt1=Math.sqrt(n); 
                if(((sqrt1 - Math.floor(sqrt1)) == 0)) {
                    System.out.println(n);
                    b=false;
                    break;
                }
            }
            if(b==false){
                break;
            }
        }
    }
}
