/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class oa {
    static bc field_b;
    int field_e;
    static rg field_c;
    String field_d;
    static int field_a;

    public static void a(int param0) {
        if (param0 != 22085) {
            oa.a(-72);
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final java.net.Socket a(boolean param0) throws IOException {
        if (param0) {
            return null;
        }
        return new java.net.Socket(((oa) this).field_d, ((oa) this).field_e);
    }

    final static java.awt.Container a() {
        int var1 = 0;
        if (!(null == i.field_h)) {
            return (java.awt.Container) (Object) i.field_h;
        }
        return (java.awt.Container) (Object) vi.b(0);
    }

    abstract java.net.Socket b(int param0) throws IOException;

    static {
    }
}
