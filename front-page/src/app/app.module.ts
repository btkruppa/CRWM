import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DialogueComponent } from './dialogue/dialogue.component';
import { VitalsComponent } from './vitals/vitals.component';
import { ClipboardComponent } from './clipboard/clipboard.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    DialogueComponent,
    VitalsComponent,
    ClipboardComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
