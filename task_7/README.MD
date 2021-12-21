MainActivity и RectTime находятся в task_7/app/src/main/java/com/example/task_7/

Интерфейсы и классы реализации паттерна "Наблюдать"  находятся в task_7/app/src/main/java/com/example/task_7/Observer + ./Observers (два наблюдателя)

Интерфейс Observer, который реализует лишь один метод handleEvent для обработки событий наблюдателей 
![image](https://user-images.githubusercontent.com/75545890/146928211-42995bdc-b714-435a-a1d9-8a4a6e8abb53.png)

Интерфейс Observed будет релазиован классом RectTime

![image](https://user-images.githubusercontent.com/75545890/146928328-6c9ce70f-d0d1-481c-81ed-76732e1a4b12.png)

Класс RectTime помимо реализации методов интерфейса Observed имеет собственный сеттер для установки параметров, необходимых во время отрисовки фигуры.

![image](https://user-images.githubusercontent.com/75545890/146928379-3821be9f-0bda-4a1c-8e6d-0b17a7175d5b.png)

Два наблюдателя: paramObserver, который реагирует каждый раз, когда вызывает метод установки параметров фигуры и timeObserver, который реагирует на таймер(10 секунд) и меняет цвет фигуры.

![image](https://user-images.githubusercontent.com/75545890/146928541-3c20cb2e-8397-4607-8997-6395c3eead9f.png)
![image](https://user-images.githubusercontent.com/75545890/146928754-e6e83b59-228f-445c-9ab3-4b446061539c.png)

Функция timer() создаёт секундомер, который нужен для показа работоспособности второго наблюдателя
![image](https://user-images.githubusercontent.com/75545890/146928898-1e033e77-aa25-4c7d-837c-ccb1001a3be9.png)


https://user-images.githubusercontent.com/75545890/146928908-16da7475-dd80-462a-94c1-7f4badd87559.mp4

