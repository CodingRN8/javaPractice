import java.util.*;

public class dayThree {

   static void Nopiramid(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
   }
   static void No2piramid(){
    for(int i=5;i>0;i--){
        for(int j=1;j<=i;j++){
        System.out.print(j+" ");
        }
        System.out.println();
    }
   }
   static void No3piramid(){
    int n=4;
    int number =1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            number++;
            System.out.print(number+" ");
        }
        System.out.println();
    }

   }
   static void No4piramid(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        int sum;
        sum = i+j;
        if(sum % 2 == 0){
            System.out.print("1 ");
        }
        else{
            System.out.print("0 ");
        }
    }
     System.out.println();
    
   }
}
static void starpattern(){
    int n = 5;
    int space;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        space = 2*(n-i);
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }  
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>0;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        space = 2*(n-i);
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

}
      


    public static void main(String[] args) {

        starpattern();
        
    }
    
}
