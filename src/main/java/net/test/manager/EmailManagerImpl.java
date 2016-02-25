package net.test.manager;

import java.text.MessageFormat;

import net.test.entity.Email;

public class EmailManagerImpl implements EmailManager {

	private AddressBook addressBook;

	private String from;

	private String subject;

	private String bodyTemplate;

	private int discount;

	public EmailManagerImpl(AddressBook addressBook) {
		this.addressBook = addressBook;
	}

	public Email generateEmail() {

		Email email = new Email();
		email.setFrom(from);
		email.setTo(addressBook.getRecipients());
		email.setSubject(subject);
		email.setBody(MessageFormat.format(bodyTemplate, discount));

		return email;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBodyTemplate() {
		return bodyTemplate;
	}

	public void setBodyTemplate(String bodyTemplate) {
		this.bodyTemplate = bodyTemplate;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
