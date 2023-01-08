package inherenence;
public class Car {
    ///deloit exam
    public static void main(String[] args) {

      String s=name;
      int d=birthYear;
      char c=luckyChar;
      if (!(c>=97)){
        c=(char)(c+32);
      }
      int v=0;
      for (int i=0;i<s.length();i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
        ||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
            v++;
        }
      }
      int no=d;
      while(no>10){
        no=0;
        while(d>0){
        int res=d%10;
        no+=res;
        d/=10;
        }
        d=no;
      }
      int ch=0;
      char t='a';
      while(t<=c){
        ch++;
        t++;
      }
      int fin=0;
      while(ch>0){
        int rem=ch%10;
        fin+=rem;
        ch/=10;
      }
      System.out.println(v+""+no+""+fin);
      if (v==fin && v==no){
        System.out.println('1');
      }
      else{
        System.out.println('N');
      }
    }
}
