public class day17 {

    //Task1
    public static void add(int i) {
        System.out.println(" int i");
    }

    public static void add(int i, float j) {
        System.out.println("int i, float j");
    }

    public static void add(float i, int j) {
        System.out.println("float j, int i");
    }

    //Task2
    public static int add1(int i) {
        System.out.println("int ");
        return i;
    }

    public static float add1(float i) {
        System.out.println("float");
        return i;
    }

    //Task7
    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    static int max(int a, int b, int c) {
        if (max(a, b) > c)
            return max(a, b);
        else
            return c;
    }

    static int max(int a, int b, int c, int d) {
        if (max(a, b, c) > d)
            return max(a, b, c);
        else return d;
    }
    //Task5

    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int argument) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == argument)
                return i;
        }
        return -1;
    }

    public static boolean search(int[] array, int argument, int index) {
        if (search(array, argument) == index)
            return true;
        else
            return false;
    }

    //Task6
    public static int square(int p) {
        float PI = 3.14f;
        return (int) PI * p * p;
    }

    public static float square(float p) {
        return p * p;
    }

    public static int square(int p, int q) {
        return p * q;
    }

    //Task10
    static int reminder(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    static int reminder(int number, int num) {
        return reminder(number) % num;
    }

    //Task9
    static int fahrenheitCelsius(float celsius, int value) {
        int f = (int) celsius * 9 / 5 + 32;
        return f;
    }

    //Task8
    static int destance(int x1, int x2) {
        int y1 = 0;
        int y2 = 0;
        int dis = (x1 - y1) * (x1 - y1) + (x2 - y2) * (x2 - y2);
        return dis;
    }

    static int destance(int x1, int x2, int x3, int x4) {
        int dis = (x3 - x1) * (x3 - x1) + (x4 - x2) * (x4 - x2);
        return dis;
    }


    public static void main(String[] args) {
        System.out.println(max(7, 9));
        System.out.println(max(7, 9, 12));
        System.out.println(max(4, 6, 7, 1));


    }
}


