import javax.swing.*;

public class IYCMQJProg2 extends JFrame
{
	JLabel label;


	IYCMQJProg2()
	{
		label = new JLabel("Informatika tanár");
		add(label);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 300);
	}

	public static void main(String[] args)
	{
		new IYCMQJProg2();
	}
}
