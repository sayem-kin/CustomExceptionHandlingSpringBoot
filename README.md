# Spring Boot Custom Exception Handling Project

Welcome to the Spring Boot Custom Exception Handling project. This project demonstrates how to handle and manage custom exceptions in a Spring Boot application. It provides a structured approach to handle various exception scenarios while exposing APIs.

## Project Structure

The project is organized into different packages based on functionality:

- `controller`: Contains controllers to handle HTTP requests.
  - `MainController`: Handles main business logic.
  - `GlobalExceptionHandler`: Handles global exceptions.

- `exception`: Contains custom exception classes for different scenarios.
  - `ArrayCustomException`: Custom exception for array-related issues.
  - `SortageOfMoneyCustomException`: Custom exception for insufficient funds.
  - `OddNumberCustomException`: Custom exception for odd number issues.
  - `CustomNullPointerException`: Custom exception for null pointer issues.
  - `CustomExceptionTwo`: Another custom exception.
  - `CustomException`: Base class for custom exceptions.
  - `CustomCastException`: Custom exception related to class casting.

- `service`: Contains service classes for business logic.
  - `CalculatorService`: Example service for calculations.
  - `Person`: Example class for person-related operations.
  - `Human`: Another example class.

## Usage

1. Clone this repository to your local machine using:https://github.com/sayem-kin/CustomExceptionHandlingSpringBoot.git
2. Open the project in your preferred IDE.

3. Build and run the Spring Boot application.

4. Use Postman or any API testing tool to test different exception scenarios:
- Access different endpoints defined in the `MainController` for business logic testing.
- Observe how the `GlobalExceptionHandler` handles exceptions and returns appropriate responses.

## Contributing

Contributions are welcome! If you find any issues or want to add new features, feel free to create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

