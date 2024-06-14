import java .util.*;

public class dayTwo {
    
    static void printStar1(){

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void sum(){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println(sum );

    }
    static void dotstar(){
        int m = 4;
        int n = 5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(j==1||i==1||j==n||i==m){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    static void half1Piramid(){
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
            System.out.println();
        }
        
    }
    static void half2Piramid(){
        for(int i=4;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }   
    }
    static void half3Piramid(){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        }
    
    public static void main (String[] args)
    {
        
        half3Piramid();
        
    }
}



