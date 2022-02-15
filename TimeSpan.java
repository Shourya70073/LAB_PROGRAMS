class TimeSpan{
    private int hours;
    private int minutes;
    
    public TimeSpan(int hours,int minutes){
        this.hours=hours;
        this.minutes=minutes;
       
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    
    public void add(int hours,int minutes){
        this.hours+=hours;
        this.minutes+=minutes;
        int extraHours=this.minutes/60;
        this.minutes=this.minutes%60;
        this.hours+=extraHours;
    }
    public void add(TimeSpan obj){
        add(obj.hours,obj.minutes);
    }
    public double getTotalHours(){
        double total=hours+(minutes/60.0);
        return total;
    }
    public String toString(){
        return hours + "h"+ minutes + "m";
    }
    public static void main (String[] args) {
        TimeSpan obj1=new TimeSpan(2,60);
        TimeSpan obj2=new TimeSpan(3, 45 );
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        obj1.add(obj2);
        System.out.println("After adding: "+ obj1.toString());
      
    } }
