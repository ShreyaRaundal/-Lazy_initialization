# Lazy_initialization

✅ 1. Car and Engine
Class: Car
brand, model, fuelType, price
Behavior: displayCar(), insertEngine()
Class: Engine
type, horsepower, capacity
Behavior: displayEngine()
Lazy Instantiation? ✅
Engine object is created only when insertEngine() is called.

✅ 2. Mobile and Sim
Class: Mobile
brand, name, price, type
Behavior: displayMobile(), insertSim()
Class: Sim
serviceProvider, networkType, type, simNo
Behavior: displaySim()
Lazy Instantiation? ✅
SIM object is created only when insertSim() is called.

✅ 3. Computer and Pendrive
Class: Computer
brand, ram, rom, processor, price
Behavior: displayComputer(), insertPendrive()
Class: Pendrive
brand, memory, speed, price
Behavior: displayPendrive()
Lazy Instantiation? ✅
Pendrive object is created only when insertPendrive() is called.

✅ 4. Student and Course Enrollment
Class: Student
name, rollNo, branch, ArrayList<Course> courses
Behavior: enrollCourse(), displayCourses()
Class: Course
courseName, courseCode, credits
Behavior: displayCourse()
Lazy Instantiation? ✅
Courses list starts empty; Course objects created and added only when enrollCourse() is called.

✅ 5. Order and Product (E-Commerce)
Class: Order
orderId, customerName, ArrayList<Product> products
Behavior: addProduct(), calculateTotal(), displayOrder()
Class: Product
productName, price, quantity
Behavior: displayProduct()
