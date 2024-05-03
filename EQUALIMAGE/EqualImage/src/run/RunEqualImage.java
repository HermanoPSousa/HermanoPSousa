
package run;


import java.awt.EventQueue;
import javax.swing.UIManager.LookAndFeelInfo;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import view.EqualImage;

/**
 * @NAME....................: RunEqualImage.java
 * @AUTHOR..................: Hermano Pereira de Sousa
 * @COMPANY.................: Systems Development Center
 * @DATE CREATE.............: 3 de mai. de 2024,11:27:56
 * @DATE REFORMULATION......:
 * @DATE END OF DEVELOPMENT.:
 * @DATE MAINTENANCE........: 
 * @OBJECTIVE...............: 
 */
public class RunEqualImage {

    /**
     * 
     * @param args 
     * @método: main()
     * @objetivo: executar o sistema.
     */
    public static void main(String[] args){
        for(LookAndFeelInfo info : getInstalledLookAndFeels()){
            if("nimbus".equals(info.getName())){
                try{
                    setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex){
                    
                }
                break;
            }
            
        }
        
        EventQueue.invokeLater(() -> {
            new EqualImage().setVisible(true);
        });
    }    
} // end of class RunEqualImage
