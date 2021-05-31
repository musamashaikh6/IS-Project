import java.util.*;

public class CaesarDecrypt
{
	public static String decrypt(String original_message, int key)
	{
		if(key>26)
		{
			key=key+26;
		}

		else if(key<0)
		{
			key= (key%26)+26;
		}
		String cipherText="";
		int length=original_message.length();
		for(int i=0; i<length; i++)
		{
			char ch=original_message.charAt(i);

			if(Character.isLetter(ch))
			{
				if(Character.isLowerCase(ch))
				{
					char c = (char)(ch-key);
					if (c<'a')
					{
						cipherText += (char)(ch + (26-key));
					}
					else
					{
						cipherText +=c;
					}
				}

				if(Character.isUpperCase(ch))
				{
					char c = (char)(ch-key);
					if (c<'A')
					{
						cipherText+= (char)(ch + (26-key));
					}
					else
					{
						cipherText +=c;
					}
				}
			}
		}
		return cipherText;
	}
	public static void main(String[] args)
	{

		Scanner message= new Scanner(System.in);

		String str = message.nextLine();

		String cipher = decrypt(str, 3);

		System.out.println(cipher);
	}
}