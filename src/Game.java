import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Game {
	public boolean turn = true;
	
	public void click(JButton button, JLabel lblPlayer) {
		if(turn) {
			lblPlayer.setText("./icons/player2");
			button.setIcon(new ImageIcon("./icons/42.png"));	
		}
		else {
			button.setIcon(new ImageIcon("./icons/58.png"));
			lblPlayer.setText("player1");
		}
		
		turn = !turn;
	}
	

}
