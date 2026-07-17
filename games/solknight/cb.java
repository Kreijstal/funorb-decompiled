/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb extends IOException {
    static int field_a;
    static String field_b;

    public static void a(int param0) {
        int var1 = 0;
        field_b = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (i.field_J != null) {
          var1 = (Object) (Object) i.field_J;
          synchronized (var1) {
            L0: {
              i.field_J = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void b(int param0) {
        ce.field_f = null;
        if (param0 != 32) {
            return;
        }
        rc.field_r = null;
    }

    cb(String param0) {
        super(param0);
    }

    final static void b(byte param0) {
        int var1 = 0;
        if (wc.field_a < 224) {
          var1 = wc.field_a % 32;
          ah.a((byte) -69, 32 + (wc.field_a - var1));
          return;
        } else {
          ah.a((byte) -103, 256);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Age:";
    }
}
