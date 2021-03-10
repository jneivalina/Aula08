
public class entendendofuncoesreturn {

	public static void saudacao(
			String nome)	{
		System.out.println("Saudações Tricolores!!!! "  + nome + " !");
	}
	public static int anoLancamento (int numeroFilme) {
		switch(numeroFilme) {
		case 1:
			return 1999;
			
		case 2:
			return 2002;
			
		case 3:
			return 2005;
			
		case 4:
			return 1977;
			
		case 5:
			return 1980;
			
		case 6:
			return 1983;
			
		default:
			return -1;
		
		}
		
	}
	public static void main(String[] args) {
		saudacao("João");
		
		System.out.println(anoLancamento());
		int ano;
		ano = anoLancamento();
		int diferenca;
		diferenca = 1989 - ano;
		System.out.println("Quando voce o filme foi lancado voce tinha" + diferenca);

	}

}
