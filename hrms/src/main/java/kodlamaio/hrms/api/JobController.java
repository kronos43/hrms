package kodlamaio.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Job;

@RestController
@RequestMapping("Jobs")
public class JobController {
	
	private JobService jobService;
		
		@Autowired
		public JobController(JobService jobService) {
			super();
			this.jobService = jobService;
		}
		
		@GetMapping("/findall")
		public DataResult<List<Job>> getAll(){
			return this.jobService.findAll();
		}
		
		@PostMapping("/add")
		public Result add(@RequestBody Job job) {
			return this.jobService.add(job);
		}
		
		@GetMapping("/findById")
		public DataResult<List<Job>> findById(int id){
			return this.findById(id);
		}
}
