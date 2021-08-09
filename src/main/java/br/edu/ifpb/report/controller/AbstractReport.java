package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.AbstractConnectionDatabase;

public abstract class AbstractReport{
		
	public void generate() {
        createDatabaseConnection();
        executeDatabaseQuery();
        convertToTypeFile();
    }
    
    public abstract void createDatabaseConnection();

    public abstract void executeDatabaseQuery();

    public abstract void convertToTypeFile();
}
