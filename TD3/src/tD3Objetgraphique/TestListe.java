package tD3Objetgraphique;
import javax.swing.*;
import java.awt.*;

public class TestListe extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ListeObjetGraphique liste; // اللائحة ديال الكائنات الرسومية

    public TestListe(ListeObjetGraphique liste) {
        this.liste = liste;
        setTitle("Test Liste Objets Graphiques");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // دالة الرسم
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        liste.tracerObjetsGraphique(g); // نرسم جميع الكائنات داخل اللائحة
    }

    public static void main(String[] args) {
        // إنشاء لائحة فيها حتى لـ 10 كائنات
        ListeObjetGraphique liste = new ListeObjetGraphique(10);

        // نضيف بعض الكائنات المختلفة
        liste.ajouter(new Cercle(100, 100, 50));
        liste.ajouter(new Rectangle(200, 150, 100, 60));
        liste.ajouter(new Bouton(250, 300, 120, 50, "OK"));
        liste.ajouter(new Bouton(50, 250, 100, 40, "Annuler"));

        // إنشاء النافذة وعرض الكائنات
        new TestListe(liste);
    }
}