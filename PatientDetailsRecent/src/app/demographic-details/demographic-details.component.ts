import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demographic-details',
  templateUrl: './demographic-details.component.html',
  styleUrls: ['./demographic-details.component.css']
})
export class DemographicDetailsComponent implements OnInit {

  hasAllergy:boolean = false;

  ngOnInit(): void {
  }

  showAllergyForm(event:any){
    if ( event.target.checked ) {
      this.hasAllergy = !this.hasAllergy;
    }else{
      this.hasAllergy = !this.hasAllergy;
    }
    
  }
}
