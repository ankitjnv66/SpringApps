package spring.assignment.Assignment1;

import org.springframework.stereotype.Component;

@Component
public class Bank {

	String bankName;
	String bankAddress;
	
	public Bank() {
		
	}
	
	

	public Bank(String bankName, String bankAddress) {
		super();
		this.bankName = bankName;
		this.bankAddress = bankAddress;
	}



	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}



	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankAddress=" + bankAddress + "]";
	}
	
	
	
}
