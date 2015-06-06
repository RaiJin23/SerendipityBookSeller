import java.util.Scanner;
public class TestPos
{
	public static void main (String[] args)
	{
	
		BookData books[] = new BookData[20];
		for ( int i = 0; i < books.length; i++) 
		{
			books[i]=new BookData();
		}
		
		System.out.println("Size of array: " + books.length);
		int choice;
		float inventoryTotal = 0;
		Scanner keyboard = new Scanner(System.in);
		int size = books.length;
		do
			{	
				System.out.println("Serendipity Booksellers");
				System.out.println("Main Menu");
				System.out.println();
				System.out.println();
				System.out.println("    1. Cashier Module");
				System.out.println("    2. Inventory Database Module");
				System.out.println("    3. Report Module");
				System.out.println("    4. Exit");
			
				System.out.println("Enter your choice(1-4): ");
				choice = keyboard.nextInt();
				//keyboard.nextLine();
				
				if (choice > 4 || choice <= 0)
				{
					System.out.println("Please enter a valid choice.");
					System.out.println();
				}
			
				switch (choice)
				{
					case 1:
						String date, isbn, title;
						int ans;
						int bookQty;
						int[] bookHolder = new int[10];
						int[] qtyHolder = new int[10];
						float price;
						
						do
						{
							keyboard.nextLine(); //clear buffer?
							System.out.println("Enter the date(MM/DD/YY): ");
							date = keyboard.nextLine();
							System.out.println("Enter the title of the book: ");
							title = keyboard.nextLine();
							/*-----------------------------------------------------------------
							/Look-Up book in-function
							/-----------------------------------------------------------------*/
								for(int i = 0;  i < size;  i++)
									{
										if (books[i].bookTitle != null)
										{
											if(books[i].bookTitle.equals(title) == true)
											{
												System.out.println("Book found!");
												System.out.println("Quantity of book being purchased: ");
												
												bookQty = keyboard.nextInt();
												keyboard.nextLine();
												
												//inner for loop to hold the number
												for(int j = 0; i < bookHolder.length; j++)
												{
													if (bookHolder[j] == 0)
													{
														bookHolder[j] = i;
														break;
													}
													else 
													{
														System.out.println("Cannot add anymore to the transactions");
													}
												}
												for(int k = 0; i < qtyHolder.length; k++)
												{
													if (bookHolder[k] == 0)
													{
														bookHolder[k] = bookQty;
														break;
													}
													else 
													{
														System.out.println("Cannot add anymore to the transactions");
													}
												}
												break;
											}
											else if (books[i] == null)
											{
												System.out.println("Book not found!");
											}
										}
										else if(i == (books.length-1))
											System.out.println("Reached end of inventory, book not found");
									}
							//---------------------------------------------------------------------
							System.out.println();
							System.out.println();
							System.out.println("Would you like to add another book?(1.Yes /2. No)");
							ans = keyboard.nextInt();
							keyboard.nextLine();
							
						} while (ans != 2);
							
							
							System.out.println("Serendipity Booksellers");
							System.out.println();
							System.out.println("Date: ");
							System.out.println();
							System.out.println("Qty" + "\t"+ "ISBN" + "\t    " + "Title" + "\t\t\t" + "Price" + "\t" + "Total");
							System.out.println("_______________________________________________________________");
							//System.out.println(bookQty + "\t" + isbn + "   " + title + "\t\t\t" + price + "\t" + (bookQty * price));
							System.out.println();
							System.out.println();
							
							System.out.println("\t\t    " + "Subtotal");
							System.out.println("\t\t    " + "Tax");
							System.out.println("\t\t    " + "Total");
								
							System.out.println();
							System.out.println();
							
						
							System.out.println("Thank You For Shopping at Serendipity!");
						break;
						
					case 2:
						do
						{
							System.out.println("Serendipity Booksellers");
							System.out.println("Inventory Database");
							System.out.println();
							System.out.println();				
							System.out.println("    1. Look-Up a Book");
							System.out.println("    2. Add a Book");
							System.out.println("    3. Edit a Book' Record");
							System.out.println("    4. Delete a Book");
							System.out.println("    5. Return to Main Menu");
							System.out.println();
							System.out.println();
			
							System.out.println("Enter your choice(1-5): ");
							choice = keyboard.nextInt();
							keyboard.nextLine();
							if (choice > 5 || choice <= 0)
							{
								System.out.println("Please enter a valid choice.");
								System.out.println();
							}
							
							switch (choice)
							{
								case 1:
									lookUpBook(books);
									
									break;

									case 2:
										addBook(books);
									
										break;
									case 3:
										editBook(books);
										
										break;
					
									case 4:
										deleteBook(books);
										
										break;
									case 5:
										break;
							}
						} while (choice != 5);
				
						break;
						
					case 3:
						do
						{
							System.out.println("Serendipity Booksellers");
							System.out.println("Reports");
							System.out.println();
							System.out.println("1. Inventory Listing");
							System.out.println("2. Inventory Wholesale Value");
							System.out.println("3. Inventory Retail Value");
							System.out.println("4. Listing by Quantity");
							System.out.println("5. Listing by Cost");
							System.out.println("6. Listing by Age");
							System.out.println("7. Return to Main Menu");
							System.out.println();
							System.out.println("Enter your choice(1-7): ");
							choice = keyboard.nextInt();
							switch (choice)
							{
								case 1:
									repListing(books);
									
									break;
								case 2:
									repWholesale(books);
									break;
								case 3:
									repCost(books);
									break;
								case 4:
									break;
								case 5:
									break;
								case 6:
									break;
								case 7:
									break;
							}
							
						} while (choice != 7);
						break;
					case 4:
						break;
					
				
				} 
		
			}while (choice != 4);
	
	}
	
