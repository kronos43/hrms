package kodlamaio.hrms.core.utilities;

public class Result {
	
	private boolean success;
	private String message;
	
	public Result(boolean success,String string){
		this(success);
		this.message = string;
	}
	
	public Result(boolean success) {
		this.success = success; 
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	public String getMessage() {
		return this.message;
	}
}
