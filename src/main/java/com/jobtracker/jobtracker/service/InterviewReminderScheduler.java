package com.jobtracker.jobtracker.service;

import com.jobtracker.jobtracker.Job;
import com.jobtracker.jobtracker.repository.JobRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
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
    public void sendInterviewReminders() throws IOException {

        LocalDate tomorrow = LocalDate.now().plusDays(1);

        List<Job> jobs = jobRepository.findByInterviewDate(tomorrow);

        for (Job job : jobs) {

            if (job.getEmail() != null && !job.getEmail().isBlank()) {

                emailService.sendEmail(job.getEmail());

                System.out.println("Reminder sent to: " + job.getEmail());

            }
        }
    }
}
