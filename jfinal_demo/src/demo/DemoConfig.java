package demo;

import com.jfinal.config.*;

/**
 * JFinal基于Java代码进行环境配置
 * @author Yicheng Wang
 */
public class DemoConfig extends JFinalConfig {

	public void configConstant(Constants me) {
		me.setDevMode(true);
	}

	/**
	 * 路径配置
	 */
	public void configRoute(Routes me) {
		me.add("/hello", HelloController.class);
	}

	public void configPlugin(Plugins me) { }

	public void configInterceptor(Interceptors me) { }

	public void configHandler(Handlers me) { }

}