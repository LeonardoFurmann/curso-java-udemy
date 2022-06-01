package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;

// Construtor padr�o
	Data(){
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
	}

// Contrutor com param�tro
	Data(int dia, int mes , int ano ){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada(){
		return String.format("%d/%d/%d", this.dia, mes, ano);
	}
}
