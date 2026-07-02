package com.jobtracker.jobtracker.service;

import com.jobtracker.jobtracker.Job;
import com.jobtracker.jobtracker.repository.JobRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class InterviewReminderScheduler {

    private final JobRepository jobRepository;
    private final SendGridEmailService emailService;

    public InterviewReminderScheduler(JobRepository jobRepository,
                                      SendGridEmailService emailService) {
        this.jobRepository = jobRepository;
        this.emailService = emailService;
    }

    @Scheduled(cron = "0 0 9 * * *") 
    // runs every day at 9 AM
    public void sendInterviewReminders() {

        LocalDate tomorrow = LocalDate.now().plusDays(1);

        List<Job> jobs = jobRepository
                .findByInterviewDateAndReminderSentFalse(tomorrow);

        for (Job job : jobs) {
            try {
                emailService.sendEmail(job.getEmail());

                job.setReminderSent(true);
                jobRepository.save(job);

                System.out.println("Reminder sent to: " + job.getEmail());

            } catch (Exception e) {
                System.out.println("Failed for: " + job.getEmail());
                e.printStackTrace();
            }
        }
    }
}