/**
    Enhance the invoice-printing program by providing
    for two kinds of line items: One kind describes products
    that are purchased in certain numerical quantities (such as
    "3 toasters"), another describes a fixed charge (such
    as "shipping: $5.00"). Hint: Use inheritance.

    For Part II, complete the QuantityItem class.
    Use the FixedPriceItem class and the AbstractItem
    class you used for part I.
*/
public class QuantityItem extends AbstractItem{
	
	private int quantity;
	Product p;

	public QuantityItem(Product pe, int aQuantity) {
		p = pe;
		quantity = aQuantity;
		// TODO Auto-generated constructor stub
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		double x = p.getPrice() * quantity;
		return x;
	}

	@Override
	public String getDescription(int length) {
		// TODO Auto-generated method stub
		return p.getDescription();
	}
	
	public String format() {
//		final int COLUMN_WIDTH = 43;
//	      return getDescription(COLUMN_WIDTH) + String.format("%8.2f", p.getPrice(), getQuantity(), getTotalPrice());
		return "        " + getDescription(43) + "                   " + p.getPrice() + "   " + getQuantity() + "  " + getTotalPrice(); 
		
	}
	
	
 






}
