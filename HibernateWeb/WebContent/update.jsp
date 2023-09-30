<jsp:useBean id="ed" class="pp.EmpDao"></jsp:useBean>
<jsp:useBean id="e" class="pp.Emp"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>
<% 
   ed.update(e);
   RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
   rd.include(request, response);
   out.println("successfully Updated");
%>