package matricula;

public class Disciplina {
	private String codigo;
	private String nome;
	private int ch;
	private boolean obrigatoria;
	
	public Disciplina(String codigo, String nome, int ch, boolean obrigatoria) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.ch = ch;
		this.obrigatoria = obrigatoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getCh() {
		return ch;
	}

	public boolean isObrigatoria() {
		return obrigatoria;
	}
}
