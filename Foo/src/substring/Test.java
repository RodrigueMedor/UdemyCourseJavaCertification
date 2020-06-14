package substring;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "https://images7.bamboohr.com/17789/photos/40549-2-1.jpg?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiaHR0cHM6Ly9pbWFnZXM3LmJhbWJvb2hyLmNvbS8xNzc4OS8qIiwiQ29uZGl0aW9uIjp7IkRhdGVHcmVhdGVyVGhhbiI6eyJBV1M6RXBvY2hUaW1lIjoxNTkxODA4ODI3fSwiRGF0ZUxlc3NUaGFuIjp7IkFXUzpFcG9jaFRpbWUiOjE1OTQ0MDA4Mjh9fX1dfQ__&Signature=GWZ86wkmaJpMR-OiR~rzwAwoUojqMAeDaS7fzRjKNz-R1X4lKNUWNng-uvrFlhCfbsBBJscWpRQfN3OVAWEVRo1qzDLee~MVc9ZV2LTf27jnjTbeKqYNxsAazcjdlZ6MFTV8vtd71-4wlUVoYIEWSHfulIfek2CJ0dc1QN8U7EjONgpb378icqXUYwlx4weM76U-qHRnu34GrAeul7votMvBQZk5veJP2Ri2pe5PCXK-5tGj7Z~dnpvr0EhEX6RHO4wn5Hp4y0rt7lHW11vUWbyvyit4ASAM6KTFjd~OPrqhB80b8fyTP-ZXmVfmg";
		System.out.println(removeLastCharOptional("Rodrigue"));
		
		String str ="abc,cde,def,fgh";
		String kept = string.substring( 0, string.indexOf("?"));
		String remainder = str.substring(str.indexOf(",")+1, str.length());
		System.out.println(remainder);
		System.out.println(kept);

	}
	
	public static String removeLastCharOptional(String s) {
		return Optional.ofNullable(s)
				.filter(str-> str.length() != 0)
				.map(st -> st.substring(0, st.length() -1))
				.orElse(s);
	}

}
