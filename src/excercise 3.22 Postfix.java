public class Postfix {
    Node topNode;

    Postfix()
    {
        this.topNode = null;
    }

    private class Node
    {
        double data;
        Node link;
    }

    public void push(double stackItemData)
    {
        Node temp = new Node();
        temp.data = stackItemData;
        temp.link = topNode;
        topNode = temp;
    }

    public double pop()
    {
        if (topNode == null) {
            return 0;
        }
        double temp = topNode.data;
        topNode = (topNode).link;
        return temp;

    }

    public double expressionCheck(String expression){
        String[] arrOfStr = expression.split(" ");
        for(int i=0;i<arrOfStr.length;i++){
            String string = arrOfStr[i];
            try{
                double number = Double.parseDouble(string);
                push(number);
            }
            catch(Exception ex){
                double val1 = pop();
                double val2 = pop();

                switch(string)
                {
                    case "+":
                        push(val2+val1);
                        break;

                    case "-":
                        push(val2- val1);
                        break;

                    case "/":
                        push(val2/val1);
                        break;

                    case "*":
                        push(val2*val1);
                        break;
                }
            }


        }
        return pop();
    }


    public static void main(String[] args)
    {

        Postfix postfix = new Postfix();
        String exp="2.2 4.456 2 + * 12.3 -";
        System.out.println("postfix evaluation: "+postfix.expressionCheck(exp));
    }

}

