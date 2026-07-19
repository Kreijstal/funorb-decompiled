/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class n {
    String field_b;
    static int field_d;
    static String field_e;
    static bi field_a;
    int field_c;

    final static be a(int param0) {
        be discarded$0 = null;
        if (param0 != 21146) {
            discarded$0 = n.a(124);
            return hb.field_r;
        }
        return hb.field_r;
    }

    final java.net.Socket c(int param0) throws IOException {
        if (param0 != -8463) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_b, this.field_c);
    }

    abstract java.net.Socket b(int param0) throws IOException;

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 < 112) {
            field_a = (bi) null;
        }
    }

    static {
        field_e = "Secret achievement";
    }
}
