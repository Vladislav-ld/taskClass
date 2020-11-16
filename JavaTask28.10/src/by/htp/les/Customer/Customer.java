package by.htp.les.Customer;

public class Customer {

	private int id;
	private String lastName;
	private String name;
	private String middleName;
	private String adress;
	private int numCard;
	private int numBank;
	
	public Customer(int _id, String _lastName, String _name, String _middleName, String _adress, int _numCard, int _numBank) {
		id = _id;
		lastName = _lastName;
		name = _name;
		middleName = _middleName;
		adress = _adress;
		numCard = _numCard;
		numBank = _numBank;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int _id) {
		id = _id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String _lastName) {
		lastName = _lastName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String _name) {
		name = _name;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String _middleName) {
		middleName = _middleName;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String _adress) {
		adress = _adress;
	}
	
	public int getNumCard() {
		return numCard;
	}
	
	public void setNumCard(int _numCard) {
		numCard = _numCard;
	}

	public int getNumBank() {
		return numBank;
	}

	public void setNumBank(int _numBank) {
		numBank = _numBank;
	}
	
	
	public String toString() {
		return id + " " + lastName + " " + name + " " + middleName + " " + adress + " " + numCard +	" " + numBank;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numBank;
		result = prime * result + numCard;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numBank != other.numBank)
			return false;
		if (numCard != other.numCard)
			return false;
		return true;
	}

}
