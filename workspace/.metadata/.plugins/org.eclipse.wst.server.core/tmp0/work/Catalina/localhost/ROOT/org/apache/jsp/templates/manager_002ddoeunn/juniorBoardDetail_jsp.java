/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-03 04:53:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.manager_002ddoeunn;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class juniorBoardDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>관리자페이지-이용자게시글 상세</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"../../static/css/manager-doeunn/junior-board-detail.css\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   <div class=\"wrap\">\n");
      out.write("        <header class=\"navi-bar\">\n");
      out.write("            <div class=\"logo\"></div>\n");
      out.write("            <div class=\"navi-container\">\n");
      out.write("                <!-- navi-box 하나가 큰 카테고리 하나에 해당합니다-->\n");
      out.write("               <section class=\"navi-box\">\n");
      out.write("                    <div class=\"flex-line\">\n");
      out.write("                        <div class=\"icon board-icon\"></div>\n");
      out.write("                        <div class=\"navi-title\">커뮤니티 관리</div>\n");
      out.write("                        <div class=\"arrow\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"board-list list\">\n");
      out.write("                        <li onclick=\"location.href='/listUserOk.admin'\">이용자 게시판</li>\n");
      out.write("						<li onclick=\"location.href='/listJuniorOk.admin'\">주니어 게시판</li>\n");
      out.write("                    </ul>\n");
      out.write("               </section>\n");
      out.write("\n");
      out.write("               <section class=\"navi-box\">\n");
      out.write("                    <div class=\"flex-line\">\n");
      out.write("                        <div class=\"icon message-icon\"></div>\n");
      out.write("                        <div class=\"navi-title\">문의 관리</div>\n");
      out.write("                        <div class=\"arrow\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"inquiries-list list\">\n");
      out.write("                        <li onclick=\"location.href='/listUserOk.admin'\">전체 문의목록</li>\n");
      out.write("                    </ul>\n");
      out.write("               </section>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"main-title-box\">\n");
      out.write("                <h4 onclick=\"location.href='/listJuniorOk.admin'\">← 목록 화면으로 돌아가기</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-container\">\n");
      out.write("                <section class=\"content\">\n");
      out.write("                   <div class=\"line\">\n");
      out.write("                    <div class=\"box title\">제목</div>\n");
      out.write("                    <div class=\"box item\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"line\">\n");
      out.write("                    <div class=\"box title\">작성자</div>\n");
      out.write("                    <div class=\"box item\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"line\">\n");
      out.write("                    <div class=\"box title\">작성날짜</div>\n");
      out.write("                    <div class=\"box item\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardRegisterDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"line\">\n");
      out.write("                    <div class=\"box title\">내용</div>\n");
      out.write("                    <div class=\"box item\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardContent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"line\">\n");
      out.write("                    <button class=\"button go-to-post-btn\" onclick=\"location.href='/listJuniorOk.admin'\">해당 게시물 페이지로 이동하기</button>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"line\">\n");
      out.write("                    <button class=\"button remove-btn\" onclick=\"location.href='/deleteBoard.admin?boardId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">삭제하기</button>\n");
      out.write("                   </div>\n");
      out.write("                </section>\n");
      out.write("            </form>\n");
      out.write("        </main>\n");
      out.write("   </div>\n");
      out.write("</body>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.4.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("	const boardId = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\n");
      out.write("	const boardContent = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardContent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\n");
      out.write("	const boardRegisterDate = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardRegisterDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\n");
      out.write("	const boardTitle = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`\n");
      out.write("	let boards1 = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boards1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\n");
      out.write("	console.log(boardId);\n");
      out.write("	console.log(boardContent);\n");
      out.write("	console.log(boards1);\n");
      out.write("	console.log(boardTitle);\n");
      out.write("</script>\n");
      out.write("<script src=\"../../static/js/manager-doeunn/user-board-detail.js\"></script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
