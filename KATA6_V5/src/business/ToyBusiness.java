package business;

import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;
import toys.SerialNumberGenerator;

public abstract class ToyBusiness {
    final protected SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
    
 
    
    
    
}
