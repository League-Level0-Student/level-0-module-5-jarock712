package _01_algorithms._1_prime_or_not;
import javax.swing.JOptionPane;
public class algorithms_1 {
public static void main(String[] args) {
	String num = JOptionPane.showInputDialog("Pick a number?");
	int number = Integer.parseInt(num);
	boolean option = false;
	for (int i = 2; i <= number/2 ; i++) {
		if (number % i == 0) {
			option = true;
			break;
		}
	}
	if(!option){
		JOptionPane.showMessageDialog(null, number + " is a prime number");
	}else {
		JOptionPane.showMessageDialog(null, number + " isn't a prime number");
	}
}
}
