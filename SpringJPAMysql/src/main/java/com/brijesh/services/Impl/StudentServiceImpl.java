package com.brijesh.services.Impl;

import com.brijesh.common.CollegeConstants;
import com.brijesh.exception.CollegeException;
import com.brijesh.model.request.StudentReqResp;
import com.brijesh.services.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    public StudentServiceImpl() {

    }

    public List<StudentReqResp> getStudentDetails(StudentReqResp studentRequest) throws CollegeException {
        List<StudentReqResp> studentList = null;
        try {

        } catch (Throwable throwable) {
            throw new CollegeException(CollegeConstants.ERROR_PROCESSING_STUDENT_SERVICE_REQUEST, throwable);
        }
        return studentList;
    }

    public StudentReqResp getStudentInfo(String studentId) throws CollegeException {
        StudentReqResp studentResp = null;
        try {

        } catch (Throwable throwable) {
            throw new CollegeException(CollegeConstants.ERROR_PROCESSING_STUDENT_SERVICE_REQUEST, throwable);
        }
        return studentResp;
    }
}
