package heranca;

@SuppressWarnings("unused")
public class Emprestimo extends Servico{
	
	//ATRIBUTOS DO SERVI�O DE EMPR�STIMO
	private double valor;
	private double taxa;
	
	//TAXA DE 10% PARA SERVI�O DE EMPR�STIMO
	@Override
	public double calcularTaxa() {
		return this.valor * 0.1;
	}

}

