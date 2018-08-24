package cn.mrzero.dome.factory.FactoryMethodPattern;

public class Client {

	public static void main(String[] args) throws Exception {
		LoggerFactory factory = (LoggerFactory)XMLUtil.getBean();
		Logger logger = factory.createLogger();
		logger.useLogger();
	}

}
