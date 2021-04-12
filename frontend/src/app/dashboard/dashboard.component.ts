import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserDataService } from '../service/data/user-data.service';
import { Observable } from 'rxjs';

  export  class transaction {
    date :String = ""
    desc :String = ""
    amount :String = ""
  }
 

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})


export class DashboardComponent implements OnInit {

  id = ''
  
  username : String = ""
  
  trans : transaction[] = []
 

  //Customer class data
    name!: String;
    lastlogin!: String;
    balance!: String;
  
  //  transLists = [
  //   new transList(new Date(), 'School Fee', 90000 ),
  // ]

 
  constructor(private route: ActivatedRoute, private router : Router,private service: UserDataService ) {
         
   }

    ngOnInit(): void {
      this.id = this.route.snapshot.params.id 
    //  this.getUsernamebyID()  
      this.fetchLastLoginbyID()
      this.fetchTransbyID()
       
  }
   
  fetchAll4dashboard(){
    this.fetchLastLoginbyID()
    this.fetchTransbyID()
    this.fetchUsernamebyID()

  }

  //************************************************************************************************* */

    fetchLastLoginbyID() {
      console.log(this.service.getLastLoginByID(this.id));
      this.service.getLastLoginByID(this.id).subscribe(res => this.fetchLastLoginbyIDres(res), 
                                                           error => this.handleErrorResponse(error)
      );
    }

    fetchLastLoginbyIDres(res: String){
      this.lastlogin = res
      console.log(this.lastlogin + "Is the last login for " + this.id);   
         
    }

  //************************************************************************************************* */

  
     
//************************************************************************************************* */
    //Works well
  fetchTransbyID() {
    console.log(this.service.getTransbyID(this.id));
    this.service.getTransbyID(this.id).subscribe(res => this.fetchTransbyIDRes(res), 
                                                         error => this.handleErrorResponse(error)  
    );
  }

  //Works well
  fetchTransbyIDRes(res: transaction[]) {
           this.trans = res
           for(let i = 0; i < this.trans.length; i++){
           console.log(this.trans[i].amount +"is thea amount for " + this.trans[i].desc)
          }
      }
   
 //************************************************************************************************* */ 
  
// Works well

fetchUsernamebyID(){
    console.log(this.service.getUserNamebyID(this.id));
    this.service.getUserNamebyID(this.id).subscribe(res => this.getUsernamebyIDRes(res), 
                                                         error => this.handleErrorResponse(error)
    );
   }
// Works well
   getUsernamebyIDRes(response: String) {
    this.username = response
    console.log(this.username);
  }
//************************************************************************************************* */


  handleErrorResponse(error: Object) {
    this.router.navigate(['error']);
    console.log(error);
  }

 

}




