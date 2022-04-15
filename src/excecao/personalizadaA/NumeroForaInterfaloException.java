package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaInterfaloException extends RuntimeException {
	
	private String nomeDoAtributo;
	
	public NumeroForaInterfaloException(String nomeDoAtributo) {

		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está negativo.", nomeDoAtributo);
	}

}
