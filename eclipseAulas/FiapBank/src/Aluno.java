
public class Aluno {
	private String matricula;
	private String nome;
	private double primeiraNota;
	private double segundaNota;
	private double notaTrabalho;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String alunoMatricula) {
		matricula = alunoMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String alunoNome) {
		nome = alunoNome;
	}
	
	public double getPrimeiraNota() {
		return primeiraNota;
	}
	
	public void setPrimeiraNota(double alunoPrimeiraNota) {
		primeiraNota = alunoPrimeiraNota;
	}
	
	public double getSegundaNota() {
		return segundaNota;
	}
	
	public void setSegundaNota(double alunoSegundaNota) {
		segundaNota = alunoSegundaNota;
	}
	
	public double getNotaTrabalho() {
		return notaTrabalho;
	}
	
	public void setNotaTrabalho(double alunoNotaTrabalho) {
		notaTrabalho = alunoNotaTrabalho;
	}
	
	public double calculaMedia() {
		return (primeiraNota * 2.5 + segundaNota * 2.5 + notaTrabalho * 2)/7;
	}
	
	public double calculaNotaNecessariaParaAprovacao() {
		double media = calculaMedia();
		if(media >= 6) {
			return 0.;
		}
		return 12 - media;
	}
	
	
}
