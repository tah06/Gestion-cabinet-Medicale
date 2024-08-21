import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { MaterielComponent } from './components/materiel/materiel.component';
import { MedecinComponent } from './components/medecin/medecin.component';

const routes: Routes = [
  { path: '', redirectTo:'dashboard' , pathMatch:'full' },
  { path:'dashboard', component:DashboardComponent},
  { path:'medecin', component:MedecinComponent},
  { path:'materiel', component:MaterielComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
