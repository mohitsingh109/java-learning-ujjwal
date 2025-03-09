# Product & Sales Data Processing in Java

## **Problem Statement**
You need to build a **complex data processing system** that handles sales records of different products. The system should:
1. **Retrieve a list of Product objects and Sale objects**.
2. **Filter sales** based on specific criteria (e.g., date range, customer category, minimum purchase quantity).
3. **Aggregate and process sales data** to calculate total revenue per product.
4. **Sort products** by total revenue in descending order.
5. **Further analyze top-selling products** to determine customer trends.
6. **Generate a final report** summarizing sales performance.

---

## **Requirements**
### **1. Define a Product Class**
- Fields: `productId`, `productName`, `category`, `price`
- Constructor and Getters

### **2. Define a Sale Class**
- Fields: `saleId`, `product`, `customerCategory`, `quantity`, `saleDate`
- Constructor and Getters

### **3. Main Processing Tasks**
- **Retrieve a list of products and sales** (store in `List<Product>` and `List<Sale>`).
- **Filter sales** based on:
    - A given **date range** (e.g., last 6 months).
    - Customer category (e.g., "Premium", "Regular").
    - Minimum quantity purchased.
- **Aggregate total sales per product**.
- **Sort products** by revenue in descending order.
- **Determine top-selling products** and analyze their customer categories.
- **Generate a final report** displaying:
    - Number of sales processed.
    - Total revenue per product.
    - Top 3 best-selling products with their revenue and customer category analysis.

---

## **Example Input & Output**
### **Given Products & Sales:**
```java
List<Product> products = new ArrayList<>();
products.add(new Product(1, "Laptop", "Electronics", 1000));
products.add(new Product(2, "Smartphone", "Electronics", 800));
products.add(new Product(3, "Headphones", "Accessories", 150));

List<Sale> sales = new ArrayList<>();
sales.add(new Sale(201, products.get(0), "Premium", 5, "2024-01-15"));
sales.add(new Sale(202, products.get(1), "Regular", 10, "2024-02-10"));
sales.add(new Sale(203, products.get(2), "Premium", 20, "2023-11-05"));
sales.add(new Sale(204, products.get(0), "Regular", 2, "2024-03-01"));
```

### **Processing Steps:**
1. Filter Sales within **last 6 months** (excluding sales before 2023-09-01).
2. Group sales by **product** and calculate total revenue.
3. Sort products by **revenue** in descending order.
4. Determine the **top 3 selling products** and analyze customer purchase trends.
5. Generate Report:
```
Sales Report:
Total Sales Processed: 3
Product Revenue:
1. Laptop - $7,000 (Customers: Premium, Regular)
2. Smartphone - $8,000 (Customers: Regular)
3. Headphones - $3,000 (Customers: Premium)

Top-selling Product: Smartphone with $8,000 revenue
```


