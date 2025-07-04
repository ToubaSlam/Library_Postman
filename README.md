# 📚 Library API Testing Project

Welcome to the **Library API Testing Project**, a robust and modular RESTful API testing suite for managing books, users, wishlists, and households. This repository includes the source code, Postman collections, environment files, and setup instructions to help you test a Node.js-based Library API efficiently.

---

## 📑 Table of Contents

- ✨ [Introduction](#introduction)
- 🚀 [Features](#features)
- ⚙️ [Installation & Setup](#installation--setup)
- 🧪 [Usage & Running Tests](#usage--running-tests)
- 🖼️ [Test Reports](#test-reports)
- 🤝 [Contributing](#contributing)
- 📝 [License](#license)

---

## ✨ Introduction

The **Library API** enables managing a full book rental service through RESTful endpoints. It supports creating, retrieving, updating, and deleting entities such as books, users, households, and wishlists.

This project automates the validation of all API endpoints using Postman and Newman, ensuring reliable CI/CD integrations and efficient regression testing.

---

## 🚀 Features

✅ Create, update, retrieve, and delete books  
✅ Manage users and household records  
✅ Wishlist management for users  
✅ Secure operations using authentication tokens  
✅ JSON-based request/response  
✅ Organized in folders by entity type  
✅ Built-in support for automated testing using Newman  
✅ Detailed HTML reports generated via Newman  

---

## ⚙️ Installation & Setup

### Prerequisites:
- [Node.js](https://nodejs.org/) (v14+)
- [Postman](https://www.postman.com/downloads/)
- [Newman](https://www.npmjs.com/package/newman)

### Clone the repository:
```bash
git clone https://github.com/ToubaSlam/Library_Postman.git
cd Library_Postman
```

### Install dependencies:
```bash
npm install -g newman
```

---

## 🧪 Usage & Running Tests

### Using Postman UI:
1. Open Postman
2. Click **Import**
3. Import the `FakerStoreCollection.postman_collection.json`
4. Import the relevant environment (e.g., `Library_Environment.postman_environment.json`)
5. Select the environment from the top-right dropdown
6. Run individual requests or the entire collection using **Collection Runner**

### Using Newman CLI:
Run all tests and generate an HTML report:
```bash
newman run FakerStoreCollection.postman_collection.json -e Library_Environment.postman_environment.json -r cli,html --reporter-html-export newman/report.html
```

Or just double-click `run.bat` if available, which automates the above.

---

## 🖼️ Test Reports

All reports are saved in the `newman/` directory after execution.  
Open `report.html` in your browser to view the full results, including passed/failed test cases and response details.

---

## 🤝 Contributing

We welcome contributions!

1. Fork this repo  
2. Create a branch (`feature/my-feature`)  
3. Commit your changes  
4. Push and create a Pull Request 🚀

---

## 📝 License

This project is licensed under the **MIT License** – feel free to use and modify it.

---

✨ Happy Testing!
