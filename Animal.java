class Animal {
  public String mSpecies;
  public int mAge;
  public String mSize;
  public String mBreed;
  public String mColor;
  public int mPrice;
  public boolean mAdopted;

  public Animal(String species, int age, String size, String breed, String color, int price, boolean adopted) {
    mSpecies = species;
    mAge = age;
    mSize = size;
    mBreed = breed;
    mColor = color;
    mPrice = price;
    mAdopted = adopted;
  }


  public boolean worthBuying(int maxPrice){
    return (mPrice < maxPrice);
  }

  public boolean agePet(int maxAge){
    return (mAge < maxAge);
  }

  public boolean isAdopted(){
  return mAdopted = true;
  }

}
