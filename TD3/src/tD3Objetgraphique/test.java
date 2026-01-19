package tD3Objetgraphique;
import javax.swing.*;  // مكتبة النوافذ
import java.awt.*;     // مكتبة الرسوم
public class test extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ObjetGraphique[] objets; // المصفوفة ديال الكائنات

    public test(ObjetGraphique[] objets) {
        this.objets = objets;
        setTitle("Test Objets Graphiques"); // عنوان النافذة
        setSize(400, 400);                  // الحجم ديال النافذة
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);                   // خلي النافذة تظهر
    }

    // هنا غادي نرسم الكائنات
    @Override
    public void paint(Graphics g) {
        super.paint(g); // يرسم النافذة أولا
        for (ObjetGraphique obj : objets) {
            obj.tracer(g); // كل كائن يرسم نفسه
        }
    }
	public static void main(String[] args) {
		ObjetGraphique[] objets =new ObjetGraphique[3];
		objets[0]=new Cercle(30,40,50);
		objets[1]=new Rectangle(100,150,50,70);
		objets[2]=new Bouton(100,140,85,60,"haha");
		new test(objets); // نخلق النافذة ونرسم الكائنات
	}

}
