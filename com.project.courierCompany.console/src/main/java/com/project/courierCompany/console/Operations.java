package com.project.courierCompany.console;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Date : 2021-05-04
 * The target is 7 kilograms, 2 kilograms, both 7 kilograms and 2 kilograms, or the situation that cannot be created with them at all.
 * 
 * @author AysegulBulur
 * @version 0.0.1
 * 
 */
@RestController
public class Operations extends AMethods{
	
	/* (non-Javadoc)
	 * @see com.project.courierCompany.console.AMethods#preparePackage()
	 *  */
	
	private static final Logger LOGGER = LogManager.getLogger(Operations.class);
	
	@GetMapping("/")
	
	@Override
	public void preparePackage() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please write in kilograms of your package : ");
		
		try{
			target = sc.nextInt();
			
			if(0 < target && target <= 30){
				// The value the user will enter will be between 0 and 30.
				if(target < 7){
					// If the entered value is less than 7.
					if(target % 2 == 0){
						// It is used to see if the entered value is created with 2 kilogram packages.
						multiplesOfTwo = target / 2;
						// It is used to print how many should be used if it is created with 2 kilogram packages.
						System.out.println("Use " + multiplesOfTwo + " grains, 2 kilograms of soap...\n" + "To reach the " + target + 
								" kilograms we can create a " + target + " kilograms package with " + multiplesOfTwo + 
								" ,2 kilograms soaps...");
						LOGGER.info("Package created...");
					}
					else{
						// It is both less than 7 and not divided by 2.
						System.out.println("-1 \n" + "We cannot reach " + target + " kg with 7 and 2 kg packages...");
						LOGGER.error("Package cannot be created...");
					}
				}
				else{
					// If the entered value is greater than 7
					septuple = target / 7;
					// It is used to print how many should be used if created with 7 kilogram packages.
					remainderInDivision = target % 7;
					// It is used to find the remainder of the entered value divided by 7.
					if(target % 7 == 0){
						// Girilen değer hem 7'den büyük hem de 7'ye tam bölünüyorsa
						System.out.println("No soap of 2 kilograms is used....\n" + "To reach the " + target + 
								" kilograms we can create a " + target + " kilograms package with " + septuple + 
								" ,7 kilograms soaps...");
						LOGGER.info("Package created...");
					}
					else{
						// If the value entered is both greater than 7 and not divided by 7
						if(remainderInDivision % 2 == 0){
							/* The remainder of the entered value divided by 7 is divided by 2 exactly?
							    If split means it can be created with both 7-kilogram and 2-kilogram packages.*/
							multiplesOfTwo = remainderInDivision / 2;
							// It is used to print how many 2-kilogram packages should be used.
							System.out.println("Use " + multiplesOfTwo + " grains, 2 kilograms of soap...\n" + "In order to reach the " + target + 
									" kilogram, we can create a " + target + " kilogram package with " + septuple + " of 7 kilograms and " + multiplesOfTwo + " pieces of 2 kilograms of soap...");
							LOGGER.info("Package created...");
						}
						else{
							// The value entered is greater than 7 and cannot be divided by both 7 and 2.
							System.out.println("-1 \n" + "We cannot reach " + target + " kg with 7 and 2 kg packages...");
							LOGGER.error("Package cannot be created...");
						}
					}
				}
			}
			else{
				// If the user enters a value outside the range 0 and 30
				System.out.println("-1 \n" + "We cannot reach " + target + " kg with 7 and 2 kg packages...");
				LOGGER.error("Package cannot be created...");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Please enter the value as an integer...");
			LOGGER.error("No other value can be entered than Interger....");
			preparePackage();
		}
		
	}

}
