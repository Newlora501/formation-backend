#### **Projet 3: Gestion d'une École
- **Description :** Développer une application pour gérer les étudiants et les cours dans une école.
Les étudiants peuvent être inscrits à des cours, et les notes peuvent être attribuées.
- **Collections utilisées:** ArrayList , HashSet , LinkedHashMap .
- **Explication:**
    • ArrayList pour stocker les étudiants inscrits dans un cours.
    • HashSet pour assurer l'unicité des cours.
    • LinkedHashMap pour associer les étudiants aux notes dans un ordre d'insertion.
    Logique:
    • enrollStudent inscrit un étudiant à un cours, vérifie s'il est déjà inscrit via le
    HashSet .
    • assignGrade attribue une note à un étudiant dans un cours via LinkedHashMap .
    • listStudentsInCourse affiche les étudiants inscrits dans un cours en utilisant
    ArrayList