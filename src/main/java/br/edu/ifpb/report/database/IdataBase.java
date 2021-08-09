package br.edu.ifpb.report.database;

public interface IdataBase{
	public void openConnection();
	public void runQuery(String query);
}
