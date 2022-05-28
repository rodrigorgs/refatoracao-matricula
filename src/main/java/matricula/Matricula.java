package matricula;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Matricula {
	private Estudante estudante;
	private int ano;
	private Collection<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Matricula(Estudante estudante, int ano) {
		super();
		this.estudante = estudante;
		this.ano = ano;
	}

	public void addDisciplina(Disciplina d) {
		disciplinas.add(d);
	}
	
	public Estudante getEstudante() {
		return estudante;
	}

	public int getAno() {
		return ano;
	}
	
	public Collection<Disciplina> getDisciplinas() {
		return Collections.unmodifiableCollection(disciplinas);
	}
}
