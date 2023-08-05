@question1


Feature: Facebook
  
 
 Scenario: Login facebook and post status

Given user is on facebook page "https://id-id.facebook.com/"
And user entered valid userName or phoneNumber as "camellia.imoet@gmail.com" and password as "kalera08"
When user click on login button
Then render home page
And user create status as "hello world"
When user click post button