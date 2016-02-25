package net.test;

import net.test.manager.AddressBookImpl;
import net.test.manager.EmailManagerImpl;

public class Main {

	public static void main(String[] args) {

		AddressBookImpl addressBook = new AddressBookImpl();
		addressBook.setRecipients("customer1@mycompany.com, customer2@mycompany.com");

		EmailManagerImpl emailManager = new EmailManagerImpl(addressBook);
		emailManager.setFrom("info@mycompany.com");
		emailManager.setSubject("Discount granted !");
		emailManager.setBodyTemplate("You have been granted {0}% discount !");
		emailManager.setDiscount(10);

		System.out.println(emailManager.generateEmail());

	}

}
