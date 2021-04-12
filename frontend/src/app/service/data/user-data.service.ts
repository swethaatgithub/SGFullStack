import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { transaction } from 'src/app/dashboard/dashboard.component';




@Injectable({
  providedIn: 'root'
})
export class UserDataService {

   constructor(private http:HttpClient,private route: Router ) { 
  }

  

  getLastLoginByID(id:String) { 
          return this.http.get(`http://localhost:8080/getLastLoginByID/${id}`,{observe : 'body' , responseType: 'text'});
  }


// Works well
  getUserNamebyID(id:String) { 
    console.log("getUserNamebyID :"+`http://localhost:8080/getNameByID/${id}`)
    return this.http.get(`http://localhost:8080/getNameByID/${id}`, {observe : 'body' , responseType: 'text'})
}

// Works well
getTransbyID(id:String) { 
  console.log("getUserNamebyID :"+`http://localhost:8080/getTransByID/${id}`)
  return this.http.get<transaction[]>(`http://localhost:8080/getTransByID/${id}`, {observe : 'body' , responseType: 'json'})
}

getTeamNameList(){
  console.log("getUserNamebyID :"+"http://localhost:8080/getTeamNameList")
  return this.http.get<String[]>("http://localhost:8080/getTeamNameList", {observe : 'body' , responseType: 'json'})
}


}
