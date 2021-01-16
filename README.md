Spring Data Rest HAL Browser: HAL makes our API exportable, 
and its documentation easily discoverable from within the API itself.





Version :

SpringBoot version    : 2.4.2.RELEASE
Java                  : 1.8.0_91

Hypertext Application Language (HAL) is a simple language that gives a consistent and easy way to hyperlink between resources in API. 
The spring boot starter actuator is actually in the HAL format. HAL browser searches for APIs and identifies the links. 
It shows the link on the screen so that we can easily browse through the API.


HAL browser Demo 

as my service running on 8080  we can change port accordingly base on your application 

go to http://localhost:8080/

in  search box mention URI click on  go  will get response


Added sample GET service to show how we can use POJO to convert response to both XML and JSON.

PreRequiste: we require "jackson-dataformat-xml" on classpath


URL:http://localhost:8080/students
Header :
    Content_Type=application/xml or application/json 
    
based on header value response will be generated

JOSN Response:

{
  "name": "Kunal Lawand",
  "city": "Ahmednagar",
  "age": 21
}

XML Response :
<Student><name>Kunal Lawand</name><city>Ahmednagar</city><age>21</age></Student>
