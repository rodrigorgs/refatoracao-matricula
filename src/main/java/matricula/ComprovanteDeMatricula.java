package matricula;

public class ComprovanteDeMatricula {
	private Matricula matricula;

	public ComprovanteDeMatricula(Matricula matricula) {
		super();
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		String texto = "";
		
		// cabeçalho - TODO: extrair método
		String cabecalho = "";
		cabecalho += "Universidade Federal da Bahia";
		cabecalho += "\nCOMPROVANTE DE MATRÍCULA - " + matricula.getAno();
		cabecalho += "\nEstudante: " + matricula.getEstudante().getNome();
		cabecalho += "\n---";
		
		texto += cabecalho;
		
		// disciplinas - TODO: extrair método
		String lista = "";
		for (Disciplina d : matricula.getDisciplinas()) {
			lista += "\n" + d.getCodigo() + " - " + d.getNome() + " (" + d.getCh() + " h)";
		}
		
		texto += lista;
		
		// sumário - TODO: extrair método
		// TODO: extrair método de calcular CH obrigatória
		//   e mover para a classe Matricula 
		String sumario = "\n---";
		int chOb;
		chOb = 0;
		for (Disciplina d: matricula.getDisciplinas()) {
			if (d.isObrigatoria()) {
				chOb += d.getCh();
			}
		}
		sumario += "\nCarga horária obrigatória: " + chOb + " h";
		
		// TODO: extrair método de calcular CH optativa
		//   e mover para a classe Matricula
		int chOp = 0;
		for (Disciplina d: matricula.getDisciplinas()) {
			if (!d.isObrigatoria()) {
				chOp += d.getCh();
			}
		}
		sumario += "\nCarga horária optativa: " + chOp + " h";
		
		texto += sumario;
		
		// TODO: ao final, remover a variável texto.
		//       O codigo deste método deve conter apenas uma linha:
		//       return cabecalho() + disciplinas() + sumario();
		return texto;
	}
}
