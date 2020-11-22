////W istniejącej klasie Car utwórz statyczną metodę przyjmującą tablicę obiektów klasy Car i zwracającą największy obiekt tej tablicy.
////        Obiekt Car jest większy od drugiego obiektu jeśli jego maxSpeed jest większa. Jeśli maxSpeed są równe większy jest ten obiekt,
////        którego acceleration jest większe.
////
////        W przypadku, kiedy wejściowa tablica jest pusta, wyrzuć wyjątek typu IllegalStateException z informacją "Bad array size".
//
//
//public class Car {
//    private int maxSpeed;
//    private int acceleration;
//
//    public static Car getMax(Car[] cars) {
//        int max = cars[0].maxSpeed;
//        for (Car car : cars) {
//            if (max < car.maxSpeed) {
//                max = car.maxSpeed;
//            }else if(max == car.maxSpeed){
//                if (){
//
//                }
//            }
//
//        }
//
//        return null;
//    }
//
//    public Car(int maxSpeed, int acceleration) {
//        this.maxSpeed = maxSpeed;
//        this.acceleration = acceleration;
//    }
//
//    @Override
//    public String toString() {
//        return "Car with maxSpeed=" + maxSpeed + " and acceleration=" + acceleration;
//    }
//
//}
//
//
//
