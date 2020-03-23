package com.in28minutes.soap.webservices.soapcoursemanagement.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.GetCourseDetailsRequest;
import com.in28minutes.courses.GetCourseDetailsResponse;

@Endpoint
public class CourseDetailsEndpoint {
	// method
	// input - GetCourseDetailsRequest
	// output - GetCourseDetailsResponse
	// from namespace - http://in28minutes.com/courses
	// of name - GetCourseDetailsRequest
	
	@PayloadRoot(
		namespace="http://in28minutes.com/courses"
		,localPart="GetCourseDetailsRequest")
	
	// response will be java converted to html
	@ResponsePayload
	public GetCourseDetailsResponse processCourseDetailsRequest
	// request will be xml converted to java
	(@RequestPayload GetCourseDetailsRequest request)
	{
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(request.getId());
		courseDetails.setName("Microservices");
		courseDetails.setDescription("SOAP Request and Response");
		
		return response;
	}
	
	
	
}
