
class Human {
	int aadhaNumber;
	String name;

	public Human(int aadhaNumber, String name) {
		super();
		this.aadhaNumber = aadhaNumber;
		this.name = name;
	}

	public int getAadhaNumber() {
		return aadhaNumber;
	}

	public void setAadhaNumber(int aadhaNumber) {
		this.aadhaNumber = aadhaNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aadhaNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Human other = (Human) obj;
		if (aadhaNumber != other.aadhaNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class HashCodeAndEquals {
	final static int i=10;
	int j=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human(101, "Arun");
		Human h2 = new Human(101, "Arun");
		System.out.println("Human1 hashcode is " + h1.hashCode());
		System.out.println("Human2 hashcode is " + h2.hashCode());
		System.out.println("Equals method =====>" + h1.equals(h2));
		
		

	}

}
