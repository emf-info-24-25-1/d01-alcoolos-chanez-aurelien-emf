package app;

public class Application {
        public static void main(String[] args) {
                Ami ami1 = new Ami("Forneraud", "Aurélein", 2);
                Ami ami2 = new Ami("Marmy", "Théo", 15);
                Ami ami3 = new Ami("Duc", "Gabriel", 5);

                while (ami1.getNombreBièresSupportables() == 0 && ami2.getNombreBièresSupportables() == 0
                                && ami3.getNombreBièresSupportables() == 0) {

                        System.out.println("Nombre de bières supportables pour " + ami1.getPrenom() + " "
                                        + ami1.getNom() + " : " + ami1.getNombreBièresSupportables());
                        System.out.println("Nombre de bières supportables pour " + ami2.getPrenom() + " "
                                        + ami2.getNom() + " : " + ami2.getNombreBièresSupportables());
                        System.out.println("Nombre de bières supportables pour " + ami3.getPrenom() + " "
                                        + ami3.getNom() + " : " + ami3.getNombreBièresSupportables());

                        ami1.boitUneBière();
                        ami2.boitUneBière();
                        ami3.boitUneBière();
                }
        }
}
