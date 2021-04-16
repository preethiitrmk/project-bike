import { Component, OnInit } from '@angular/core';
import   CompanyElements   from 'src/app/models/companyelements'
@Component({
  selector: 'app-company-details',
  templateUrl: './company-details.component.html',
  styleUrls: ['./company-details.component.css']
})
export class CompanyDetailsComponent implements OnInit {
  characters: CompanyElements[] = [
    {
    bike_model: 'ABC',
    price:100,
    type: 'XYZ',
    status: 'AVAILABLE'
    },
    {
    bike_model: 'DEF',
    price: 200,
    type: 'UVW',
    status: 'BOOKED'
    },
    {
    bike_model: 'GHI',
    price: 300,
    type: 'RST',
    status: 'BOOKED'
    },
    {
    bike_model: 'JKL',
    price: 400,
    type: 'OPQ',
    status: 'AVAILABLE'
    }
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
