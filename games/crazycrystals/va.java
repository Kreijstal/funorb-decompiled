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
        if (!param0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
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
                L2: {
                  if (param0 >= 15) {
                    break L2;
                  } else {
                    va.a(false);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (field_c == var1_int) {
                    if (-33 < (md.field_k[var1_int] ^ -1)) {
                      md.field_k[var1_int] = md.field_k[var1_int] + 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    if (-1 > (md.field_k[var1_int] ^ -1)) {
                      md.field_k[var1_int] = md.field_k[var1_int] - 1;
                      break L3;
                    } else {
                      break L3;
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
          throw dn.a((Throwable) ((Object) var1), "va.A(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != 2047) {
            va.a(11);
        }
        return nb.field_c[2047 & param1];
    }

    static {
        field_a = "You have 1 unread message!";
    }
}
