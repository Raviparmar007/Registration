    package demotest;
     
    import java.io.IOException;
     
    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
     
    /**
     * Servlet implementation class guru_login
     */
    public class login extends HttpServlet {
     
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public login() {
            super();
            // TODO Auto-generated constructor stub
        }
     
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		String username = request.getParameter("username");
    		String password = request.getParameter("password");
    		if(username.isEmpty() || password.isEmpty() )
    		{
    			RequestDispatcher req = request.getRequestDispatcher("Register_3.jsp");
    			req.include(request, response);
    		}
    		else
    		{
    			RequestDispatcher req = request.getRequestDispatcher("Register_4.jsp");
    			req.forward(request, response);
    		}
    	}
     
    }