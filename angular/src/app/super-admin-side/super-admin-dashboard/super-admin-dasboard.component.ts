import { Component, OnInit } from '@angular/core';
import { AdminList } from 'src/app/models/adminlist';
@Component({
  selector: 'app-super-admin-dasboard',
  templateUrl: './super-admin-dasboard.component.html',
  styleUrls: ['./super-admin-dasboard.component.css']
})
export class SuperAdminDasboardComponent implements OnInit {
  characters: AdminList[] = [
    {
    aname: 'ABC',
    cname:'abc',
    address:'DEF',
    mobile: 123456789
    
    },
    {
    aname: 'GHI',
    cname:'def',
    address: 'JKL',
    mobile: 987654321
    
    },
    {
    aname:'MNO',
    cname:'ghi',
    address:'PQR',
    mobile: 567894321
    
    },
    {
    aname: 'STU',
    cname:'jkl',
    address: 'VWX',
    mobile: 5432167890,
   
    }
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
