package com.jobtracker.jobtracker.service;

import com.jobtracker.jobtracker.Job;
import com.jobtracker.jobtracker.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public Job addJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    @Override
    public Optional<Job> updateJob(Long id, Job updatedJob) {
        return jobRepository.findById(id).map(job -> {
            job.setCompany(updatedJob.getCompany());
            job.setRole(updatedJob.getRole());
            job.setStatus(updatedJob.getStatus());
            return jobRepository.save(job);
        });
    }

    @Override
    public boolean deleteJob(Long id) {
        if (jobRepository.existsById(id)) {
            jobRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
