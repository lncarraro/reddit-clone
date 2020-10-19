package com.leoncarraro.redditclone.service.util;

import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class MailContentBuilder {

	private final TemplateEngine templateEngine;
	
	public String build(String message) {
		Context context = new Context();
		context.setVariable("message", message);
		return templateEngine.process("mailTemplate", context);
	}
	
}
