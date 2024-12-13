package exception;

public class AuraValueException extends RuntimeException {
	public AuraValueException() {
		super("Aura: Entre 1 e 1000");
	}
}