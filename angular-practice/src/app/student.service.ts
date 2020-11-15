import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

//@Injectable : 다른 곳에 주입될 수 있다고 명시해줌
@Injectable({ 
  providedIn: 'root'
})
export class StudentService {

  serverUrl = 'http://localhost:8080/student/'

  constructor(private http : HttpClient) { }

  /**
   * 학생들의 정보를 불러옴
   */
  selectStudentAll() {
    return this.http.get(this.serverUrl+'list')
    //.subscribe(res => { console.log(res);})
  }

  /**
   * 학생의 정보를 불러옴
   */
  selectStudentOne(param : any){
    return this.http.get(this.serverUrl+param);
  }

  /**
   * 학생의 정보 등록
   * @param param 
   */
  insertStudent(param : any){ 
    return this.http.post(this.serverUrl,param);
  }

  /**
   * 특정 학생의 정보를 변경
   * @param param 
   */
  updateStudent(param : any){ 
    return this.http.put(this.serverUrl,param);
  }

  /**
   * 특정 학생의 정보를 삭제
   * @param param //stuId
   */
  deleteStudent(param : any){ 
    return this.http.delete(this.serverUrl+param);

  }
}
