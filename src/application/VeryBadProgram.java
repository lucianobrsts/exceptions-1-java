package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class VeryBadProgram {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		@SuppressWarnings("unused")
		int roomNumber = sc.nextInt();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkout = sdf.parse(sc.next());
		
		if(!checkout.after(checkin)) {
			System.out.println("Error in reservation: check-out date must be after check-in date!");
		} else {
//			Reservation reservation = new Reservation(roomNumber, checkin, checkout);
			
//			System.out.println(reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());
			
			Date now  = new Date();
			
			if(checkin.before(now) || checkout.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates!");
			} else if(checkin.after(checkout)) {
				System.out.println("Error in reservation: check-out date must be after check-in date!");
			} else {
//				reservation.updateDates(checkin, checkout);
//				System.out.println(reservation);
			}
			
		}
		
		
		sc.close();
	}

}
