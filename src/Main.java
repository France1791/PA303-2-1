public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        sumInt();
        sumDouble();
        addVar();
        divideInt();
        divideDouble();

    }
//    Write a program that declares two integer variables, assigns an integer to each,
//    and adds them together. Assign the sum to a variable
    static void sumInt(){
        int x = 1;
        int y = 1;
        int z = x + y;
        System.out.println(z);
    }

//    Write a program that declares two double variables, assigns a number to each,
//    and adds them together. Assign the sum to a variable.
  static void sumDouble(){
        double i = 3.5;
        double j = 1.5;
        double k = i + j;
      System.out.println(k);
  }

//  Write a program that declares an integer variable and a double variable, assigns numbers to each,
//  and adds them together. Assign the sum to a variable.  Print out the result. What variable type must the sum be?
    static void addVar(){
        int a = 3;
        double b = 5.5;
        double c = a + b;
        System.out.println(c);
    }

//    Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
//    Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
    static void divideInt(){
        int l = 3;
        double m = 9.2;
        double n;
        if( l < m){
          n = m/l;
        } else{
            n = l/m;
        }
        System.out.println(n);
    }

//   Write a program that declares two double variables, assigns a number to each,
//   and divides the larger number by the smaller number. Assign the result to a variable.
//   Print out the result. Now cast the result to an integer. Print out the result again.
    static void divideDouble(){
        double s = 5.5;
        double t = 15.9;
        double u;
//     when change result to an integer variable(int u), we received this error message:
//        java: incompatible types: possible lossy conversion from double to
        if(s < t){
            u = t / s;
        }else{
            u = s / t;
        }
        System.out.println(u);
    }

}