package hrms.business.abstracts;

import java.util.List;

import hrms.entities.concretes.JobTitles;

public interface JobTitleService {
	List<JobTitles> getAll();
}
