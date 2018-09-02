
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){
        Carro c = new Carro();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        
        System.out.println("\n		OS COMANDOS SÃO:\n\n 	in    ---- Para embarcar passageiros\n 	out   ---- Para desembarcar passageiros\n 	fuel  ---- para adicionar combustivel\n        show  ---- para mostrar detalhes\n 	drive ---- para andar\n\n");
      
        
        while (true){
            
            String[] comando;
            comando = sc.nextLine(). split(" ");
            
            if(comando[0].equals("sair")){
            System.out.println("  Até a proxima :)");
            break;
            }   
            switch(comando[0]){ 
            case("show"):
                c.show();
                break;
            case("in"):
                c.embarcar();
                break;
            case("out"):
                c.desembarcar();
                break;
            case("fuel"):
                c.abastecer(Double.parseDouble(comando[1]));
                 break;
            case("drive"):
                c.andar(Double.parseDouble(comando[1]));
                break;
            default:
		      System.out.println("  Tente novamente :(");
                  
            }
        }
    }
}