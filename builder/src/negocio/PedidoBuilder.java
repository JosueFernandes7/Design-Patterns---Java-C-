package negocio;

import java.util.ArrayList;
import java.util.Random;

public class PedidoBuilder {

      private int id;
      private Cliente cliente;
      private Vendedor vendedor;
      private ArrayList<Item> items;
      
      public PedidoBuilder(){}

      public void generateRandomId(){
        this.id = this.cliente.getId() + this.vendedor.getId() + (int)this.vendedor.getInicio().toEpochDay() * new Random().nextInt(1000);
      }
      public PedidoBuilder vendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
      }
      public PedidoBuilder cliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
      }
      public PedidoBuilder items(ArrayList<Item> items) {
        this.items = items;
        return this;
      }

      public Pedido build(){
        generateRandomId(); // gera um id aleatorio antes do build
        return new Pedido(this.id,this.cliente, this.vendedor, this.items);
      }
}
