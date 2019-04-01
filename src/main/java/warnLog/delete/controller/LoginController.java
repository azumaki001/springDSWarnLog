package warnLog.delete.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = {"/", "/gotoLogin"}, method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView gotoLogin(HttpServletRequest  request) {
		ModelAndView mav = new ModelAndView ();
		SecurityContextImpl securityContextImpl = (SecurityContextImpl) request
				.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
		if (securityContextImpl != null) {
			if (securityContextImpl.getAuthentication().isAuthenticated()) {
				mav.setViewName("redirect:/top");
			}
		}
		mav.setViewName("/login");
		return mav;
	}
}
