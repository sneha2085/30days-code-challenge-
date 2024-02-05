class Fibonacci<br> 
{<br>
    public static void main(String[] args)<br>
    {<br>
        int num3;int i;<br>
        int num1 = 0;<br>
        int num2 = 1;<br>
      
        System.out.println(num1);<br>
        System.out.println(num2);<br>
        for(i=1;i<=8;i++)<br>
        {<br>
        num3 = num1+num2;<br>
        System.out.println(num3);<br>
        num1 = num2;<br>
        num2 = num3;<br>
        }<br>
    }<br>
}<br>
