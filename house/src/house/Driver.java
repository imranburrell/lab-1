package house;

public class Driver {

	public static void main(String[] args) {
		System.out.println("congrats");
		// TODO Auto-generated method stub
int a,b=1;
house[] houses= new house[3];
houses[0]= new house();
houses[0].setAdvertiser("NHT");
 System.out.println("I am buying this house: "+houses[0]);
System.out.println("---All Houses---");
for (house house: houses){
	System.out.println(house);
}
}
}