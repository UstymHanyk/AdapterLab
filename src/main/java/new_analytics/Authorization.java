package new_analytics;

public class Authorization {
    public boolean authorize(DataBase db) {
        db.getUserData();
        return true;
    }
}
