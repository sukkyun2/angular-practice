import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent{

  constructor(private studentService : StudentService, private route : ActivatedRoute) { }

  students : any = [];


  ngOnInit(): void {
    this.getStudent();
  }

  getStudent(): any {
    this.studentService
        .selectStudentAll()
        .subscribe(res => 
          { console.log(res); 
            this.students = res
          })
  }
  
  deleteStudent(stuId : any){
    // let stuId = this.route.snapshot.params['stuId'];
    console.log(event);
    console.log(stuId);
    this.studentService
          .deleteStudent(stuId)
          .subscribe(res => {
             alert('삭제되었습니다.');
             this.getStudent();
          });
  }



}
