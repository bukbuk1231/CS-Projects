public class PrefixToInfix
{
    private String expression;
    @SuppressWarnings("unchecked")
    private Stack<String> output = new ArrayStack();
    private char ch;
    
    public PrefixToInfix()
    {
	expression = null;
    }

    public PrefixToInfix(String prefixExpression)
    {
	expression = prefixExpression;
    } 

    private boolean isOperator(char ch)
    {
	if(ch == '+' || ch == '-' || ch == '*' || ch =='/' || ch == '^')
	    return true;
	return false;
    }
  
    public String ConvertToInfix()
    {
	for(int i = expression.length() - 1; i >= 0; i--)
	{
	    ch = expression.charAt(i);
	    if(isOperator(ch))
	    {
		String operandA = output.pop();
		String operandB = output.pop();
		output.push("("+operandA+ch+operandB+")");
	    }
	    else
		output.push(""+ch);
	}	
	return output.pop();
    }
    
}