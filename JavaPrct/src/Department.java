public class Department {

    private String Name;
    private String Position;
    private int id;


   public Department(String Name, String Position, int id) {
        this.Name = Name;
       this.Position = Position;
       this.id = id;

    }


   @Override
  public String toString() {
        return "პოზიციაზე " + Position + " მუშაობს " + Name + " მისი აიდი არის " + id;
  }


  @Override
    public boolean equals(Object obj) {

         if (obj == this) {
             return true;
         }
          if (!(obj instanceof Department)) {
              return false;
         }
         Department other = (Department) obj;
         return this.Name.equals(other.Name) &&
            this.Position.equals(other.Position)&&
                 this.id == other.id;
  }
}


