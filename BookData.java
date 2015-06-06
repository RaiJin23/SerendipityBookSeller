
public class BookData 
{
	String bookTitle, isbn, author, publisher, dateAdded;
	int qtyOnHand;
	float wholesale, retail;
	boolean empty;
	
	public BookData()
	{
		bookTitle = null;
		isbn = null;
		author = null;
		publisher = null;
		dateAdded = null;
		qtyOnHand = 0;
		wholesale = 0;
		retail = 0;
		empty = true;
	}
	
	public void setTitle()
	{
		
	}
	
	public void setIsbn()
	{
		
	}
	
	public void setAuthor()
	{
		
	}
	
	public void setDateAdded()
	{
		
	}
	
	public void setQty()
	{
		
	}
	
	public void setWholesale()
	{
		
	}
	
	public void setRetail()
	{
		
	}
	
	public boolean isEmpty()
	{
		return empty;
	}
	
	public void removeBook()
	{
		empty = true;
	}
	
	public String getBookTitle()
	{
		return bookTitle;
	}
	
	public String getIsbn()
	{
		return isbn;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getPub()
	{
		return publisher;
	}
	
	public String getDate()
	{
		return dateAdded;
	}
	
	public int getQty()
	{
		return qtyOnHand;
	}
	
	public float getWholeSale()
	{
		return wholesale;
	}
	
	public float getRetail()
	{
		return retail;
	}
	
	
	public String toString()
	{
		System.out.println("Title: " + bookTitle);
		System.out.println("ISBN: " + isbn);
		System.out.println("Author: " + author);
		System.out.println("Publisher: " + publisher);
		System.out.println("Date Added: " + dateAdded);
		System.out.println("Quantity-On-Hand: " + qtyOnHand);
		System.out.println("Wholesale Cost: " + wholesale);
		System.out.println("Retail Price: " + retail);
		return "";
	}
}
