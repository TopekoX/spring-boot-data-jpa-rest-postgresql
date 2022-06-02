# Spring Boot Data JPA REST with PostgreSQL

## API Specification

### Get

Request:

```
http://localhost:8080/api/v1/students
```

Response:

```json
[
	{
		"id": 1,
		"name": "Ucup Topekox",
		"email": "ucup@gmail.com",
		"dob": "2000-01-23",
		"age": 22
	},
	{
		"id": 2,
		"name": "Budi Sudarsono",
		"email": "budi@gmail.com",
		"dob": "2001-10-02",
		"age": 20
	}
]
```

### POST

Request:

```
http://localhost:8080/api/v1/students
```

Body

```json
{
	"name" : "Uzumaki Naruto",
	"email" : "naruto@gmail.com",
	"dob" : "1999-10-12"
}
```

### DELETE

Request:

```
http://localhost:8080/api/v1/students/{id}
```

### UPDATE

Request:

```
http://localhost:8080/api/v1/students/{}id?name={name}&email={email}
```

Example:

```
http://localhost:8080/api/v1/students/2?name=Joko
```

Param name & email can be null.
