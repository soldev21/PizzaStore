PizzaStore.

Application-un məqsədi sadə PizzaStore funksionalı qurmaqdan ibarətdir.
İlkin olaraq aşağıdakı komponentlərdən ibarətdir.

PizzaStore - pizza mağazası funksiyalarını təsvir edən classdır. 
əsas funksiyası orderPizza - funksiyasıdır. Sifariş veriləcək pizzanın 
adını və sayını qəbul edir və nəticədə sifariş haqqında məlumatlar qaytarır.


PizzaFactory - bu class pizzanın adı və sayına görə sözügedən pizzanın olub olmamasını yoxlayır 
əgər varsa obyektin yaradıb uyğun metoduna müraciət edir. Əgər bu adda pizza yoxdursa exception atır.

model - package-də Pizza növlərinin hər birinə uyğun eyni adda class-lar olmalıdır və hər biri SomePizza classındakı eyni metodları 
təsvir etməlidir.


Tapşırıq:
1. PizzaStore - classının body-i boş verilmiş metodlarını real kodla təmin etmək.
2. mode- packageinə yeni pizza classları əlavə edtmək.
3. PizzaFactory - classında yeni Pizza classlarını nəzərə almaq.

Qeyd: İnheritance - dan istifadə etmədən yazmalısınız. 
 