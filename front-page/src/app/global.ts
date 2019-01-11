/*@author Jake Mulrenin */
/*This global ts file defines the isOn variable that is used to 
change the views depending on what is clicked on*/
import{Injectable} from "@angular/core";

@Injectable()
export class Globals{
    isOn:boolean = true;
    firstButtonOn = true;
    whichTestButton = false;
    introStart:string = "> Welcome,  ";
    introEnd:string = "I'm Dr. Hawk. Congratulations  on  passing  medical  school! Now  your  real  test  begins.";
    username:string = "CapnKnuckles";
    patientFirstName:string;
    patientLastName:string;
    observableSymptom:string;
    observation:string = "You notice ";

    sleep (time) {
        return new Promise((resolve) => setTimeout(resolve, time));
      }
}