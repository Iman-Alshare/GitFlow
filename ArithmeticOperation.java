class ArithmeticOperation{

    public static Object pow(Object num1, Object num2) {
        Object div;
        if ((num1 instanceof String) || (num2 instanceof String) || (num1 instanceof Character) || (num1 instanceof Character))
            return (Object)null;
        if (Double.parseDouble(num1.toString())==0.0)
            return (Object)null;
        div = Math.pow(Double.parseDouble(num1.toString()),Double.parseDouble(num2.toString()));
        if (num1 instanceof Integer && num2 instanceof Integer )
            return Double.valueOf(div.toString()).intValue();
        return Double.valueOf(div.toString());
    }

}