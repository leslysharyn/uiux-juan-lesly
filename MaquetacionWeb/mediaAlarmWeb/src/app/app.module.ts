import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MyAlarmsComponent } from './my-alarms/my-alarms.component';
import { LoginComponent } from './login/login.component';
import { MultimediaComponent } from './multimedia/multimedia.component';
import { AjustesComponent } from './ajustes/ajustes.component';
import { SyncComponent } from './sync/sync.component';
import { CalendarModule, DatePickerModule, TimePickerModule, DateRangePickerModule, DateTimePickerModule } from '@syncfusion/ej2-angular-calendars';

@NgModule({
  declarations: [
    AppComponent,
    MyAlarmsComponent,
    LoginComponent,
    MultimediaComponent,
    AjustesComponent,
    SyncComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    CalendarModule, DatePickerModule, TimePickerModule, DateRangePickerModule, DateTimePickerModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
