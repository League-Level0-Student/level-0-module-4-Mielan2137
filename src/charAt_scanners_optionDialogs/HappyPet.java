package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet

	// 1. Ask the user what kind of pet they want to buy, and store their answer in
	// a variable

	// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

	// 3. Use showOptionDialog to ask the user what they want to do to make their
	// pet happy
	// (eg: cuddle, food, water, take a walk, groom, clean up poop).
	// Make sure to customize the title and question too.

	// 5. Use user input to call the appropriate method created in step 4.

	// 6. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	static int happinessLevel = 0;

	public static void main(String[] args) {

		String Pet = JOptionPane.showInputDialog("What kind of pet would you like to buy?");
		
		while (happinessLevel < 20) {
			}

		int task = JOptionPane.showOptionDialog(null, "WHAT WOULD YOU LIKE TO DO TO MAKE YOUR PET HAPPIER?",
				"HAPPY PET HAPPY LIFE", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Feed it", "Walk it", "Scratch it" }, null);

		JOptionPane.showMessageDialog(null, task);

			if (task == 0) {
				Feed();
				JOptionPane.showMessageDialog(null, "Your total points are now " + happinessLevel);

			}

			else if (task == 1) {
				Walk();
				JOptionPane.showMessageDialog(null, "Your total points are now " + happinessLevel);

			} 
			
			else if (task == 2) {
				Scratch();
				JOptionPane.showMessageDialog(null, "Your total points are now " + happinessLevel);
			}

		}

	public static void Feed() {
		happinessLevel += 5;
	}

	public static void Walk() {
		happinessLevel += 5;
	}

	public static void Scratch() {
		happinessLevel += 10;
	}

}