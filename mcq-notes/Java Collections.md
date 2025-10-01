# 📘 Java Collections Framework – Notes

The **Java Collections Framework (JCF)** provides a **set of classes and interfaces** for storing and manipulating groups of objects efficiently.  
It is part of the `java.util` package.

---

## 🌟 Key Benefits
- Predefined **data structures & algorithms**  
- **Reusable, efficient, and well-tested**  
- Saves time (no need to implement from scratch)  
- Provides **utility methods** (sorting, searching, etc.)  
- Supports **thread-safe** variants  

---

## 🔑 Core Interfaces
- **Iterable** → root interface, supports iteration
- **Collection** → base interface for most collections  
  - **List** → Ordered, allows duplicates  
  - **Set** → Unordered (or sorted), no duplicates  
  - **Queue** → FIFO / special ordering  

- **Map** (separate from Collection) → stores **key-value pairs**  
  - Keys → unique  
  - Values → can be duplicate  

---

## 📌 Common Methods (Collection Interface)
- `add(element)`  
- `addAll(collection)`  
- `remove(element)`  
- `removeAll(collection)`  
- `clear()`  
- `size()`  
- `iterator()`  

---

## 1️⃣ List Interface
**Ordered collection, allows duplicates**

| Implementation | Features |
|----------------|-----------|
| **ArrayList**  | Dynamic array, fast random access, slow insertion/deletion |
| **LinkedList** | Doubly linked list, fast insertion/deletion, slower access |
| **Vector**     | Legacy, synchronized (thread-safe) |
| **Stack**      | LIFO (Last In First Out), extends Vector |

---

## 2️⃣ Queue Interface
**FIFO (First In First Out)**

| Implementation     | Features |
|--------------------|-----------|
| **PriorityQueue**  | Orders elements by natural ordering or comparator |
| **LinkedList**     | Can implement Queue |
| **Deque**          | Double-ended queue (insert/remove from both sides) |
| **ArrayDeque**     | Faster than Stack, efficient deque implementation |

---

## 3️⃣ Set Interface
**Unique elements only, no duplicates**

| Implementation     | Features |
|--------------------|-----------|
| **HashSet**        | Unordered, uses hashing, unique elements |
| **LinkedHashSet**  | Maintains insertion order |
| **TreeSet**        | Sorted order (implements NavigableSet) |

---

## 4️⃣ Map Interface
**Key-Value pairs (keys unique, values can duplicate)**

| Implementation     | Features |
|--------------------|-----------|
| **HashMap**        | Unordered, 1 null key allowed, multiple null values |
| **LinkedHashMap**  | Maintains insertion order |
| **TreeMap**        | Sorted order by keys (no null key) |
| **Hashtable**      | Legacy, synchronized (thread-safe) |

---

## 🔧 Collections Utility Class
Static methods for common operations:

- `sort(list)`  
- `reverse(list)`  
- `shuffle(list)`  
- `min(collection)`  
- `max(collection)`  
- `frequency(collection, element)`  

---

## 🎯 Important Interview Questions
- Difference: **ArrayList vs LinkedList**  
- Difference: **HashSet vs TreeSet vs LinkedHashSet**  
- Difference: **HashMap vs Hashtable**  
- Use cases: **Stack vs Queue**  
- How **PriorityQueue** works internally  
- Real-world uses of **Map** (e.g., roll number → student details)  

---

## 📝 Quick Differences

| Feature         | List             | Set               | Queue             | Map                    |
|-----------------|-----------------|-------------------|------------------|------------------------|
| Order           | Maintains order | No / Sorted order | FIFO / Priority  | Key-value mapping      |
| Duplicates      | Allowed         | Not allowed       | Allowed (values) | Keys unique, values ok |
| Example Classes | ArrayList       | HashSet, TreeSet  | PriorityQueue    | HashMap, TreeMap       |

---
## 🎯 Important Interview Questions (with Answers)

### 1. Difference: ArrayList vs LinkedList
- **ArrayList**
  - Uses **dynamic array** internally
  - **Fast random access** (O(1))
  - **Slow insertion/deletion** (O(n)), especially in the middle
  - Better for **read-heavy** operations
- **LinkedList**
  - Uses **doubly linked list** internally
  - **Slow random access** (O(n))
  - **Fast insertion/deletion** (O(1)) if node reference known
  - Better for **write-heavy** operations

---

### 2. Difference: HashSet vs TreeSet vs LinkedHashSet
- **HashSet**
  - Unordered
  - Stores unique elements using hashing
  - Fast (O(1) average for add/remove/search)
- **LinkedHashSet**
  - Maintains **insertion order**
  - Slightly slower than HashSet
- **TreeSet**
  - Stores elements in **sorted order**
  - Uses Red-Black Tree internally
  - Slower (O(log n) for add/remove/search)
  - Does **not allow null elements**

---

### 3. Difference: HashMap vs Hashtable
- **HashMap**
  - Non-synchronized (not thread-safe)
  - Allows **1 null key** and multiple null values
  - Faster than Hashtable
- **Hashtable**
  - Synchronized (thread-safe)
  - **No null key or value allowed**
  - Legacy, rarely used in new code

---

### 4. Use cases: Stack vs Queue
- **Stack (LIFO)** → "Last In First Out"
  - Undo operations in editors
  - Expression evaluation (e.g., infix to postfix)
  - Function call stack in programming
- **Queue (FIFO)** → "First In First Out"
  - Scheduling tasks
  - Print spooling
  - OS process management

---

### 5. How PriorityQueue works internally
- Implemented using a **heap (binary heap)** data structure
- By default: **min-heap** (smallest element at head)
- Elements ordered by **natural ordering** or custom **Comparator**
- Insertions/removals: O(log n)
- Useful for tasks like:
  - Scheduling jobs
  - Finding top-k elements

---

### 6. Real-world uses of Map
- Student roll number → Student details
- Employee ID → Employee record
- Vehicle registration number → Owner details
- Cache implementations
- Word frequency counter
- Routing tables in networks

---
