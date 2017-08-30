package it.alten.project.example.pmd;

public class PMDTest {

	public static void main(String[] args) {
		
		String s= null;
	
		s = new String("");
		s = new String("");
		
		try{
			Integer.parseInt(s);
		}catch(Exception e){
			
		}
		
		try{
			Integer.parseInt(s);
		}catch(Exception e){
			
		}
		
		
		try{
			Integer.parseInt(s);
		}catch(Exception e){
			
		}
	}
}
