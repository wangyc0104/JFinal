package demo;

import com.jfinal.core.Controller;

/**
 * JFinal欢迎页控制器
 * @author Yicheng Wang
 */
public class HelloController extends Controller {

	/**
	 * 欢迎页默认渲染页
	 */
	public void index() {
		renderText("Hello, Yicheng!");
	}

}