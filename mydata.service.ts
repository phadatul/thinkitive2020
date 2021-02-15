import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MydataService {
mydata:string="DEFAULT";
  constructor() { }

  getData(){
    return this.mydata;
  }

  setData(mydata:string){
    this.mydata=mydata;
  }
}
