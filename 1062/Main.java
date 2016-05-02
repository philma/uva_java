import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int cnt = 0;
        Scanner input = new Scanner(System.in);
        String line;
        while((line = input.nextLine()).compareTo("end") != 0)
        {
            ++cnt;
            ArrayList<Stack<Character>> stacks = new ArrayList<Stack<Character>>();
            
            for(int i = 0; i < line.length(); ++i)
            {
                boolean enter = false;
                for(int j = 0; j < stacks.size(); ++j)
                {
                    Stack<Character> stack = stacks.get(j);
                    if(stack.empty() || stack.peek() >= line.charAt(i))
                    {
                        enter = true;
                        stack.push(line.charAt(i));
                        break;
                    }
                }

                if(!enter)
                {
                    Stack<Character> stack = new Stack<Character>();
                    stack.push(line.charAt(i));
                    stacks.add(stack);
                }
            }

            System.out.println("Case " + cnt + ": " + stacks.size());
        }
    }
}
