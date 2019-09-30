package opps;
public class Xyz {
	int i = 10;
}

class yzx extends Xyz {
	int i = 20;

	public static void main(String[] args) {

		{
			Xyz a = new yzx();

			System.out.println(a.i);
		}
	}

}
//o/p=10

