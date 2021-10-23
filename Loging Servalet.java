public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userName = request.getParameter(username"); //
		String password = request.getParameter("password")
		
		boolean isTrue
		
		isTrue = CustomerDB.validate(userName, password); //
		
		if (isTrue == true) {
			
			List<Customer> cusDetails = CustomerDBUtil.getcustomer(userName); //
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp"); 
			dis.forward("request, response"); //
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');"); 
			out.println("location='login.jsp'"); 
			out.println("</script"); //
		}
		
	}

}
