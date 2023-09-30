<jsp:useBean id="ed" class="pp.EmpDao"></jsp:useBean>
<% 
  int id = Integer.parseInt(request.getParameter("id"));
  int i = ed.delete(id);
  RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
  rd.include(request, response);
  out.println(i+" record deleted");
%>