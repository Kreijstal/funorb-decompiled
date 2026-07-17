/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class va extends IOException {
    static int field_c;
    static ko field_b;
    static String field_a;
    static int field_d;

    va(String param0) {
        super(param0);
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
    }

    final static void a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = CrazyCrystals.field_B;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= md.field_k.length) {
                break L0;
              } else {
                L2: {
                  if (field_c == var1_int) {
                    if (-33 > md.field_k[var1_int]) {
                      md.field_k[var1_int] = md.field_k[var1_int] + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    if (-1 > md.field_k[var1_int]) {
                      md.field_k[var1_int] = md.field_k[var1_int] - 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "va.A(" + 127 + 41);
        }
    }

    final static int a(int param0, int param1) {
        return nb.field_c[2047 & param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You have 1 unread message!";
    }
}
