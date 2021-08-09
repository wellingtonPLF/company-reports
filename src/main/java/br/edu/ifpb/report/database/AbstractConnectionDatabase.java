package br.edu.ifpb.report.database;

public abstract class AbstractConnectionDatabase implements IdataBase{
	
	protected abstract void connection();
	protected abstract void query(String query);
	
	public void openConnection() {
		connection();
    }

	public void runQuery(String query) {
    	query(query);
    }
}
