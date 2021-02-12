import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
username=new FormControl('username');
email=new FormControl('email');
  constructor() { }
  myformgroup=new FormGroup({username:new FormControl('admin'),email:new FormControl('abc@xyz.com')});
  ngOnInit(): void {
 
  }

  mynewmethod(data:any){
    alert(data.username+" "+data.email);
  }

}
