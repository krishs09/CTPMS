import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { DemographicDetailsComponent } from './demographic-details/demographic-details.component';
import { VisitDetailsComponent } from './visit-details/visit-details.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatChipInput, MatChipList, MatChipsModule} from '@angular/material/chips';
import {MatChipInputEvent} from '@angular/material/chips';
import { ChiplistComponent } from './chiplist/chiplist.component';
import{MatFormFieldModule} from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { ChiplistautocompleteComponent } from './chiplistautocomplete/chiplistautocomplete.component'
import {MatAutocompleteModule} from '@angular/material/autocomplete';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    DemographicDetailsComponent,
    VisitDetailsComponent,
    ChiplistComponent,
    ChiplistautocompleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    BrowserAnimationsModule,
    MatFormFieldModule,
    MatChipsModule,
    MatIconModule,
    MatAutocompleteModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
