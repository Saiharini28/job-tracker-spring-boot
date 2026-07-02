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

        Email from = new Email("kinnuu1415@gmail.com"); // Your verified sender email
        Email to = new Email(toEmail);

        String subject = "Test Email from Job Tracker";

        Content content = new Content(
                "text/plain",
                "Congratulations! 🎉 Your SendGrid integration is working successfully."
        );

        Mail mail = new Mail(from, subject, to, content);

        SendGrid sendGrid = new SendGrid(apiKey);

        Request request = new Request();
        request.setMethod(Method.POST);
        request.setEndpoint("mail/send");
        request.setBody(mail.build());

        Response response = sendGrid.api(request);

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody());
    }
}