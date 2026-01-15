package com.jobtracker.jobtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jobtracker.jobtracker.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}

