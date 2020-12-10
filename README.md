# Tokoin

### 1. Download IntelliJ IDEA
You can choose the configuration match with your computer

Uri IntelliJ IDEA:
```
https://www.jetbrains.com/idea/download/#section=windows
```
After install, run IntelliJ IDEA and open project Tokoin

### 2. Open file TokoinApplication and run

At console, you will have 4 option:
```
1. Search User
2. Search Ticket
3. Search Organization
4. Exit !!!
```

If you input 1 or 2 or 3, next step will show 3 option:
```
1. Interger
2. String
3. Boolean
```

If you choose 1 in 3 option:
```
1. You will be able to search for data with fields of type integer
2. You will be able to search for data with fields of type string
3. You will be able to search for data with fields of type boolean
```

A list type will show and you can choose 1 number for set type to search. Ex:
```
1. url
2. external_id
3. name
4. alias
5. created_at
6. locale
7. timezone
8. last_login_at
9. email
10. phone
11. signature
12. role
```
And after that, you must input your value want to search

If search data success, data will show in console. Else:

- Condition is exist: Show message "Not found any data !!!"

- Condition is not exist: Show message. Ex: "The User haven't enough data with relate Organization !!!"

With any your choose but don't have in show list. A message "Input value was wrong. Please choose again !!!" will show. And you will return the first step.

### Unit Test

Run unit test at src/test/java/com.example.demo/controller