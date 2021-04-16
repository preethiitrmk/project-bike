export class UserProfileModel
{
    
   

    name: string;
    

    email: string;
   

    password: string;
    age:number;
    mobilenumber:number;

    constructor(name: string,email: string,password: string, age: number, mobilenumber: number)
    {
        
        this.name=name;
      
        this.email=email;
        
        this.password=password;
        this.age=age;
        this.mobilenumber=mobilenumber;
    }
}
