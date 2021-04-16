export default class CompanyElements {
    bike_model: String;
    price: Number;
    type: String;
    status: String;

    constructor(bike_model: String,price:Number,type: String,status: String){
            this.bike_model=bike_model;
            this.price=price;
            this.type=type;
            this.status=status;
        }
}
