package ca.bechir.passenger;
import java.io.Serializable;
import java.util.Comparator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;






    @Entity
	public class Passenger implements Comparable<Passenger> {
    	@Id
    	@GeneratedValue(strategy=GenerationType.IDENTITY)
    	//maybe long id
		private Long id;
		private String name;
		private String family;
		private String birthdate;
		private String email;
		private String phone;
		private String gender;
		private int paymentCard;
		private String address;
		private String flightLoc;
		
		
		
	   


		protected Passenger() {
			
		}


		@Override
		public int compareTo(Passenger o) {
			return (this.family).compareTo(o.family);
		}


		public Long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getFamily() {
			return family;
		}


		public void setFamily(String family) {
			this.family = family;
		}


		public String getBirthdate() {
			return birthdate;
		}


		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPhone() {
			return phone;
		}


		public void setPhone(String phone) {
			this.phone = phone;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public int getPaymentCard() {
			return paymentCard;
		}


		public void setPaymentCard(int paymentCard) {
			this.paymentCard = paymentCard;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getFlightLoc() {
			return flightLoc;
		}


		public void setFlightLoc(String flightLoc) {
			this.flightLoc = flightLoc;
		}
		
		
		
}
