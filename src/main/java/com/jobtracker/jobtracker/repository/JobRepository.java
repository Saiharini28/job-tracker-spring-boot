package com.jobtracker.jobtracker.repository;

import com.jobtracker.jobtracker.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {

    List<Job> findByInterviewDate(LocalDate interviewDate);

}