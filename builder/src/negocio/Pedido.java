package negocio;

import java.util.ArrayList;

// classe de Pedido
public class Pedido {
    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Item> items;

    public Pedido(int id,Cliente cliente, Vendedor vendedor, ArrayList<Item> items) {
      this.id = id;
      this.cliente = cliente;
      this.vendedor = vendedor;
      this.items = items;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public Cliente getCliente() {
      return cliente;
    }

    public void setCliente(Cliente cliente) {
      this.cliente = cliente;
    }

    public Vendedor getVendedor() {
      return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
      this.vendedor = vendedor;
    }

    public ArrayList<Item> getItems() {
      return items;
    }

    public void setItems(ArrayList<Item> items) {
      this.items = items;
    }

    @Override
    public String toString() {
      return "Pedido [id=" + id + ", cliente=" + cliente + ", vendedor=" + vendedor + ", items=" + items + "]";
    }
    
    
}