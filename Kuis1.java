import java.util.Scanner;

public class Kuis1{
	public static void main(String args[]){
		String nama;
		int nim, tahun;
		int tahun1 = 2020;
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan nama anda  \t : ");
		nama = sc.nextLine();
		System.out.print("Masukkan nim anda  \t : ");
		nim = sc.nextInt();
		System.out.print("Masukkan tahun lahir anda : ");
		tahun = sc.nextInt();
		System.out.println("------------------------------");
		System.out.println("-----------DATA DIRI----------");
		System.out.println("Nama anda adalah \t : " + nama);
		System.out.println("Nim anda adalah \t : " + nim);
		int usia = tahun1 - tahun;
		System.out.println("Usia anda adalah \t : " + usia);

	}
}
