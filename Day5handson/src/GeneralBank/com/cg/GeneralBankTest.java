package GeneralBank.com.cg;

public class GeneralBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICIBank ic=new ICICIBank();
		KotMBank kb=new KotMBank();
		System.out.println(ic.getSavingInterestRate());//ic.getSavingInterestRate();
		System.out.println(ic.getFixedInterestRate());//ic.getFixedInterestRate();
		System.out.println(kb.getSavingInterestRate());//kb.getSavingInterestRate();
		System.out.println(kb.getSavingInterestRate());kb.getSavingInterestRate();
		//System.out.println("kb.");
		GeneralBank gb=new ICICIBank();
		GeneralBank gb1=new KotMBank();
		System.out.println(gb.getSavingInterestRate());
		System.out.println(gb.getFixedInterestRate());
		System.out.println(gb1.getSavingInterestRate());
		System.out.println(gb1.getFixedInterestRate());
		
		
		
		

	}

}
