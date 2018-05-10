import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		int idades[] = new int [7];
		String apresenta = "";
		
		for(int i = 0; i<=6; i++){
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade"));
			apresenta += String.valueOf(idades[i]+"\n");
		}
		JOptionPane.showMessageDialog(null, "As idades inseridas são: "+
		"\n" + apresenta);
		
	}

}
