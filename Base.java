class Base

{

public void area()

{

System.out.println("null argument");
}

public void area(int a)

{

System.out.println("one integer argument");
}


public void area(float x)

{

System.out.println("one float argument");
}


}

public class Demo12

{

public static void main(String[] args)

{
you
Base b=new Base();


b.area();

b.area(10);
b.area(1.2f);

}

}