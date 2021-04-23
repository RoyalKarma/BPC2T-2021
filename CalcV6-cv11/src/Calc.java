import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {

	public static void main(String[] args) {
		// vytvoreni jednotlivych objektu GUI
		JFrame screen = new JFrame();
		JPanel panel = new JPanel();
		// vytvoreni tlacitek pro matematicke operace
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton eqls = new JButton("=");
		JLabel label = new JLabel(" "); // pole pro vypisovani vysledku a zadanych hodnot

		// po zvoleni moznosti "rovna se" pouzijeme engine k vyhodnoceni rovnice
		eqls.addActionListener(e -> {
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn"); // vytvoreni EngineManageru a
																						// specifikace pouziteho Enginu
			try {
				label.setText(String.valueOf(engine.eval(label.getText()))); // engine vezme text z labelu a vyhodnoti
																				// jej
			} catch (ScriptException scriptException) {
				scriptException.printStackTrace();

			}
		});

		for (int i = 0; i < 10; i++) { // loop pro vytvoreni ciselnych tlacitek
			JButton button = new JButton(String.valueOf(i)); // vytvoreni tlacitka pro danou iteraci
			button.addActionListener(new ActionListener() { // pridani funkcnosti k tlacitku
				public void actionPerformed(ActionEvent e) {
					String help = label.getText(); // ulozeni stavajiciho textu labelu
					label.setText(help + button.getText()); // puvodni label + zmacknute tlacitko
				}
			});
			panel.add(button); // pridani tlacitka do panelu
		}
		// vytvoreni GUI
		label.setHorizontalAlignment(JLabel.RIGHT); // vytvoreni pole pro vypisovani vysledku, zmacknutych tlacitek
		label.setBorder(new BasicBorders.ButtonBorder(Color.RED, Color.BLACK, Color.RED, Color.BLACK)); // hranice pole
		screen.setSize(300, 200); // velikost okna
		screen.setTitle("FlawlessCalculator6.1.1"); // titulek kalkulacky
		screen.setLayout(new BorderLayout());
		screen.getContentPane().add(label, BorderLayout.NORTH); // umisteni pole pro vypisovani
		panel.setLayout(new GridLayout(4, 3)); // layout pro tlacitka
		
        //Tlacitka +-
		plus.addActionListener(new ActionListener() { // vytvoreni tlacitka +
			public void actionPerformed(ActionEvent e) {
				String help = label.getText();// ulozeni stavajiciho textu v labelu
				label.setText(help + "+");// puvodni label + zmacknute tlacitko
			}
		});

		panel.add(plus); // pridani tlacitka do GUI
		minus.addActionListener(new ActionListener() { // vytvoreni tlacitka -
			public void actionPerformed(ActionEvent e) {
				String help = label.getText(); // ulozeni stavajiciho textu v labelu
				label.setText(help + "-");// puvodni label + zmacknute tlacitko
			}
		});
		panel.add(minus); // pridani tlacitka do panelu
		
		
		screen.getContentPane().add(panel);
		screen.add(eqls, BorderLayout.SOUTH); // pridani tlacitka =
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // vypnuti po zmacknuti "close"
		// vlastnosti okna
		screen.setVisible(true);
		screen.setResizable(false);
	}
}