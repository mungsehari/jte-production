# Project Name

A brief description of your project.

## Prerequisites

- **Java**: OpenJDK 23 or later
- **Maven**: Ensure you have Maven installed or use the included `mvnw` wrapper
- **GraalVM**: Required for native image compilation

## Getting Started

Clone the repository and navigate to the project directory:

1.Standard Build
./mvnw clean package

2.Native Image Build
./mvnw -Pnative native:compile

Running the Application
1. Standard Mode
java -jar target/your-project-name.jar

2. Native Executable Mode
./target/jte-production -Dspring.profiles.active=prod


```bash
git clone https://github.com/yourusername/your-repository.git
cd your-repository





