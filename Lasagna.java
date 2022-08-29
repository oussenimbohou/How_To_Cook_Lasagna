public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeRem){
        return 40 - timeRem;
}
    // TODO: define the 'preparationTimeInMinutes()' method
   public int preparationTimeInMinutes(int layer){
      return 2*layer;
}

    // TODO: define the 'totalTimeInMinutes()' method
   public int totalTimeInMinutes(int layer,int timeRem){
        return 2*layer + timeRem;
}
}
