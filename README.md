# NewsPaper Application

## Introduction

The NewsPaper application is a Java-based web application developed using Spring Boot and Hibernate. It's designed to help users to manage and organize their news items from various sources.

## Key Features

1. **News Management:** Users can create, update, delete, and view news items.
2. **Topics:** News items can be associated with topics for better organization and categorization.
3. **Source Management:** Users can add, update, and delete the sources of the news items.

## API Endpoints

### News

- `GET /api/news`: Fetches all the news items.
- `POST /api/news`: Creates a new news item. Requires JSON input.
- `GET /api/news/{id}`: Fetches the news item with the specified ID.
- `PUT /api/news/{id}`: Updates the news item with the specified ID. Requires JSON input.
- `DELETE /api/news/{id}`: Deletes the news item with the specified ID.

### Topics

- `GET /api/topics`: Fetches all the topics.
- `POST /api/topics`: Creates a new topic. Requires JSON input.
- `GET /api/topics/{id}`: Fetches the topic with the specified ID.
- `PUT /api/topics/{id}`: Updates the topic with the specified ID. Requires JSON input.
- `DELETE /api/topics/{id}`: Deletes the topic with the specified ID.

### Sources

- `GET /api/sources`: Fetches all the sources.
- `POST /api/sources`: Creates a new source. Requires JSON input.
- `GET /api/sources/{id}`: Fetches the source with the specified ID.
- `PUT /api/sources/{id}`: Updates the source with the specified ID. Requires JSON input.
- `DELETE /api/sources/{id}`: Deletes the source with the specified ID.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java Development Kit (JDK) 11 or later
- Maven 3.6 or later
- Postgresql

### Installation

1. Clone the repository
```bash
git clone https://github.com/samen66/newspaper.git
