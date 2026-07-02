package com.jobtracker.jobtracker.service;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SendGridEmailService {

    @Value("${sendgrid.api.key}")
    private String apiKey;

    public void sendEmail(String toEmail) throws IOException {

    Email from = new Email("kinnuu1415@gmail.com");
    Email to = new Email(toEmail);

    String subject = "Interview Reminder - Job Tracker";

    String message =
            "Dear Candidate,\n\n" +
            "This is a friendly reminder that your interview is scheduled for tomorrow.\n\n" +
            "Please find the details below:\n\n" +
            "Company: Job Application Tracker\n" +
            "Interview Date: Tomorrow\n" +
            "Time: Please check your schedule\n\n" +
            "This is an automated reminder from Job Tracker System.\n\n" +
            "All the best for your interview!\n\n" +
            "Regards,\n" +
            "Job Tracker System";

    Content content = new Content("text/plain", message);

    Mail mail = new Mail(from, subject, to, content);

    SendGrid sendGrid = new SendGrid(apiKey);

    Request request = new Request();
    request.setMethod(Method.POST);
    request.setEndpoint("mail/send");
    request.setBody(mail.build());

    Response response = sendGrid.api(request);

    System.out.println("Status Code: " + response.getStatusCode());
}
}