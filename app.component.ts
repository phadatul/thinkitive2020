import { Component, Input } from '@angular/core';
import { MydataService } from './mydata.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hellorouting';
constructor(private myservice:MydataService){

}


user:string="";
}
