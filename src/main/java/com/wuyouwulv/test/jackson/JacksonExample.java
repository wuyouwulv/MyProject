package com.wuyouwulv.test.jackson;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonExample {
    public static void main(String[] args) {

	User user = new User();
	ObjectMapper mapper = new ObjectMapper();
		
	try {

		// convert user object to json string, and save to a file
		mapper.writeValue(new File("d:\\user.json"), user);
		mapper.setVisibility(JsonMethod.FIELD, Visibility.ANY);
		// display to console
		System.out.println(mapper.writeValueAsString(user));

	} catch (JsonGenerationException e) {

		e.printStackTrace();

	} catch (JsonMappingException e) {

		e.printStackTrace();

	} catch (IOException e) {

		e.printStackTrace();

	}

  }

}