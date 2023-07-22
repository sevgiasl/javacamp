package miniProjeSesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("kalın sesli harf");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("ince sesli harf");
			break;
		default:
			System.out.println("geçersiz harf");
		}

	}
}
