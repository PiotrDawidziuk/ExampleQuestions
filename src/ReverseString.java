// Class of ReverseString 
class ReverseString
{
    public static void main(String[] args)
    {
        String input = "1 2 3 4 5 6 7 8";

        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] strAsByteArray = input.getBytes();

        byte [] result =
                new byte [strAsByteArray.length];

        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] =
                    strAsByteArray[strAsByteArray.length-i-1];

        System.out.println(new String(result));
    }
} 