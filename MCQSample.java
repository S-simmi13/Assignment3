package day11;

public class MCQSample {

	String k;
	protected void finalize()
	{
		System.out.println("garbage collected");
	}
	public static void main(String[] args) {
		
//		MCQSample p= new MCQSample();
//		
//		System.out.println(p.k);//null

		
//		MCQSample p1;
//		p1=null;
//		System.out.println(p1.k); //NullPointerException

		
		MCQSample p2= new MCQSample();
        p2=null;
        System.gc();
		
		
		
		
	}

}
