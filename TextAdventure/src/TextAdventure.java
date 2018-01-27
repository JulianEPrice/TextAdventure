import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextAdventure extends JPanel{

	public static TextAdventure textadventure;
	
	JFrame jframe = new JFrame("Text Adventure");
	
	JTextArea area = new JTextArea();
	
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public int width = (int) screenSize.getWidth(), height = (int) screenSize.getHeight();

	private Scanner s;
	
	public TextAdventure() {
		super();
		
		jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jframe.setLocationRelativeTo(null);
		//area.setBounds(50, 50, 400, 400);
//		area.setLineWrap(true);
//		area.setWrapStyleWord(true);
//		jframe.setBackground(Color.ORANGE);
//		jframe.setForeground(Color.ORANGE);

		//area.setText("Hey BROOOOO");
		//jframe.add(area);
		//jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{
		jframe.dispose(); System.exit(0);}
       }
	   );
		Render render = new Render();
		jframe.add(render);
		
		Level_0();
		
	}
	
	public void Level_0() {
		

		try {
			s = new Scanner(new File("Level_0"));
			ArrayList<String> listS = new ArrayList<String>();
			ArrayList<Integer> listI = new ArrayList<Integer>();
			while (s.hasNextLine()) {
				listS.add(s.nextLine());
			}
			
			for (int i = 0; i < listS.size(); i++) {
				System.out.println(listS.get(i));
				//listI.add(s.nextInt());
			}
			System.out.println(listS);
			area.setText(listS.get(0));
			System.out.println(listI);
		} catch (FileNotFoundException e ) {
			System.out.println("File not found");
		}
		
//		String[] words = readArray("Level_0");
//		for (int i = 0; i < words.length; i = i + 1) {
//			System.out.println("This is words[i]: " + words[i] + " This is words.length: " + words.length);
//			area.setText(Arrays.toString(words));
//		}
		
	}


//	private static String readString(String file) {
//		String text = "";
//		try {
//			Scanner s = new Scanner(new File(file));
//			while (s.hasNextLine()) {
//				text = text + s.next() + " ";
//			}
//		} 
//		catch (FileNotFoundException e) {
//				System.out.println("File not found");
//		}
//		
//		return text;
//	}
//	
//	private static String[] readArray(String file) {
////		List<String> lines = new ArrayList<String> ();
////		String line == null;
//		int ctr = 0;
//		try {
//			Scanner s1 = new Scanner(new File(file));
//			while (s1.hasNextLine()) {
//				
//				ctr = ctr + 1;
//				s1.nextLine();
//			}
//			String[] words = new String[ctr];
//			
//			Scanner s2 = new Scanner(new File(file));
//				for (int i = 0; i < ctr; i = i + 1) {
//					words[i] = s2.nextLine();
//				}
//			//System.out.println(words);
//			return words;
//		} catch (FileNotFoundException e) {
//			
//		}
//		return null;
//	}
	
	public static void main(String args[]) {
		textadventure = new TextAdventure();
		
		
		
//		String text = readString("Level_0");
//		System.out.println(text);
//		
//		String[] words = readArray("Level_0");		
//		System.out.println(words[3]);
//		for (int i = 0; i < words.length; i = i + 1) {
//			System.out.println("This is words[i]: " + words[i] + " This is words.length: " + words.length);
//			//area.setText(words[2]);

		
//		}
//		System.out.println("This is array: " + Arrays.toString(words));
	}
	
}
