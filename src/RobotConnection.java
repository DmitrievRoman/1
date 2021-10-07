public interface RobotConnection extends AutoCloseable{
    void moveRobotTo(int x, int y) throws RobotConnectionException;

    @Override
    default void close() throws Exception {

    }
}
