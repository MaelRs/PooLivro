package livro.poo;

public class Livro implements Publicacao{
	private String titulo,autor;
	private int totPag,pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	

	public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPag = totPag;
		this.aberto=false;
		this.pagAtual=0;
		this.leitor = leitor;
	}
	
	

	@Override
	public String toString() {
		System.out.println("------------------------------------------------------------------");
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totPag=" + totPag + ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ", leitor=" + leitor.getNome() +", idade="+leitor.getIdade()+", sexo= "+leitor.getSexo()+ "]";
	}
	
		public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getTotPag() {
		return totPag;
	}



	public void setTotPag(int totPag) {
		this.totPag = totPag;
	}



	public int getPagAtual() {
		return pagAtual;
	}



	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}



	public boolean getAberto() {
		return aberto;
	}



	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}



	public Pessoa getLeitor() {
		return leitor;
	}



	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}



	@Override
	public void abrir() {
		this.aberto=true;
		
	}

	@Override
	public void fechar() {
		this.aberto=false;
	}

	@Override
	public void folear(int p) {
		if(p>this.getTotPag()) {
			this.pagAtual=0;
		}else {
			this.pagAtual=p;
		}
		
	}

	@Override
	public void avancarPag() {
		if (this.aberto=true) {
			this.setPagAtual(this.getPagAtual()+1);
		}else {
			System.out.println("Livro fechado");
		}
	}

	@Override
	public void voltarPag() {
		if (this.aberto=true) {
			this.setPagAtual(this.getPagAtual()-1);
		}else {
			System.out.println("Livro fechado");
		}
	}
	

}
