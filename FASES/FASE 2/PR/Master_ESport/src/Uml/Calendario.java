package src;

public class Calendario {
    private int[] equipos;
    private String[][] matriz1,matriz2,jornadas,jornadas2;
	
    public Calendario(int N){
            equipos = new int[N];
            for (int i=0;i<N;i++){
                    equipos[i] = i+1;
            }
            matriz1 = new String[N-1][N/2];
            matriz2 = new String[N-1][N/2];
            jornadas = new String[N-1][N/2]; 
            jornadas2 = new String[N-1][N/2];

            int cont = 0;
            int cont2 = N-2;

            for(int i=0;i<N-1;i++){
                    for(int j=0;j<N/2;j++){
                            matriz1[i][j] = String.valueOf(equipos[cont]);
                            cont++;
                            if(cont==(N-1)) cont=0;
                            if(j==0) matriz2[i][j] = String.valueOf(N);
                            else {
                                    matriz2[i][j] = String.valueOf(equipos[cont2]);
                                    cont2--;
                                    if(cont2==-1) cont2 = N-2;
                            }
                            if(j==0){
                                    if(i%2==0) jornadas[i][j] = matriz2[i][j] + "-" + matriz1[i][j] + " ";
                                    else jornadas[i][j] = matriz1[i][j] + "-" + matriz2[i][j] + " ";
                            }
                            else jornadas[i][j] = matriz1[i][j] + "-" + matriz2[i][j] + " ";
                            //segunda vuelta - al reves que la primera
                            if(j==0){
                                    if(i%2==0) jornadas2[i][j] = matriz1[i][j] + "-" + matriz2[i][j] + " ";
                                    else jornadas2[i][j] = matriz2[i][j] + "-" + matriz1[i][j] + " ";
                            }
                            else jornadas2[i][j] = matriz2[i][j] + "-" + matriz1[i][j] + " ";
                    }
            }
            
            int jorn = 1;
            for(int i=0;i<N-1;i++){
                    for(int j=0;j<N/2;j++){
                            System.out.print("J"+jorn+" "+jornadas[i][j]); 
                            if(j==(N/2)-1) System.out.println();
                    }
                    jorn++;
            }

            System.out.println();
            jorn = N;
            for(int i=0;i<N-1;i++){
                    for(int j=0;j<N/2;j++){
                            System.out.print("J"+jorn+" "+jornadas2[i][j]);
                            if(j==(N/2)-1) System.out.println();
                    }
                    jorn++;
            }
	}
	public static void main(String[] args) {
		new Calendario(10);
	}
	
}
