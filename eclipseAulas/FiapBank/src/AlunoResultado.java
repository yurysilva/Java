
public class AlunoResultado {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setMatricula("RM85595");
		aluno.setNome("Yury Silva");
		aluno.setPrimeiraNota(4.0);
		aluno.setSegundaNota(7.0);
		aluno.setNotaTrabalho(10);
		
		double notaParaAprovacao = aluno.calculaNotaNecessariaParaAprovacao();
		
		String mensagem = String.format(
				"O aluno %s ficou com média %.1f e precisa de %.1f pontos na avaliação final. [%s]",
				aluno.getNome(),
				aluno.calculaMedia(),
				notaParaAprovacao,
				notaParaAprovacao != 0 ? "EXAME" : "APROVADO"
		);
		
		System.out.println(mensagem);
	}
	
}
