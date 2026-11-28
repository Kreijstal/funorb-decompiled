/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    static IntrusiveDeque field_b;
    int field_e;
    static AccountServiceResult field_c;
    String field_d;
    static int field_a;

    public static void clearStaticReferences(int param0) {
        if (param0 != 22085) {
          SocketConnector.clearStaticReferences(-72);
          field_b = null;
          field_c = null;
          return;
        }
        field_b = null;
        field_c = null;
    }

    final java.net.Socket openDirectSocket(boolean param0) throws IOException {
        if (param0) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_d, this.field_e);
    }

    final static java.awt.Container a(byte param0) {
        int var1 = -65 % ((69 - param0) / 53);
        if (null != SoundCache.field_h) {
          return (java.awt.Container) ((Object) SoundCache.field_h);
        }
        return (java.awt.Container) ((Object) DiskCacheWorker.b(0));
    }

    abstract java.net.Socket openSocket(int param0) throws IOException;

    static {
    }
}