	public static void deleteBook(BookData[] book)
	{
		Scanner keyboard = new Scanner(System.in);
		String deleteTitle;
		System.out.println("Enter the title: ");
		
		deleteTitle = keyboard.nextLine();

		for(int i = 0;  i < book.length;  i++)
		{
			if(book[i].bookTitle.equals(deleteTitle) == true)
			{
				System.out.println("Book found");
				System.out.println(book[i]);
				System.out.println();
				System.out.println("Are you sure you want to delete the record? ");
				int c;
				c = keyboard.nextInt();
				if (c == 1)
				{
					book[i].removeBook();
				} //end if
				else
					System.out.println("Thanks for not deleting it.");

				break;
			} // end of if
			else if (i == (book.length-1))
				System.out.println("Book not found");

		} //end of for
	}
	public static void repCost(BookData[] book)
	{
		//---------------------------------------------
		//RepCost Function
		//---------------------------------------------
		float inventoryTotal = 0;
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < book.length && book[i].isEmpty() == false; i++)
		{
			System.out.println(book[i].bookTitle);
			System.out.println(book[i].isbn);
			System.out.println(book[i].qtyOnHand);
			System.out.println(book[i].retail);
			System.out.print("Total retail value: ");
			System.out.println(book[i].wholesale * book[i].retail);
			inventoryTotal += book[i].wholesale * book[i].retail;
			System.out.println("Total Inventory Value:" + inventoryTotal);
			System.out.println("Press enter to view the next or exit.");
			keyboard.nextLine();
			keyboard.nextLine();
			System.out.println();
			System.out.println();
			System.out.println();
	
		}
	}
	public static void repWholesale(BookData[] book)
	{
		//---------------------------------------------
		//RepWholesale Function
		//---------------------------------------------
		Scanner keyboard = new Scanner(System.in);
		float inventoryTotal = 0;
		for(int i = 0; i < book.length && book[i].isEmpty() == false; i++)
		{
			
			System.out.println(book[i].bookTitle);
			System.out.println(book[i].isbn);
			System.out.println(book[i].qtyOnHand);
			System.out.println(book[i].wholesale);
			System.out.print("Total wholesale value: ");
			System.out.println(book[i].wholesale * book[i].qtyOnHand);
			inventoryTotal += book[i].wholesale * book[i].qtyOnHand;
			System.out.println("Total Inventory Value:" + inventoryTotal);
			System.out.println("Press enter to view the next or exit.");
			keyboard.nextLine();
			keyboard.nextLine();
			System.out.println();
			System.out.println();
			System.out.println();

		}//end for
	} // end repWholesale
	public static void repListing(BookData[] book)
	{
		//---------------------------------------------
		//RepListing Function
		//---------------------------------------------
		for(int i = 0; i < book.length && book[i].isEmpty() == false; i++)
		{
			Scanner keyboard = new Scanner(System.in);	
			System.out.println(book[i]);
			System.out.println("Press enter to view the next or exit.");
			keyboard.nextLine();
			keyboard.nextLine();
			System.out.println();
			System.out.println();
			System.out.println();

		} //end for
		System.out.println("Done!");
	} //end repListing
	
	public static void lookUpBook(BookData[] book) 
	{
		Scanner keyboard = new Scanner(System.in);
		String aTitle;
		System.out.println("Enter the title: ");
	
		aTitle = keyboard.nextLine();

		for(int i = 0;  i < book.length;  i++)
		{
			if(book[i].bookTitle.equals(aTitle) == true)
			{
				System.out.println("Book found");
				break;
			}
			else if (i == (book.length-1))
				System.out.println("Book not found");
			
		}
	}
	public static void editBook(BookData[] book)
	{
		Scanner keyboard = new Scanner(System.in);
		String findTitle;
		System.out.println("Enter the title: ");
		findTitle = keyboard.nextLine();
		for(int i = 0;  i < book.length;  i++)
		{
			if(book[i].bookTitle.equals(findTitle) == true)
			{
				System.out.println("Book found");
				System.out.println("Here's the details:");
				System.out.println(book[i]);
				
				System.out.println();
				System.out.println("What would you like to edit?");
				int select;
				select = keyboard.nextInt();
				switch (select)
				{
					case 1:
						System.out.println("Enter the new title: " );
						book[i].bookTitle = keyboard.nextLine();
						break;
					
					case 2:
						System.out.println("Enter the new isbn: " );
						book[i].isbn = keyboard.nextLine();
						break;
					
					case 3:
						System.out.println("Enter the new qty:" );
						book[i].qtyOnHand = keyboard.nextInt();
						break;

					case 4:
						System.out.println("Enter the new wholesale:" );
						book[i].wholesale = keyboard.nextFloat();
						break;

					case 5:
						System.out.println("Enter the new retail:" );
						book[i].retail = keyboard.nextFloat();
						break;
				}//end of switch
			break;
			} //end of if
			else
			System.out.println("Book not found");
		
		}//end of for		
	} //end of editBook
	public static void addBook(BookData[] book)
	{
		int emptySpot = 0;
		boolean found = false;
		Scanner keyboard = new Scanner(System.in);			
		for(int i = 0; i < book.length && found == false; i++)
		{
			if(book[i].isEmpty() == true)
			{
				emptySpot = i;
				book[i].empty = false;
				found = true;
				
			}
			else if (i == (book.length -1))
			{
				System.out.println("Reached end of inventory, no more space!");
			}

		}
		
		
		System.out.println("Space available at: " + emptySpot);

		System.out.println("Enter the title: ");
		book[emptySpot].bookTitle = keyboard.nextLine();
		System.out.println("ISBN: ");
		book[emptySpot].isbn = keyboard.nextLine();
		//System.out.println("Author: ");
		//	books[emptySpot].author = keyboard.nextLine();
		//System.out.println("Publisher: ");
		//books[emptySpot].publisher = keyboard.nextLine();
		//System.out.println("Date Added: ");
		//books[emptySpot].dateAdded = keyboard.nextLine();
		System.out.println("Quantity: ");
		book[emptySpot].qtyOnHand = keyboard.nextInt();
		System.out.println("Wholesale Cost: ");
		book[emptySpot].wholesale = keyboard.nextFloat();
		System.out.println("Retail Price: ");
		book[emptySpot].retail = keyboard.nextFloat();
		

	}
}
