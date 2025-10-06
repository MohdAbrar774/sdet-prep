Here’s a clean, exam + interview–ready **SQL short notes** in Markdown (`.md`) format 👇

---

````markdown
# 🧠 SQL Short Notes

## 📘 What is SQL?
**SQL (Structured Query Language)** is used to manage and manipulate relational databases.

---

## 📂 Types of SQL Commands

| Type | Description | Examples |
|------|--------------|-----------|
| **DDL** (Data Definition Language) | Defines structure of database objects | `CREATE`, `ALTER`, `DROP`, `TRUNCATE` |
| **DML** (Data Manipulation Language) | Manages data in tables | `INSERT`, `UPDATE`, `DELETE` |
| **DQL** (Data Query Language) | Retrieves data | `SELECT` |
| **DCL** (Data Control Language) | Controls access permissions | `GRANT`, `REVOKE` |
| **TCL** (Transaction Control Language) | Manages transactions | `COMMIT`, `ROLLBACK`, `SAVEPOINT` |

---

## 🧱 DDL Commands

### CREATE
```sql
CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary DECIMAL(10,2)
);
````

### ALTER

```sql
ALTER TABLE employees ADD COLUMN age INT;
```

### DROP

```sql
DROP TABLE employees;
```

### TRUNCATE

```sql
TRUNCATE TABLE employees;
```

---

## 🧩 DML Commands

### INSERT

```sql
INSERT INTO employees (id, name, salary) VALUES (1, 'John', 50000);
```

### UPDATE

```sql
UPDATE employees SET salary = 60000 WHERE id = 1;
```

### DELETE

```sql
DELETE FROM employees WHERE id = 1;
```

---

## 🔍 DQL – SELECT Queries

### Basic SELECT

```sql
SELECT * FROM employees;
```

### With WHERE

```sql
SELECT name, salary FROM employees WHERE salary > 50000;
```

### Sorting

```sql
SELECT * FROM employees ORDER BY salary DESC;
```

### Limiting Rows

```sql
SELECT * FROM employees LIMIT 5;
```

---

## 🔗 SQL Clauses

| Clause             | Purpose                             |
| ------------------ | ----------------------------------- |
| **WHERE**          | Filters rows                        |
| **ORDER BY**       | Sorts rows                          |
| **GROUP BY**       | Groups rows for aggregation         |
| **HAVING**         | Filters groups (used with GROUP BY) |
| **LIMIT / OFFSET** | Limits number of results            |

---

## 🧮 Aggregate Functions

| Function  | Description   |
| --------- | ------------- |
| `COUNT()` | Counts rows   |
| `SUM()`   | Adds values   |
| `AVG()`   | Average value |
| `MIN()`   | Minimum value |
| `MAX()`   | Maximum value |

Example:

```sql
SELECT department, COUNT(*) AS total_employees
FROM employees
GROUP BY department
HAVING COUNT(*) > 5;
```

---

## 🧠 Joins in SQL

| Join Type      | Description                                     |
| -------------- | ----------------------------------------------- |
| **INNER JOIN** | Returns matching rows in both tables            |
| **LEFT JOIN**  | Returns all rows from left + matched from right |
| **RIGHT JOIN** | Returns all rows from right + matched from left |
| **FULL JOIN**  | Returns all rows from both tables               |
| **CROSS JOIN** | Returns Cartesian product                       |

Example:

```sql
SELECT e.name, d.dept_name
FROM employees e
INNER JOIN departments d ON e.dept_id = d.id;
```

---

## 🔐 Constraints

| Constraint      | Description                  |
| --------------- | ---------------------------- |
| **PRIMARY KEY** | Unique + Not Null            |
| **FOREIGN KEY** | Links to another table’s key |
| **UNIQUE**      | No duplicate values          |
| **NOT NULL**    | Must have a value            |
| **DEFAULT**     | Provides default value       |
| **CHECK**       | Adds condition               |

---

## 💾 TCL Commands

| Command       | Purpose                    |
| ------------- | -------------------------- |
| **COMMIT**    | Save transaction           |
| **ROLLBACK**  | Undo changes               |
| **SAVEPOINT** | Set a point to rollback to |

Example:

```sql
BEGIN;
UPDATE employees SET salary = salary + 5000;
SAVEPOINT before_bonus;
UPDATE employees SET salary = salary + 2000 WHERE id = 2;
ROLLBACK TO before_bonus;
COMMIT;
```

---

## ⚙️ Subqueries

### Example:

```sql
SELECT name 
FROM employees 
WHERE salary > (SELECT AVG(salary) FROM employees);
```

---

## 🧩 Views

Virtual table based on result of a query.

```sql
CREATE VIEW high_salary AS
SELECT name, salary FROM employees WHERE salary > 70000;
```

---

## 🧾 Indexes

Used to speed up query performance.

```sql
CREATE INDEX idx_name ON employees(name);
```

---

## 🧱 Normalization

| Normal Form | Rule                           |
| ----------- | ------------------------------ |
| **1NF**     | Atomic values only             |
| **2NF**     | 1NF + No partial dependency    |
| **3NF**     | 2NF + No transitive dependency |
| **BCNF**    | Stronger form of 3NF           |

---

Perfect — here’s a **detailed but crisp answer sheet** for all those common SQL interview questions 👇 (you can directly add this under your `📊 Common SQL Interview Questions` section in your `.md` file)

---

````markdown
## 📊 Common SQL Interview Questions — Detailed Answers

### 1️⃣ Difference between DELETE, TRUNCATE, and DROP

| Command | Description | Rollback | Affect on Structure |
|----------|--------------|-----------|----------------------|
| **DELETE** | Removes specific rows using `WHERE` | ✅ Yes | ❌ No |
| **TRUNCATE** | Removes all rows from table (faster than DELETE) | ❌ No | ❌ No |
| **DROP** | Deletes entire table with structure | ❌ No | ✅ Yes |

**Example:**
```sql
DELETE FROM employees WHERE id = 5;
TRUNCATE TABLE employees;
DROP TABLE employees;
````

