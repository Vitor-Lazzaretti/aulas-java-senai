import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// Vitor Lazzaretti
		Scanner sc = new Scanner(System.in);
		int resposta, pontos = 0;
		String nome;
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Quiz Sobre Naruto > 10 perguntas ");
		System.out.println("---------------------------------");
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Questão número 1:");
		System.out.println("---------------------------------");
		System.out.println("Quem é o último vilão da quarta guerra ninja?");
		System.out.println("1 - Madara");
		System.out.println("2 - Sasuke");
		System.out.println("3 - Zetsu");
		System.out.println("4 - Kaguya");
		System.out.println("---------------------------------");
		System.out.print("Resposta: ");
		resposta = sc.nextInt();
		System.out.println("---------------------------------");
		if(resposta != 4) { // Verificando Resposta
			System.out.println("Errado!");
		} else {
			System.out.println("Certo!");
			pontos++; // Aumentando a Pontuação
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Questão número 2:");
		System.out.println("---------------------------------");
		System.out.println("Quem é o Hokage conhecido como Sandaime?");
		System.out.println("1 - Hiruzen");
		System.out.println("2 - Tsunade");
		System.out.println("3 - Kakashi");
		System.out.println("4 - Naruto");
		System.out.println("---------------------------------");
		System.out.print("Resposta: ");
		resposta = sc.nextInt();
		System.out.println("---------------------------------");
		if(resposta != 1) {			
			System.out.println("Errado!");
		} else {
			System.out.println("Certo!");
			pontos++; // Aumentando a Pontuação
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Questão número 3:");
		System.out.println("---------------------------------");
		System.out.println("Qual jutsu Itachi usa no Kabuto em sua última luta?");
		System.out.println("1 - Izanagi");
		System.out.println("2 - Izanami");
		System.out.println("3 - Koto Amatsukami");
		System.out.println("4 - Katon");
		System.out.println("---------------------------------");
		System.out.print("Resposta: ");
		resposta = sc.nextInt();
		System.out.println("---------------------------------");
		if(resposta != 2) {	// Verificando Resposta		
			System.out.println("Errado!");
		} else {
			System.out.println("Certo!");
			pontos++; // Aumentando a Pontuação
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Questão número 4:");
		System.out.println("---------------------------------");
		System.out.println("Qual o ninja conhecido Ninja Teletransportador?");
		System.out.println("1 - Minato");
		System.out.println("2 - Kakashi");
		System.out.println("3 - Danzou");
		System.out.println("4 - Shisui");
		System.out.println("---------------------------------");
		System.out.print("Resposta: ");
		resposta = sc.nextInt();
		System.out.println("---------------------------------");
		if(resposta != 4) {	// Verificando Resposta		
			System.out.println("Errado!");
		} else {
			System.out.println("Certo!");
			pontos++; // Aumentando a Pontuação
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Questão número 5:");
		System.out.println("---------------------------------");
		System.out.println("Qual destes personagens nunca utilizou o Rinnegan?");
		System.out.println("1 - Sasuke");
		System.out.println("2 - Itachi");
		System.out.println("3 - Madara");
		System.out.println("4 - Zetsu");
		System.out.println("---------------------------------");
		System.out.print("Resposta: ");
		resposta = sc.nextInt();
		System.out.println("---------------------------------");
		if(resposta != 2) {	// Verificando Resposta		
			System.out.println("Errado!");
		} else {
			System.out.println("Certo!");
			pontos++; // Aumentando a Pontuação
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Questão número 6:");
		System.out.println("---------------------------------");
		System.out.println("Qual destes lugares, Naruto e Sasuke não se enfrentaram?");
		System.out.println("1 - Dimensão Kamui");
		System.out.println("2 - Vale do Fim");
		System.out.println("3 - Konohagakure");
		System.out.println("4 - Otogakure");
		System.out.println("---------------------------------");
		System.out.print("Resposta: ");
		resposta = sc.nextInt();
		System.out.println("---------------------------------");
		if(resposta != 1) {	// Verificando Resposta		
			System.out.println("Errado!");
		} else {
			System.out.println("Certo!");
			pontos++; // Aumentando a Pontuação
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Questão número 7:");
		System.out.println("---------------------------------");
		System.out.println("Qual é o nome da Bijuu de uma cauda?");
		System.out.println("1 - Son Goku");
		System.out.println("2 - Isobu");
		System.out.println("3 - Shukaku");
		System.out.println("4 - Matatabi");
		System.out.println("---------------------------------");
		System.out.print("Resposta: ");
		resposta = sc.nextInt();
		System.out.println("---------------------------------");
		if(resposta != 3) {	// Verificando Resposta		
			System.out.println("Errado!");
		} else {
			System.out.println("Certo!");
			pontos++; // Aumentando a Pontuação
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Questão número 8:");
		System.out.println("---------------------------------");
		System.out.println("Qual destes times é falso?");
		System.out.println("1 - Time 7 = Naruto, Sasuke, Sakura");
		System.out.println("2 - Time 8 = Kiba, Hinata e Shino");
		System.out.println("3 - Time 10 = Ino, Shikamaru, Choji");
		System.out.println("4 - Time 6 = Neji, Tenten, Rock Lee");
		System.out.println("---------------------------------");
		System.out.print("Resposta: ");
		resposta = sc.nextInt();
		System.out.println("---------------------------------");
		if(resposta != 4) {	// Verificando Resposta		
			System.out.println("Errado!");
		} else {
			System.out.println("Certo!");
			pontos++; // Aumentando a Pontuação
		}
		
		int i = 1;
		
		do { // Duas Chances Nesta Pergunta
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Questão número 9 - Difícil (Chance " + i + " de 2)");
			System.out.println("---------------------------------");
			System.out.println("O Pai de Maito Guy foi morto ...");
			System.out.println("1 - pela Akatsuki");
			System.out.println("2 - pelos 7 espadachins da névoa");
			System.out.println("3 - durante a terceira guerra ninja");
			System.out.println("4 - durante a segunda guerra ninja");
			System.out.println("5 - pelo Orochimaru");
			System.out.println("6 - durante o massacre do Clã Uchiha");
			System.out.println("7 - no fim da quarta guerra ninja");
			System.out.println("---------------------------------");
			System.out.print("Resposta: ");
			resposta = sc.nextInt();
			System.out.println("---------------------------------");
			if(resposta != 2) {	// Verificando Resposta		
				System.out.println("Errado!");
				i++;
			} else {
				System.out.println("Certo!");
				pontos++; // Aumentando a Pontuação
				i = 10;
			}
		} while(i <= 2);
		
		i = 1;
		do { // Duas Chances Nesta Pergunta
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Questão número 10 - Difícil (Chance " + i + " de 2)");
			System.out.println("---------------------------------");
			System.out.println("Qual destes não é considerado Kekkei Genkai");
			System.out.println("1 - Técnicas de Estilo Fusão - Mei Terumi");
			System.out.println("2 - Byakugan - Hinata Hyuga");
			System.out.println("3 - Jōgan - Boruto Uzumaki");
			System.out.println("4 - Mangekyou Sharingan - Madara Uchiha");
			System.out.println("5 - Técnicas de Estilo Madeira - Hashirama Senju");
			System.out.println("6 - Teiseigan - Toneri Otsutsuki");
			System.out.println("7 - Técnica das Sombras - Shikamaru Nara");
			System.out.println("---------------------------------");
			System.out.print("Resposta: ");
			resposta = sc.nextInt();
			System.out.println("---------------------------------");
			if(resposta != 7) {	// Verificando Resposta		
				System.out.println("Errado!");
				i++;
			} else {
				System.out.println("Certo!");
				pontos++; // Aumentando a Pontuação
				i = 10;
			}
		} while(i <= 2);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Calculando...");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Resultado:");
		if(pontos <= 4) { // Verificando Pontuação
			System.out.println("Que pena " + nome + " você acertou apenas " + pontos);
		} else if(pontos <= 7) {
			System.out.println("Boa " + nome + " você acertou " + pontos);
		} else if(pontos <= 9){
			System.out.println("Parabéns " + nome + " você acertou " + pontos);
		} else {
			System.out.println("Você acertou todas as 10 questões! Parabéns " + nome);
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("FIM");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		sc.close();
	}

}
