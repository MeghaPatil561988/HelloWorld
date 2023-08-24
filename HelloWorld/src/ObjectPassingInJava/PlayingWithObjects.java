package ObjectPassingInJava;

public class PlayingWithObjects {

	public static void main(String[] args) 
	{
		Paper p = new Paper();
		p.setText("Hello World");
		System.out.println(p.getText());
		
		Printer hp = new Printer();
		hp.print(p);
		System.out.println(p.getText());
		

	}

}
