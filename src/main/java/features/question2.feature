@question2


Feature: WalletHub
  
 
 Scenario: Create review in wallet hub

Given user is on wallet hub page "https://wallethub.com/join/login?ref=https://wallethub.com/profile/test-insurance-company-13732055i"
And user entered valid email as "rajuspi@gmail.com" and password as "Rajuwallethub!1"
When user click on login button wallet hub
Then user click fourth star for rating
And user choose Health Insurance
And user type the review
Then user click submit button


