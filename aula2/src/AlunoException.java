
public class AlunoException extends Exception {
	
	private String error;
	
	public AlunoException(String error) {
		this.error = error;
		System.out.println(this.error);
	}
	
}
