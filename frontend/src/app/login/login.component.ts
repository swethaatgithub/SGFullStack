import { Component, OnInit  } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})


export class LoginComponent implements OnInit {

  id = 'W106'
  password = ''
  errorMessage = 'Invalid Credentials'
  invalidLogin = false

  constructor(private router: Router) { }

  handleLogin() {
    console.log(this.id);
    if (this.id === 'W106' && this.password === 'dummy') {
      this.router.navigate(['dashboard', this.id])
      this.invalidLogin = false
    }
    else {
      this.invalidLogin = true
    }
  }


  ngOnInit(): void {
  }

}
