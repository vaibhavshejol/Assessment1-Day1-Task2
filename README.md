#Task2Calculations Application
This application provides multiple calculations on a given number using concurrent threads in Java. It calculates various mathematical properties such as square, cube, prime number check, Armstrong number check, palindrome check, factorial, and number reversal.

**Features:**
Square: Calculates the square of a given number.
Cube: Calculates the cube of a given number.
Even or Odd: Checks if a given number is even or odd.
Prime or Not: Checks if a given number is a prime number.
Armstrong or Not: Checks if a given number is an Armstrong number.
Palindrome or Not: Checks if a given number is a palindrome.
Factorial: Calculates the factorial of a given number.
Reverse: Reverses the digits of a given number.

**Installation**
**Prerequisites**
Java Development Kit (JDK) 11 or higher
Maven or Gradle (for dependency management and building)

**Clone the Repository**
git clone https://github.com/vaibhavshejol/Assessment1-Day1-Task2.git
cd Task2Calculations

**Usage**
Build the project using Gradle.
./gradlew clean build

**Run the application:**
java -jar target/Task2Calculations-0.0.1-SNAPSHOT.jar

**Access the calculations via HTTP POST requests. Here's an example using cURL:**
curl -X POST http://localhost:8080/performcalculation/123
Replace 123 with any integer to see the results for different calculations.

**API Endpoint**
POST /performcalculation/{number}
Executes multiple calculations on the given number and returns a JSON object containing the results.

**Example Response:**
{
  "Square": "Square of 123 is 15129",
  "Cube": "Cube of 123 is 1860867",
  "EvenOrOdd": "Given number 123 is odd.",
  "PrimeOrNot": "Given number 123 is not a prime number.",
  "ArmstrongOrNot": "123 is not an Armstrong number.",
  "PalimdromOrNot": "Given number 123 is not a palindrome.",
  "Factorial": "Factorial of 123 is 113242811782062978314575211587320462287317495794882519900489628256688353252342007662450862131773440000000000000000",
  "Reverse": "Reverse of 123 is 321"
}

**Contributing**
Contributions are welcome! Please follow these steps to contribute:

Fork the repository.
Create a new branch (git checkout -b feature/your_feature).
Commit your changes (git commit -am 'Add some feature').
Push to the branch (git push origin feature/your_feature).
Create a new Pull Request.

**License**
This project is licensed under the MIT License - see the LICENSE file for details.

