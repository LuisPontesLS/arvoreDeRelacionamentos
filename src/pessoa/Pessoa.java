package pessoa;

public class Pessoa {

// ATRIBUTOS
	private String nome, deOnde;
	private Boolean estaViva;
	private Character genero;
	private Double notaInicial;
	private double nota;

// CONSTRUTORES
	public Pessoa() {
	}

	public Pessoa(String nome, String deOnde, Boolean estaViva, Character genero) {
		this.nome = nome;
		this.deOnde = deOnde;
		this.estaViva = estaViva;
		this.genero = genero;
		this.nota = 0.0; //PESSOA SEMPRE INICIA COM NOTA 0.0
	}

// MÉTODOS ACESSORES  MODIFICADORES
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDeOnde() {
		return deOnde;
	}

	public void setDeOnde(String deOnde) {
		this.deOnde = deOnde;
	}

	public Boolean getEstaViva() {
		return estaViva;
	}

	public void setEstaViva(Boolean estaViva) {
		this.estaViva = estaViva;
	}

	public Character getGenero() {
		return genero;
	}

	public void setGenero(Character genero) {
		this.genero = genero;
	}

// MÉTODO ESPECÍFICO
	public double nota(double notaDada) {
		return nota += notaDada;
	}

	@Override
	public String toString() {
		return "Pessoa [Nome: " + nome + ", De onde: " + deOnde + ", Esta viva: " + estaViva + ", Gênero: " + genero + ", Nota: " + String.format("%.1f", nota(nota)) + "]";
	}
	
	

}//
