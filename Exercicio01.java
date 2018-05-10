import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		String[] nomes = new String [25];
		String resultado = "";
		
		for(int i = 0; i<=24; i++){
		nomes[i] = JOptionPane.showInputDialog(null, "Insira o nome");
		resultado += "\n"+ nomes[i]+"\n";
		} 
			JOptionPane.showMessageDialog(null, "Os nomes inseridos são: "+
		"\n"+resultado);
			
	}

}