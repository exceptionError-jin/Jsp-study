/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-02 07:23:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.message;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class msg_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1681825652000L));
    _jspx_dependants.put("/templates/message/../mainpageSeo/loginHeader.jsp", Long.valueOf(1683004062648L));
    _jspx_dependants.put("jar:file:/Users/gimjin/Desktop/web_1900_hds/jsp/workspace/joongshin/WebContent/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/templates/message/../mainpageSeo/footer.jsp", Long.valueOf(1682517413499L));
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("	href=\"/static/css/message-jym/msg-main-page.css\">\n");
      out.write("<title>chat</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<!-- 로고 -->\n");
      out.write("<link href=\"../../static/image/logo/logo.png\" rel=\"shortcut icon\"\n");
      out.write("	type=\"image/x-icon\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("	href=\"../../static/css/mainpageSeo/hf.css\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("<body class=\"home\">\n");
      out.write("	<div class=\"h__cov-progress\"\n");
      out.write("		style=\"background-color: rgb(0, 199, 174); opacity: 0; position: fixed; top: 0px; left: 0px; width: 0%; height: 2px; transition: opacity 0.6s ease 0s;\"></div>\n");
      out.write("	<header id=\"app-header\" class=\"h_global-header\" data-v-50506024=\"\">\n");
      out.write("		<div  data-v-50506024=\"\"\n");
      out.write("			class=\"h-global-navigation-bar\">\n");
      out.write("			<!-- 섹션태그때문에 이미지가 나오지 않아서 없애버렸어요 -->\n");
      out.write("			<div  class=\"h-desktop-header\">\n");
      out.write("				<div  class=\"left-section\" style=\"display: flex; margin-right: 300px\">\n");
      out.write("					<div  class=\"logo\" style=\"margin: auto;\">\n");
      out.write("						<a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/listOk.board\" class=\"\"> <img\n");
      out.write("							 src=\"../../static/image/logo/JOONGSHIN.svg\"\n");
      out.write("							alt=\"숨고, 숨은고수\">\n");
      out.write("						</a>\n");
      out.write("					</div>\n");
      out.write("						<ul class=\"nav-list\" style=\"margin-right: 20px;\">\n");
      out.write("							<li  class=\"nav-item left-section-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/comulistOk.board\">\n");
      out.write("								<span>커뮤니티</span></li></a>\n");
      out.write("							<li class=\"nav-item left-section-item\"><a\n");
      out.write("								href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/reqBoard.board\">\n");
      out.write("								<span >문의 게시판</span></a></li>\n");
      out.write("						</ul>\n");
      out.write("				</div>\n");
      out.write("				<!--  					 로고,문자열 네개까지 ↑ -->\n");
      out.write("				");
      out.write("\n");
      out.write("				<!-- 로그인 회원가입 고수가입 전↑ -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("				<div  class=\"right-section\" style=\"display: flex; margin-left: 20px;\">\n");
      out.write("					<nav >\n");
      out.write("						<ul  class=\"nav-list\">\n");
      out.write("						<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/messageListOk.message\"\n");
      out.write("							class=\"message1\" name=\"message\" style=\"font-size: 17px; margin: auto;\">\n");
      out.write("							<li  class=\"nav-item right-section-item\"><span \n");
      out.write("									>채팅</span>\n");
      out.write("							<!----></li>\n");
      out.write("							</a>\n");
      out.write("							<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/myMainOk.mypage\"\n");
      out.write("							class=\"mypage1\" name=\"search-form\" style=\"margin: auto 40px;\">\n");
      out.write("							<li  class=\"nav-item right-section-item\" >\n");
      out.write("							<span style=\"font-size: 17px;\"\n");
      out.write("									>마이페이지</span>\n");
      out.write("							<!----></li>\n");
      out.write("							</form>\n");
      out.write("							</a>\n");
      out.write("							<li  class=\"nav-item right-section-item\">\n");
      out.write("							<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/logout.user\"><span style=\"font-size: 17px;\"\n");
      out.write("									>로그아웃</span></a>\n");
      out.write("							<!----></li>\n");
      out.write("						</ul>\n");
      out.write("					</nav>\n");
      out.write("					\n");
      out.write("					\n");
      out.write("						\n");
      out.write("							\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("			</div>\n");
      out.write("			<!-- 헤더 전체 div 닫는부분 -->\n");
      out.write("			<!-- 없애버린 세션 태그 닫는자리 -->\n");
      out.write("		</div>\n");
      out.write("	</header>\n");
      out.write("	<!-- 헤더 끝 -->\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<div id=\"app-body\">\n");
      out.write("		<!-- 채팅페이지 바디 -->\n");
      out.write("		<div class=\"chat-list\">\n");
      out.write("			<!-- 해더 부분  -->\n");
      out.write("			<div class=\"page-header\">\n");
      out.write("				<div class=\"container\">\n");
      out.write("					<section class=\"page-title\">\n");
      out.write("						<h3>채팅</h3>\n");
      out.write("						<!--<a href=\"/pro/chats/edit\" class=\"chat-list-edit-button\"> 편집 </a>-->\n");
      out.write("					</section>\n");
      out.write("					<section class=\"row\">\n");
      out.write("						<div class=\"col-12\">\n");
      out.write("							<div role=\"group\" class=\"input-group\" id=\"input-group\">\n");
      out.write("								<div class=\"input-group-prepend\">\n");
      out.write("									<img\n");
      out.write("										src=\"data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxOCIgaGVpZ2h0PSIxOCIgdmlld0JveD0iMCAwIDE4IDE4Ij4KICAgIDxnIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+CiAgICAgICAgPGcgc3Ryb2tlPSIjNzM3MzczIiBzdHJva2Utd2lkdGg9IjEuNSI+CiAgICAgICAgICAgIDxnPgogICAgICAgICAgICAgICAgPGc+CiAgICAgICAgICAgICAgICAgICAgPGcgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoLTMwMSAtMjMzKSB0cmFuc2xhdGUoMjg1IDIyMikgdHJhbnNsYXRlKDE2IDExKSB0cmFuc2xhdGUoMSAxKSI+CiAgICAgICAgICAgICAgICAgICAgICAgIDxjaXJjbGUgY3g9IjYuNjExIiBjeT0iNi42MTEiIHI9IjUuODYxIi8+CiAgICAgICAgICAgICAgICAgICAgICAgIDxwYXRoIHN0cm9rZS1saW5lY2FwPSJyb3VuZCIgc3Ryb2tlLWxpbmVqb2luPSJyb3VuZCIgZD0iTTE1LjI1IDE1LjI1TDExLjAwNyAxMS4wMDciLz4KICAgICAgICAgICAgICAgICAgICA8L2c+CiAgICAgICAgICAgICAgICA8L2c+CiAgICAgICAgICAgIDwvZz4KICAgICAgICA8L2c+CiAgICA8L2c+Cjwvc3ZnPgo=\">\n");
      out.write("								</div>\n");
      out.write("								<div class=\"input-flex-group\">\n");
      out.write("									<input type=\"search\" name=\"keyword\"\n");
      out.write("										placeholder=\"쪽지 상대의 이름 또는 내용으로 검색해보세요.\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${keyword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("										class=\"form-search-text-input form-control\" id=\"__BVID__14\">\n");
      out.write("								</div>\n");
      out.write("								<!---->\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"col-12\">\n");
      out.write("							<div class=\"chat-filter-wrapper\">\n");
      out.write("								<ul class=\"chat-filter\">\n");
      out.write("									<li class=\"chat-filter-item ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${receive ? '' : 'selected'}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("										보낸 채팅</li>\n");
      out.write("									<li class=\"chat-filter-item ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${receive ? 'selected' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("										받은 채팅</li>\n");
      out.write("								</ul>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("					</section>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<!--          바디  -->\n");
      out.write("			<div class=\"page-body\">\n");
      out.write("				<div class=\"container\">\n");
      out.write("					<ul class=\"row\"></ul>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../static/css/mainpageSeo/hf.css\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<footer>\n");
      out.write("			<nav id=\"app-footer\" class=\"footer-container\" data-v-4e4965bd=\"\">\n");
      out.write("				<div class=\"footer-container-row container\" data-v-4e4965bd=\"\">\n");
      out.write("					<div class=\"col-content margin-bottom\" data-v-4e4965bd=\"\">\n");
      out.write("						<p class=\"text contact\" data-v-4e4965bd=\"\">1599-5319</p>\n");
      out.write("						<p class=\"text-middle\" data-v-4e4965bd=\"\">\n");
      out.write("							평일 10:00 - 18:00<br data-v-4e4965bd=\"\">(점심시간 13:00 - 14:00\n");
      out.write("							제외 · 주말/공휴일 제외)\n");
      out.write("						</p>\n");
      out.write("						<a class=\"download\" data-v-4e4965bd=\"\"\n");
      out.write("							href=\"https://soomgoapp.onelink.me/6cqv?af_channel=cpc&amp;af_dp=smgo%3A%2F%2Fhome%2F&amp;af_keywords=%EC%88%A8%EA%B3%A0&amp;af_sub2=%EB%A9%94%EC%9D%B8&amp;af_sub4=footer&amp;af_web_dp=https%3A%2F%2Fsoomgo.com%2Fapp-download%2Fsender&amp;c=%EB%A9%94%EC%9D%B8&amp;pid=google\"><img\n");
      out.write("							src=\"https://assets.cdn.soomgo.com/icons/icon-download-appstore.svg\"\n");
      out.write("							alt=\"앱스토어\" data-v-4e4965bd=\"\">APP STORE </a><a class=\"download\"\n");
      out.write("							data-v-4e4965bd=\"\"\n");
      out.write("							href=\"https://soomgoapp.onelink.me/6cqv?af_channel=cpc&amp;af_dp=smgo%3A%2F%2Fhome%2F&amp;af_keywords=%EC%88%A8%EA%B3%A0&amp;af_sub2=%EB%A9%94%EC%9D%B8&amp;af_sub4=footer&amp;af_web_dp=https%3A%2F%2Fsoomgo.com%2Fapp-download%2Fsender&amp;c=%EB%A9%94%EC%9D%B8&amp;pid=google\"><img\n");
      out.write("							src=\"https://assets.cdn.soomgo.com/icons/icon-download-palystore.svg\"\n");
      out.write("							alt=\"구글플레이\" data-v-4e4965bd=\"\">PLAY STORE </a>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-content right\" data-v-4e4965bd=\"\">\n");
      out.write("						<ul class=\"content-list\" data-v-4e4965bd=\"\">\n");
      out.write("							<li data-v-4e4965bd=\"\" class=\"open-padding\"><span\n");
      out.write("								class=\"text-middle title category\" data-v-4e4965bd=\"\">\n");
      out.write("									중신소개 <span class=\"new-badge\" style=\"display: none;\"\n");
      out.write("									data-v-4e4965bd=\"\">N</span>\n");
      out.write("								<!---->\n");
      out.write("							</span>\n");
      out.write("							<div style=\"\" data-v-4e4965bd=\"\">\n");
      out.write("									<a href=\"/about\" class=\"text-middle category\"\n");
      out.write("										data-v-4e4965bd=\"\"> 회사소개 <span class=\"new-badge\"\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\n");
      out.write("										href=\"https://soomgo.career.greetinghr.com/\"\n");
      out.write("										class=\"text-middle category\" data-v-4e4965bd=\"\"> 채용안내 <span\n");
      out.write("										class=\"new-badge\" style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\n");
      out.write("										href=\"https://blog.soomgo.com\" class=\"text-middle category\"\n");
      out.write("										data-v-4e4965bd=\"\"> 팀블로그 <span class=\"new-badge\"\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a>\n");
      out.write("								</div></li>\n");
      out.write("							<li data-v-4e4965bd=\"\" class=\"open-padding\"><span\n");
      out.write("								class=\"text-middle title category\" data-v-4e4965bd=\"\">\n");
      out.write("									고객안내 <span class=\"new-badge\" style=\"display: none;\"\n");
      out.write("									data-v-4e4965bd=\"\">N</span>\n");
      out.write("								<!---->\n");
      out.write("							</span>\n");
      out.write("							<div style=\"\" data-v-4e4965bd=\"\">\n");
      out.write("									<a href=\"/how-it-works\" class=\"text-middle category\"\n");
      out.write("										data-v-4e4965bd=\"\"> 이용안내 <span class=\"new-badge\"\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\n");
      out.write("										href=\"/safety\" class=\"text-middle category\" data-v-4e4965bd=\"\">\n");
      out.write("										안전정책 <span class=\"new-badge\" style=\"display: none;\"\n");
      out.write("										data-v-4e4965bd=\"\">N</span>\n");
      out.write("									</a><a href=\"/prices\" class=\"text-middle category\"\n");
      out.write("										data-v-4e4965bd=\"\"> 예상금액 <span class=\"new-badge\"\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\n");
      out.write("										href=\"/search/pro?from=footer\" class=\"text-middle category\"\n");
      out.write("										data-v-4e4965bd=\"\"> 주니어찾기 <span class=\"new-badge\"\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\n");
      out.write("										href=\"https://help.soomgo.com/hc/ko/articles/360056329911\"\n");
      out.write("										class=\"text-middle category\" data-v-4e4965bd=\"\"> 주니어보증 <span\n");
      out.write("										class=\"new-badge\" style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\n");
      out.write("										href=\"/questions/\" class=\"text-middle category\"\n");
      out.write("										data-v-4e4965bd=\"\"> 주니어에게묻다 <span class=\"new-badge\"\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\n");
      out.write("										href=\"/community/soomgo-life/all\"\n");
      out.write("										class=\"text-middle category sr-only\" data-v-4e4965bd=\"\">\n");
      out.write("										커뮤니티 <span class=\"new-badge\" style=\"display: none;\"\n");
      out.write("										data-v-4e4965bd=\"\">N</span>\n");
      out.write("									</a>\n");
      out.write("								</div></li>\n");
      out.write("							<li data-v-4e4965bd=\"\" class=\"open-padding\"><span\n");
      out.write("								class=\"text-middle title category\" data-v-4e4965bd=\"\">\n");
      out.write("									주니어안내 <span class=\"new-badge\" style=\"display: none;\"\n");
      out.write("									data-v-4e4965bd=\"\">N</span>\n");
      out.write("								<!---->\n");
      out.write("							</span>\n");
      out.write("							<div style=\"\" data-v-4e4965bd=\"\">\n");
      out.write("									<a href=\"/how-soomgo-works\" class=\"text-middle category\"\n");
      out.write("										data-v-4e4965bd=\"\"> 이용안내 <span class=\"new-badge\"\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\n");
      out.write("										href=\"https://help.soomgo.com/hc/ko/categories/115001218027\"\n");
      out.write("										class=\"text-middle category\" data-v-4e4965bd=\"\"> 주니어가이드 <span\n");
      out.write("										class=\"new-badge\" style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\n");
      out.write("										href=\"/pro\" class=\"text-middle category\" data-v-4e4965bd=\"\">\n");
      out.write("										주니어가입 <span class=\"new-badge\" style=\"display: none;\"\n");
      out.write("										data-v-4e4965bd=\"\">N</span>\n");
      out.write("									</a><a href=\"/pro-center\" class=\"text-middle category\"\n");
      out.write("										data-v-4e4965bd=\"\"> 주니어센터 <span class=\"new-badge\"\n");
      out.write("										style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a>\n");
      out.write("								</div></li>\n");
      out.write("							<li data-v-4e4965bd=\"\" class=\"open-padding\"><span\n");
      out.write("								class=\"text-middle title category\" data-v-4e4965bd=\"\">\n");
      out.write("									고객센터 <span class=\"new-badge\" style=\"display: none;\"\n");
      out.write("									data-v-4e4965bd=\"\">N</span>\n");
      out.write("								<!---->\n");
      out.write("							</span>\n");
      out.write("							<div style=\"\" data-v-4e4965bd=\"\">\n");
      out.write("									<a\n");
      out.write("										href=\"https://help.soomgo.com/hc/ko/categories/360002081551-%EA%B3%B5%EC%A7%80%EC%82%AC%ED%95%AD\"\n");
      out.write("										class=\"text-middle category\" data-v-4e4965bd=\"\"> 공지사항 <span\n");
      out.write("										class=\"new-badge\" style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a><a\n");
      out.write("										href=\"https://help.soomgo.com/hc/ko\"\n");
      out.write("										class=\"text-middle category\" data-v-4e4965bd=\"\"> 자주묻는질문 <span\n");
      out.write("										class=\"new-badge\" style=\"display: none;\" data-v-4e4965bd=\"\">N</span></a>\n");
      out.write("								</div></li>\n");
      out.write("						</ul>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"footer-container-row container terms\" data-v-4e4965bd=\"\">\n");
      out.write("					<div class=\"term-container\" data-v-4e4965bd=\"\">\n");
      out.write("						<div class=\"col-content term-content\" data-v-4e4965bd=\"\">\n");
      out.write("							<div class=\"col-content-list-term\" data-v-4e4965bd=\"\">\n");
      out.write("								<div class=\"terms-group\" data-v-4e4965bd=\"\">\n");
      out.write("									<a href=\"/terms/usage\" class=\"text term\" data-v-4e4965bd=\"\">이용약관</a><a\n");
      out.write("										href=\"/terms/privacy\" class=\"text term\" data-v-4e4965bd=\"\">개인정보처리방침</a>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"terms-group\" data-v-4e4965bd=\"\">\n");
      out.write("									<a href=\"/terms/location\" class=\"text term\" data-v-4e4965bd=\"\">위치기반\n");
      out.write("										서비스 이용약관</a><a target=\"_blank\" rel=\"nofollow\"\n");
      out.write("										href=\"https://www.ftc.go.kr/bizCommPop.do?wrkr_no=1208822325\"\n");
      out.write("										class=\"text term\" data-v-4e4965bd=\"\"> 사업자 정보확인 </a>\n");
      out.write("								</div>\n");
      out.write("							</div>\n");
      out.write("							<div class=\"col-content-list-term\" data-v-4e4965bd=\"\">\n");
      out.write("								<span class=\"text term-text\" data-v-4e4965bd=\"\">\n");
      out.write("									(주)브레이브모바일은 통신판매중개자로서 통신판매의 당사자가 아니며 개별 판매자가 제공하는 서비스에 대한 이행,\n");
      out.write("									계약사항 등과 관련한 의무와 책임은 거래당사자에게 있습니다. </span>\n");
      out.write("							</div>\n");
      out.write("							<ul class=\"col-content-guide\" data-v-4e4965bd=\"\">\n");
      out.write("								<li class=\"text\" data-v-4e4965bd=\"\">상호명:(주)브레이브모바일 ·\n");
      out.write("									대표이사:KIM ROBIN H · 개인정보책임관리자:김태우 · 주소:서울특별시 강남구 테헤란로 415, L7\n");
      out.write("									강남타워 5층</li>\n");
      out.write("								<li class=\"text\" data-v-4e4965bd=\"\">사업자등록번호:120-88-22325 ·\n");
      out.write("									통신판매업신고증:제 2021-서울강남-00551 호 · 직업정보제공사업 신고번호:서울청 제 2019-21호</li>\n");
      out.write("								<li class=\"text\" data-v-4e4965bd=\"\">고객센터:1599-5319 ·\n");
      out.write("									이메일:support@soomgo.com</li>\n");
      out.write("								<li class=\"text\" data-v-4e4965bd=\"\">Copyright ©Brave Mobile\n");
      out.write("									Inc. All Rights Reserved.</li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"col-content badge-list right\" data-v-4e4965bd=\"\">\n");
      out.write("							<a href=\"https://www.facebook.com/SoomgoKorea/\" target=\"_blank\"\n");
      out.write("								class=\"footer-badge\" data-v-4e4965bd=\"\"><img\n");
      out.write("								src=\"https://assets.cdn.soomgo.com/icons/icon-footer-sns-facebook.svg\"\n");
      out.write("								alt=\"주니어 페이스북 계정\" data-v-4e4965bd=\"\"></a><a\n");
      out.write("								href=\"https://www.instagram.com/soomgo_official/\"\n");
      out.write("								target=\"_blank\" class=\"footer-badge\" data-v-4e4965bd=\"\"><img\n");
      out.write("								src=\"https://assets.cdn.soomgo.com/icons/icon-footer-sns-instagram.svg\"\n");
      out.write("								alt=\"주니어 인스타그램\" data-v-4e4965bd=\"\"></a><a\n");
      out.write("								href=\"https://blog.naver.com/brave_mobile_mkt/\" target=\"_blank\"\n");
      out.write("								class=\"footer-badge\" data-v-4e4965bd=\"\"><img\n");
      out.write("								src=\"https://assets.cdn.soomgo.com/icons/icon-footer-sns-naverblog.svg\"\n");
      out.write("								alt=\"주니어 블로그\" data-v-4e4965bd=\"\"></a><a\n");
      out.write("								href=\"https://post.naver.com/brave_mobile_mkt?isHome=1\"\n");
      out.write("								target=\"_blank\" class=\"footer-badge\" data-v-4e4965bd=\"\"><img\n");
      out.write("								src=\"https://assets.cdn.soomgo.com/icons/icon-footer-sns-naverpost.svg\"\n");
      out.write("								alt=\"주니어 포스트\" data-v-4e4965bd=\"\"></a><a\n");
      out.write("								href=\"https://news.soomgo.com\" target=\"_blank\"\n");
      out.write("								class=\"footer-badge\" data-v-4e4965bd=\"\"><img\n");
      out.write("								src=\"https://assets.cdn.soomgo.com/icons/icon-footer-sns-tistory.svg\"\n");
      out.write("								alt=\"주니어 스토리\" data-v-4e4965bd=\"\"></a>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</nav>\n");
      out.write("	</div>\n");
      out.write("	<!-- 전체 div -->\n");
      out.write("	</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.4.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("	let messages = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messages}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\n");
      out.write("	let keyword = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${keyword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\n");
      out.write("	let receive = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${receive}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\n");
      out.write("</script>\n");
      out.write("<script src=\"/static/js/message-jym/msg-list.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	\n");
      out.write("</script>\n");
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