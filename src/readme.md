Задача “Автомобили” продолжение:


Давайте перезагрузим метод refuel().  
Для бензинового и дизельного двигателей сделаем метод  refuel(int liter), который заправляет автомобиль на необходимое количества литров топлива. Таким образом:
refuel() - заправляемся до полного бака
refuel(int liter) - заливаем указанное количество или до полного бака

Для электроавтомобиля сделаем метод  refuel(int chargePercent) который заряжает до указанного значения или на 100%
Таким образом:
refuel() - заправляемся до полного заряда
refuel(int chargePercent) - заряжает до указанного количества или до полного заряда.


Реализуйте класс GasStation (String title) - заправка.  Реализуйте метод,  refuel(Auto auto, int amount) который принимает автомобиль и цифру, на сколько его заправить и соответственно заправляет авто вызывая его метод refuel().

В классе автомобиль реализуйте метод drive(int distance) который выводит на экран что автомобиль столько то проехал, и столько то заряда\топлива осталось



Задача 2.

Напишите программу, которая спрашивает массив какой длинны хотел бы получить пользователь, и диапазон значений (min, max).Программа должна создать массив необходимой длины, заполненный случайными числами в заданном диапазоне.
