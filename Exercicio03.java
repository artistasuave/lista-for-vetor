import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		String apresenta = "";
		double soma = 0;
		
		int registros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de preços que deseja inserir"));
		double[] precos = new double[registros];
		
		for(int i = 0; i<registros; i++){
		precos [i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
		
		//soma = soma+precos[i];
		apresenta += precos[i]+"\n"; 
		}
		
		for(int i = 0; i<precos.length; i++){
			soma += precos[i];
		}
		
		JOptionPane.showMessageDialog(null, "Os preços inseridos são: "+"\n"+
		apresenta+
		"\nO total dos preços é: "+
		soma);
	}

}
