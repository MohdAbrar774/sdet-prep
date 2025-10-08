
---

## 🗂️ Table of Contents
1. Introduction to Software Testing
2. Software Development Life Cycle (SDLC)
3. Verification vs Validation
4. Software Testing Life Cycle (STLC)
5. Levels of Testing
6. Types of Testing + Diagram
7. Bug / Defect Life Cycle
8. Manual vs Automation Testing
9. Automation Testing Overview
10. Selenium Overview
11. Selenium Locators
12. Waits in Selenium
13. Best Practices & Summary
14. Next Steps for SDET Prep

---

## 🧩 Introduction to Software Testing
Software Testing is the process of **verifying and validating** that a software application:
- Works as expected  
- Meets business and user requirements  
- Is **free from defects or bugs**

> 🎯 **Goal:** Deliver a quality product with minimum defects.

---

## 🏗️ Software Development Life Cycle (SDLC)

Stages of SDLC:
1. **Requirement Analysis**
2. **Design**
3. **Implementation (Coding)**
4. **Testing**
5. **Deployment**
6. **Maintenance**

**Common Models:**
- Waterfall Model  
- V-Model  
- Agile Model  

> 🌀 In Agile, testing happens **continuously** alongside development.

---

## 🔍 Verification vs Validation

| Term | Description | Example |
|------|--------------|----------|
| **Verification** | Ensures product is built correctly (process check) | Code review, design review |
| **Validation** | Ensures right product is built (output check) | Functional testing, UAT |

---

## 🧪 Software Testing Life Cycle (STLC)

Steps involved in testing effectively:

1. **Requirement Analysis** → Understand what to test  
2. **Test Planning** → Prepare strategy, tools, timelines  
3. **Test Case Design** → Write test cases and scenarios  
4. **Test Environment Setup** → Prepare system or environment  
5. **Test Execution** → Run test cases manually/automatically  
6. **Defect Reporting & Tracking** → Log and track bugs  
7. **Test Closure** → Document results and lessons learned  

---

## 🧱 Levels of Testing

| Level | Description |
|--------|-------------|
| **Unit Testing** | Testing individual components (by developers) |
| **Integration Testing** | Checking data flow between modules |
| **System Testing** | Testing complete integrated system |
| **Acceptance Testing** | Done by clients/users before release |

---

## 🧭 Types of Testing + Diagram

### 1. Functional Testing  
- Checks if each function of software works as expected  
- Examples: Smoke, Sanity, Regression, Retesting  

### 2. Non-Functional Testing  
- Tests **performance**, **security**, **usability**, etc.

```mermaid
graph TD
A[Software Testing] --> B[Functional Testing]
A --> C[Non-Functional Testing]
B --> B1[Smoke Testing]
B --> B2[Sanity Testing]
B --> B3[Regression Testing]
B --> B4[Retesting]
C --> C1[Performance Testing]
C --> C2[Security Testing]
C --> C3[Usability Testing]
C --> C4[Compatibility Testing]
````

---

## 🪲 Bug / Defect Life Cycle

### States:

1. **New**
2. **Assigned**
3. **Open / In Progress**
4. **Fixed**
5. **Retest**
6. **Closed**
7. **Reopened**
8. **Rejected**
9. **Deferred**

```mermaid
graph LR
A[New] --> B[Assigned]
B --> C[Open/Active]
C --> D[Fixed]
D --> E[Retest]
E --> F[Closed]
E --> G[Reopened]
C --> H[Rejected]
C --> I[Deferred]
```

> ✅ Bug lifecycle ensures transparency and accountability.

---

## ⚙️ Manual vs Automation Testing

| Feature       | Manual Testing         | Automation Testing           |
| ------------- | ---------------------- | ---------------------------- |
| **Execution** | Human testers          | Tools / scripts              |
| **Speed**     | Slow                   | Fast                         |
| **Accuracy**  | May have human error   | High accuracy                |
| **Cost**      | Low initial            | High initial (tool setup)    |
| **Best For**  | Exploratory, usability | Regression, load, repetitive |

---

## 🤖 Automation Testing Overview

### What is Automation Testing?

Automation Testing is **running test cases automatically** using scripts and tools.

### Benefits:

* Saves time on repetitive tests
* Improves test coverage
* Reduces human error
* Enables **CI/CD** integration

### Popular Tools:

* **Selenium**
* HP UFT / QTP
* TestComplete
* Ranorex
* SoapUI
* JMeter

---

## 🌐 Selenium Overview

### What is Selenium?

Selenium is an **open-source automation tool** for testing **web applications** on different browsers and platforms.

> ⚠️ Works only for **web**, not desktop/mobile apps.

### Components of Selenium

1. **Selenium IDE** – Record & playback tool
2. **Selenium WebDriver** – Automates browsers using code
3. **Selenium Grid** – Parallel execution on multiple systems

```
graph LR
A[Test Script] --> B[Selenium WebDriver]
B --> C[Browser (Chrome/Firefox/etc)]
C --> D[Web Application]
```

---

### Advantages of Selenium

* Free & Open Source
* Supports many languages: *Java, Python, C#, Ruby, PHP*
* Works on *Windows, Linux, Mac*
* Compatible with *Chrome, Firefox, Safari, Edge*
* Integrates with Jenkins, Maven, TestNG, Docker

---

## 🔍 Selenium Locators

### What are Locators?

Locators identify and interact with web elements on a webpage.

| Locator               | Description                   | Example                                                 |
| --------------------- | ----------------------------- | ------------------------------------------------------- |
| **ID**                | Fastest and unique identifier | `driver.findElement(By.id("username"));`                |
| **Name**              | Finds by `name` attribute     | `driver.findElement(By.name("email"));`                 |
| **Link Text**         | Finds link by visible text    | `driver.findElement(By.linkText("Login"));`             |
| **Partial Link Text** | Finds partial text            | `driver.findElement(By.partialLinkText("Sign"));`       |
| **CSS Selector**      | Uses CSS syntax               | `driver.findElement(By.cssSelector("#gh-ac"));`         |
| **XPath**             | Navigates DOM hierarchy       | `driver.findElement(By.xpath("//input[@id='gh-ac']"));` |

---

## ⏳ Waits in Selenium

### Implicit Wait

* Applies globally to all elements
* Waits for a fixed time before throwing error

```java
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
```

---

### Explicit Wait

* Waits dynamically for specific elements or conditions
* More flexible than implicit

```java
WebDriverWait wait = new WebDriverWait(driver, 20);
WebElement element = wait.until(
  ExpectedConditions.visibilityOfElementLocated(By.id("username"))
);
```

---

## 💡 Best Practices & Summary

* Prefer **ID** locator first (fastest & stable)
* Use **CSS Selectors** for speed
* Use **XPath** for complex DOMs
* Combine **Implicit + Explicit waits** to avoid flaky tests
* Keep locators short, simple, and reliable

---

## 🎯 Summary Table

| Concept                | Description                                   |
| ---------------------- | --------------------------------------------- |
| **STLC**               | Defines steps in testing life cycle           |
| **Bug Lifecycle**      | Flow of bug from creation → closure           |
| **Automation Testing** | Replaces manual repetitive tasks with scripts |
| **Selenium**           | Most popular automation tool for web testing  |
| **Locators**           | Used to find and interact with elements       |
| **Waits**              | Synchronization methods for stable tests      |

---