package cn.mrzero.dome.factory.SimpleFactory;

public class ChartFactory {
	public static Chart createChart(String chartType) {
		Chart chart = null;
		if(chartType.equals("linechart")) {
			chart = new LineChart();
		} else if(chartType.equals("piechart")){
			chart = new PieChart();
		}
		return chart;
	}
}
