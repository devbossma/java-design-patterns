package ma.devboss.JDP.creational.singleton;

    public final class Singleton {

        // L'utilisation du mot clé volatile, en Java version 5 et supérieure,
        // empêche les effets de bord dus aux copies locales de l'instance qui peuvent être modifiées dans le thread principal.
        // De Java version 1.2 à 1.4, il est possible d'utiliser la classe ThreadLocal.
        private static volatile Singleton instance = null;



        /**
         * Constructeur de l'objet.
         */
        private Singleton() {
            // La présence d'un constructeur privé supprime le constructeur public par défaut.
            // De plus, seul le singleton peut s'instancier lui-même.
            super();
        }

        /**
         * Méthode permettant de renvoyer une instance de la classe Singleton
         * @return Retourne l'instance du singleton.
         */
        public final static Singleton getInstance() {
            //Le "Double-Checked Singleton"/"Singleton doublement vérifié" permet
            //d'éviter un appel coûteux à synchronized,
            //une fois que l'instanciation est faite.
            if (Singleton.instance == null) {
                // Le mot-clé synchronized sur ce bloc empêche toute instanciation
                // multiple même par différents "threads".
                // Il est TRES important.
                synchronized(Singleton.class) {
                    if (Singleton.instance == null) {
                        Singleton.instance = new Singleton();
                    }
                }
            }
            return Singleton.instance;
        }

        // D'autres méthodes classiques et non "static".
        public void doSomething(){
            System.out.println("Singleton.doSomething");

        }

    }

