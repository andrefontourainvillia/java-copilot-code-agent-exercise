# Source Code Structure

This document describes the current source code organization for the Mergington High School Management System.

## 🏗️ Clean Architecture Implementation

The codebase follows Clean Architecture principles with clear separation of concerns across four main layers:

```
src/main/java/com/mergingtonhigh/schoolmanagement/
├── 🎯 domain/                  # Core business logic (no external dependencies)
├── 🔧 application/             # Use cases and application services  
├── 🏭 infrastructure/          # External frameworks and persistence
└── 🎨 presentation/            # REST API controllers and mappers
```

## 📁 Current Directory Structure

### Domain Layer (`domain/`)
Pure business logic with no external dependencies:

```
domain/
├── entities/
│   ├── Activity.java          # Core activity entity with validation
│   └── Teacher.java           # Teacher entity with authentication
├── repositories/              # Repository interfaces (implemented in infrastructure)
│   ├── ActivityRepository.java
│   └── TeacherRepository.java
└── valueobjects/              # Immutable value objects
    ├── Email.java             # Email validation and formatting
    └── ScheduleDetails.java   # Activity schedule information
```

### Application Layer (`application/`)
Orchestrates domain logic and defines use cases:

```
application/
├── dtos/                      # Data Transfer Objects for external communication
│   ├── ActivityDTO.java       # Activity representation for API responses
│   ├── LoginRequestDTO.java   # Authentication request structure
│   ├── StudentRegistrationDTO.java  # Student enrollment data
│   └── TeacherDTO.java        # Teacher information for responses
└── usecases/                  # Business use cases and application services
    ├── ActivityUseCase.java   # Activity management operations
    ├── AuthenticationUseCase.java  # Teacher authentication logic
    └── StudentRegistrationUseCase.java  # Student enrollment operations
```

### Infrastructure Layer (`infrastructure/`)
External frameworks, databases, and configuration:

```
infrastructure/
├── config/                    # Spring configuration classes
│   ├── SecurityConfig.java   # Spring Security configuration
│   └── WebConfig.java        # Web and CORS configuration
├── migrations/                # Database migration scripts (Mongock)
│   ├── V001_InitialDatabaseSetup.java    # Initial data seeding
│   └── V002_AddMangaManiacsActivity.java # Additional activity setup
└── persistence/               # Repository implementations
    ├── ActivityRepositoryImpl.java    # Domain repository implementation
    ├── MongoActivityRepository.java   # Spring Data MongoDB interface
    ├── MongoTeacherRepository.java    # Spring Data MongoDB interface
    └── TeacherRepositoryImpl.java     # Domain repository implementation
```

### Presentation Layer (`presentation/`)
REST API endpoints and request/response handling:

```
presentation/
├── controllers/               # REST API controllers
│   ├── ActivityController.java     # Activity management endpoints
│   ├── AuthController.java        # Authentication endpoints  
│   └── StaticController.java      # Static resource serving
└── mappers/                   # Entity ↔ DTO conversion
    ├── ActivityMapper.java    # Activity mapping utilities
    └── TeacherMapper.java     # Teacher mapping utilities
```

## 🔄 Data Flow

1. **HTTP Request** → `presentation/controllers/`
2. **Controller** → `application/usecases/` (orchestration)
3. **Use Case** → `domain/entities/` + `domain/repositories/` (business logic)
4. **Repository Interface** → `infrastructure/persistence/` (data access)
5. **Response** ← `presentation/mappers/` ← `application/dtos/`

## 🚀 Key Design Patterns

- **Repository Pattern**: Domain interfaces implemented in infrastructure
- **Use Case Pattern**: Application services coordinate domain operations  
- **DTO Pattern**: Clean separation between internal entities and external APIs
- **Value Objects**: Immutable objects for domain concepts (Email, ScheduleDetails)
- **Database Migrations**: Mongock for reproducible database setup

## 🛠️ Development Notes

- All domain entities validate themselves in constructors/setters
- Repository interfaces are defined in domain, implemented in infrastructure
- Use cases handle authentication and coordinate business operations
- Mappers handle conversion between domain entities and DTOs
- Static resources are served from `src/main/resources/static/`

## 📝 Adding New Features

When extending the system:

1. **New Entity**: Add to `domain/entities/` with validation
2. **New Repository**: Interface in `domain/repositories/`, implementation in `infrastructure/persistence/`
3. **New Use Case**: Add to `application/usecases/` 
4. **New Endpoint**: Add controller to `presentation/controllers/`
5. **New DTO**: Add to `application/dtos/` with corresponding mapper

Always maintain the dependency direction: `presentation` → `application` → `domain` ← `infrastructure`