class Book
{
    void display()
    {
        System.out.println("Name - One Arranged Murder");
        System.out.println("Author - Chetan Bhagat");
    }
}

class Reference_Book extends Book
{
    void display()
    {
        System.out.println("Name - Pure Java 2");
        System.out.println("Author - Kenneth Litwak");
    }
}

class Magazine extends Book
{
    void display()
    {
        System.out.println("Name - Dataquest");
        System.out.println("Author - Pradeep Gupta");
    }
}

class Inheritance
{
    public static void main(String args[])
    {
        Book b;
        b=new Book();
        b.display();
        b=new Reference_Book();
        b.display();
        b=new Magazine();
        b.display();
    }
}
