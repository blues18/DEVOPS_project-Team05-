package com.dvops.maven.eclipse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    //database connections 
    
    private String jdbcURL = "jdbc:mysql://localhost:3306/userdetails_storage";
	private String jdbcUsername = "root";
	private String jdbcPassword = "Ezeikel888=";
    
    private static final String select_product_by_name = "select product_name, product_type, product_brand, "
    		+ "product_price,product_discription,product_stocks from product_Table where product_name = ?";
    
    private static final String select_all_product = "SELECT * FROM product_table ";
    
    //connection to the database via jdbc
    
    protected Connection getConnection(){
    	Connection connection = null;
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	return connection;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String servletPath = request.getServletPath();
			try {
				listProduct(request,response);
				System.out.println("Requesting from server ");
				}catch (SQLException ex) {
					System.out.println("error at DoGet ");
					throw new ServletException(ex);
				} 
		
	}
	
	private void listProduct(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<products_model> products = new ArrayList<>();
		try (Connection connection = getConnection();
				// Step 5.1: Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(select_all_product);) {
			// Step 5.2: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 5.3: Process the ResultSet object.
			while (rs.next()) {
				String product_name = rs.getString("product_name");
				String product_type = rs.getString("product_type");
				String product_brand = rs.getString("product_brand");
				int product_price = rs.getInt("product_price");
				String product_discription = rs.getString("product_discription");
				int product_stocks = rs.getInt("product_stocks");
				products.add(new products_model(product_name, product_type, product_brand, 
						product_price,product_discription,product_stocks));
				System.out.println("adding to list");
			}
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

		request.setAttribute("listProduct", products);
		request.getRequestDispatcher("/viewAllproduct.jsp").forward(request, response);

	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
