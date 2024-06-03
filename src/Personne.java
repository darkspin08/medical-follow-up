public class Personne {

        private String nom;
        private int age;
        private String sexe;
        private double taille;
        private double poids;

        public Personne(String nom, int age, String sexe, double taille, double poids) {
            this.nom = nom;
            this.age = age;
            this.sexe = sexe;
            this.taille = taille;
            this.poids = poids;
        }

        // Getters et Setters

        public String getNom() {
            return nom;
        }

        public int getAge() {
            return age;
        }

        public String getSexe() {
            return sexe;
        }

        public double getTaille() {
            return taille;
        }

        public double getPoids() {
            return poids;
        }

        public String calculerIMC() {
            double imc = poids / (taille * taille);
            if (imc < 18.5) {
                return "Vous êtes en sous-poids.";
            } else if (imc >= 18.5 && imc < 24.9) {
                return "Vous avez un poids normal.";
            } else if (imc >= 25 && imc < 29.9) {
                return "Vous êtes en surpoids.";
            } else {
                return "Vous êtes obèse.";
            }
        }
    }
