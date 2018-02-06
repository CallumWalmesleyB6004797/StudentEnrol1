package com.enrol

class Course {

String department

String title

Leader leader

String code

Date startDate

Date endDate

String description

String studyMode

int numberOfStudents

Double tuitionFees

String toString(){

return title

}

static constraints = {
title blank:false, nuallable:false
department blank:false, nuallable:false
code blank:false, nuallable:false
numberOfStudents blank:false, nuallable:false
}
}
