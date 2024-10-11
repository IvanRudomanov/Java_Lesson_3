/*Задание 1. Удаление отрицательных значений из массива
Реализуйте метод, который принимает на вход целочисленный массив и удаляет все отрицательные числа. Метод должен вернуть массив, 
содержащий только неотрицательные числа.
Пример:
[-1, 2, -3, 4, -5, 6]
Результат:
[2, 4, 6] */

/* import java.util.ArrayList;

public class Printer {

    public static int[] filterNegative(int[] a) {
        ArrayList<Integer> arr_tmp = new ArrayList<>();
        int i = 0;
        for (i = 0; i <= a.length; i++) {
                if (a[i] > -1) {
                    arr_tmp.add(a[i]);
                }
        }
        System.out.println(arr_tmp.toString());
        int[] arr_res = new int[arr_tmp.size()];
        for (int j = 0; j < arr_tmp.size(); j++) {
             arr_res[j] = arr_tmp.get(j);
        }
        System.out.println(arr_res.length);
        return arr_res;
    }
               
    public static void main(String[] args) {
        int [] a = {-1, 2, -3, 4, -5, 6};
        int [] arr_rez = filterNegative(a);
        System.out.println(arr_rez.toString());
    }
} 
*/

/* Задача 2. Уникальные числа
Напишите метод, который принимает целочисленный массив и возвращает новый массив, 
содержащий только уникальные элементы из исходного массива.
Пример:
[1, 2, 2, 3, 4, 4, 5]
Результат:
[1, 2, 3, 4, 5]
 */
/**
 * Printer
 */

/*  import java.util.ArrayList;
 import java.util.Arrays;

 public class Printer {

    public static int[] Unique_Digit(int[] a) {
        ArrayList<Integer> tmp_arr = new ArrayList<>();
        int i = 0;
        
        for (i=0; i<a.length; i++) {
            boolean k = true;
            int j = 0;
            for (j=0; j<tmp_arr.size(); j++) {
                if (tmp_arr.get(j).equals(a[i])) {
                    k = false;
                } 
            }
            if (k) {
                tmp_arr.add(a[i]);
                //System.out.println(tmp_arr.get(tmp_arr.size()-1));
            }
            
        }
        int[] res_arr = new int[tmp_arr.size()];
        for (int k = 0; k < tmp_arr.size(); k++) {
            res_arr[k] = tmp_arr.get(k);
        }
        return res_arr; 
 
    }
    
    public static void main(String[] args) {
        int [] a = {1, 2, 2, 3, 4, 4, 5};
        
        int [] a_mod = Unique_Digit(a);

        System.out.println(Arrays.toString(a_mod));
    }
}

 */

 /* Задача 3. Длина слов
 Реализуйте метод, который принимает на вход массив строк и возвращает  новый массив, содержащий только строки, 
 длина которых больше 3 символов.
 Пример:
 ["cat", "elephant", "dog", "giraffe"]
 Результат:
 ["elephant", "giraffe"]
 */

/**
 * Printer
 */

 import java.util.Arrays;
 import java.util.ArrayList;

 public class Printer {

        public static String[] filterShortStrings(String[] arr) {
            ArrayList<String> result = new ArrayList<>();
            for (String s : arr) {
            if (s.length() > 3) {
            result.add(s);
            }
            }
            // Преобразуем ArrayList в массив
            String[] resultArray = new String[result.size()];
            for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
            }
            return resultArray;
            }
 
    public static void main(String[] args) {
        String [] arr =  {"cat", "elephant", "dog", "giraffe"};
        String itresume_res = Arrays.toString(filterShortStrings(arr));
        System.out.println(itresume_res);   
    }
}


