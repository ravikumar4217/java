public class EnumDemo {
    public enum Season{ SUMMER,WINTER,SPRING,FALL}
        public enum Week{ SUNDAY,MONDAY,TUESDAY,WEDNEWDAY,THURSDAY,FRIDAY,SATURDAY}
        public static void main(String args[]) {
            System.out.println("The values of season are : ");
            for(Season s:Season.values())
            {
                System.out.println(s);
            }
             for(Week w:Week.values())
            {
                System.out.println(w);
            }
        }
}
