package jogo;
import java.util.Scanner;
 
public class Ache_o_Numero {
public static void main (String args[]) {
	Scanner ler = new Scanner (System.in);
	
	int boa []= new int [10];
	int resp, sort, acrt=0, err=0, chanc=4;
 
	for (int i=1;i<=4;i++) {
		sort = (int) (Math.random()*9);
		
		for(int k=1;k==1;k++) {
			boa[sort]= 1;
		}
	}
	 
 	for (int p=1; p<=4; p++) {
	    System.out.println("Qual casa esta o n�mero 1? (lembrando que s�o 10 casas, e a contagem come�a do 0)");
	    resp=ler.nextInt(); 
	 	
	    if(boa[resp]==1) {
	    	acrt++;
	    	chanc--;
	    }else {
	    	err++;
	    	chanc--;
	    }
	    
	 	if(boa[resp]==1) {
	 		System.out.print("Parab�ns, voc� acertou!!!\n"
	 				+ "PLACAR: \n"
	 				+ ""+acrt+" ACERTO(S)\n"
	 				+ ""+err+"  ERRO(S)\n");
	 		if(chanc!=0) {
	 			System.out.println("VOC� AINDA TEM "+chanc+" CHANCE(S)\n");
	 		}else {
	 			System.out.println("Suas chances acabaram");
	 		}
	 		
	 	}else {
	 		System.out.print("Que pena, voc� errou :(\n"
	 				+ "PLACAR:\n"
	 				+ ""+acrt+" ACERTO(S)\n"
	 				+ ""+err+"  ERRO(S)\n");
	 		if(chanc!=0) {
	 			System.out.println("VOC� AINDA TEM "+chanc+" CHANCE(S)\n");
	 		}else {
	 			System.out.println("Suas chances acabaram");
	 		}
		 	
		}
 	}
 	
 	if(acrt>err) {
 		System.out.println("\n----===Parab�ns! Voc� DESTRUIU no jogo!!!!===----");
 	}else if(acrt==err) {
 		System.out.println("\n----===Houve um empate no placar, tente outra vez!===----");
 	}else {
 		System.out.println("\n----===Voc� perdeu :( Mais sorte na pr�xima vez.===----");
 	}
 	
 	ler.close();
}	

}
