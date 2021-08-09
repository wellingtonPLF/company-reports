package br.edu.ifpb.report.database;

public class MysqlDatabaseConnector extends AbstractConnectionDatabase{

	public void connection(){
		System.out.println("Create mysql connetion");
	}

    public void query(String query){
    	System.out.println("Executing MySQL Query...");
    }
}
