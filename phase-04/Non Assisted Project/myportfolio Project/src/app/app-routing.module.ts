import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { SigninComponent } from './signin/signin.component';
import { SignupComponent } from './signup/signup.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { HomepageComponent } from './homepage/homepage.component';
import { ContactusComponent } from './contactus/contactus.component';


const routes: Routes = [
{path:'',
component:HomepageComponent},
  {path:'signin',
component:SigninComponent},
{path:'signup',
component:SignupComponent},
{
  path:'aboutus',
  component:AboutusComponent
},{

  path:'contactus',
  component:ContactusComponent

}];




@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }