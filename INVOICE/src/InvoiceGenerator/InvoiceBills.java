/**
 * 
 */
package InvoiceGenerator;

import java.io.PrintWriter;

/**
 * @author suraj
 *
 */
public class InvoiceBills {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		StringBuffer bill = new StringBuffer();

		StringBuffer starLine = new StringBuffer();
		for (int i = 0; i<80; i++) {
			starLine.append("-");
		}
        bill.append(starLine);
		bill.append("\n");
		

		// INVOICE LINE
		bill.append(String.format("|%34s", ""));
		bill.append(String.format("%10.10s", "INVOICE"));
		bill.append(String.format("%34s|", ""));

		bill.append("\n");
		bill.append(starLine);

		// COMPANY NAME
		bill.append("\n");
		bill.append(String.format("|%-39.39s|", "SURAJ.co"));
		bill.append(String.format("%-38.38s|", "CustmerName:"));

		// ADDRESS
		bill.append("\n");
		bill.append(String.format("|%-39.39s|", "SURAJ.co Company Sangola,413308"));
		bill.append(String.format("%-38.38s|", "Custmer Address:"));

		// MOBILE NUMBER
		bill.append("\n");
		bill.append(String.format("|%-39.39s|", "Telephone Number:02187-22909"));
		bill.append(String.format("%-38.38s|", "Mobile Number:9867452310"));

		// STRA LINE
		bill.append("\n");
		bill.append(starLine);

		// LINE FOR INVOICE ROW
		bill.append("\n");
		bill.append(String.format("|%-27.27s|", "Invoice Number :2012080166"));
		bill.append(String.format("%-24.24s|", "Invoice Date :09-sep-2021"));
		bill.append(String.format("%-25.25s|", "Salesman:Suraj"));

		// LINE FOR INVOICE ROW 2
		bill.append("\n");
		bill.append(String.format("|%-27.27s|", "PO Number : P001"));
		bill.append(String.format("%-24.24s|", "PO Date :--"));
		bill.append(String.format("%-25.25s|", ""));

		// PRINT STAR LINE
		bill.append("\n");
		bill.append(starLine);

		// PRINT HEADER BLOCK
		bill.append("\n");
		bill.append(String.format("|%-8.8s|","HSNC"));
		bill.append(String.format("%-13.13s|","PROD DESC"));
		bill.append(String.format("%-7.7s|","MRP"));
		bill.append(String.format("%-7.7s|","Box"));
		bill.append(String.format("%-7.7s|","Rate"));
		bill.append(String.format("%-7.7s|","Scheme"));
		bill.append(String.format("%-7.7s|","GST%"));
		bill.append(String.format("%-7.7s|","GST AMT"));
		bill.append(String.format("%-7.7s|","Net AMT"));
		
		// PRINT STAR LINE
				bill.append("\n");
				bill.append(starLine);
				
		for (int i=0;i<8;i++) {
			bill.append("\n");
			bill.append(String.format("|%-8.8s|","PEN"));
			bill.append(String.format("%-13.13s|","PARKER,BLUE"));
			bill.append(String.format("%-7.7s|","150"));
			bill.append(String.format("%-7.7s|","1"));
			bill.append(String.format("%-7.7s|","150"));
			bill.append(String.format("%-7.7s|","NO"));
			bill.append(String.format("%-7.7s|","18%"));
			bill.append(String.format("%-7.7s|","18"));
			bill.append(String.format("%-7.7s|","168"));
		}
		
		// PRINT STAR LINE
		bill.append("\n");
		bill.append(starLine);
		
		//WRITE TO FILE
		PrintWriter out=new PrintWriter("bill.txt");
		out.println(bill);
		out.close();
	
		

		System.out.println(bill);
	}

}
