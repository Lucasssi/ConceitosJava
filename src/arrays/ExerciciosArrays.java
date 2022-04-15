package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ExerciciosArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] notasAlunoA = new double[3];
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length -1]);
		
		System.out.println(total / notasAlunoA.length);
		
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];			
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
		

	}

}
