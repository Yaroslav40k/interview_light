# Tax id selector
Our organization works with billing payment transactions. 
We need you to develop a small Tax ID Type selector based on an information presented by our customers.

Tax IDs are very important. For example, displaying a customer’s tax ID on invoice documents 
is a common requirement that you can satisfy by adding tax IDs to customers.
A customer’s tax IDs display in the header of invoice and credit note PDFs.

You’re responsible for making sure that customer information is accurate. Make sure that the Tax ID is correct.

Imagine you have a JSON file coming to your application with customers data :
```
[
{
"name": "Helen", 
"billingCountryCode": "USA", 
"taxId": "12-3456789"
},
{
"name": "John",
"billingCountryCode": "GBR",
"taxId": "GB123456789"
},
{
"name": "Tamia",
"billingCountryCode": "IND",
"taxId": "12ABCDE3456FGZH"
}
]
```
And you want to select a proper Tax ID Type using 3 different patterns :

^((GB)?([0-9]{9}([0-9]{3})?|[A-Z]{2}[0-9]{3}))$  - for UNITED_KINGDOM  ids
^([07][1-7]|1[0-6]|2[0-7]|[35][0-9]|[468][0-8]|9[0-589])-?\\d{7}$ - for UNITED_STATES  ids
^([0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1})$ - for INDIA ids

Read the json file.
Get the list of customers.
Check if a Tax ID value is valid.
Assign proper Tax ID Type to a customer.
Return a list of updated customers.

Remember, our customers can make mistakes in their Tax IDs!

## TIP
We suggest starting from what you think is the core of the application.
Feel free to add any methods/classes!
