public class Cliente {
	public String nom, ema, end;
		public int [] tel = new int[3];
		public static void main(String[]args) {	
		Cliente joao;
		joao = new Cliente();
		joao.nom="Joao Boa Morte";
		joao.ema="Joao@churrasco.com";
		joao.end="Nova Mutum";
		joao.tel[0]=11223344;
		joao.tel[1]=22334455;
		joao.tel[2]=33445566;
		Cliente maria;
		maria = new Cliente();
		maria.nom="Maria";
		maria.ema="maria@hotmail.com";
		maria.end="Diamantino";
		maria.tel[0]=12121212;
		maria.tel[1]=23232323;
		maria.tel[2]=34343434;
		Cliente creuza;
		creuza = new Cliente();
		creuza.nom="Creuza";
		creuza.ema="Creuza@gmail.com.br";
		creuza.end="Alto Paraguai";
		creuza.tel[0]=11111111;
		creuza.tel[1]=22222222;
		creuza.tel[2]=33333333;
		
		creuza.tel[0]=maria.tel[0];
		creuza.tel[1]=maria.tel[1];
		creuza.tel[2]=maria.tel[2];
		maria.tel[0]=joao.tel[0];
	}
}


