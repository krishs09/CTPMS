import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChiplistautocompleteComponent } from './chiplistautocomplete.component';

describe('ChiplistautocompleteComponent', () => {
  let component: ChiplistautocompleteComponent;
  let fixture: ComponentFixture<ChiplistautocompleteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChiplistautocompleteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ChiplistautocompleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
