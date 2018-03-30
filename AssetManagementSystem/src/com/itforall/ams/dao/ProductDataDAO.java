/**
 * 
 */
package com.itforall.ams.dao;

import com.itforall.ams.exceptions.ProductTypeNotFound;
import com.itforall.ams.vo.ProductVO;

/**
 * @author TK048537
 *
 */
public interface ProductDataDAO {
	public ProductVO ProductDataDAO(ProductVO vo) throws ProductTypeNotFound;
}
