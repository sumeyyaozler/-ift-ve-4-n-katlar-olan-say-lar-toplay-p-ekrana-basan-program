import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner scan = new Scanner(System.in);

       do {
           System.out.print("enter number :");
           n =scan.nextInt();
           if(n%4==0&&n>0){
               total+=n;
           }
        }while(n%4 ==0);
        System.out.println(total);
    }
}




