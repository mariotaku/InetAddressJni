package org.mariotaku.inetaddrjni.library;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.net.InetAddress;

public class InetAddressUtils {

    static {
        System.loadLibrary("inetaddress");
    }

    private InetAddressUtils() {
        throw new AssertionError("Trying to instantiate this class");
    }

    /**
     * @param input IP address in string
     * @return type corresponding to &lt;sys/socket.h&gt;
     */
    public native static int getInetAddressType(final String input);

    @Nullable
    public native static InetAddress getResolvedIPAddress(@Nullable final String host, @NonNull final String address);
}