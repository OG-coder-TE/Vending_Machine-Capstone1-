package com.techelevator;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class AuditReport {

public void dispenseAuditReport() {
		
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
		
}
}
