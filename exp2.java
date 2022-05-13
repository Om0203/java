import java.awt.event.MouseEvent;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class exp2 extends Frame implements MouseListener {
	String str;
	Frame f;
	TextField tf;
	exp2(){
		f = new Frame("Mouse Action");
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		tf = new TextField("Mouse Event");
		tf.setSize(100,50);
		f.add(tf);
		f.addMouseListener(this);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		str = "Mouse Clicked";
		tf.setText(str);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		str = "Mouse Pressed";
		tf.setText(str);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		str = "Mouse Released";
		tf.setText(str);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		str = "Mouse entered";
		tf.setText(str);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		str = "Mouse Exited";
		tf.setText(str);
	}
	
	public static void main(String[] args){
		exp2 obj = new exp2();
	}
}
