# Spring Boot CRUD MySQL (Student)
Projek aplikasi CRUD Rest API MySQL dengan Java Spring Boot, dengan tema datanya adalah Student/Siswa, untuk data Student:

- id (int)
- name (String)
- gender (char)
- age (int)
- email (String)

Untuk base url:     
[http://localhost:8080/api/v1/student/](http://localhost:8080/api/v1/student/)

## GET /all
Ambil semua data Student.  

### Request:
Tidak ada parameter.
### Response:
```Json
{
  "message": "Success get all student",
  "code": 200,
  "arrayList": [
    {
      "id": 1,
      "name": "Ifandika",
      "gender": "L",
      "age": 18,
      "email": "if.dika@gmail.com"
    }
  ]
}
```

## GET /{id}
Ambil data Student dengan id.  

### Request:
- Integer - id

Value = 1
### Response:
```Json
{
  "message": "Success get student by id=1",
  "code": 200,
  "arrayList": [
    {
      "id": 1,
      "name": "Ifandika",
      "gender": "L",
      "age": 18,
      "email": "if.dika@gmail.com"
    }
  ]
}
```

## POST /add
Tambah data Student.

### Request:
- Json Body
```Json
{
  "name": "Prikitiew",
  "gender": "L",
  "age": 90,
  "email": "p.kitiew@gmail.com"
}
```
### Response:
```Json
{
  "message": "Success add",
  "code": 200,
  "arrayList": []
}
```

## PUT /update/{id}
Perbarui data Student.

### Request:
- Integer id    

Value = 52

- Json Body
```Json
{
  "name": "Yun",
  "gender": "P",
  "age": 15,
  "email": "yun.123@gmail.com"
}
```
### Response:
```Json
{
  "message": "Success update",
  "code": 200,
  "arrayList": [
    {
      "id": 52,
      "name": "Yun",
      "gender": "P",
      "age": 15,
      "email": "yun.123@gmail.com"
    }
  ]
}
```

## DELETE /{id}
Perbarui data Student.

### Request:
- Integer id    

Value = 52
### Response:
```Json
{
  "message": "Success delete",
  "code": 200,
  "arrayList": [
    {
      "id": 52,
      "name": "Yun",
      "gender": "P",
      "age": 15,
      "email": "yun.123@gmail.com"
    }
  ]
}
```