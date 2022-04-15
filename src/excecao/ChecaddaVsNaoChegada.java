package excecao;

public class ChecaddaVsNaoChegada {
	
	public static void main(String[] args) {
		
		try {
		geraErro1();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	
		
		System.out.println("Fim :)");
		
	}
	
	// Exceção NÃo chacada ou verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreou um erro bem legal #01!");
		
	}
	
	// Exceção chacada ou verificada
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreou um erro bem legal #02!");
	}

}
