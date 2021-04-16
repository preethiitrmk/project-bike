import { Component, Input, OnInit } from '@angular/core';
import { CompanyList } from 'src/app/models/companylist';

@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.css']
})
export class UserDashboardComponent implements OnInit {

 characters: CompanyList[] = [
    {
    name: 'ABC',
    address:'DEF',
    mobile: 123456789
    
    },
    {
    name: 'GHI',
    address: 'JKL',
    mobile: 987654321
    
    },
    {
    name:'MNO',
    address:'PQR',
    mobile: 567894321
    
    },
    {
    name: 'STU',
    address: 'VWX',
    mobile: 5432167890,
   
    }
  ];
  constructor() { 

    

  }

  //@Input()
  //company!: Company;

  ngOnInit(): void {
  }

  
  

}
