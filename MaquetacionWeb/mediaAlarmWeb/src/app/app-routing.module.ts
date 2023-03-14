import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MyAlarmsComponent } from './my-alarms/my-alarms.component';
import { LoginComponent } from './login/login.component';
import { MultimediaComponent } from './multimedia/multimedia.component';
import { AjustesComponent } from './ajustes/ajustes.component';
import { SyncComponent } from './sync/sync.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'my-alarms', component: MyAlarmsComponent },
  { path: 'multimedia', component: MultimediaComponent },
  { path: 'settings', component: AjustesComponent },
  { path: 'sync', component: SyncComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { enableTracing: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
