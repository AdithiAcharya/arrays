import java.util.Stack;

class PlateStack
{
   public Stack<String>st=new Stack<>(); 


    public void addPlate(String plate)
    {
        st.push(plate);
        System.out.println("Added plate :"+plate);
    }

    public String removePlates()
    {
        if(!st.isEmpty())
        {
            String top_plate=st.pop();
            System.out.println("the popped plate is: "+top_plate);
            return top_plate;
        }
        else
        {
            System.out.println("no plates left ");
            return null;
        }
    }

    public String peekTopPlate()
    {
        if(!st.isEmpty())
        {
            String topPlate = st.peek();
            System.out.println("the top element is :"+topPlate);
            return topPlate;
        }
        else
        {
            System.out.println("No plates left ");
            return null;
        }
    }

    public boolean checkPlates()
    {
        return !st.isEmpty();
    }
}
class Main {
    public static void main(String[] args) {
        
        PlateStack plateStack=new PlateStack();
        
        plateStack.addPlate("plate1");
        plateStack.addPlate("plate2");
        plateStack.addPlate("plate3");
        
        plateStack.peekTopPlate();
        
        
        while(plateStack.checkPlates())
        {
            plateStack.removePlates();
        }
        
        if(!plateStack.checkPlates())
        {
            System.out.println("No plates left");
        }
    }
}
