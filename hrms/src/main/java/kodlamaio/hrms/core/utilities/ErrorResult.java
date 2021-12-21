package kodlamaio.hrms.core.utilities;

public class ErrorResult extends Result{

	public ErrorResult(String string) {
		super(false, string);
	}
	
	public ErrorResult() {
		super(false);
	}
}
