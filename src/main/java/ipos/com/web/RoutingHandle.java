package ipos.com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoutingHandle {

	@RequestMapping({ "/submitted-sub", "/create-sub", "/sub-detail", "/submitted-sub", "/create-contract/{id}/{mode}", "/search-sub", "/search-contract", "/tests",
			"/tests/new", "/tests/**", "/approved-sub", "/answers" })
	public String index() {
		return "forward:/index.html";
	}
}
