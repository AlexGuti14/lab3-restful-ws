package rest.addressbook.domain;

/**
 * A phone number
 */
public class PhoneNumber {

  private String number;
  private PhoneType type = PhoneType.HOME;

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PhoneType getType() {
    return type;
  }

  public void setType(PhoneType type) {
    this.type = type;
  }


  
  public PhoneNumber() {
  }

  public PhoneNumber(String number, PhoneType type) {
    this.number = number;
    this.type = type;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((number == null) ? 0 : number.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    PhoneNumber other = (PhoneNumber) obj;
    if (number == null) {
      if (other.number != null)
        return false;
    } else if (!number.equals(other.number))
      return false;
    if (type != other.type)
      return false;
    return true;
  }

}
