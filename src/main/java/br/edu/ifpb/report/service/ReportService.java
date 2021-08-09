package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.AbstractReport;
import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;

public class ReportService{
	
	public void generateReport(AbstractReport report) {
        report.generate();
    }
}
