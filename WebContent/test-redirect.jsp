<%-- Redirect from JSP to Servlet --%>

<%
    response.sendRedirect(request.getContextPath() + "/funny");
%>