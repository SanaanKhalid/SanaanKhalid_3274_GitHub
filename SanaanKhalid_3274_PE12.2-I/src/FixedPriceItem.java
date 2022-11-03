/****************************************************8
 * @author Sanaan Khalid
 * Date: 10/27/2022 [Th]
 */



/**
    Enhance the invoice-printing program by providing
    for two kinds of line items: One kind describes products
    that are purchased in certain numerical quantities (such as
    "3 toasters"), another describes a fixed charge (such
    as "shipping: $5.00"). Hint: Use inheritance.

    For Part I, only complete the FixedPriceItem class.
*/
public class FixedPriceItem extends AbstractItem {

	private String description;
	private double charge;
	
	/**
	 * Construct an item that has a fixed charge
	 * @param aDescription this description for the item
	 * @param aCharge the charge
	 */
	public FixedPriceItem(String aDescription, double aCharge) {
	
		description = aDescription;
		charge = aCharge;
	}
	
	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		return charge;
	}

	@Override
	public String getDescription(int length) {
		// TODO Auto-generated method stub
		return String.format("%-" + (length - 13) + "s%8.2f        ", description, charge);
	}
	
	












}
