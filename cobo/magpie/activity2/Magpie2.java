/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 * The higher up a key word conditional is in the getResponse method, the
	 * higher priority it has.
	 * QUESTION 1: These statements have key words as part of other words, and so
	 * return a response based on the key words even though they don't necessarily
	 * make sense (eg. no in know & mother in smothered ).
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Mr. Mykolyk") >= 0)
		{
			response = "He sounds terrific.";
		}
		else if (statement.indexOf("Emily") >= 0)
		{
			response = "OMG!! I know her, too!";
		}
		else if (statement.indexOf("Kartik") >= 0)
		{
			response = "Hey, I've heard of him from somwhere!";
		}
		else if (statement.indexOf("Tasnim") >= 0)
		{
			response = "I think she is in my APCS class.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "I really don't care, but you seem to. Continue.";
		}
		else if (whichResponse == 5)
		{
			response = "For real? That's so awesome.";
		}

		return response;
	}
}
