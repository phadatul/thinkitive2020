import { Component, OnInit } from '@angular/core';
import { MydataService } from '../mydata.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
user:string="";
  constructor(private myservice:MydataService) { }

  ngOnInit(): void {
    this.user=this.myservice.getData();
  }

}
