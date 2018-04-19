/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.util.Locale;

/**
 *
 * @author Administrator
 */
public class country_test {
    
    public static void main(String[] args) {

	country_test obj = new country_test();
	obj.run();

    }

    public void run() {

	String[] locales = Locale.getISOCountries();
       
       
  
	for (String countryCode : locales) {

		Locale obj = new Locale("", countryCode);
                
               String a =obj.getDisplayCountry();
              
                
                 //System.out.println(a);
                 
                 

		//System.out.println("Country Code = " + obj.getCountry() 
		//	+ ", Country Name = " + obj.getDisplayCountry());

	}
   
	//System.out.println("Done");
    }
    
}
