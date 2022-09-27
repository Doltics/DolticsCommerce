/**
 *
 */
package com.doltics.commerce.utils;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.doltics.commerce.abstracts.AbstractUtil;


/**
 * 
 * Handle Pagination
 * 
 * @author Paul Kevin
 *
 * @version enter version, 26 Feb 2018
 *
 * @since  jdk 1.8
 */
public class PaginationUtils extends AbstractUtil{
	
	/**
     * Returns a new object which specifies the the wanted result page.
     * @param pageIndex The index of the wanted result page
     * @return
     */
    public static Pageable paginationIdDesc(int pageIndex, int perpage) {
        return paginationDesc(pageIndex, perpage, "id");
    }
    
    public static Pageable paginationIdAsc(int pageIndex, int perpage) {
        return paginationAsc(pageIndex, perpage, "id");
    }
    
    public static Pageable paginationAsc(int pageIndex, int perpage, String field) {
        Pageable pageSpecification = PageRequest.of(pageIndex, perpage, sortByAsc(field));
        return pageSpecification;
    }
    
    public static Pageable paginationDesc(int pageIndex, int perpage, String field) {
        Pageable pageSpecification = PageRequest.of(pageIndex, perpage, sortByDesc(field));
        return pageSpecification;
    }
  
    private static Sort sortByAsc(String field) {
        return Sort.by(Sort.Direction.ASC, field);
    }
    
    private static Sort sortByDesc(String field) {
        return Sort.by(Sort.Direction.DESC, field);
    }
}