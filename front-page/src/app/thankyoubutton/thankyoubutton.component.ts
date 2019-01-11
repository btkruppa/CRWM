import { Component, OnInit } from '@angular/core';
import {Globals} from '../global';

@Component({
  selector: 'app-thankyoubutton',
  templateUrl: './thankyoubutton.component.html',
  styleUrls: ['./thankyoubutton.component.css']
})
export class ThankyoubuttonComponent implements OnInit {

  constructor(private globals:Globals) { }

  ngOnInit() {
  }
  introducePatient(){
    this.globals.patientFirstName = "Sally";
    this.globals.patientLastName = "Brooks";
    document.getElementById("introPatient").innerHTML += "/n> Great! I'd like to introduce you to your new patient, " + this.globals.patientFirstName + " " + this.globals.patientLastName;
    this.globals.firstButtonOn = false;
  }
}
