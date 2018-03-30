/**
 * 
 */
package com.itforall.ams.bo;

import com.itforall.ams.exceptions.ProductTypeNotFound;
import com.itforall.ams.vo.ProductVO;

/**
 * @author TK048537
 *
 */
public interface ProductDataBO {
	
	boolean ProductDataBO(ProductVO vo) throws ProductTypeNotFound;
}
