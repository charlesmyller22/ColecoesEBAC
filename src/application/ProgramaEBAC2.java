package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaEBAC2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> listMasculina = new ArrayList<>();
		List<String> listFeminina = new ArrayList<>();
		
		System.out.println("Quantas pessoas você vai digitar ? ");
		
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<n; i++) {
			System.out.println("Digita o nome e o sexo separados por hifen: ");
			
			String resposta = sc.nextLine();
			
			String[] fields = resposta.split("-");
			
			String name = fields[0];
			String sexo = fields[1];
			
			
			if(sexo.equals("M")) {
				listMasculina.add(resposta);
			} else {
				listFeminina.add(resposta);
			}
		}
		System.out.println("Grupo Masculino: " + listMasculina);
		System.out.println("Grupo feminino: " + listFeminina);
		
		sc.close();
	}

}
