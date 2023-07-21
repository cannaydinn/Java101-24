import java.util.Scanner;

public class ElmasYapimi{
    public static void main(String[] args) {
        //Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("n:");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=0; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}