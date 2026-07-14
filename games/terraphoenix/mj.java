/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class mj {
    static String field_a;
    static String field_c;
    int field_b;
    String field_d;

    abstract java.net.Socket b(boolean param0) throws IOException;

    final static ci[] a(fa param0, int param1, int param2, boolean param3) {
        if (!vh.a(param1, param2, param0, param3)) {
            return null;
        }
        return uc.l(0);
    }

    final static void a(byte param0) {
        hj.field_K = null;
        wb.field_a = null;
        sb.field_m = null;
        ha.field_s = null;
        qc.field_b = null;
        if (param0 <= 68) {
            return;
        }
        rf.field_p = null;
    }

    final java.net.Socket a(boolean param0) throws IOException {
        if (!param0) {
          mj.a(28);
          return new java.net.Socket(((mj) this).field_d, ((mj) this).field_b);
        } else {
          return new java.net.Socket(((mj) this).field_d, ((mj) this).field_b);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 11147) {
            field_c = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You can press undo to cancel the last landing location.";
        field_a = "This password contains your email address, and would be easy to guess";
    }
}
