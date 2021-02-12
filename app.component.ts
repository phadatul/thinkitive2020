import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  isadmin=false;
  title:any = 'My First Angular Project';
  x:string[]=["Pune","Mumbai","Nagpur","Delhi","Nasik","Bengaluru"];
  mytext="hello this is text";
  myclass="myclass1";

  changeText(){
    alert(this.mytext);
    this.mytext=this.mytext.toUpperCase();
    this.myclass="myclass2";
    this.isadmin=true;
  }
}
