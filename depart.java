package inherenence;

public class depart extends College {
    String Dn="CSIT";
    public void test(){
        System.out.println("no use of  test");
    }
    
}
class College extends University{
    String Cn="SIETK";
    public void placement(){
        System.out.println("no placements for 2023");
    }   
}
class University{
    String un="jntua";
    public void conductExam(){
        System.out.println("emcet");
    }
}