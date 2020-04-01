package entidades;

public class PJuridica extends Pessoa
{
	protected Integer numeroFuncionarios;
	
	public PJuridica() {
		super();
	}

	public PJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double calcImp() 
	{
		double imposto = 0;
		
		if(numeroFuncionarios > 10) 
		{
			imposto = rendaAnual * 14/100;
		}else {
			imposto = rendaAnual * 16/100;
		}
		return imposto;
	}
	
	 
	
}
