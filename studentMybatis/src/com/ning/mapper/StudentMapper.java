package com.ning.mapper;

import com.ning.pojo.PageInfo;
import com.ning.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selByPage(PageInfo pi);

    long selCountByPageInfo(PageInfo pi);
}
