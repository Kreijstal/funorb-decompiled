/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class hk {
    int field_c;
    String field_b;
    static qj[] field_a;
    static int field_d;

    final static int a(CharSequence param0, int param1) {
        int var4 = 0;
        int var5 = TrackController.field_F ? 1 : 0;
        int var2 = param0.length();
        int var3 = param1;
        for (var4 = 0; var2 > var4; var4++) {
            var3 = hj.a(param0.charAt(var4), (byte) -124) + (-var3 + (var3 << -972512891));
        }
        return var3;
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != 0) {
          ((hk) this).field_c = -46;
          return new java.net.Socket(((hk) this).field_b, ((hk) this).field_c);
        } else {
          return new java.net.Socket(((hk) this).field_b, ((hk) this).field_c);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -19) {
            Object var2 = null;
            int discarded$0 = hk.a((CharSequence) null, 33);
        }
    }

    abstract java.net.Socket c(int param0) throws IOException;

    static {
    }
}
