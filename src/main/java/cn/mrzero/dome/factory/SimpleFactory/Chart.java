package cn.mrzero.dome.factory.SimpleFactory;

interface  Chart {
	void display();
}

class LineChart implements Chart {

	public LineChart() {
		System.out.println("创建直线图");
	}

	public void display() {
		System.out.println("显示直线图表");
	}
	
}

class PieChart implements Chart{
	public PieChart() {
		System.out.println("创建饼状图");
	}

	public void display() {
		System.out.println("显示饼状图表");
	}
	
}