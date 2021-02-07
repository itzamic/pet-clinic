# pet-clinic

The Pet Clinic example

## Notes for the Project

### SOLID Principles of OOP
1. Single Responsibility Principle
- Every class should have a single responsibility.
- There should never be more than one reason for a class to change.
- Your classes should be small. No more than a screen full of code.
- Avoid 'god' classes.
- Split big classes into smaller classes.
2. Open Closed Principle
- Your classes should be open for extension
- But closed for modification
- You should be able to extend a classes' behavior, without modifying it.
- Use private variables with getters and setter - ONLY when you need them.
- Use abstract base classes
3. Liskov Substitution Principle
- Objects in a program would be replaceable with instances of their subtypes WITHOUT altering the correctness of the program.
- Violations will often fail the "Is a" test.
- A Square "Is a" Rectangle
- However, a Rectangle "Is Not" a Square
4. Interface Segregation Principle
- Make fine-grained interfaces that are client specific
- Many client specific interfaces are better than one "general purpose" interface.
- Keep your components focused and minimize dependencies between them
- Notice relationship to the Single Responsibility Principle
    - i.e.avoid 'god' interfaces
5. Dependency Inversion Principle
- Abstractions should not depend upon details
- Details should depend upon abstractions
- Important that higher level and lower level objects depend on the same abstract interaction
- This is not the same as Dependency Injection - which is how objects obtain dependency objects

### Spring Bean Scopes
- Singleton - (default) Only one instance of the bean is created in the IoC container
- Prototype - A new instance is created each time the bean is requested
- Request - A single instance per http request. Only valid in the context of a web-aware Spring ApplicationContext
- Session - A single instance per http session. Only valid in the context of a web-aware Spring Application Context
- Global-session - A single instance per global session. Typically, Only used in a Portlet context. Only valid in the context of a web-aware Spring ApplicationContext
- Application - bean is scoped to the lifecycle of a ServletContext. Only valid in the context of a web-aware Spring ApplicationContext
- Websocket - Scopes a single bean definition to the lifecycle of a WebSocket. Only valid in the context of a web-aware Spring ApplicationContext