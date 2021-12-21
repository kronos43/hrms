package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Job;


public interface JobService {
	
	public DataResult<List<Job>> findAll();
	
	public Result add(Job job);
	
	public DataResult<List<Job>> findById(int id);
}
