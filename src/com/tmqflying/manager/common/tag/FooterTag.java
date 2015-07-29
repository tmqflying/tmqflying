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
public class FooterTag extends TagSupport {
	
	private static final long serialVersionUID = 130400534637401519L;
	
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
		content.append("    <div class=\"footer\">");
		content.append("      <div class=\"container\">");
		content.append("        <p class=\"text-muted\">");
		content.append("        <a href=\"/\">tmqflying.com</a>");
		content.append("        &loz;");
		content.append("        <a href=\"mailto:tmq@tmqflying.com\">tmq@tmqflying.com</a>");
		content.append("        &loz; To live is to enjoy the world. &minus;&minus;by maoqi tao");
		content.append("        <span class=\"update-time\">&lt;Updated at 2015.07.29 16:57:18&gt;&nbsp;support by 0x208 &amp; Maoqitao</span>");
		content.append("        <!-- cnzz count code ");
		content.append("        <script type=\"text/javascript\">var cnzz_protocol = ((\"https:\" == document.location.protocol) ? \" https://\" : \" http://\");document.write(unescape(\"%3Cspan id='cnzz_stat_icon_1253546376'%3E%3C/span%3E%3Cscript src='\" + cnzz_protocol + \"s23.cnzz.com/z_stat.php%3Fid%3D1253546376%26show%3Dpic' type='text/javascript'%3E%3C/script%3E\"));</script>");
		content.append("        --> ");
		content.append("        </p>");
		content.append("      </div>");
		content.append("    </div>");
		
		return content.toString();
	}
}
