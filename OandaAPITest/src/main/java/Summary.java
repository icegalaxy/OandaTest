import com.oanda.v20.Context;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.account.AccountSummary;

public class Summary {

	public static void main(String[] args) {
		Context ctx = new Context(
				"https://api-fxpractice.oanda.com",
				"606076d25540a34b3a3a17162d155b63-20338cfc57b1bf21c301665fc3b88d31");

		try {
			AccountSummary summary = ctx.account.summary(
					new AccountID("101-003-10035566-002")).getAccount();
			System.out.println(summary);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}