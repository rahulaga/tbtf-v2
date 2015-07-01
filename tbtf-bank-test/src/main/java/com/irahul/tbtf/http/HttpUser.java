package com.irahul.tbtf.http;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Select fields we want exposed to the REST layer. Separation from business/data layer. 
 * 
 * Note "XML" annotation. The resteasy-jettison implementation converts these to JSON depending on
 * the Accept media type
 * 
 * @author rahul
 *
 */
@XmlRootElement(name = "user")
public class HttpUser {
	
	@XmlElement
	public long id;
	
	@XmlElement
	public String firstName;
	
	@XmlElement
	public String lastName;
	
	@XmlElement
	public String pin;

	@Override
	public String toString() {
		return "HttpUser [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", pin=" + pin + "]";
	}
	
}
