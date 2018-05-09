package heranca;

@SuppressWarnings("unused")
public class Emprestimo extends Servico{
	
	//ATRIBUTOS DO SERVIÇO DE EMPRÉSTIMO
	private double valor;
	private double taxa;
	
	//TAXA DE 10% PARA SERVIÇO DE EMPRÉSTIMO
	@Override
	public double calcularTaxa() {
		return this.valor * 0.1;
	}

}

