package cn.mrzero.dome.factory.SimpleFactory;

class Client {
	public static void main(String args[]){
		Chart chart;
		String chartType = XMLUtil.getChartType();
		chart = ChartFactory.createChart(chartType);
		chart.display();
	}
}
