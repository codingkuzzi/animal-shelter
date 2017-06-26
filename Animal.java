class Animal {
  public String mSpecies;
  public int mAge;
  public String mSize;
  public String mBreed;
  public String mColor;
  public int mPrice;

  public boolean worthBuying(int maxPrice){
    return (mPrice < maxPrice);
  }

  public boolean agePet(int maxAge){
    return (mAge < maxAge);
  }
}
