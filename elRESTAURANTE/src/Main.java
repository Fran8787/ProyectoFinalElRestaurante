//Proyecto Final

import AccesoData.MesaData;
import AccesoData.ProductoData;
import Entidades.Producto;
import java.util.List;


import AccesoData.ReservaData;
import Entidades.Mesa;

import java.util.List;




public class Main {    
    public static void main(String[] args) {
        
        
        
      MesaData meData = new MesaData();
      Mesa me = new Mesa();
      List<Mesa> listaMesas= null;
      
      listaMesas = meData.obtenerTodasLasMesas();
      


    }

}
