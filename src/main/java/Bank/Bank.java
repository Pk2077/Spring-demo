package Bank;

import org.springframework.beans.factory.annotation.Autowired;

public class Bank {
	private String Bname;
	private Address address;
	
	public Bank(Address address) {
		super();
		this.address = address;
	}
	
	@Autowired
	private Address address1;
	

}
