package br.edu.ifpb.report.database;

public class PostgreSQLDatabaseConnector extends AbstractConnectionDatabase{

	public void connection(){
		System.out.println("Create postgres connetion");
	}

    public void query(String query){
    	System.out.println("Executing  PostgreSQL Query...");
    }
}
