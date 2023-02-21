package application;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Programa_Collections2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		System.out.println("Digite vários nomes separados por vírgula: ");
		
			String resposta = sc.next();
			
			String[] nomes = resposta.split(",");
			
			for(String nome : nomes) {
				list.add(nome);
				Collections.sort(list);
		}
		System.out.println(list);
		
		
		
		
		sc.close();
	}

}
