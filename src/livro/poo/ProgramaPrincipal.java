package livro.poo;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Pessoa p[]=new Pessoa[2];
		Livro l[]=new Livro[3];
		
		
		p[0]=new Pessoa("Ana",16,"F");
		p[1]=new Pessoa("Carlos",38,"M");
		
		l[0]=new Livro("A Cabana","Joseph Gerrard",300,p[0]);
		l[1]=new Livro("A revolucao dos Bichos","Jhorge Orwel",420,p[1]);
		l[2]=new Livro("A Xicara","Jhon Smith",28,p[0]);
		
		//l[0].avancarPag();
		//l[0].avancarPag();
		l[0].avancarPag();
		System.out.println(l[0].toString());
		
		
		System.out.println(l[1].toString());
		
		System.out.println(l[2].toString());
	}

}
