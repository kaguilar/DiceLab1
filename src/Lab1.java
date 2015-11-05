import javax.swing.JOptionPane;

public class Lab1{

	public static void main(String[] args) 
	{
		String doAgain;

		do{

			JOptionPane.showMessageDialog(null, "Dice Playing time:)");
			Dice dice = new Dice();

			dice.Throw();
			dice.Value();

			doAgain = JOptionPane.showInputDialog("One more time? [Y/N]").toUpperCase();
			while(!(doAgain.matches("[YN]+"))) 
			{				
				JOptionPane.showMessageDialog(null, "Error: Invalid choice.");
				doAgain = JOptionPane.showInputDialog("Do it again? (Y/N)").toUpperCase();

			}
		}while (!(doAgain.equals("N")));
		JOptionPane.showMessageDialog(null, "Bye Bye");
	}
}