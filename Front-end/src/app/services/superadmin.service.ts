import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { SuperAdmin } from '../model/superadmin.model';


@Injectable({
  providedIn: 'root'
})
export class SuperadminService {

  private baseUrl = 'http://localhost:8082/api';

  constructor(private http: HttpClient) { }

  getAllSuperAdmins(): Observable<SuperAdmin[]> {
    return this.http.get<SuperAdmin[]>(`${this.baseUrl}/superadmins`);
  }

  getSuperAdminById(id: number): Observable<SuperAdmin> {
    return this.http.get<SuperAdmin>(`${this.baseUrl}/superadmin/${id}`);
  }

  createSuperAdmin(superAdmin: SuperAdmin): Observable<SuperAdmin> {
    return this.http.post<SuperAdmin>(`${this.baseUrl}/superadmin/create`, superAdmin);
  }

  deleteSuperAdmin(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/superadmin/${id}`);
  }
}
