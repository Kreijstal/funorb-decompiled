/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tl extends IOException {
    static boolean field_b;
    static int field_a;
    static int field_c;
    static volatile boolean field_d;

    tl(String param0) {
        super(param0);
    }

    final static boolean a(pf param0, byte param1, int param2, int param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = param0.a(param3, 16, param2);
        var4 = var5;
        if (param1 == -5) {
          if (var5 == null) {
            return false;
          } else {
            mb.a(0, var5);
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
    }
}
