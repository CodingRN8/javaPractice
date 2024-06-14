import java.util.*;


public class dayFour {

    public static void AverageSum(){

        Scanner sc= new Scanner(System.in);
        int[] arr = new int[3];


        for(int i=0;i<3;i++)
        {
            int x = sc.nextInt();
            arr[i] = x;
        }
        int average =(arr[0]+arr[1]+arr[2])/3;

        System.out.println(average);

    }
    public static void SumofOddN0(){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for(int i=1;i<=n;i++){
            if(i % 2 != 0){
             x = x + i;
            }
        }
        System.out.print(x);

    }
    public static void Greaterno(){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater then a");
        }
    }
    public static void Radius(){
        Scanner sc= new Scanner (System.in);

        float pie = 3.14f;
        int radius = sc.nextInt();
        float circumference= 2*pie*radius;
        System.out.println(circumference);
        
        


    }

    
    public static void main(String[]args)
    {
    Greaterno();
        
    }
}
