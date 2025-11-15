# spring_boot_task1
Spring Boot Product API – Task Description

1.Create a simple Spring Boot application (no database needed).
Sadə bir Spring Boot tətbiqi yaradın (məlumat bazası lazım deyil).

2.Create two classes: ProductController and ProductService.
İki class yaradın: ProductController və ProductService.

3.Inject ProductService into ProductController using dependency injection (DI).
ProductService class-ını dependency injection ilə ProductController-ə əlavə edin.

4.Create a Product class with at least 4 properties (name is required).
Product adlı class yaradın və ən azı 4 property əlavə edin (name mütləqdir).

5.Store products inside a collection in ProductService (e.g., HashMap).
ProductService class-ında məhsulları saxlamaq üçün collection yaradın (məsələn, HashMap).

6.Implement get(productName) method that returns the product or throws 404 if not found.
get(productName) methodu yazın — məhsul tapılarsa qaytarsın, tapılmazsa 404 xətası versin.

7.Map ProductController to the /products path.
ProductController-i /products path-inə map edin.

8.Create a GET endpoint /products/{name} that calls the get method of ProductService.
/products/{name} üçün GET endpoint yaradın və ProductService-dəki get metodunu çağırın.

9.Implement save(Product product) in ProductService to add or replace a product in the collection.
ProductService-də save(Product) methodu yazın — məhsulu əlavə etsin və ya mövcud məhsulu yeniləsin.

10.Create a POST endpoint /products that receives a Product and calls the save method.
/products üçün POST endpoint yaradın — Product obyektini qəbul edib save metoduna göndərsin.
