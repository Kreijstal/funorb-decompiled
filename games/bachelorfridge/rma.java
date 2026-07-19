/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rma {
    static eaa field_d;
    String field_a;
    int field_b;
    static String field_c;

    final static kv[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 3) {
          field_c = (String) null;
          return ec.a(3, 5, param3, param1, 1, param4, 1, param0, 1);
        } else {
          return ec.a(3, 5, param3, param1, 1, param4, 1, param0, 1);
        }
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    public static void c(int param0) {
        field_c = null;
        if (param0 != 1) {
            field_d = (eaa) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static int b(int param0) {
        if (param0 != 1) {
            return 75;
        }
        return ud.field_p;
    }

    final java.net.Socket a(int param0) throws IOException {
        int discarded$2 = 0;
        if (param0 != 3332) {
          discarded$2 = rma.b(-5);
          return new java.net.Socket(this.field_a, this.field_b);
        } else {
          return new java.net.Socket(this.field_a, this.field_b);
        }
    }

    static {
        field_c = "Creating your account";
        field_d = new eaa();
    }
}
