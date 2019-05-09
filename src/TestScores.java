import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String Score = JOptionPane.showInputDialog("What was your test score?");

		double S = Double.parseDouble(Score);
		double total = 0.0;

		if (S>= 90) {
			JOptionPane.showMessageDialog(null, "Your grade is A");
			JOptionPane.showMessageDialog(null, "Great Job! ! ! ");
		} 
		else if (S>= 80) {
			JOptionPane.showMessageDialog(null, "Your grade is B");
			JOptionPane.showMessageDialog(null, "Good Job! ! ! ");
		}
		else if (S>= 70) {
			JOptionPane.showMessageDialog(null, "Your grade is C");
			JOptionPane.showMessageDialog(null, "Okay Job! ! ! ");
		}
		else if (S>= 60) {
			JOptionPane.showMessageDialog(null, "Your grade is D");
			JOptionPane.showMessageDialog(null, "Alright Now! ! ! ");
		}
		else if (S< 60) {
			JOptionPane.showMessageDialog(null, "Your grade is F");
			JOptionPane.showMessageDialog(null, "Booyyy U Fina Fail ! ! ! ");
			JOptionPane.showMessageDialog(null, "U stupid ass! ! ! ");
			JOptionPane.showMessageDialog(null, "Go get yoself a job at Mcdonald and live in yo mama's basement! ! ! ");
			JOptionPane.showMessageDialog(null, "And screw yo sister you Alabama Boy! ! ! ");
			JOptionPane.showMessageDialog(null, "YE YEET ! ! ! ");
		}
	}
}
