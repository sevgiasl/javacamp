﻿--Select
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers
--Allians

Select*from Customers where City='Berlin'
--müşterilerden şehri berlin olanları getir

select*from Products where categoryId=1 or CategoryID=3
--case insensitive,büyük-küçük harf duyarsız

select*from Products where categoryId=1 and UnitPrice>=10
-- <> farklı demek

select*from Products order by CategoryID,ProductName
-- e göre sırala

select*from Products order by UnitPrice asc 
--ascending,artan

select*from Products order by UnitPrice desc
--descending,azalan,düşen

select*from Products where CategoryID=1 order by UnitPrice desc
--filtrele ve sırala

select count(*) Adet from Products where CategoryID=2
--daki bütün satırları say

select categoryID from products group by CategoryID
--hangi kategoride kaç farklı ürünümüz var

select categoryID,count(*) from products group by CategoryID
--her bir grup için arka planda bir tablo oluyor gibi düşünebiliriz

select categoryID,count(*) from products group by CategoryID having count(*)<10
--having, group by a konu olan kümülatif sorguya yazılan koşullar için kullanılır

select categoryID,count(*) from products where UnitPrice>20 
group by CategoryID having count(*)<10
--birim fiyatı 20 den fazla olan ürünleri kategoriId ye göre grupla onlardan sayısı her bir grupta 10 dan az olanları ver

select*
from Products inner join Categories --tüm ürünlerle,kategorileri birleştir
on Products.CategoryID=Categories.CategoryID --şartında bir araya getir

select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName --hangi tablodan hangi kolonu istiyorsun
from Products inner join Categories --tüm ürünlerle,kategorileri birleştir
on Products.CategoryID=Categories.CategoryID --şartında bir araya getir
where Products.UnitPrice>10
-- inner join sadece 2 tabloda da eşleşenleri biraraya getirir,eşleşmeyen data varsa getirmez

--DTO, Data Transformation Object (c# da)

select*from [Order Details]

select*from Products p inner join [Order Details] od --2 tabloyu join edeceğimiz zaman 2 tablodaki ortak kolonu bulmamız gerekir
on p.ProductID=od.ProductID
--inner join sadece 2 tabloda da eşleşen kayıtları getirir

select*from Products p left join [Order Details] od --2 tabloyu join edeceğimiz zaman 2 tablodaki ortak kolonu bulmamız gerekir
on p.ProductID=od.ProductID
-- left join solda olup sağda olmayanları da getir
-- right join sağda olup solda olmayanları da getirir

select*from Customers c inner join Orders o 
on c.CustomerID=o.CustomerID

select*from Customers c left join Orders o 
on c.CustomerID=o.CustomerID

select*from Customers c left join Orders o 
on c.CustomerID=o.CustomerID
where o.CustomerID is null
--left join - inner join data
--o.CustomerID de o data yok demek,is null

select*from Products p inner join [Order Details] od
on p.ProductID=od.ProductID
inner join Orders o
on o.OrderID=od.OrderID
--birden fazla tabloyu birleştirme


