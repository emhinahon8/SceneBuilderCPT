package data;

/**
 * @author Elsemarie Hinahon
 * @date 06/13/2024
 * Stores the username and password entered from the register page
 */
public final class Database {

	/**
	 * Private constructor 
	 */
	// (Don't let anyone create a new database)
	private Database() {}
	
	/**
	 * Declares 'username' as type String
	 */
	public static String username;
	
	/**
	 * Declares 'password' as type String
	 */
	public static String password;

}

//HARDCODED USERNAME AND PASSWORD (initial testing)
//public static String username = "test"; // these are not constants, so no need for all apps since they can change
//public static String password = "123";