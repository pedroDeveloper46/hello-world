import java.util.Scanner;
public class Ma�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       System.out.println("As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00 se forem\r\n" + 
       		"compradas pelo menos 12. ");
       System.out.println("Voc� vai levar quantas ma��s?");
       int m = in.nextInt();
       double r = 0;
       if (m < 12) {
		for (int i = 0; i < m; i++) {
			r += 1.30;
		}
	
	}else if (m >= 12) {
		for (int i = 0; i < m; i++) {
			r += 1.00;
		}
	}
       System.out.println("Total: " + r);
	}

}
