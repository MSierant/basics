package pl.jaksienauczyc.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
