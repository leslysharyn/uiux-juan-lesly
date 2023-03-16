import { Component } from '@angular/core';
import { MatSlideToggleChange } from '@angular/material/slide-toggle';

@Component({
  selector: 'my-alarms',
  templateUrl: './my-alarms.component.html',
  styleUrls: ['./my-alarms.component.scss'],
})

export class MyAlarmsComponent {
  onToggleChange(event: MatSlideToggleChange) {
  console.log('Slide toggle changed:', event.checked);
  }

  selectedOption: string = "";

  onOptionSelected(event: any) {
    this.selectedOption = event.target.value;
  }
  
  isClicked = [false, false, false, false, false, false, false];

  onClick(index: number) {
    this.isClicked[index] = !this.isClicked[index];
  }
}
