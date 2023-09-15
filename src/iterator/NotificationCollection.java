package iterator;

public class NotificationCollection implements Collection{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notificationList;

    public NotificationCollection(){
        notificationList = new Notification[MAX_ITEMS];
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String str){
        Notification notification = new Notification(str);
        // Verifica si la lista esta llena
        if (numberOfItems >= MAX_ITEMS){
            System.err.println("Full");
        }
        else{
            // Agrega la nueva notificacion a la lista en la posicion 
            notificationList[numberOfItems] = notification;
            // Incremento contador de items
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator(){
        return new NotificationIterator(notificationList);
    }

}
