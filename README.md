# Selenium-


Webdriver Architecture : 

the selenium code which you have written is the client and what happens is that the client code is converted to json format and send through the HTTP Protool to the browser driver the browser driver communcates with the browser through the HTTP Protocol to the browser and perform the actions on the browser and the responses is again wrapped in the json format and it is sent back to the Selenium client 

Two ways of invoking the browser 
1. directly specify the path of the browser driver or let the selnium manager handle those things
   Set the property using system.setproperty("webdriver.chrome.driver","path need to give of the chrome driver ");


