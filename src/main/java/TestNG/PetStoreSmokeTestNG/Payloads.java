package TestNG.PetStoreSmokeTestNG;


public  class Payloads {
	

	
	public static String CreateBody(int id)
	{
	
	
	return  "{\r\n" + 
			"    \"id\": "+id+",\r\n" + 
			"    \"category\": {\r\n" + 
			"        \"id\": 0,\r\n" + 
			"        \"name\": \"string\"\r\n" + 
			"    },\r\n" + 
			"    \"name\": \"tony\",\r\n" + 
			"    \"photoUrls\": [\r\n" + 
			"        \"string\"\r\n" + 
			"    ],\r\n" + 
			"    \"tags\": [\r\n" + 
			"        {\r\n" + 
			"            \"id\": 0,\r\n" + 
			"            \"name\": \"string\"\r\n" + 
			"        }\r\n" + 
			"    ],\r\n" + 
			"    \"status\": \"available\"\r\n" + 
			"}";
	}
	
	
	public static String UpdateBody(int id)
	{
	
	
	return  "{\r\n" + 
			"    \"id\": "+id+",\r\n" + 
			"    \"category\": {\r\n" + 
			"        \"id\": 0,\r\n" + 
			"        \"name\": \"string\"\r\n" + 
			"    },\r\n" + 
			"    \"name\": \"tony\",\r\n" + 
			"    \"photoUrls\": [\r\n" + 
			"        \"string\"\r\n" + 
			"    ],\r\n" + 
			"    \"tags\": [\r\n" + 
			"        {\r\n" + 
			"            \"id\": 0,\r\n" + 
			"            \"name\": \"string\"\r\n" + 
			"        }\r\n" + 
			"    ],\r\n" + 
			"    \"status\": \"not available\"\r\n" + 
			"}";
}
}
