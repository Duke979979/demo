// This program prints a line from that song you know
// Author: <Brad Lenig>
// Date: <10-17-16>

import javax.swing.*;
public class TwelveDays
{
   public static void main (String args[]) 
   {
      int choice;
      String entry;
      double total = 0;
      double price;
	  String suffix = "";
	  String thing;
	  
	  // calls method to get user choice from static method below.  Nice!
      choice = getChoice();

	  // convert to switch
	  switch (choice) 
		{
			case 12:
				thing = " Twelve drummers drumming";
				suffix = "th";
				break;
			case 11:
				thing = " Eleven pipers piping";
				suffix = "th";
				break;
			case 10:
				thing = " Ten lords a-leaping";
				suffix = "th";
				break;
			case 9:
				thing = " Nine ladies dancing";
				suffix = "th";
				break;
			case 8:
				thing = " Eight maids a-milking";
				suffix = "th";
				break;
			case 7:
				thing = " Seven swans a-swimming";
				suffix = "th";
				break;
			case 6:
				thing = " Six geese a-laying";
				suffix = "th";
				break;
			case 5:
				thing = " Five golden rings";
				suffix = "th";
				break;
			case 4:
				thing = " Four calling birds";
				suffix = "th";
				break;
			case 3:
				thing = " Three French hens";
				suffix = "rd";
				break;
			case 2:
				thing = " Two turtle doves and";
				suffix = "nd";
				break;
			case 1:
				thing = " A partridge in a pear tree";
				suffix = "st";
				break;
			default:
				thing = " Invalid choice";
				break;
		}	         
	  System.out.println("\nOn the " + choice + suffix +
          " day of Christmas\n" +
          "My true love gave to me" + thing);
   }
   
   // custom method to get user input with GUI. Returns their day choice.
   public static int getChoice()
   {
      int choice;
      String entry;
      entry = JOptionPane.showInputDialog(null, 
         "From what day do you\n" +
         "want to start the song\n" +
         "The Twelve Days of Christmas?");
      choice = Integer.parseInt(entry);
      return choice;
   }
}