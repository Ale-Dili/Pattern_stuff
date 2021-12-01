package lambda.expression;

interface funcFormat{
    String run(String str);
}

public class Main
{
    public static void main(String[] args) {
        String s1 = "Hello world";
        funcFormat scream = (s)->s+"!!";
        funcFormat ask = (s) -> s+"??";
        StringFormatter stringFormatter = new StringFormatter();

        System.out.println();
        formatString(s1,ask);

    }

    public static void formatString (String s, funcFormat format){
        System.out.println(format.run(s));
    }
}

 class StringFormatter{
    public Object askFormat(Object s){
        return s+"??";
    }

 }
