package com.hcl.vamsi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Class to find all the circular prime numbers between 2 and the given number.
 * @author Vamsi.Kallam
 *
 */
@Controller
public class FindAllCircularPrimeNumber {
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/findAllCircularPrime")
	@ResponseBody
	public static StringBuilder findAllCircularPrimeNumber(@RequestParam("number") int number){
		StringBuilder circularPrimeNumberList = new StringBuilder();		
		// TODO Auto-generated method stub				
				//for (int i = 2;i<=number;i++){
				/*	if(Boolean.valueOf(CircularPrimeNumber.isCircularPrimeNumber(i))){
						System.out.println(i + " is circular Prime number");
						circularPrimeNumberList.append(String.valueOf(i)).append(" ");
					}
				}*/
		return circularPrimeNumberList;
	}
}
