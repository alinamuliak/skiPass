package idGenerator;

public class IdGenerator {
        static int id;
        public static int createId() {
            id++;
            return id;
        }
}
