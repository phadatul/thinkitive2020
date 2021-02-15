import { Component, Input, OnInit } from '@angular/core';
import { MydataService } from '../mydata.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
user:string="";

  constructor(private myservice:MydataService) { }

  ngOnInit(): void {
    this.user=this.myservice.getData();
  }

  changeValue(){
    this.myservice.setData(this.user);
    console.log(this.myservice.getData());
  }

}
