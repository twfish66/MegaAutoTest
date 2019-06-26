
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import org.openqa.selenium.WebElement


def static "com.database.sql.connectDB"(
    	String server	
     , 	String port	
     , 	String dbname	
     , 	String username	
     , 	String password	) {
    (new com.database.sql()).connectDB(
        	server
         , 	port
         , 	dbname
         , 	username
         , 	password)
}

def static "com.database.sql.executeQuery"(
    	String queryString	) {
    (new com.database.sql()).executeQuery(
        	queryString)
}

def static "com.database.sql.closeDatabaseConnection"() {
    (new com.database.sql()).closeDatabaseConnection()
}

def static "com.database.sql.execute"(
    	String queryString	) {
    (new com.database.sql()).execute(
        	queryString)
}

def static "com.example.WebUICustomKeywords.isElementPresent"(
    	TestObject to	
     , 	int timeout	) {
    (new com.example.WebUICustomKeywords()).isElementPresent(
        	to
         , 	timeout)
}

def static "com.example.WebUICustomKeywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new com.example.WebUICustomKeywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "com.example.WebUICustomKeywords.getHtmlTableColumns"(
    	WebElement row	
     , 	String tagName	) {
    (new com.example.WebUICustomKeywords()).getHtmlTableColumns(
        	row
         , 	tagName)
}

def static "com.example.WebUICustomKeywords.promptMesg"(
    	Object message	) {
    (new com.example.WebUICustomKeywords()).promptMesg(
        	message)
}

def static "com.example.WebUICustomKeywords.showMesg"(
    	Object message	) {
    (new com.example.WebUICustomKeywords()).showMesg(
        	message)
}

def static "com.example.WebUICustomKeywords.dropDownList"(
    	Object message	) {
    (new com.example.WebUICustomKeywords()).dropDownList(
        	message)
}

def static "com.example.WebUICustomKeywords.randomNumber"(
    	TestObject to	
     , 	int minimum	
     , 	int maximum	) {
    (new com.example.WebUICustomKeywords()).randomNumber(
        	to
         , 	minimum
         , 	maximum)
}
