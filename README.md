PizzaStore.

##Level 1

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



##Level 2

1. Model package-dəki Pizza classları arasında iyerarxiya təmin etmək məqsədi ilə AbstractPizza classı yaradın.
Bu class digər pizza classlarındakı ümumi metod və fieldləri özündə cəmləşdirməlidir. Ehtiyac olarsa parametr qəbul edən overloaded constructor əlavə edin.  
Qalan bütün pizza classları AbstractPizza classından törənməlidirlər.
2. PizzaFactory classındakı getPriceForPizza metodu bizə axtarılan pizzanın sayına görə qiymətini deyil artıq həmin pizzanın özünü qaytarmalıdır. 
Metodun return type-ı AbstractPizza olmalıdır.
3. 2-nin nəticəsinə uyğun olaraq PizzaStore classındakı orderPizza funksiyası PizzaFactory.getPriceForPizza()
metodundan uyğun pizzanı almalı və aidiyyatı qiymət funksiyasını özu çağırmalıdır.
Və əlavə olaraq Siffarişə uyğun olaraq yeni Cheque instansı yaratmalı və o instansı uyğun olaraq doldurmalıdır və həmin obyekti "cheques" listinə əlavə etməlidir.
4. PizzaStore.cancelOrder(Cheque); funksiyası geri qaytarılması tələb olunan çeki alır və yoxlanış apardıqdan sonra 
qaytarılıb-qaytarılmayacağı (true/false) haqqında məlmat verir.
5. PizzaStore.removeOrder(Cheque,Integer); funksiyası sifarişdən hər hansısa bir məhsulu silmək üçün istifadə olunur. Metod 
sifariş çekini və sifariş çekindəki Order nömrəsini tələb edir və həmin məhsulu sifarişdən silərək yeni çek qaytarır.
6. PizzaStore - classındakı cancelCheque və removeOrder metodlarının overloaded versiyalarını yazın. Yeni funksiyalar əvvəlkilərdən fərqli olaraq 
Cheque referansı əvəzinə sadəcə çekin id-sini qəbul edəcək.
7. 6-cı bəndin tələblərini təmin etmək üçün List<Cheuqe> collectionunu Map<Integer,Cheque> ilə əvəz edin və bunu kodun aidiyyatı yerlərində nəzərə alın.
8. Gün ərzində aparılan satış əməliyyatları üzrə hesabat aparmaq üçün, çekləri fayla export etmək lazımdır. Bunun üçü PizzaStore-classına exportCheques(int i);
tərtibində bir metod əlavə etməlisiniz. Metodun qəbul etdiyi parameter (i) 3 qiymət alır. 0 - bütün çeklər, 1 - yanlız uğurlu çeklər, 2 - yanlız uğursuz çeklər.