package com.example.javaproject.example;

import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

public class GsonTester {
	public static void main(String[] args) {
		// inputOne:
		// {
		// "name": "Irene Wang",
		// "email": "irenewang@gmail.com",
		// "number_of_reports": 7,
		// "employments": [
		// {
		// "title": "CEO",
		// "is_current": true
		// },
		// {
		// "title": "Head of Operations",
		// "is_current": false
		// }
		// ],
		// "bonus": {
		// "amount": 100000,
		// "cadence": "ANNUAL"
		// },
		// "is_full_time": true
		// }
		String inputOne = "{\"name\": \"Irene Wang\",\"email\": \"irenewang@gmail.com\",\"number_of_reports\": 7,\"employments\": [{\"title\": \"CEO\",\"is_current\": true},{\"title\": \"Head of Operations\",\"is_current\": false}],\"bonus\": {\"amount\": 100000,\"cadence\": \"ANNUAL\"},\"is_full_time\": true}";

		// inputTwo:
		// ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
		// "Saturday"]
		String inputTwo = "[\"Sunday\", \"Monday\", \"Tuesday\", \"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\"]";

		// inputThree:
		// 999
		String inputThree = "999";

		// Object
		JsonElement inputOneElem = JsonParser.parseString(inputOne);
		System.out.println("inputOne:");
		System.out.println("inputOneElem.isJsonObject(): " + inputOneElem.isJsonObject());
		System.out.println("inputOneElem.isJsonArray(): " + inputOneElem.isJsonArray());
		System.out.println("inputOneElem.isJsonPrimitive(): " + inputOneElem.isJsonPrimitive());
		System.out.println("inputOneElem.isJsonNull(): " + inputOneElem.isJsonNull());
		JsonObject inputOneObject = inputOneElem.getAsJsonObject();
		System.out.println("inputOneObject:");
		for (String key : inputOneObject.keySet()) {
			JsonElement value = inputOneObject.get(key);
			System.out.println("    key: " + key + ", value: " + value);
		}
		System.out.println("");

		// Array
		JsonElement inputTwoElem = JsonParser.parseString(inputTwo);
		System.out.println("inputTwo:");
		System.out.println("inputTwoElem.isJsonObject(): " + inputTwoElem.isJsonObject());
		System.out.println("inputTwoElem.isJsonArray(): " + inputTwoElem.isJsonArray());
		System.out.println("inputTwoElem.isJsonPrimitive(): " + inputTwoElem.isJsonPrimitive());
		System.out.println("inputTwoElem.isJsonNull(): " + inputTwoElem.isJsonNull());
		JsonArray inputTwoArray = inputTwoElem.getAsJsonArray();
		System.out.println("inputTwoArray:");
		for (JsonElement elem : inputTwoArray) {
			System.out.println("    elem: " + elem.toString());
		}
		System.out.println("");

		// Number
		JsonElement inputThreeElem = JsonParser.parseString(inputThree);
		System.out.println("inputThreeElem:");
		System.out.println("inputThreeElem.isJsonObject(): " + inputThreeElem.isJsonObject());
		System.out.println("inputThreeElem.isJsonArray(): " + inputThreeElem.isJsonArray());
		System.out.println("inputThreeElem.isJsonPrimitive(): " + inputThreeElem.isJsonPrimitive());
		System.out.println("inputThreeElem.isJsonNull(): " + inputThreeElem.isJsonNull());
		JsonPrimitive inputThreePrimitive = inputThreeElem.getAsJsonPrimitive();
		System.out.println("inputThreePrimitive.isString(): " + inputThreePrimitive.isString());
		System.out.println("inputThreePrimitive.isNumber(): " + inputThreePrimitive.isNumber());
		System.out.println("inputThreePrimitive.isBoolean(): " + inputThreePrimitive.isBoolean());
		Number inputThreeNumber = inputThreePrimitive.getAsNumber();
		System.out.println("inputThreeNumber.doubleValue(): " + inputThreeNumber.doubleValue());
		System.out.println("inputThreeNumber.intValue(): " + inputThreeNumber.intValue());
		System.out.println("");
	}
}
