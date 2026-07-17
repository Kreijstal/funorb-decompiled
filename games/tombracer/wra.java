/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wra extends IOException {
    static String field_b;
    static String field_a;

    wra(String param0) {
        super(param0);
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (db.field_h.field_c.length <= var1_int) {
                break L0;
              } else {
                db.field_h.field_c[var1_int] = vba.field_x[var1_int];
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "wra.A(" + 0 + 41);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Public";
    }
}
