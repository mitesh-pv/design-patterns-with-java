package org.adapter;

public class SocketAdapterImpl implements SocketAdapter {
    private Socket socket;

    public SocketAdapterImpl(Socket socket) {
        this.socket = socket;
    }

    @Override
    public String get12V() {
        return convertSocketVolts("12V");
    }

    @Override
    public String get120V() {
        return convertSocketVolts("120V");
    }

    @Override
    public String get3V() {
        return convertSocketVolts("3V");
    }

    private String convertSocketVolts(String mockVolt) {
        return mockVolt;
    }
}
