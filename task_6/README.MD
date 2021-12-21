Главный класс и Context находятся в task6/app/src/main/java/com/example/task6/

Классы соритровок находятся в task6/app/src/main/java/com/example/task6/Sorts

Интерфейс Strategy находится в task6/app/src/main/java/com/example/task6/

Макет интерфейса находится в task6/app/src/main/res/layout/

Ниже представлен пример кода класса сортировки "Пузырьком", который реализаует интерфейс Strategy
![image](https://user-images.githubusercontent.com/75545890/143763023-4d906562-c586-447b-951a-00c0f6d2e2eb.png)

Класс Context нужен для определения выбранной стратегии, он позволяет избежать громозких конструкций if...else в главном классе
![image](https://user-images.githubusercontent.com/75545890/143763063-1957d9a6-bdea-4bfd-9837-e3a884896235.png)

После генерациии нового массива чисел, пользователь может выбрать одну из трёх предложенный сортировок. Ниже представлен код сортировки bubbleSort.
Сначала создаётся экземпляр класса Context с нужной сортировкой, после вызывается сам метод сортировки. Отсортированный массив копируется в новый для дальнейшего отображения
в TextView. В цикле с помощью StringBuilder идёт препобразование отсортириованного массива в массив строк с пробелами, для корректного отображения в TextView.
![image](https://user-images.githubusercontent.com/75545890/143763227-e317f613-fbaf-4260-b241-1986bafdd2f5.png)


https://user-images.githubusercontent.com/75545890/143763204-1f0be54a-f0cc-4e78-b8fd-245535acf2d3.mp4

