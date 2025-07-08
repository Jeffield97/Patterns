import Observer.impl.Observer;
import Observer.impl.Subject;

public class Patrones {
    public static void main(String[] args) {
        System.out.println("========== OBSERVER ==========");
        Subject subject = new Subject();
        //Creamos los observadores
        Observer observer1 = new Observer("1");
        Observer observer2 = new Observer("2");
        Observer observer3 = new Observer("3");

        //Agregamos a los observer al subject
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        //Notificamos a los observadores
        subject.notifyObserver();

        subject.removeObserver("2");

        subject.notifyObserver();
    }


}
