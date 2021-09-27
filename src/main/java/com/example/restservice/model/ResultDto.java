package com.example.restservice.model;

import java.util.List;

public class ResultDto<T> {
String message;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public List<T> getGreetings() {
	return greetings;
}
public void setGreetings(List<T> greetings) {
	this.greetings = greetings;
}
public Long getCount() {
	return count;
}
public void setCount(Long count) {
	this.count = count;
}
List<T> greetings ;
Long count;

}
