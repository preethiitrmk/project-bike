import { Component, OnInit } from '@angular/core';
import { UserBookingElements } from 'src/app/models/userbookingelements'
@Component({
  selector: 'app-user-bookings',
  templateUrl: './user-bookings.component.html',
  styleUrls: ['./user-bookings.component.css']
})
export class UserBookingsComponent implements OnInit {
  bookings: UserBookingElements[] = [
    {
    company_name:'ABC',
    bike_model:'DEF',
    rent:'RENT',
    days:10,
    total_price:100,
    },
    {
    company_name:'GHI',
    bike_model:'JKL',
    rent:'RENT',
    days:20,
    total_price:200,
    },
    {
    company_name:'MNO',
    bike_model:'PQR',
    rent:'RENT',
    days:30,
    total_price:300,
    },
    {
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
