package kodlamaio.hrms.core.utilities;

public class SuccessResult extends Result{

	public SuccessResult(String string) {
		super(true, string);
	}
	
	public SuccessResult() {
		super(true);
	}
	
}
