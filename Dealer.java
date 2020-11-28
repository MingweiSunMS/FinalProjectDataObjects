import java.util.*;

public class Dealer {
	
	private String dealerId;
	private String dealerName;
	private Address dealerAddress;
	
	public Dealer(String dealerId, String dealerName, Address dealerAddress) {
		this.dealerId=dealerId;
		this.dealerName=Objects.requireNonNull(dealerName,"Dealer's name cannot be null");
		this.dealerAddress=dealerAddress;
	}
	
	public void setDealerId(String dealerId) {
		this.dealerId=dealerId;
	}
	
	public void setDealerName(String dealerName) {
		this.dealerName=dealerName;
	}
	
	public void setDealerAddress(Address address) {
		this.dealerAddress=address;
	}
	
	public String getDealerId() {
		return this.dealerId;
	}
	
	public String getDealerName() {
		return this.dealerName;
	}
	
	public Address getDealerAddress() {
		return this.dealerAddress;
	}
	
	public String toString() {
		return "Dealer Id is: "+this.dealerId
				+"\nDealer Name is: "+this.dealerName
				+"\n"+this.dealerAddress.toString();
	}
	
	
}
