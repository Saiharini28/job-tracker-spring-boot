package com.jobtracker.jobtracker.service;

import com.jobtracker.jobtracker.Job;

import java.util.List;
import java.util.Optional;

public interface JobService {

    List<Job> getAllJobs();

    Job addJob(Job job);

    Optional<Job> getJobById(Long id);

    Optional<Job> updateJob(Long id, Job updatedJob);

    boolean deleteJob(Long id);
}
