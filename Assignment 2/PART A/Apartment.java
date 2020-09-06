public class Apartment {

	Apartment(Owner owner, int rent)
	{
		this.Rent = rent;
		this.Owner = owner;
	 }
	int getRent() {return this.Rent; }
	Owner getOwner() {return this.Owner; }

	int Rent;
	Owner Owner;

	public static void main(String[] args) {

		Owner owner1 = new Owner("Jeff", 40);
		Owner owner2 = new Owner("Mukesh", 50);
		Owner owner3 = new Owner("Bill", 60);

		Apartment a1 = new Apartment(owner1, 4000);
		Apartment a2 = new Apartment(owner2, 6000);
		Apartment a3 = new Apartment(owner1, 1000);
		Apartment a4 = new Apartment(owner3, 9000);

		// create an array of Apartments and initialize to the above 4
		Apartment array[];
    array = new Apartment[]{a1, a2, a3, a4};

		// find the apt with the hightest rent
		int temp;
    temp = 0;
    Owner owner = new Owner("", 0);
    for (int i = 0; i< array.length; i++)
		{
      if (array[i].getRent() > temp)
      {
        temp = array[i].getRent();
        owner = array[i].getOwner();
      }
      else
        continue;
    }
		// print the name of its owner (to System.out)
		System.out.printf("%s", owner.getName());
	}

}

class Owner {

	Owner(String name, int age)
	{
		this.Age = age;
		this.Name = name;
	 }
	int getAge() { return this.Age; }
	String getName() {return this.Name; }

	int Age;
	String Name;

}
