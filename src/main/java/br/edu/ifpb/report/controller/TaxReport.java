package br.edu.ifpb.report.controller;

import br.edu.ifpb.fileconvertion.AbstractConvertion;
import br.edu.ifpb.report.database.AbstractConnectionDatabase;

public class TaxReport extends AbstractReport{
	
	private AbstractConnectionDatabase connector;
	private String query;
	private AbstractConvertion typefile;
	
	public TaxReport (AbstractConnectionDatabase connector, String query, AbstractConvertion typefile){
		this.connector = connector;
		this.query = query;
		this.typefile = typefile;
	}
	
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.openConnection();
    }

    public void executeDatabaseQuery() {
        connector.runQuery(this.query);
    }

    public void convertToTypeFile() {
    	typefile.convert();
    }
}
