package com.enrol

class BootStrap {



    def init = { servletContext ->

def tom=new Leader(fullName:'Dr Tom Donaldson',
			department:'Computing',
			subject:'Programming',
			post:'Reader',
			leaderEmail:'t.donaldson@email.com',
			office:'B-9432',
			username:'tdonald',
			password:'secret',
			bio:'''This is a bio for the leader.''').save()

def matt=new Leader(fullName:'Dr Matt Parker',
			department:'History',
			subject:'History',
			post:'Reader',
			leaderEmail:'m.parker@email.com',
			office:'B-9600',
			username:'mparker',
			password:'parkerrulez',
			bio:'''This is a bio for the matt leader.''').save()

def course1=new Course(title:'BSc Hon Interactive Media with Animation',
			department:'Computing',
			leader:tom,
			code:'IMA101',
			startDate:new Date('19/09/2017'),
			endDate: new Date ('19/08/2020'),
			numberOfStudents:55,
			studyMode:'Full-time',
			tuitionFees:9000,
			description:'''This is a description for Interactive Media with Animation Course''').save()

def course2=new Course(title:'BSc Hon History',
			department:'Humanities',
			leader:matt,
			code:'HIS101',
			startDate:new Date('19/09/2017'),
			endDate: new Date ('19/08/2021'),
			numberOfStudents:68,
			studyMode:'Full-time',
			tuitionFees:9450,
			description:'''This is a description for History Course''').save()

def lect1=new Lecturer(fullName:'Dr Steve Crossbar',
			post:'Lecturer',
			lecturerEmail:'s.h.crossbar@theUni.ac.uk',
			subject:'Web Design',
			office:'Office-2211',
			bio:'''Lorem ipsum dolor sit amet, ludus contentiones ut nam, quaeque dolores facillisi in nec''').save()

def module1=new Module(title:'System Architectures',
			code:'SYS234',
			credits:'20',
			lecturer:lect1,
			course:'BSc Hon Computing',
			description:'''I'm a description from the Module instance''').save()

def student1=new Student(name:'Jane Armando',
			studentID:'b38845',
			dob:new Date('10/11/1996'),
			email:'kst@email.com',
			isFundingAvailable:true,
			username:'rvg96',
			password:'secret',
			course:course1).save()

def student2=new Student(name:'Scott Oliver',
			studentID:'b6784',
			dob:new Date('1/15/1997'),
			email:'ScottyO@email.com',
			isFundingAvailable:true,
			username:'Scotty97',
			password:'passyword',
			course:course2).save()

}
    def destroy = {
    }
}
