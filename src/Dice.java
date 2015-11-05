
	import javax.swing.JOptionPane;

	public class Dice {

		private int diceNumber;
		
		public int Throw()
		{
			diceNumber = 1 + (int) ( Math.random() * (6) );
			return diceNumber;
		}
		
		public void Value()
		{
			
			JOptionPane.showMessageDialog(null, "Lucky Number is " + diceNumber);
			
		}}

