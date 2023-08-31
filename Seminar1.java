public class Seminar1 {
    // Task_1
    // public static void main(String[] args) {
    //     int[] array = {1, 2, 3, 4, 5};
    //     System.out.println(checkArray(array, 7));
    // }
    // public static int checkArray(int[] array, int len){
    //     if(array.length < len){return -1;};
    //     return array.length;
    // } 

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println(stringCode(array, 5, 3));
    }

    public static int checkArray(Integer[] array, int len, int value) {
        if(array == null){return -3;};
        if(array.length < len){return -1;};
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -2;        
    }

    public static String stringCode(Integer[] array, int len, int value) {
        int code = checkArray(array, len, value);
        if (code == -1){
            return "Длина массива(" + array.length + ") меньше некоторого заданного минимума(" + len + ")";
        }
        if (code == -2){
            return "Искомый элемент не найден" + value + ")";
        }
        if (code == -3){
            return "Вместо массива пришел null ";
        }
        return "Индекс найденного элемента - " + code;        
    }

    


}
