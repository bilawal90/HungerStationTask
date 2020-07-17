Feature: Validating Pet Store API's

Scenario: Verify if Pet is being Successfully added using AddPetAPI
		Given Add Pet Payload
		When user calls AddPetAPI with Post https request
		Then  the API Call is success with status code 200
        