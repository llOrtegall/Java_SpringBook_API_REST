package ortega.inyeccion.example.models;

public class Products implements Cloneable {
  private Long idProduct;
  private String name;
  private String description;
  private Double price;

  public Products(Long idProduct, String name, String description, Double price) {
    this.idProduct = idProduct;
    this.name = name;
    this.description = description;
    this.price = price;
  }

  public Long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(Long idProduct) {
    this.idProduct = idProduct;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public Object clone() {
    try {
      return super.clone();
    } catch (CloneNotSupportedException e) {
      return new Products(idProduct, name, description, price);
    }
  }

}
