package alchemystar.freedom.config;

/**
 * SocketConfig
 *
 * @Author lizhuyang
 */
public interface SocketConfig {

    int FRONTEND_SOCKET_RECV_BUF = 4 * 1024 * 1024;
    int FRONTEND_SOCKET_SEND_BUF = 1024 * 1024;
    int BACKEND_SOCKET_RECV_BUF = 4 * 1024 * 1024;
    // mysql 5.6
    int BACKEND_SOCKET_SEND_BUF = 1024 * 1024;
    int CONNECT_TIMEOUT_MILLIS = 5000;
    int SO_TIMEOUT =  10 * 60;
}
