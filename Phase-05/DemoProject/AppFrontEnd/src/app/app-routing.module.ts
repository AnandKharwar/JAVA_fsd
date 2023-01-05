import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormComponent } from './form/form.component';
import { ImagesComponent } from './images/images.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  

  {"path":"users",component:UserComponent},
  {"path":"form",component:FormComponent},
  {"path":"image",component:ImagesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
