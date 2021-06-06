package hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.business.abstracts.JobTitleService;
import hrms.dataAccess.abstracts.JobTitleDao;
import hrms.entities.concretes.JobTitles;

@Service
public class JobTitleManager implements JobTitleService {
	
	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao=jobTitleDao;
	}

	@Override
	public List<JobTitles> getAll() {
		return this.jobTitleDao.findAll();
	}

}
