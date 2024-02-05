import java.util.*;<br>

class sneha<br>
  {<br>
    public static void main(String[] args)<br>
{<br>
        Scanner sc = new Scanner(System.in);<br>
        System.out.println("Enter a number");<br>
        int a = sc.nextInt();<br>
        fac(a);<br>
    }<br>

    static void fac(int a)<br>
  {<br>
        int fact = 1;<br>
        if (a < 0) <br>
{<br>
            System.out.println("factorial of a negative no does not exist");<br>
        } <br>
  else<br>
  {<br>
            for(int i = 1; i <= a; i++)<br>
  {<br>
                fact = fact * i;<br>
            }<br>
            System.out.println("the factorial is:" + fact);<br>

        }<br>
  }<br>
  }<br>
