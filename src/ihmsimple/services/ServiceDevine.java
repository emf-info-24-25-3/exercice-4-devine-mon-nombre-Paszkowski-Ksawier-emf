package ihmsimple.services;

import java.lang.ModuleLayer.Controller;

/**
 * Classe représentant le service de l'application MVC "IhmSimple".
 * 
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 29.10.2023
 * @version 1.0.0
 */
public class ServiceDevine {
    /**
     * Nombre maximum que l'utilisateur peut proposer.
     */
    public final int MAX = 100;
    
    /**
     * Nombre minimum que l'utilisateur peut proposer.
     */
    public final int MIN = 1;
    
    /**
     * Valeur retournée par la méthode lireValeurProposee() si ce qui a été saisi
     * par l'utilisateur n'est pas convertible
     * en un entier.
     */
    public final static int NOMBRE_INVALIDE = -1;

    /**
     * Référence au contrôleur de l'application.
     */
    private Controller refCtrl;

    /**
     * Constructeur du service.
     * Comme toujours, le travail N°1 consiste à initialiser TOUS nos attributs :-).
     * Pour la référence au contrôleur, vous devez à présent savoir quelle valeur
     * initiale donner.
     */
    public ServiceDevine() {
        this.refCtrl = null;
    }

    /**
     * Invente et retourne un nouveau nombre à deviner aléatoirement choisi entre
     * les limites tolérées pour ce jeu.
     * 
     * @return le nombre à deviner aléatoirement choisi
     */
    public int penserAUnNombre() {
        return (int) (Math.random() * (MAX - MIN + 1)) + MIN;
    }

    /**
     * Retourne la référence au contrôleur de l'application.
     * 
     * @param ctrl la référence au contrôleur de l'application
     */
    public void setRefCtrl(ihmsimple.ctrl.Controller ctrl) {
        this.refCtrl = refCtrl;
    }

    /**
     * Retourne la référence au contrôleur de l'application.
     * 
     * @return la référence au contrôleur de l'application
     */
    public Controller getRefCtrl() {
        return refCtrl;
    }

}
