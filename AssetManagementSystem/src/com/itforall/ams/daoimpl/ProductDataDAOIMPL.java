/**
 * 
 */
package com.itforall.ams.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itforall.ams.connection.CreateConnection;
import com.itforall.ams.constants.SuccessConstants;
import com.itforall.ams.dao.ProductDataDAO;
import com.itforall.ams.exceptions.ProductTypeNotFound;
import com.itforall.ams.vo.ProductVO;

/**
 * @author TK048537
 *
 */
public class ProductDataDAOIMPL implements ProductDataDAO {

	boolean flag;
	Connection con;
	PreparedStatement ps;
	/* (non-Javadoc)
	 * @see com.itforall.ams.dao.ProductDataDAO#ProductDataDAO(com.itforall.ams.vo.ProductVO)
	 */
	@Override
	public ProductVO ProductDataDAO(ProductVO vo) throws ProductTypeNotFound {
		// TODO Auto-generated method stub
		CreateConnection getConnectionObj = new CreateConnection();
		con = getConnectionObj.getConnection();
		List<String> prodType = new ArrayList<String>();
		try
		{
			ps = con.prepareStatement(SuccessConstants.PRODUCT_TYPE);
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				prodType.add(result.getString(1));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		ProductVO voProd = new ProductVO();
		voProd.setProductType(prodType);
		CreateConnection.closeConnection();
		return voProd;
	}

}
