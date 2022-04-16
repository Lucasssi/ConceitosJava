package lambdas;

//@FunctionalInterface // Ao utilizar esta nota��o ser� definido que podera utilizar somente um metodo;
public interface Calculo {
	
	 double executar(double a, double b);
	 
	 default String legal() {
		 return "Legal";
	 }
	 
	 static String muitoLegal() {
		 return "Muito Legal";
	 }
	 

}
