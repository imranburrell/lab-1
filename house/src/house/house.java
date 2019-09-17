package house;

public class house {
private int id;
private float price;
private String advertiser;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getAdvertiser() {
	return advertiser;
}
public void setAdvertiser(String advertiser) {
	this.advertiser = advertiser;
}
public house(int id, float price, String advertiser) {
	super();
	this.id = id;
	this.price = price;
	this.advertiser = advertiser;
}
public house() {
	this.id=0;
	this.price=0.0f;
	this.advertiser="";
}
@Override
public String toString() {
	return "house [id=" + id + ", price=" + price + ", advertiser="
			+ advertiser + "]";
}

}
