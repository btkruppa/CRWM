import { Symptom } from './symptom.model';

 export class Disease {
     id: number;
     name: string;
     description: string;
     symptom: Symptom;

     constructor(id: number, name: string, description: string, symptom: Symptom){
         this.id = id;
         this.name = name;
         this.description = description;
         this.symptom = symptom;
     }
 }