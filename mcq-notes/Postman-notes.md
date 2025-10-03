# Postman Notes – GET Request

## 📌 What is a GET Request?
- **GET** is an HTTP method used to **retrieve data** from a server.
- It does **not modify** resources on the server (read-only).
- Commonly used for fetching data like users, products, posts, etc.

---

## 📌 Steps to Make a GET Request in Postman
1. **Open Postman**.
2. Select **GET** from the request method dropdown.
3. Enter the **Request URL** (e.g., `https://api.example.com/users`).
4. (Optional) Add **Query Parameters**:
   - Go to **Params** tab.
   - Add key-value pairs (e.g., `?id=101`).
5. Click **Send**.
6. View the **Response** in the Body section.

---

## 📌 Key Components
- **URL** → Endpoint where resource is located.
- **Params** → Extra data sent in URL (`?key=value`).
- **Headers** → Metadata like `Authorization`, `Content-Type`.
- **Response** → Data returned (JSON, XML, HTML, etc.).

---

## 📌 Example
### Request:
