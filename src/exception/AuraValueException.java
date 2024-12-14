package exception;

public class AuraValueException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AuraValueException() {
		super("Aura: Entre 1 e 1000");
	}
}