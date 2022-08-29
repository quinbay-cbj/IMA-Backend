# IMA Backend
 * Create DataBase : "quinbay"

 * Create DB : userdb
    create table userdb(emailId text primary key,userId text unique,role text,name text, status boolean, address text, contact text, password text);
    
 * Insert:   
    insert into userdb(emailid,userid,role,name,status,address,contact,password) values('admin@gmail.com','3dc8cc6b-d6d4-4103-acde-12b0af113791','admin','Admin',true,'Coimbatore','9543218765','admin123');

 * Create DB : productdb
     create table productdb(sellerid text not null,productid text primary key,productname text,discription text,productprice int,sellingprice int,quantity int,imageUrl text,promo int);

 * changes to be Done: UserMicroService
    
     update the url for const PRODUCT_LINK in Constants class 


 * Changes to be Done: SellerMicroServices

     change the IP in ConstantValue Class -> GET_ALL_USER_LINK
     


