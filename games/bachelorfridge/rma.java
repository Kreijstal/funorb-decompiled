/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rma {
    static eaa field_d;
    String field_a;
    int field_b;
    static String field_c;

    final static kv[] a() {
        int discarded$0 = 1;
        int discarded$1 = 0;
        int discarded$2 = 1;
        int discarded$3 = 0;
        int discarded$4 = 1;
        int discarded$5 = 65793;
        int discarded$6 = 0;
        int discarded$7 = 5;
        int discarded$8 = 3;
        return ec.a();
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    public static void c() {
        field_c = null;
        field_d = null;
    }

    final static int b(int param0) {
        if (param0 != 1) {
            return 75;
        }
        return ud.field_p;
    }

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != 3332) {
          int discarded$2 = rma.b(-5);
          return new java.net.Socket(((rma) this).field_a, ((rma) this).field_b);
        } else {
          return new java.net.Socket(((rma) this).field_a, ((rma) this).field_b);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Creating your account";
        field_d = new eaa();
    }
}
