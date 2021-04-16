import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SuperAdminAllbookingsComponent } from './super-admin-allbookings.component';

describe('SuperAdminAllbookingsComponent', () => {
  let component: SuperAdminAllbookingsComponent;
  let fixture: ComponentFixture<SuperAdminAllbookingsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SuperAdminAllbookingsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SuperAdminAllbookingsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
