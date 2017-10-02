import javafx.application.Application;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
/**
 *To learn how to use If... Else.
 *Author: Zhonglin Yang
 *E-mail Address: zy2708@email.vccs.edu
 *Last Changed: October 2, 2017
 */
public class IfElse extends Application
{	@Override
public void start(Stage primarystage)
{
    TextInputDialog textinputdialog=new TextInputDialog("1 or 2");
    textinputdialog.setTitle("print vs printf demo");
    textinputdialog.setContentText("Select 1 for print or select 2 for printf demo");
    Optional<String> input=textinputdialog.showAndWait();
    String option=input.get();//declare option
    if(option.equals("1"))//When input is 1
    {
        System.out.println("You selected option 1 ");
    }
    else if(option.equals("2"))//When input is 2, output is printf
    {
        System.out.printf("\n"+"Hello %s ","Yang");
        System.out.printf("\n"+"Charcters: %c",65);
        System.out.printf("\n"+"Decimals: %d",1998);
        System.out.printf("\n"+"Exponents: %e",3.1415926);
        System.out.printf("\n"+"Float: %f",3.1415926);
    }

}
}