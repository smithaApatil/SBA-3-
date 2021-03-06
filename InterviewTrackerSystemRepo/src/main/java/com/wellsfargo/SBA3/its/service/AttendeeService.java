package com.wellsfargo.SBA3.its.service;

import java.util.ArrayList

;

import com.wellsfargo.SBA3.its.entity.Attendee;
import com.wellsfargo.SBA3.its.exceptions.UserException;


public interface AttendeeService {
	
	Attendee addAttendee(int userId, int interviewID) throws UserException;
	
	ArrayList getUsersByInterviewID(int interviewId) throws UserException;
	
	ArrayList getInterviewsByUserID(int userId) throws UserException;

}
