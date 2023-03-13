import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MyAlarmsComponent } from './my-alarms/my-alarms.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'my-alarms', component: MyAlarmsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { enableTracing: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
