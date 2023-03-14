import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyAlarmsComponent } from './my-alarms.component';

describe('MyAlarmsComponent', () => {
  let component: MyAlarmsComponent;
  let fixture: ComponentFixture<MyAlarmsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MyAlarmsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MyAlarmsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
