import java.util.Scanner;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;
import java.util.Random;

public class Birthday {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company \n to choose gifts for young children.");
		
		String name, toy, ans = null;
		double total = 0;
		int age = 0;
		
		do {
			name = JOptionPane.showInputDialog("Enter the child's name: ");
			age = Integer.parseInt(JOptionPane.showInputDialog("Enter the child's age: "));
			do {
				toy = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
				if(!(toy.toLowerCase().equals("plushie")) && !toy.toLowerCase().equals("book") && !toy.toLowerCase().equals("blocks")) {
					JOptionPane.showMessageDialog(null, "Invalid Choice, please choose again");
				}
			}while (!(toy.toLowerCase().equals("plushie")) && !toy.toLowerCase().equals("book") && !toy.toLowerCase().equals("blocks"));
			
			Toy thing = new Toy(toy, age);
			if (thing.ageOK()){
				JOptionPane.showMessageDialog(null, "Good Choice!");
			}
			while (thing.ageOK() == false) {
				ans = JOptionPane.showInputDialog("Toy is not age appropriate. Do you want to buy a different toy? Yes or No");
				if (ans.toLowerCase().equals("yes")) {
					do {
						thing.setToy(JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book"));
						if(!(toy.toLowerCase().equals("plushie")) && !toy.toLowerCase().equals("book") && !toy.toLowerCase().equals("blocks")) {
							JOptionPane.showMessageDialog(null, "Invalid Choice, please choose again");
						}
					}while (!(toy.toLowerCase().equals("plushie")) && !toy.toLowerCase().equals("book") && !toy.toLowerCase().equals("blocks"));
				}
				else if (ans.toLowerCase().equals("no")) {
					break;
				}
			}
			
			
			thing.addCard(JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No"));
			thing.addBalloon(JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No"));
			JOptionPane.showMessageDialog(null, "The gift for " + name + thing.toString());
			total += thing.getCost();
			
			
			ans = JOptionPane.showInputDialog("Would you like another gift?");
		} while (ans.toLowerCase().equals("yes"));
		
		DecimalFormat dollar = new DecimalFormat("#,##0.00");	//format cost
		Random randomRange = new Random();
		JOptionPane.showMessageDialog(null, "The total cost of your order is $" + dollar.format(total));
		JOptionPane.showMessageDialog(null, "Order number is " + randomRange.nextInt(100000) + "\nProgrammer: Erik Umoh");
	}
	
}
