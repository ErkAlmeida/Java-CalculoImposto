package entidades;

public class PFisica extends Pessoa
{
	protected Double gastosSaude;
	
	
	public PFisica() {
		
		super();
	}

	public PFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calcImp() 
	{
		double imposto = 0;
		if(gastosSaude > 0)
		{
			if(rendaAnual < 20000) 
			{
				imposto = (rendaAnual * 15/100)-(gastosSaude * 50/100);
			}else {
				imposto = (rendaAnual * 25/100)-(gastosSaude * 50/100);
			}
		}else {
			if(rendaAnual < 20000) 
			{
				imposto = (rendaAnual * 15/100);
			}else {
				imposto = (rendaAnual * 25/100);
			}
		}
		return imposto;
	}
	
	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		
		
		sb.append("Nome :"+nome+" $"+calcImp());
		

		return sb.toString();
	}
}
