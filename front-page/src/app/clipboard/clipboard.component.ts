import { Component, OnInit } from '@angular/core';
import { Globals } from '../global';

@Component({
  selector: 'app-clipboard',
  templateUrl: './clipboard.component.html',
  styleUrls: ['./clipboard.component.css']
})
export class ClipboardComponent implements OnInit {

  constructor(private globals:Globals) { }

  
  ngOnInit() {
  }

}
