import { Component } from '@angular/core';

@Component({
  selector: 'app-materiel',
  templateUrl: './materiel.component.html',
  styleUrls: ['./materiel.component.css']
})
export class MaterielComponent {
  materiels = [
    {
      id: 2, 
      type: 'Ultrasound Scanner', 
      manufacturer: 'GE Healthcare', 
      model: 'Logiq E9', 
      serialNumber: '789XYZ123', 
      purshaseDate: new Date('2019-06-20'), 
      nextMaintenanceDate: new Date('2022-06-15') 
    },
    {
      id: 3, 
      type: 'Defibrillator', 
      manufacturer: 'Zoll', 
      model: 'R Series', 
      serialNumber: '456LMN789', 
      purshaseDate: new Date('2021-03-12'), 
      nextMaintenanceDate: new Date('2023-03-01')
    },
    {
      id: 4, 
      type: 'Blood Pressure Monitor', 
      manufacturer: 'Omron', 
      model: 'HEM-907XL', 
      serialNumber: '321PQR654', 
      purshaseDate: new Date('2018-09-25'), 
      nextMaintenanceDate: new Date('2021-09-10')
    },
    {
      id: 5, 
      type: 'Infusion Pump', 
      manufacturer: 'Baxter', 
      model: 'Syringe Pump', 
      serialNumber: '654STU321', 
      purshaseDate: new Date('2022-02-18'), 
      nextMaintenanceDate: new Date('2023-02-12')
    },
    {
      id: 6, 
      type: 'Ventilator', 
      manufacturer: 'Dräger', 
      model: 'Evita V300', 
      serialNumber: '987VWX654', 
      purshaseDate: new Date('2020-11-05'), 
      nextMaintenanceDate: new Date('2023-11-02')
    }
  ];

  // Liste des types et fabricants pour les menus déroulants
  types = [
    'Ultrasound Scanner',
    'Defibrillator',
    'Blood Pressure Monitor',
    'Infusion Pump',
    'Ventilator'
  ];

  manufacturers = [
    'GE Healthcare',
    'Zoll',
    'Omron',
    'Baxter',
    'Dräger'
  ];

  popupVisible: string | null = null;
  selectedMateriel: any = {};

  openPopup(popupType: string, materiel: any = null) {
    this.popupVisible = popupType;
    if (popupType === 'edit' && materiel) {
      this.selectedMateriel = { ...materiel };
    } else if (popupType === 'add') {
      this.selectedMateriel = { id: 0, type: '', manufacturer: '', model: '', serialNumber: '', purshaseDate: null, nextMaintenanceDate: null };
    } else if (popupType === 'delete' && materiel) {
      this.selectedMateriel = materiel;
    }
  }

  closePopup() {
    this.popupVisible = null;
  }

  saveMateriel() {
    if (this.popupVisible === 'edit') {
      const index = this.materiels.findIndex(m => m.id === this.selectedMateriel.id);
      if (index !== -1) {
        this.materiels[index] = this.selectedMateriel;
      }
    } else if (this.popupVisible === 'add') {
      this.selectedMateriel.id = this.materiels.length + 1;
      this.materiels.push(this.selectedMateriel);
    }
    this.closePopup();
  }

  deleteMateriel() {
    this.materiels = this.materiels.filter(m => m.id !== this.selectedMateriel.id);
    this.closePopup();
  }
}
