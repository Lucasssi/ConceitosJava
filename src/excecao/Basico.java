package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Usuario u1=null;
		try {
			imprimirNomeusuario(u1);
		} catch (Exception excecao) {
			System.out.println("ocorrerou um erro nomomento de imprimir o usuario");
		}
		
		try {
			System.out.println(7/0);	
		}catch(ArithmeticException e){
			System.out.println("Ocorreu p erro: "+ e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	public static void imprimirNomeusuario (Usuario usuario) {
		System.out.println(usuario.toString());
	}

}
