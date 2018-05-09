package heranca;

public class Servico {
	
	//ATRIBUTOS E MÉTODOS COMUNS DE 
	//TODOS OS TIPOS DE SERVIÇOS;
	protected Cliente cliente;
	protected Funcionario funcionario;
	protected String dataContratacao;
	
	//TAXA ÚNICA PARA TODO TIPO DE SERVIÇO
	public double calcularTaxa(){
		return 10.0;
	}

}

