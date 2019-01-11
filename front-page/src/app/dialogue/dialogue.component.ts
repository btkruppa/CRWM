import { Component, OnInit } from '@angular/core';
import {Globals} from '../global';

@Component({
  selector: 'app-dialogue',
  templateUrl: './dialogue.component.html',
  styleUrls: ['./dialogue.component.css']
})
export class DialogueComponent implements OnInit {

  constructor(private globals:Globals) { }
  placeholder:boolean = false;
  ngOnInit() {
    this.startGame();
  }

  startGame(){
    document.getElementById("dialoguetext").innerHTML = this.globals.introStart + this.globals.username + "." + this.globals.introEnd;
  }

  introducePatient(){
    document.getElementById("dialoguetext").innerHTML += "/n> Great! I'd like to introduce you to your new patient, " + this.globals.patientFirstName + " " + this.globals.patientLastName;
  }
}
