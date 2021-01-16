/**
 * 
 */
package com.kd.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author klawand
 *
 */
@RestController
public class SampleRestController {

	@Autowired
	HttpServletRequest request;

	@GetMapping(value = "/students", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Student> getStudents() {
		Student s = new Student();
		s.setAge(21);
		s.setCity("Ahmednagar");
		s.setName("Kunal Lawand");

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(
				request.getContentType().equals(MediaType.APPLICATION_JSON_VALUE)? MediaType.APPLICATION_JSON
						: MediaType.APPLICATION_XML);

		return new ResponseEntity<Student>(s, headers, HttpStatus.OK);
	}

}
