package heranca;

public class ProgramaTeste {

	public static void main(String[] args) {
		Emprestimo e = new Emprestimo();
		SeguroDeVeiculo sv = new SeguroDeVeiculo();
		
		//AMBOS
		System.out.println("Taxa de Servi�o: " + e.calcularTaxa());
		System.out.println("Taxa de Servi�o: " + sv.calcularTaxa());

	}

}
