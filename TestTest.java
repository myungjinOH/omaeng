package testNHN;

import java.io.*;

public class TestTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] pk = new String[3];
		pk[0] = "0";
		pk[1] = "0";
		pk[2] = "0";

		String in = "";
		System.out.println("6���� �������� �Է��ϼ���.");

		in = br.readLine();

		String[] inarr = in.split("\\s");

		pk[0] = inarr[2];
		pk[1] = inarr[1];
		pk[2] = inarr[0];
		
		//11 128 15 111 59 31 70 102 50 172 88 56 40 41 12
	}
}
