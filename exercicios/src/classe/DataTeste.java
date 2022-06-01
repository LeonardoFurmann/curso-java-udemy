package classe;

public class DataTeste {
	public static void main(String[] args) {
	
// Construtor padrão
	Data data1 = new Data();
//	data1.ano = 2003;
//	data1.mes = 03;
//	data1.dia = 11;

// Contrutor com paramêtro
	var data2 = new Data(4,4,1977);
	
	
	System.out.print(" Aniversário: " +  data1.obterDataFormatada());
	System.out.print(" \nAniversário mãe: " + data2.obterDataFormatada());
		
		
	}
}