---

### 2️⃣ Primary Key vs Unique Key

| Feature        | PRIMARY KEY                     | UNIQUE KEY                           |
| -------------- | ------------------------------- | ------------------------------------ |
| Uniqueness     | Ensures unique + not null       | Ensures unique but can have one null |
| Number allowed | One per table                   | Multiple per table                   |
| Purpose        | Identifies each record uniquely | Enforces data uniqueness             |

**Example:**

```sql
CREATE TABLE students (
  roll_no INT PRIMARY KEY,
  email VARCHAR(100) UNIQUE
);
```

---

### 3️⃣ What are Joins and Their Types?

**Join** combines rows from two or more tables based on a related column.

| Join Type      | Description                         | Example                    |
| -------------- | ----------------------------------- | -------------------------- |
| **INNER JOIN** | Returns matching rows               | `A ∩ B`                    |
| **LEFT JOIN**  | All from left + matching from right | `A + (A ∩ B)`              |
| **RIGHT JOIN** | All from right + matching from left | `B + (A ∩ B)`              |
| **FULL JOIN**  | All rows from both                  | `A ∪ B`                    |
| **CROSS JOIN** | Cartesian product                   | Every row with every other |

**Example:**

```sql
SELECT e.name, d.dept_name
FROM employees e
INNER JOIN departments d ON e.dept_id = d.id;
```

---

### 4️⃣ Difference between WHERE and HAVING

| Clause     | Used On                          | Used With         | Executes          |
| ---------- | -------------------------------- | ----------------- | ----------------- |
| **WHERE**  | Filters rows before grouping     | Any query         | Before `GROUP BY` |
| **HAVING** | Filters groups after aggregation | Aggregate queries | After `GROUP BY`  |

**Example:**

```sql
SELECT department, COUNT(*) 
FROM employees
WHERE salary > 40000
GROUP BY department
HAVING COUNT(*) > 5;
```

---

### 5️⃣ What are Indexes and When to Use Them?

**Indexes** are data structures (like B-trees) that speed up data retrieval.

✅ Use When:

* Searching or filtering large tables (`WHERE`, `JOIN`, `ORDER BY`)
* Columns often queried but not frequently updated

⚠️ Avoid When:

* Table is small
* Columns are frequently updated/deleted (can slow DML)

**Example:**

```sql
CREATE INDEX idx_emp_name ON employees(name);
```

---

### 6️⃣ Explain Normalization and Denormalization

| Term                | Meaning                                      | Purpose                               |
| ------------------- | -------------------------------------------- | ------------------------------------- |
| **Normalization**   | Organizing data into smaller, related tables | Reduce redundancy & improve integrity |
| **Denormalization** | Combining tables for faster access           | Improve query performance             |

**Example:**

* Normalized → separate `students` and `departments` tables
* Denormalized → merge both for faster reports

---

### 7️⃣ What is a View?

A **view** is a **virtual table** based on the result of an SQL query.
It doesn’t store data itself — only stores the query logic.

**Use Case:** Simplify complex queries or restrict data access.

**Example:**

```sql
CREATE VIEW high_salary AS
SELECT name, salary FROM employees WHERE salary > 70000;
```

---

### 8️⃣ Difference between INNER JOIN and OUTER JOIN

| Feature       | INNER JOIN                 | OUTER JOIN                      |
| ------------- | -------------------------- | ------------------------------- |
| Matching rows | Returns only matching rows | Returns matching + non-matching |
| Data loss     | Non-matching rows excluded | Non-matching rows preserved     |
| Types         | Only one type              | LEFT, RIGHT, FULL OUTER JOIN    |

**Example:**

```sql
-- INNER JOIN
SELECT * FROM A INNER JOIN B ON A.id = B.id;

-- LEFT OUTER JOIN
SELECT * FROM A LEFT JOIN B ON A.id = B.id;
```