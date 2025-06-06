# Software System Architecture Project

## Description

This project is a **scalable, platform-independent vending machine system** developed as part of a Software System Architecture course. It demonstrates the application of architectural principles and design patterns to build a modular, maintainable, and extensible software system.

The system is designed with a **modular architecture** that ensures **low coupling** and **high cohesion**, making it easy to extend or modify individual components without affecting the overall structure. The architecture incorporates several well-known design patterns, including:

- **State Pattern** – for managing the internal state transitions of the vending machine
- **Abstract Factory Pattern** – for creating related objects without specifying their concrete classes
- **Strategy Pattern** – for defining interchangeable algorithms (e.g., payment processing, dispensing strategies)

This project emphasizes best practices in software architecture such as separation of concerns, component reusability, and clear interface boundaries. It is implemented in **Java**, making it cross-platform and easy to deploy across different environments.

## Features

- Scalable vending machine simulation
- Modular design following SOLID principles
- Uses State, Abstract Factory, and Strategy design patterns
- Platform-independent Java implementation
- Clear separation between UI, logic, and data layers
- Designed for ease of testing and extension



## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Git
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

```bash
git clone https://github.com/KushagraK123/ssa_project.git
cd ssa_project


javac Main.java
java Main

ssa_project/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── ssa/
│   │                   ├── Main.java
│   │                   └── modules/
│   └── test/
│       └── ...
├── .gitignore
├── README.md
└── ...


Contributing

Feel free to fork this repo and contribute with pull requests. Bug reports and feature suggestions are also welcome.


