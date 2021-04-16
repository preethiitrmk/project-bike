import { Component, OnInit } from '@angular/core';
import { AdminAllBooking } from 'src/app/models/adminallbooking';
@Component({
  selector: 'app-super-admin-allbookings',
  templateUrl: './super-admin-allbookings.component.html',
  styleUrls: ['./super-admin-allbookings.component.css']
})
export class SuperAdminAllbookingsComponent implements OnInit {
  bookings: AdminAllBooking[] = [
    {
      admin_id:1,
    company_name:'ABC',
    bike_model:'DEF',
    rent:'RENT',
    days:10,
    total_price:100,
    },
    {
      admin_id:2,
    company_name:'GHI',
    bike_model:'JKL',
    rent:'RENT',
    days:20,
    total_price:200,
    },
    {
      admin_id:3,
    company_name:'MNO',
    bike_model:'PQR',
    rent:'RENT',
    days:30,
    total_price:300,
    },
    {
      admin_id:4,
    company_name:'STU',
    bike_model:'VWX',
    rent:'RENT',
    days:40,
    total_price:400,
    }
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
