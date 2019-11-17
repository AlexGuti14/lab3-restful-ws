package rest.addressbook.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * A really simple Address Book. This class is not thread safe.
 */
public class AddressBook {

  private int nextId = 1;
  private List<Person> personList = new ArrayList<>();

  //Constructors

  public AddressBook() {
  }
  
  public AddressBook(AddressBook a) {
    this.nextId = a.nextId;
    this.personList = new ArrayList<>(a.personList);
  }

  public AddressBook(int nextId, List<Person> personList) {
    this.nextId = nextId;
    this.personList = personList;
  }
  

  /**
   * The value of next unique identifier.
   *
   * @return the next unique identifier.
   */
  public int getNextId() {
    return nextId;
  }

  public void setNextId(int nextId) {
    this.nextId = nextId;
  }

  /**
   * The list of persons in this address book.
   *
   * @return a person list.
   */
  public List<Person> getPersonList() {
    return personList;
  }

  public void setPersonList(List<Person> persons) {
    this.personList = persons;
  }

  /**
   * Returns the old next identifier and increases the new value in one.
   *
   * @return an identifier.
   */
  public int nextId() {
    int oldValue = nextId;
    nextId++;
    return oldValue;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + nextId;
    result = prime * result + ((personList == null) ? 0 : personList.hashCode());
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
    AddressBook other = (AddressBook) obj;
    if (nextId != other.nextId)
      return false;
    if (personList == null) {
      if (other.personList != null)
        return false;
    } else if (!personList.equals(other.personList))
      return false;
    return true;
  }

}
