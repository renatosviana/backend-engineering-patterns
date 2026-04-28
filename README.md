# algorithms-study-java

A Java reference repository for algorithm patterns and backend engineering building blocks.

## Contents

### Algorithms

Implementations organized by pattern. Currently includes:

- **Hashing** — Two Sum
- **Stack** — Valid Parentheses
- **Sliding Window** — fixed and dynamic variants
- **Two Pointers** — 3Sum

### Backend Patterns

Examples illustrating common backend building blocks:

- Repository / Service layering
- Domain modeling (Employee, Manager)
- Threading
- Console clients

## Structure

```
src/main/java/
├── algorithms/
│   ├── hashing/
│   ├── stack/
│   ├── slidingwindow/
│   └── twopointers/
└── backendpatterns/
    └── v1/
        ├── repository/
        ├── service/
        ├── ConsoleClient.java
        ├── Employee.java
        ├── Manager.java
        └── ThreadTest.java
```

## Roadmap

Planned additions:

- More algorithm patterns (graphs, dynamic programming, heap, trees, etc.)
- Data-intensive system concepts (replication, partitioning, stream processing)

## Running

Open in IntelliJ IDEA and run any class's `main` method.

## Requirements

- Java 17+
