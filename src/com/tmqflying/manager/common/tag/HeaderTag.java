package com.tmqflying.manager.common.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * <b>HeaderTag</b><br>
 *
 * @desc Describe here.
 * @author maoqitao
 * @date 2015年7月29日 上午8:59:05
 */
public class HeaderTag extends TagSupport {
	
	private static final long serialVersionUID = -2428389943554361027L;
	
	private String backgrounColorNumber = "";
	
	
	@Override
	public int doStartTag () throws JspException {
		JspWriter out = pageContext.getOut();
		String content = null;
		
		try {
			content = generateContent();
			out.print(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return super.doEndTag();
	}
	
	private String generateContent() {
		StringBuilder content = new StringBuilder();
		content.append("    <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">");
		content.append("      <div class=\"container\">");
		content.append("        <div class=\"navbar-header\">");
		content.append("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">");
		content.append("            <span class=\"sr-only\">Toggle navigation</span>");
		content.append("            <span class=\"icon-bar\"></span>");
		content.append("            <span class=\"icon-bar\"></span>");
		content.append("            <span class=\"icon-bar\"></span>");
		content.append("          </button>");
		content.append("          <div class=\"navbar-brand cus-navbar\">");
		content.append("            <div class=\"cus-navbar-translate\">");
		content.append("              <span class=\"cus-navbar-logo\"></span>");
		content.append("              <span class=\"cus-navbar-logo-color\"></span>");
		content.append("            </div>");
		content.append("          </div>");
		content.append("          <a class=\"navbar-brand\" href=\"/\">陶茂奇&middot;信仰</a>");
		content.append("        </div>");
		content.append("        <div id=\"navbar\" class=\"collapse navbar-collapse\">");
		content.append("          <ul class=\"nav navbar-nav\">");
		
		// 业务逻辑处理，根据参数来标记背景激活颜色
		content.append("            <li class=\"");
		if (backgrounColorNumber.equalsIgnoreCase("1"))
			content.append("active");
		content.append("\"><a href=\"/index.html\">Home</a></li>");
		content.append("            <li class=\"");
		if (backgrounColorNumber.equalsIgnoreCase("2"))
			content.append("active");
		content.append("\"><a href=\"/articles.html\">Articles</a></li>");
		content.append("            <li class=\"");
		if (backgrounColorNumber.equalsIgnoreCase("3"))
			content.append("active");
		content.append("\"><a href=\"/books.html\">Books</a></li>");
		content.append("            <li class=\"");
		if (backgrounColorNumber.equalsIgnoreCase("4"))
			content.append("active");
		content.append("\"><a href=\"/technical.html\">Technical</a></li>");
		
		
		content.append("          </ul>");
		content.append("        </div><!--/.nav-collapse -->");
		content.append("      </div>");
		content.append("    </nav>");
		
		return content.toString();
	}

	public String getBackgrounColorNumber() {
		return backgrounColorNumber;
	}

	public void setBackgrounColorNumber(String backgrounColorNumber) {
		this.backgrounColorNumber = backgrounColorNumber;
	}

}
