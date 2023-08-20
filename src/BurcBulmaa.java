import java.util.Scanner;

public class BurcBulmaa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dogum Tarihinizin Ayini Yaziniz: ");
		int ay = scanner.nextInt();
		System.out.println("Dogum Tarihinizin Gununu Yaziniz: ");
		int gun = scanner.nextInt();
		
		switch (ay) {
		case 1:
			if (gun < 22) {
				System.out.println("Oglak Burcusunuz!");
			}else {
				System.out.println("Kova Burcusunuz!");
			}
		break;
		case 2:
			if (gun < 19) {
				System.out.println("Kova Burcusunuz!");
			}else {
				System.out.println("Balik Burcusunuz!");
			}
			break;
		case 3:
			if (gun < 20) {
				System.out.println("Balik Burcusunuz!");
			}else {
				System.out.println("Koc Burcusunuz!");
			}
			break;
		case 4:
			if (gun < 20) {
				System.out.println("Koc Burcusunuz!");
			}else {
				System.out.println("Boga Burcusunuz!");
			}
			break;
		case 5:
			if (gun < 21) {
				System.out.println("Boga Burcusunuz!");
			}else {
				System.out.println("Ikizler Burcusunuz!");
			}
			break;
		case 6:
			if (gun < 22) {
				System.out.println("Ikizler Burcusunuz!");
			}else {
				System.out.println("Yengec Burcusunuz!");
			}
			break;
		case 7:
			if (gun < 22) {
				System.out.println("Yengec Burcusunuz!");
			}else {
				System.out.println("Aslan Burcusunuz!");
			}
			break;
		case 8:
			if (gun < 22) {
				System.out.println("Aslan Burcusunuz!");
			}else {
				System.out.println("Basak Burcusunuz!");
			}
			break;
		case 9:
			if (gun < 22) {
				System.out.println("Basak Burcusunuz!");
			}else {
				System.out.println("Terazi Burcusunuz!");
			}
			break;
		case 10:
			if (gun < 22) {
				System.out.println("Terazi Burcusunuz!");
			}else {
				System.out.println("Akrep Burcusunuz!");
			}
			break;
		case 11:
			if (gun < 21) {
				System.out.println("Akrep Burcusunuz!");
			}else {
				System.out.println("Yay Burcusunuz!");
			}
			break;
		case 12:
			if (gun < 21) {
				System.out.println("Yay Burcusunuz!");
			}else {
				System.out.println("Oglak Burcusunuz!");
			}
			break;

		default:
			break;
		}

	}

}
