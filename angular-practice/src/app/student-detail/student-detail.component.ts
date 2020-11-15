
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent{

  student : any = {};
  tmpStudent : any = {};

  stuId : any;

  constructor(private studentService : StudentService, private route : ActivatedRoute, private router : Router) {
      this.stuId = route.snapshot.params['stuId'];
      console.log(this.stuId);
   }

  ngOnInit(): void {
    this.studentService
            .selectStudentOne(this.stuId)
            .subscribe(res => { 
              console.log(res);
              this.student = res; 
    })
  }


  // insert와 update를 총합하는 함수...
  registerStudent(){
    if(this.student.stuId){
      //stuId가 있다면 => 수정
      this.updateStudent();
    } else {
      //stuId가 없다면 => 추가
      this.insertStudent();
    }

    this.router.navigate(['list']);

  }

  insertStudent() {
    this.studentService
          .insertStudent(this.student)
          .subscribe(res => {  
            alert('추가되었습니다.');
          })

  }

  updateStudent() {
    this.studentService
          .updateStudent(this.student)
          .subscribe(res => { 
            alert('수정되었습니다.');
          })
  }
}
