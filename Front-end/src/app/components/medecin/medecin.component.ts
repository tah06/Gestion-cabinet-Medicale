import { Component } from '@angular/core';

@Component({
  selector: 'app-medecin',
  templateUrl: './medecin.component.html',
  styleUrls: ['./medecin.component.css']
})
export class MedecinComponent {
  medecins = [
    { id: 3, name: 'Dr. Alice Martin', email: 'alice.martin@example.com', phoneNumber: '0147852369', ONMM_Number: 'ONMM789012', yearsOfExperience: 8, specialite: 'Cardiologie' },
    { id: 4, name: 'Dr. Paul Lefebvre', email: 'paul.lefebvre@example.com', phoneNumber: '0765432109', ONMM_Number: 'ONMM345678', yearsOfExperience: 20, specialite: 'Dermatologie' },
    { id: 5, name: 'Dr. Claire Dubois', email: 'claire.dubois@example.com', phoneNumber: '0214567893', ONMM_Number: 'ONMM987654', yearsOfExperience: 12, specialite: 'Neurologie' },
    { id: 6, name: 'Dr. Lucas Fontaine', email: 'lucas.fontaine@example.com', phoneNumber: '0934567891', ONMM_Number: 'ONMM456789', yearsOfExperience: 5, specialite: 'Pédiatrie' },
    { id: 7, name: 'Dr. Emma Lefèvre', email: 'emma.lefevre@example.com', phoneNumber: '0123987456', ONMM_Number: 'ONMM123987', yearsOfExperience: 18, specialite: 'Gynécologie' }
  ];
  

  popupVisible: string | null = null; // La valeur initiale est null
  selectedMedecin: any = {};

  openPopup(popupType: string, medecin: any = null) {
    this.popupVisible = popupType;
    if (popupType === 'edit' && medecin) {
      this.selectedMedecin = { ...medecin };
    } else if (popupType === 'add') {
      this.selectedMedecin = { id: 0, name: '', email: '', phoneNumber: '', ONMM_Number: '', yearsOfExperience: 0, specialite: '' };
    } else if (popupType === 'delete' && medecin) {
      this.selectedMedecin = medecin;
    }
  }
  

  closePopup() {
    this.popupVisible = null;
  }

  saveMedecin() {
    console.log(this.selectedMedecin); // Vérifier que la spécialité est bien présente ici
    if (this.popupVisible === 'edit') {
      const index = this.medecins.findIndex(m => m.id === this.selectedMedecin.id);
      if (index !== -1) {
        this.medecins[index] = this.selectedMedecin;
      }
    } else if (this.popupVisible === 'add') {
      this.selectedMedecin.id = this.medecins.length + 1; // Génération d'un nouvel ID
      this.medecins.push(this.selectedMedecin);
    }
    this.closePopup();
  }
  


  deleteMedecin() {
    this.medecins = this.medecins.filter(m => m.id !== this.selectedMedecin.id);
    this.closePopup();
  }
}
