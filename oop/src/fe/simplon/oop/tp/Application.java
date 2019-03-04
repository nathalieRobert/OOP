package fe.simplon.oop.tp;

public class Application {

    public static void main(String[] args) {
	Connection mysqlCo = buildUrl(Database.MYSQL);
	System.out.println("url: " +mysqlCo.url());
	mysqlCo.open();
	mysqlCo.close();
	
	Connection postgreCo = buildUrl(Database.ORACLE);
	System.out.println("url: " +postgreCo.url());
	postgreCo.open();
	postgreCo.close();
	
    }

    private static Connection buildUrl(Database type) {
	Connection connection = null;
	
	switch (type) {
	case MYSQL:
	    connection = new MysqlConnection();
	    
	    break;
	case ORACLE:
	    connection = new OracleConnection();
	    
	    break;
	case POSTGRE:
	    connection = new PostgreConnection();
    
	    break;
	    
	default:
	    break;
	}
	
	return connection;
	
    }
}
