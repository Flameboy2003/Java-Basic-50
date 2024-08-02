package Variables_and_DataTypes;


  /* Question 1.Declare and initialize variables of different data types: int, double, char, and boolean.

    There are eight primitive data types in Java:

       | Data Type |	Size	| Description
     ---------------------------------------------------------------------------------------------------------------
       |byte	   | 1 byte     | Stores whole numbers from -128 to 127
       |short	   | 2 bytes	| Stores whole numbers from -32,768 to 32,767
       |int	       | 4 bytes	| Stores whole numbers from -2,147,483,648 to 2,147,483,647
       |long	   | 8 bytes	| Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
       |float	   | 4 bytes	| Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
       |double	   | 8 bytes	| Stores fractional numbers. Sufficient for storing 15 decimal digits
       |boolean	   | 1 bit	    | Stores true or false values
       |char	   | 2 bytes	| Stores a single character/letter or ASCII values
     ----------------------------------------------------------------------------------------------------------------
    */

    /*
       let's find the range between the Data types
            1. Identify the primitive data type (e.g., byte, short, int, long, float, or double).
            2.Determine whether the data type is signed or unsigned:
               - Signed data types (byte, short, int, long) have a fixed number of bits dedicated to
                 the sign (most significant bit).
               - Unsigned data types (char, byte[] or other arrays of bytes) do not have a sign bit.
            3.Calculate the maximum value (2^n - 1, where n is the number of bits) for unsigned data types.
            4.For signed data types, calculate the maximum value (2^(n-1) - 1) and the minimum value (-2^(n-1)).
              Note that n is the number of bits minus one, since one bit is dedicated to the sign.
    */

    /*
        Let’s apply this to the example provided:

            1. byte : 8-bit signed integer
               - Minimum value: \(-2^{7} = -128\)
               - Maximum value: \(2^{7} - 1 = 127\)

            2. short: 16-bit signed integer
               - Minimum value: \(-2^{15} = -32,768\)
               - Maximum value: \(2^{15} - 1 = 32,767\)

            3. int: 32-bit signed integer
               - Minimum value: \(-2^{31} = -2,147,483,648\)
               - Maximum value: \(2^{31} - 1 = 2,147,483,647\)

            4. long: 64-bit signed integer
               - Minimum value: \(-2^{63} = -9,223,372,036,854,775,808\)
               - Maximum value: \(2^{63} - 1 = 9,223,372,036,854,775,807\)

            For floating-point data types, the range is based on the IEEE 754 standard:

            5. **float**: 32-bit floating point
               - Approximate range: \(-3.4028235 \times 10^{38}\) to
                                        \(3.4028235 \times 10^{38}\)

            6. **double**: 64-bit floating point
               - Approximate range: \(-1.7976931348623157 \times 10^{308}\) to
                                    \(1.7976931348623157 \times 10^{308}\)
    */

public class Declaration {
    public static void main(String[] args) {

        Byte b = 127;
        System.out.println(b);

        /*
            Byte b2= -129;
            System.out.println(b2);
        Error: java: incompatible types: int cannot be converted to java.lang.Byte
        */
        int i = -2147483648;
        System.out.println(i);

        /*
            int i= 2147483648;
            System.out.println(i);
        Error:java: integer number too large

        */


    }
}
