package heranca;

public class Servico {
	
	//ATRIBUTOS E M�TODOS COMUNS DE 
	//TODOS OS TIPOS DE SERVI�OS;
	protected Cliente cliente;
	protected Funcionario funcionario;
	protected String dataContratacao;
	
	//TAXA �NICA PARA TODO TIPO DE SERVI�O
	public double calcularTaxa(){
		return 10.0;
	}

}

