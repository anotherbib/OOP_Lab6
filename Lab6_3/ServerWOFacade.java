public class ServerWOFacade {
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
        FacadeServer facade = new FacadeServer(scheduleServer);
        facade.startServer();
        facade.stopServer();
    }
    
}
