package com.project.courierCompany.console;

/**
 * Date : 2021-05-04
 * 
 * @author AysegulBulur
 * @version 0.0.1
 * */

public abstract class AMethods {
	
	/**
	 * int value for septuple : 7-kilogram packages
	 */
	public int septuple;
	/**
	 * int value for multiplesOfTwo : 2-kilogram packages
	 */
	public int multiplesOfTwo;
	/**
	 * int value for remainderInDivision : Remainder from the 7 kilogram or 2 kilogram division of the target
	 */
	public int remainderInDivision;
	/**
	 * int value for target : The weight of the package the user wants to prepare.
	 */
	public int target;
	
	public abstract void preparePackage();

}
