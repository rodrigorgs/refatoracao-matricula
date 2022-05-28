package matricula;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComprovanteDeMatriculaTest {
	@Test
	public void testComprovanteString() {
		Estudante estudante = new Estudante("Fulano");
		Matricula matricula = new Matricula(estudante, 2022);
		matricula.addDisciplina(new Disciplina("MATB02", "Qualidade de Software", 51, true));
		matricula.addDisciplina(new Disciplina("MATA62", "Engenharia de Software I", 68, true));
		matricula.addDisciplina(new Disciplina("MATA57", "Laboratório de Programação I", 68, false));
		matricula.addDisciplina(new Disciplina("MATA59", "Programação de Software Básico", 68, false));
		ComprovanteDeMatricula comprovante = new ComprovanteDeMatricula(matricula);
		String ret = comprovante.toString();
		String expected = "Universidade Federal da Bahia\nCOMPROVANTE DE MATRÍCULA - 2022\nEstudante: Fulano\n---\nMATB02 - Qualidade de Software (51 h)\nMATA62 - Engenharia de Software I (68 h)\nMATA57 - Laboratório de Programação I (68 h)\nMATA59 - Programação de Software Básico (68 h)\n---\nCarga horária obrigatória: 119 h\nCarga horária optativa: 136 h";
		assertEquals(expected, ret);
	}
}
