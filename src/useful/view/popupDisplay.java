package useful.view;

import javax.swing.JOptionPane;
/*
 * @author Connor O'Leary
 * @version 1.0 10/3/27
 */
public class popupDisplay {
	public void displayText(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	public String getResponse(String fromQuestion) {
		String response = "";
		//prompts a display window with an input dialog, the input being what is stored in response
		response += JOptionPane.showInputDialog(null, fromQuestion);
		return response;
	}
}
