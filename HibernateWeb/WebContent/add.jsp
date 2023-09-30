<jsp:useBean id="ed" class="pp.EmpDao"></jsp:useBean>
<jsp:useBean id="e" class="pp.Emp"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>
<% 
  int i = ed.addEmp(e);
%>
<%=i+" record added" %>