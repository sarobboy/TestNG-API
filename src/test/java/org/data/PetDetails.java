package org.data;

public class PetDetails {
	
	public  static String petData( int id , String name, String status) {
		
		return "{\\r\\n\"\r\n"
				+ "				+ \"  \\\"id\\\": "+id+",\\r\\n\"\r\n"
				+ "				+ \"  \\\"category\\\": {\\r\\n\"\r\n"
				+ "				+ \"    \\\"id\\\": 13,\\r\\n\"\r\n"
				+ "				+ \"    \\\"name\\\": \\\"DOG\\\"\\r\\n\"\r\n"
				+ "				+ \"  },\\r\\n\"\r\n"
				+ "				+ \"  \\\"name\\\": \\\""+name+"\\\",\\r\\n\"\r\n"
				+ "				+ \"  \\\"photoUrls\\\": [\\r\\n\"\r\n"
				+ "				+ \"    \\\"string\\\"\\r\\n\"\r\n"
				+ "				+ \"  ],\\r\\n\"\r\n"
				+ "				+ \"  \\\"tags\\\": [\\r\\n\"\r\n"
				+ "				+ \"    {\\r\\n\"\r\n"
				+ "				+ \"      \\\"id\\\": 2,\\r\\n\"\r\n"
				+ "				+ \"      \\\"name\\\": \\\"Dogo argentino\\\"\\r\\n\"\r\n"
				+ "				+ \"    }\\r\\n\"\r\n"
				+ "				+ \"  ],\\r\\n\"\r\n"
				+ "				+ \"  \\\"status\\\": \\\""+status+"\\\"\\r\\n\"\r\n"
				+ "				+ \"}\")";
		
	}

}
