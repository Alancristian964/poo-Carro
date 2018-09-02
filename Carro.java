
public class Carro {

    static float gas = 0f;
    static int pass = 0;
    float km = 0f;
    
    
    public void show(){
        System.out.printf("  pass: %d     gas: %.1fL     Km: %.1f\n",pass,gas,km);
    }   
    
    public void embarcar(){
        if(this.pass < 2){
            this.pass += 1;
            System.out.println("  done");
        }
        else{
            System.out.println("  fail: limite de pessoas atingido");
        }
    }
    
    public void desembarcar(){
        if(this.pass > 0){
            this.pass -= 1;
            System.out.println("  done");
        }
        else{
            System.out.println("  fail: nao ha ninguem no carro");
        }
        
    }
    
    public void abastecer(double x){
        if(this.gas==10){
        	System.out.println("Tanque está cheio");
        }


        else if(this.gas<10){
        this.gas += x;
        	System.out.println("  done");
        }
        
        if (this.gas > 10){
        this.gas = 10;
        }
        
    }
    public void andar(double x){
        
        if (this.pass==0){
            System.out.println("  fail: nao ha ninguem no carro");
        }
        
        else if ((x/10)>this.gas){
            System.out.println("  fail: gasolina insuficiente");
        }
        else{
            System.out.println("  done");
            this.km += x;
            this.gas -= (x*0.1);    
        
            
        } 
    }
}