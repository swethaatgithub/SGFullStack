import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ErrorComponent } from './error/error.component';
import { LoginComponent } from './login/login.component';
import { RouteGuardService } from './service/route-guard.service';
import { TeamComponent } from './team/team.component';

const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'dashboard/:id', component: DashboardComponent, canActivate:[RouteGuardService]},
  {path: 'team', component: TeamComponent, canActivate:[RouteGuardService]},
  {path: 'about', component: AboutComponent, canActivate:[RouteGuardService]},
  {path: '**', component: ErrorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
