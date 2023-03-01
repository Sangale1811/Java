public class MaximumNumber {

    public static void main(String args[]){

        int firstnumber=34;
        int secondnumber=89;

       

        int result=maxOf(firstnumber,secondnumber);                    //method calling
       // maxOf(100,200);
        

        System.out.println(result);
        sayhi();
       

    }

    static int maxOf(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
       }
    }
    static void sayhi() {
        System.out.println("hi");
        System.out.println("Good Morning");
    }
    
}
