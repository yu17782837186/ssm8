package com.ning.service;

import com.ning.pojo.PageInfo;

public interface StudentService {
    PageInfo showPage(String sname,String tname,String pageSize,String pageNumber);
}
