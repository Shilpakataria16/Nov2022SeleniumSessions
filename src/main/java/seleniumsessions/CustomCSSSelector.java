package seleniumsessions;

import org.openqa.selenium.By;

public class CustomCSSSelector {

	public static void main(String[] args) {
		
		//id
		//   #id
		//   #input-firstname   --css
		//input[@id='input-firstname']   --css
		By fn = By.cssSelector("#input-firstname");
		
		
		//tag#id
		//input#input-firstname
		
		//--------------
		// class
		//     .class
		//   .form-control
		//  tag.classs
		//   input.form-control
		// button.login-submit
		
		//.c1.c2.c3.c4....cn
		//HubSpot applictaion example
		//.form-control.private-form__control.login-email
		//tag.c1.c2.c3...cn
		//input.form-control.private-form__control.login-email
		
		// combine both the properties 
		//#id.class
		//tag#id.class
		//   input#input-firstname.login-email
		//   #input-firstname.login-email
		
		//.class#id
		// .login-email#input-firstname
		//tag.class#id
		//input.login-email#input-firstname
		
		
		//tag.c1.c2.c3.c4....cn#id
		//input#username.form-control.private-form__control.login-email
		
		
		///    other attributes
		//     tag[attr='value']
		//     input[type='text']
		
		//    input[class='login-email']       -css    -- 0 elements
		//input[@class='login-email']       -xpath   -0 elements
		
		//input[contains(@class,'login-email')]      -xpath --1 elements
		
		//input[class='form-control private-form__control login-email']    -css  -1 element
		
		//multiple attr
		//   tag[attr1='value'][attr2='value'][attr3='value']
		//    input[type='text'][name='firstname']    -css
		//input[@type='text'and @name='firstname']    -xpath
		
		
		//  tag#id[attr='value']
		//    input#input-firstname[placeholder='First Name']
		//      input#input-firstname[placeholder='First Name'][type='text']
		//      input#input-firstname[placeholder='First Name'][type='text'].form-control
		
		
		//h1[text()='Register Account']
		//text() is not available in css
		
		
		//contains:
		//   tag[attr*='value']
		//    input[placeholder*='First']
		//    input[id*='firstname']
		//    input[class*='login-email']
		
		
		//starts-with
		//  tag[attr^='value']
		//   input[placeholder^='First']
		
		//ends-with: in Xpath we dont have ends with
		//  tag[attr$='value']
		//    input[placeholder$='Name']
		
		/*  In css selector
		 * contains - *
		 * starts-with - ^
		 * ends-with - $
		 * 
		 *  /
		 *  
		 *  
		 *  
		 */
		
		
		//   parent to child:
		// parent tag child tag  (direct + indirect)
		//  parent tag > child tag  (direct child then use > sign)
		//   parent tag > child tag > child tag
		//       div.private-form__input-wrapper input#username   (HubSpot app)
		
		//      select#Form_getForm_Country option    (orangehrm app)
		//     form#Form_getForm > select   -- 0 elements matching because select is not directly associated with form
		//     form#Form_getForm select   --1 element matching because select is indirect child
		
		
		//    form#hs-login  div  -- 20 elements (direct+indirect)
		//    form#hs-login > div  -- 8 elements (direct)
		
		
		//child to parent: backward traversing not available in css
		
	}

}
