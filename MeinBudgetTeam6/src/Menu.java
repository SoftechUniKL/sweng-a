import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	
public abstract class Menu {
	protected static Hauptmenu hm_ref;

	GridBagConstraints gbc = new GridBagConstraints();

	protected static void createClientPanel(final JFrame frame, String s){
       	frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.add(headline(s), BorderLayout.NORTH);
    }

	protected static JLabel headline(String s){
		JLabel headline = new JLabel(s);
		headline.setFont(new Font("Arial", Font.BOLD, 45));
		headline.setHorizontalAlignment(JLabel.LEFT);
		return headline;
	}
	
	protected void addComp(JPanel form, GridBagLayout gb, JComponent c,  int x, int y, int width, int height){
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=width;
		gbc.gridheight=height;
		gbc.insets=new Insets(0,0,10,0);
		form.add(c, gbc);
	}
}
