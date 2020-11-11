import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args){

        //Variabel
        Scanner sc = new Scanner(System.in);
        int B, j, i;

        //Proses
        System.out.print("Jumlah baris : ");
        B = sc.nextInt();

        //Output
        for(i=1;i<=B;i++){
            for(j=1;j<=B;j++){
                if(i%2==0){
                    break;
                }
                System.out.print(j);
                System.out.print(" ");

            }
            if(i%2==0){
                for(j=B;j>=B-i;j--){
                    System.out.print(j+" ");
                }

            }

            System.out.println();
        }
    }
}
