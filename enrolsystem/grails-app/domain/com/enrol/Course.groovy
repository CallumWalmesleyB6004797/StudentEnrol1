package com.enrol

class Course {

String department

String title

String leader

String code

Date startDate

Date endDate

String description

String studyMode

int numberOfStudents

Double tuitionFees

static constraints = {
title blank:false, nuallable:false
department blank:false, nuallable:false
code blank:false, nuallable:false
numberOfStudents blank:false, nuallable:false
}
}
