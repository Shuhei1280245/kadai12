class SubtractionDisplay implements Observer {
    public void update(subject:Subject){
       print(((concreteSubject).getHour())); 
    }

    private void print(int n){
        System.out.println(”ぽっぽー！”);
    }
}