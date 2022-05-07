package work;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;

public class Sframe {
	public static void main(String[] args) {
		
		Frame frame=new Frame("Sample Frame");
		Component textArea=new TextArea("Sample Text");
		Component button=new Button("Click Me");
		frame.add(textArea,BorderLayout.NORTH);
		frame.add(button,BorderLayout.SOUTH);
		int width=600;
		int height=600;
		frame.setSize(width, height);
		frame.setVisible(true);
		
	}

}
