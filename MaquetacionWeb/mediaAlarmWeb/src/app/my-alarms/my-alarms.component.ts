import { Component } from '@angular/core';

@Component({
  selector: 'my-alarms',
  templateUrl: './my-alarms.component.html',
  styleUrls: ['./my-alarms.component.scss'],
  template: `
  <button (click)="navigateToSubcomponent()" class="button">Iniciar sesión</button>
    <router-outlet></router-outlet>
  `
})
export class MyAlarmsComponent {}
