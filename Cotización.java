package ProyectoConstructora;
import javax.swing.JOptionPane;

public class Cotización {
    public static void main(String[] args) {
        String i1 = "#  Tipo de construcción: ";//Indice 1: Tipo de construcción, los indices son para reducir texto repetitivo
        String i2 = "#  m2 a construir: ";
        String i3 = "#  Linea de construcción: ";
        String v1 = "#  El valor es de: $";
        double c1 = (45*299000);// 45m2 a construir de la linea standar
        

        int numero = Integer.parseInt(JOptionPane.showInputDialog("\n Digite una opción:\n"+" 1=Small       2=Medium        3=Big "));
        if(numero==1){
            JOptionPane.showInputDialog(null, "\n"+i1+" Small\n" + "\n Digite m2 a construir:\n" + "1=45m2     2=60m2      3=74m2");
            if (numero==1){
                JOptionPane.showInputDialog(null, "\n"+i1+" Small\n" + "\n"+i2+" 45m2\n" + "\n Digite la linea a construir:\n" + " 1=Standar       2=Premium        3=Country ");
                if (numero==1){
                    int adelanto = Integer.parseInt(JOptionPane.showInputDialog(null, "\n"+i1+" Small\n" + "\n"+i2+" 45m2\n" + "\n"+i3+"Standar " + "\n "+v1+"" + String.format("%.0f", c1) + "\n Si desea entregar un adelanto ingrese el monto, de lo contrario, ingrese 0"));
                    double a1 = (c1 - adelanto);//casa small - 45 m2 - Linea Standar - con adelanto
                    double sa1 = (c1 - adelanto);
                    
                    if (adelanto ==0){
                    JOptionPane.showInputDialog(null, "\n"+i1+" Small\n" + "\n"+i2+" 45m2\n" + "\n"+i3+"Standar " + "\n "+v1+"" + String.format("%.0f", c1) + "\n #  Debera abonar: $" + String.format("%.0f", sa1));
                    }
                    else{
                    JOptionPane.showInputDialog(null, "\n"+i1+" Small\n" + "\n"+i2+" 45m2\n" + "\n"+i3+"Standar " + "\n "+v1+"" + String.format("%.0f", c1) + "\n #  Debera abonar: $" + String.format("%.0f", a1));    
                    }
                       
                }
                    
                else if(numero==2){
                 JOptionPane.showInputDialog(null, "\n"+i1+" Medium\n" + "\n Digite m2 a construir:\n"+"1=70m2       2=88m2      3=103m2");
                }
                else if(numero==3){
                JOptionPane.showInputDialog(null, "\n"+i1+" Big\n" + "\n Digite m2 a construir:\n"+"1=73m2       2=92m2       3=120m2");
                }
                else{
                JOptionPane.showMessageDialog(null, "Elija una opción de construcción");
                }
            }
            else if(numero==2){
                JOptionPane.showInputDialog(null, "\n"+i1+" Small\n" + "\n"+i2+" 60m2\n" + "\n Digite la linea a construir:\n"+" 1=Standar       2=Premium        3=Country ");
            }
            else if(numero==3){
                JOptionPane.showInputDialog(null, "\n"+i1+" Small\n" + "\n"+i2+" 74m2\n" + "\n Digite la linea a construir:\n"+" 1=Standar       2=Premium        3=Country ");
            }
            else{
                JOptionPane.showMessageDialog(null, "Elija una linea de construcción");
            }
        }
        else if(numero==2){
            JOptionPane.showInputDialog(null, "\n"+i1+" Medium\n" + "\n Digite m2 a construir:\n"+"1=70m2       2=88m2      3=103m2");
        }
        else if(numero==3){
            JOptionPane.showInputDialog(null, "\n"+i1+" Big\n" + "\n Digite m2 a construir:\n"+"1=73m2       2=92m2       3=120m2");
        }
        else{
            JOptionPane.showMessageDialog(null, "Elija una opción de construcción");
        }
    }
}
