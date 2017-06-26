class Animal {
  public String mSpecies;
  public Integer mAge;
  public String mSize;
  public String mBreed;
  public String mColor;
  public Integer mPrice;
  public boolean mAdopted;

  public Animal(String species, Integer age, String size, String breed, String color, Integer price) {
    mSpecies = species;
    mAge = age;
    mSize = size;
    mBreed = breed;
    mColor = color;
    mPrice = price;
    mAdopted = false;
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
