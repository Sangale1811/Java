public class SolutionFunctionString {
    public static void main(String args[]){

        String A="Hello";
        String B="Java";
       // A=A + "Java";

        System.out.println(A.concat(" Java"));
        System.out.println(A.length()+B.length());

        if(A.compareTo(B)>0){
            System.out.println("Yes");

        }else{
            System.out.print("No");
        }
        String output = A.substring(0, 1).toUpperCase() + B.substring(1);
        
    }
    
    
}
