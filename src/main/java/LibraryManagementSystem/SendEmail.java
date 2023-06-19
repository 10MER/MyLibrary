/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementSystem;

/**
 *
 * @author HP
 */


import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;


public class SendEmail
{

public static void main(String [] args)
{
	// email ID of Recipient.
	String recipient = "ahmedmehaya21@gmail.com";

	// email ID of Sender.
	String sender = "mo3ta999@gmail.com";

	// using host as localhost
	String host = "127.0.0.1";

	// Getting system properties
	Properties properties = System.getProperties();

	// Setting up mail server
	properties.setProperty("smtp.gmail.com", host);

	// creating session object to get properties
	Session session = Session.getDefaultInstance(properties);

	try
	{
		// MimeMessage object.
		MimeMessage message = new MimeMessage(session);

		// Set From Field: adding senders email to from field.
		message.setFrom(new InternetAddress(sender));

		// Set To Field: adding recipient's email to from field.
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

		// Set Subject: subject of the email
		message.setSubject("This is Subject");

		// set body of the email.
		message.setText("This is a test mail");

		// Send email.
		Transport.send(message);
		System.out.println("Mail successfully sent");
	}
	catch (MessagingException mex)
	{
		mex.printStackTrace();
	}
}
}

