package org.adapter;

public class Driver {
    public static void main(String[] args) {
        Socket socket = new Socket();
        SocketAdapter adapter = new SocketAdapterImpl(socket);
        System.out.println(adapter.get12V());
    }
}
