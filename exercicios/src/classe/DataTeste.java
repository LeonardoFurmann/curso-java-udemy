package classe;

public class DataTeste {
	public static void main(String[] args) {
		
	Data data1 = new Data();
//	data1.ano = 2003;
//	data1.mes = 03;
//	data1.dia = 11;
	
	var data2 = new Data(4,4,1977);
	
		
		
	System.out.print(" Anivers�rio: " +  data1.obterDataFormatada());
	System.out.print(" \nAnivers�rio m�e: " + data2.obterDataFormatada());
		
		
	}
}
