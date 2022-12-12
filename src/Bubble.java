public class Bubble {
    public int[] sortAsc(int[] arr) {
        int temp;                  // Вспомогательная переменная, которая будет хранить в себе значение замененной переменной
        for (int i = 0; i < arr.length; i++) {   // Перебираем массив
            for (int j = 0; j < arr.length; j++) {  // Во втором цикле сравниваем каждый элемент со всеми элементами
                if(arr[i] < arr[j]){       // Сравниваем элемент с каждым элементом, если удовлетворенно условие, делаем замену
                    temp = arr[i];     // Запоминаем переносимое значение
                    arr[i] = arr[j];  // Меняем значение
                    arr[j] = temp;   // Записываем запомненное значение в новую позицию
                }
            }

        }
        return arr;    // Возвращаем отсортированный массив
    }

    public int[] sortDesc(int[] arr) {

        int temp;                  // Вспомогательная переменная, которая будет хранить в себе значение замененной переменной
        for (int i = 0; i < arr.length; i++) {   // Перебираем массив
            for (int j = 0; j < arr.length; j++) {  // Во втором цикле сравниваем каждый элемент со всеми элементами
                if(arr[i] > arr[j]){       // Сравниваем элемент с каждым элементом, если удовлетворенно условие, делаем замену
                    temp = arr[i];     // Запоминаем переносимое значение
                    arr[i] = arr[j];  // Меняем значение
                    arr[j] = temp;   // Записываем запомненное значение в новую позицию
                }
            }

        }
        return arr;    // Возвращаем отсортированный массив
    }
}
