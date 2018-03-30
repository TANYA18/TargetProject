/**
 * 
 */
package com.itforall.ams.boimpl;

import com.itforall.ams.bo.ProductDataBO;
import com.itforall.ams.daoimpl.ProductDataDAOIMPL;
import com.itforall.ams.exceptions.ProductTypeNotFound;
import com.itforall.ams.vo.ProductVO;

/**
 * @author TK048537
 *
 */
public class ProductDataBoimpl implements ProductDataBO {

	/* (non-Javadoc)
	 * @see com.itforall.ams.bo.ProductDataBO#ProductDataBO(com.itforall.ams.vo.ProductVO)
	 */
	@Override
	public boolean ProductDataBO(ProductVO vo) throws ProductTypeNotFound {
		// TODO Auto-generated method stub
		ProductDataDAOIMPL prodData = new ProductDataDAOIMPL();
		prodData.ProductDataDAO(vo);
		return false;
	}

}
