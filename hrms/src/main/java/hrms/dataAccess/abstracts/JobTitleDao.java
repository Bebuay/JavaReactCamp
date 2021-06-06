package hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.JobTitles;

public interface JobTitleDao extends JpaRepository<JobTitles,Integer>{

}
