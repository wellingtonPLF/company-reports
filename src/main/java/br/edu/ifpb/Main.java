package br.edu.ifpb;

import br.edu.ifpb.fileconvertion.PDFconvertion;
import br.edu.ifpb.fileconvertion.XLSconvertion;
import br.edu.ifpb.report.controller.ExpenseReport;

import br.edu.ifpb.report.controller.TaxReport;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;
import br.edu.ifpb.report.service.ReportService;

public class Main {

    public static void main(String[] args) {
    	PostgreSQLDatabaseConnector bancoPostgreSql;
    	MysqlDatabaseConnector bancoMysql;
    	String queryExpenses;
    	String queryTax;
    	
    	PDFconvertion convertToPDF;
    	XLSconvertion convertToXLS;
    	
    	bancoPostgreSql = new PostgreSQLDatabaseConnector();
    	bancoMysql = new MysqlDatabaseConnector();
    	
    	queryExpenses = "SELECT * FROM expenses";
    	queryTax = "SELECT * FROM taxes";
    	
    	convertToPDF = new PDFconvertion();
    	convertToXLS = new XLSconvertion();
    	
        ReportService reportService = new ReportService();
        
        reportService.generateReport(new ExpenseReport(bancoPostgreSql, queryExpenses, convertToPDF));
        reportService.generateReport(new TaxReport(bancoMysql, queryTax, convertToXLS));
    }
}
