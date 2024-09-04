#### **26. Système de Gestion des Méthodes de Paiement**

- **Description :** Créez une application pour gérer différentes méthodes de paiement avec ajout de cartes, validation des transactions, et gestion des factures.
- **Classes :**
  - **CarteBancaire :** Représente une carte bancaire ajoutée par un utilisateur.
    - `validerCarte()`: Valide les informations de la carte bancaire auprès de la banque émettrice.
    - `effectuerPaiement(double montant)`: Effectue un paiement en utilisant la carte bancaire.
  - **Facture :** Représente une facture à régler par l'utilisateur.
    - `générerFacture()`: Génère une facture pour un achat ou un service rendu.
    - `afficherDétails()`: Affiche les détails de la facture, y compris le montant et la date d'échéance.
  - **Utilisateur :** Représente un utilisateur qui effectue des paiements.
    - `ajouterCarte(CarteBancaire carte)`: Ajoute une carte bancaire à son compte pour effectuer des paiements.
    - `consulterFactures()`: Affiche toutes les factures en attente de paiement.
  - **SystèmePaiement :** Représente le système de gestion des paiements.
    - `validerTransaction(CarteBancaire carte, double montant)`: Valide une transaction avant de l'autoriser.
    - `générerRapportTransactions()`: Génère un rapport des transactions effectuées par les utilisateurs.
  
- **Logique :**
  - La classe `CarteBancaire` gère la validation des cartes et l'exécution des paiements.
  - La classe `Facture` gère la génération et l'affichage des factures à payer.
  - La classe `Utilisateur` permet aux utilisateurs d'ajouter des cartes bancaires et de consulter leurs factures.
  - La classe `SystèmePaiement` gère la validation des transactions et la génération de rapports des paiements effectués.

---
