export class UserBookingElements{
    company_name:string;
    bike_model:string;
    rent:string;
    days:number;
    total_price:number;
    

    constructor(company_name:string, bike_model:string, rent:string, days:number,total_price:number ){
        this.company_name=company_name;
        this.bike_model=bike_model;
        this.rent=rent;
        this.days=days;
        this.total_price=total_price;


    }
}