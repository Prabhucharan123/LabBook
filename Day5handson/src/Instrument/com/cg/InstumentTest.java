package Instrument.com.cg;

public class InstumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instrument instrument=new Instrument[3];
		
		Instrument i0=new Piano();
		//i0.play();
		Instrument i1=new Guitar();
		//i1.play();
		Instrument i2=new Flute();
		//i2.play();
		Instrument[] i3= {i0,i1,i2};
		//i3.play();
		for(int i=0;i<i3.length;i++) {
			System.out.println("the object stored at "+i+" location" );
			//System.out.println(Instrument[]i3.play(););
			i3[i].play();
			
		}

	}

}
