package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaInterfaloException extends Exception {
	
	private String nomeDoAtributo;
	
	public NumeroForaInterfaloException(String nomeDoAtributo) {

		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está negativo.", nomeDoAtributo);
	}

}
