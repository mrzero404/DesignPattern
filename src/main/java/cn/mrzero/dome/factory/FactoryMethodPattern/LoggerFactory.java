package cn.mrzero.dome.factory.FactoryMethodPattern;

interface LoggerFactory {
	public Logger createLogger();
}

class ErrorLoggerFactory implements LoggerFactory {
	public Logger createLogger() {
		Logger logger = new ErrorLogger();
		return logger;
	}
}

class DesignLoggerFactory implements LoggerFactory {
	public Logger createLogger() {
		Logger logger = new DesignLogger();
		return logger;
	}
}

interface Logger {
	public void useLogger();
}

class ErrorLogger implements Logger {
	public void useLogger() {
		System.out.println("useErrorLogger");
	}
}

class DesignLogger implements Logger {

	public void useLogger() {
		System.out.println("useDesignLogger");
	}
	
}