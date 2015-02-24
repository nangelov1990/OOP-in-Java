package data.product;

import java.text.ParseException;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;
import interfaces.Expirable;
import data.Product;
import enumerations.AgeRestriction;

public class FoodProduct extends Product implements Expirable {
	private DateTime expirationDate;

	private int promotionPeriodInDays = 15;
	private float promotionProcentage = 0.7f;
	int daysToProductExpiration = Days
									.daysBetween(
										getTodayDate(),
										new DateTime(this.getExpirationDate()))
									.getDays();
	
	public FoodProduct(
			String name,
			float price,
			int quantity,
			AgeRestriction ageRestriction) {
		super(name, price, quantity, ageRestriction);
		this.setPromotionPrice(promotionProcentage, InPromotionPeriod());
	}
	
	public FoodProduct(
			String name,
			float price,
			int quantity,
			AgeRestriction ageRestriction,
			String expirationDate) throws ParseException {
		this(name, price, quantity, ageRestriction);
		this.setExpirationDate(expirationDate);
		this.setPromotionPrice(promotionProcentage, InPromotionPeriod());
	}
		
	@Override
	public DateTime getExpirationDate() {
		return this.expirationDate;
	}
	
	public void setExpirationDate(String StringExpirationDate) throws ParseException {
		this.expirationDate = DateTime.parse(StringExpirationDate);		
	}
	
	private DateTime getTodayDate() {
		DateTime today = new DateTime(new Date());
		
		return today;
	}
	
	public boolean isExpired(){
		if (daysToProductExpiration <= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean InPromotionPeriod() {
		if (daysToProductExpiration <= promotionPeriodInDays) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String foodProduct = super.toString();
		if (this.getExpirationDate() != null) {
			foodProduct = foodProduct.replace(" ]\n", "; ") +
				String.format(
					"ExpirationDate: %s ]\n",
					this.getExpirationDate().toString("dd.MM.yyyy"));
		} else {
			
		}
				
		return foodProduct;
	}
}
