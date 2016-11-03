import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class RunCredCheck
	{

		public static void main(String[] args) throws FileNotFoundException
			{
				Scanner file=new Scanner(new File("creditCardNumbers2.txt"));
				while(file.hasNext())
					{
						
				long num=file.nextLong();
				long original=num;
				int digit, total=0;
				String valid;
				
				
				for(int i=0; i<16; i++)
					{
						digit=(int) (num%10);
						if (i%2==1)
							{
								digit*=2;
							}
						if (digit>=10)
							{
								int y=0;
								int z=digit;
								for (int j=0; j<2; j++)
									{
										int x=z%10;
										y+=x;
										z=z/10;
									}
								digit=y;
								
							}
						total+=digit;
						num=num/10;
						//System.out.println(digit + " " + total);
					}
				if (total%10==0)
					{
						valid="valid";
					}
				else
					{
						valid="invalid";
					}
				System.out.println("The credit card number " + original + " is " + valid + ".");
					}
			}

	}
/*int num=123;
				int digit;
				
				for (int i=0; i<3; i++)
					{
				digit=num%10;
				num=num/10;
				System.out.println(digit + " " + num);
					}*/
//the above is the digit stripping concept
