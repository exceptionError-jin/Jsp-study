/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-22 12:20:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1681825652000L));
    _jspx_dependants.put("jar:file:/Users/gimjin/Desktop/web_1900_hds/jsp/workspace/app/app/WebContent/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/images/favicon.png\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/board/board.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/modal/modal.css\">\r\n");
      out.write("    <title>작성하기</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <main id=\"board\">\r\n");
      out.write("        <div class=\"modal\">\r\n");
      out.write("            <div class=\"warn-modal\">\r\n");
      out.write("                <div id=\"content-wrap\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../fix/header.jsp", out, false);
      out.write("\r\n");
      out.write("        <section id=\"info-wrap\">\r\n");
      out.write("            <article id=\"info-container\">\r\n");
      out.write("                <h6 class=\"info\">게시글 작성하기</h6>\r\n");
      out.write("                <section class=\"move-page\">\r\n");
      out.write("                    <a href=\"javascript:location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/listOk.board'\">목록으로</a>\r\n");
      out.write("                </section>\r\n");
      out.write("            </article>\r\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/writeOk.board\" name=\"writeForm\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                <legend>\r\n");
      out.write("                    <h3>\r\n");
      out.write("                        게시글을 <span class=\"text-accent2\">바른말</span>로 <span class=\"text-accent1\">이쁘게</span> 작성해보세요\r\n");
      out.write("                    </h3>\r\n");
      out.write("                </legend>\r\n");
      out.write("                <div id=\"write-title-wrap\" class=\"wrap\">\r\n");
      out.write("                    <div class=\"profile write-profile\">\r\n");
      out.write("                        <div><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/images/profile.png\" width=\"15px\"></div>\r\n");
      out.write("                        <h6 class=\"writer\">한동석</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <label>제목</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"title area\">\r\n");
      out.write("                    <textarea rows=\"1\" name=\"boardTitle\" placeholder=\"멋진 제목을 작성해보세요.\"></textarea>\r\n");
      out.write("                    <div class=\"textarea-count\">0/30</div>\r\n");
      out.write("                </span>\r\n");
      out.write("                <div id=\"write-content-wrap\" class=\"wrap\">\r\n");
      out.write("                    <label>내용</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"content area\">\r\n");
      out.write("                    <textarea rows=\"3\" name=\"boardContent\" placeholder=\"여러분의 글솜씨를 보여주세요.\"></textarea>\r\n");
      out.write("                    <div class=\"textarea-count\">0/5,000</div>\r\n");
      out.write("                </span>\r\n");
      out.write("                <div class=\"attach-wrap\">\r\n");
      out.write("                    <label for=\"upload1\" class=\"attach\">\r\n");
      out.write("                        <img src=\"\" class=\"thumbnail\">\r\n");
      out.write("                        <div class=\"x\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/images/x.png\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <h6 class=\"plus\">+</h6>\r\n");
      out.write("                        <h6>대표 이미지</h6>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label for=\"upload2\" class=\"attach\">\r\n");
      out.write("                        <img src=\"\" class=\"thumbnail\">\r\n");
      out.write("                        <div class=\"x\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/images/x.png\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <h6 class=\"plus\">+</h6>\r\n");
      out.write("                        <h6>이미지 추가</h6>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label for=\"upload3\" class=\"attach\">\r\n");
      out.write("                        <img src=\"\" class=\"thumbnail\">\r\n");
      out.write("                        <div class=\"x\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/images/x.png\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <h6 class=\"plus\">+</h6>\r\n");
      out.write("                        <h6>이미지 추가</h6>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label for=\"upload4\" class=\"attach\">\r\n");
      out.write("                        <img src=\"\" class=\"thumbnail\">\r\n");
      out.write("                        <div class=\"x\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/images/x.png\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <h6 class=\"plus\">+</h6>\r\n");
      out.write("                        <h6>이미지 추가</h6>\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <input type=\"file\" id=\"upload1\" class=\"upload\" name=\"upload1\" style=\"display: none;\">\r\n");
      out.write("                <input type=\"file\" id=\"upload2\" class=\"upload\" name=\"upload2\" style=\"display: none;\">\r\n");
      out.write("                <input type=\"file\" id=\"upload3\" class=\"upload\" name=\"upload3\" style=\"display: none;\">\r\n");
      out.write("                <input type=\"file\" id=\"upload4\" class=\"upload\" name=\"upload4\" style=\"display: none;\">\r\n");
      out.write("                <article class=\"warn-wrap\">\r\n");
      out.write("                    <h5 class=\"warn-title\">게시글을 등록하기 전에 확인해주세요!</h5>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li>게시글 목록에서는 <span class=\"text-accent1\">대표 이미지만 나타나요.</span></li>\r\n");
      out.write("                        <li>등록한 게시글은 모든 이용자가 볼 수 있으며, <span class=\"text-accent1\">댓글은 작성자만 삭제할 수 있어요.</span></li>\r\n");
      out.write("                        <li>본인이 등록한 게시글은 언제든지 수정 및 삭제가 가능해요.</li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            이런 게시글은 본인의 의사와 상관없이 삭제될 수 있어요.\r\n");
      out.write("                            <ul class=\"inner\">\r\n");
      out.write("                                <li>비속어와 상대방을 비방하는 내용이 있는 경우</li>\r\n");
      out.write("                                <li>광고 및 홍보 내용이 있는 경우</li>\r\n");
      out.write("                                <li>정치적인 내용이 있는 경우</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>제목이 길면, 직접 작성한 제목과 다르게 올라갈 수 있어요.</li>\r\n");
      out.write("                        <li>게시글 내용을 스프링부트 마케팅 및 광고 목적으로 활용하는 것에 동의합니다.</li>\r\n");
      out.write("                        <li>스프링부트는 게시글 내용에 대한 법률적 책임이 없습니다.</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </article>\r\n");
      out.write("                <div id=\"check-agree\">\r\n");
      out.write("                    <label class=\"check-agree-wrap\">\r\n");
      out.write("                        <section>\r\n");
      out.write("                            <input type=\"checkbox\" name=\"agree\">\r\n");
      out.write("                            <span class=\"checkbox\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/images/check_all.png\" width=\"15px\">\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <p class=\"h5\">유의사항을 모두 확인했으며, 동의합니다.</p>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button style=\"cursor:pointer;\">게시글 등록하기</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </section>\r\n");
      out.write("    </main>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.1.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/modal/modal.js\"></script>\r\n");
      out.write("<script src=\"https://rawgit.com/jackmoore/autosize/master/dist/autosize.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/board/board.js\"></script>\r\n");
      out.write("\r\n");
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
