# Selenium-


Webdriver Architecture : 

the selenium code which you have written is the client and what happens is that the client code is converted to json format and send through the HTTP Protool to the browser driver the browser driver communcates with the browser through the HTTP Protocol to the browser and perform the actions on the browser and the responses is again wrapped in the json format and it is sent back to the Selenium client 

Two ways of invoking the browser 
1. directly specify the path of the browser driver or let the selenium manager handle those things
   Set the property using system.setproperty("webdriver.chrome.driver","path need to give of the chrome driver ");

Locators in selenium : 

There are different type of Locators in Selenium each locators is used to identify the elements on the HTML Web page and perform 
certain actions : 

<input type="text" placeholder="Username" id="inputUsername" value="">


input—- tag name

type,placeholder,id — attributes of that tag .

values in double quotes  —> values of that attributes .

The .sendKeys is used to send the values to a WebElement in a TextBox .


1. using the id we can pass 
By.id("give the id");
2. You can also pass using the name as well
By.id("give the name present inside the attribute name ")
3. You can identify using the class selector as well .
By.class("just give the class attribute value inside it" )

CSS and XPATH Selectors : 

the main use of css and XPATH Selector is that we do not need that particular attribute to form that value from the ground up we can build the selectors . 

CSS Selector Syntax : 
css selector (with class name) : tagname.classname .
(with id selector ): tagname#idname . 

Generic Syntax of writing the css selector : 

tagname[attribute='value'] -- syntax 

Selenium generally captures from topleft .


XPATH Selectors : 

1. Containers partial text syntax eg : 

//*[contains(text(),'Forgot your ')]

2. Contains see with the Type  : 

Xpath=//*[contains(@type,'sub')]


3. Basic Xpath : 

Xpath=//input[@name='uid']
//tagname[@attribute='Value'];


When multiple occourance is found you can use the index value to denote which one two use 

synatx : 
(//input[@type='text'])[2]

For css the syntax for accessing the elements using the index use this syntax :m

input[text='text']:nth-child(2)

the same index maynot be the accurate one beetween the xpath and css because their might be some hidden attributes . 

TRAVERSING FORM THE PARENT TO CHILD : 

If you want to traverse from Parent to child start with the following : 

//head/a/b (double // slash followed by single / slash)

give the index number if needed . 


TRAVERSING FROM PARENT TO CHILD : 
USING XPATH : 

//form/a/b
USING CSS PATH : 

parenttag name space childtagname 


XPATH Sibling traversals : 


Find more about the Xpaths Here 

https://www.guru99.com/xpath-selenium.html


difference Beetween / and // in XPATH : 


/ is used for selecting elements that are direct children of the current element, specifying a strict parent-child relationship.
// is used for selecting elements anywhere in the document, without regard to their depth or position in the hierarchy.



WINDOWS NAVIGATIONS : 


refer WindwsClass.java
[WindowClass.java]

Using the selenium Methods to Navigate the Browser like going back and front like that . 
run in maximize mode Like that . 
Selenium Wait Types : 

In Selenium, "waits" are used to ensure that the WebDriver waits for a certain condition to be met before proceeding with the next step in test automation. Waiting is important because web applications often have asynchronous behavior, and elements may not be immediately available or ready to interact with. Selenium provides several types of waits to handle different scenarios:

1.Implicit Wait:

Implicit waits are used to specify a default wait time for the WebDriver to wait for an element to become available before throwing an exception.
The WebDriver waits for the specified amount of time for an element to appear or become clickable before performing actions on it.
It is applied globally to the entire test script.
Implicit waits are useful when you want to wait for elements on every page without specifying a wait explicitly for each element.
Example:

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
WebDriver driver = new ChromeDriver();

        // Set an implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to a webpage
        driver.get("https://example.com");

        // Perform actions on elements
        // The WebDriver will wait for up to 10 seconds for elements to appear
        // without needing explicit waits for each element.
        
        driver.quit();
    }
}


Explicit Wait : 

2. Explicit Wait:

Explicit waits allow you to wait for a specific condition on a particular element using WebDriverWait and ExpectedConditions.
They provide more control and flexibility over waiting conditions compared to implicit waits.
You can set custom conditions, such as waiting for an element to be clickable, visible, or having a specific text.
Explicit waits wait for a specific condition for a defined period of time and can be used for individual elements.
Example:

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
WebDriver driver = new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://example.com");

        // Use explicit wait to wait for an element to be clickable
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("myElement")));

        // Perform actions on the element
        element.click();

        driver.quit();
    }
}

3. Fluent Wait : 

Fluent Wait:

Fluent waits provide even more flexibility and control over waits by allowing you to specify polling intervals and ignore certain exceptions.
They are used when you need to wait for an element with a custom condition while ignoring specific exceptions.
Fluent waits are built using the WebDriverWait class but allow you to configure conditions, polling intervals, and exceptions.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class FluentWaitExample {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        // Create a FluentWait with custom conditions and polling interval
        Wait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(org.openqa.selenium.NoSuchElementException.class);

        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myElement")));

        // Perform actions on the element
        element.click();

        driver.quit();
    }
}



If you get any element click error use explict wait element to be clickable () method 

refer this : https://stackoverflow.com/questions/62260511/org-openqa-selenium-elementclickinterceptedexception-element-click-intercepted










