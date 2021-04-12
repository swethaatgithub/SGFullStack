import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserDataService } from '../service/data/user-data.service';

@Component({
  selector: 'app-team',
  templateUrl: './team.component.html',
  styleUrls: ['./team.component.scss']
})
export class TeamComponent implements OnInit {

  name : String[] = [];

  constructor(private service : UserDataService, private router : Router) {

   }

  ngOnInit(): void {
    this.fetchTeamNameList();
  }

  fetchTeamNameList() {
    console.log(this.service.getTeamNameList());
    this.service.getTeamNameList().subscribe(res => this.handleSuccesfulResponse(res), 
                                                         error => this.handleErrorResponse(error)
    );
  }

  handleSuccesfulResponse(res: String[]){
    for(var i = 0; i < res.length; i++)
    { 
        console.log(res[i]); 
        this.name.push(res[i]);
    }
       
  }

  handleErrorResponse(error: Object) {
    this.router.navigate(['error']);
    console.log(error);
  }

}
