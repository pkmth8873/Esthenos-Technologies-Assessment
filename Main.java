import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        char ch=sc.next().charAt(0);
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='M')
            {
                ch=str.charAt(i);
                continue;
            }
            if(ch=='N'&&y>0)
            {
                y--;
            }
            if(ch=='S'&&y<3)
            {
                y++;
            }
            if(ch=='E'&&x<4)
            {
                x++;
            }
            if(ch=='W'&&x>0)
            {
                x--;
            }
        }
        System.out.print(y+" "+x+" "+ch);
    }
}
