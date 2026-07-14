/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rh extends ca {
    int field_q;
    static dg field_r;
    static sc field_p;

    public static void c(int param0) {
        field_p = null;
        if (param0 > -86) {
            field_p = null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    final static int a(int param0, Random param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        if (-1 <= (param2 ^ -1)) {
          throw new IllegalArgumentException();
        } else {
          if (pa.a(param2, (byte) 65)) {
            return (int)((long)param2 * ((long)param1.nextInt() & 4294967295L) >> -2027364576);
          } else {
            var3 = -(int)(4294967296L % (long)param2) + -2147483648;
            if (param0 == 14817) {
              L0: while (true) {
                var4 = param1.nextInt();
                if (var3 > var4) {
                  return gk.a(var4, param2, (byte) 71);
                } else {
                  continue L0;
                }
              }
            } else {
              var5 = null;
              String discarded$1 = rh.a((sh) null, (byte) -41, (String) null, (String) null, (String) null);
              L1: while (true) {
                var4 = param1.nextInt();
                if (var3 > var4) {
                  return gk.a(var4, param2, (byte) 71);
                } else {
                  continue L1;
                }
              }
            }
          }
        }
    }

    abstract Object c(byte param0);

    abstract boolean d(byte param0);

    final static String a(sh param0, byte param1, String param2, String param3, String param4) {
        if (param1 <= 36) {
            return null;
        }
        if (!(param0.c(90))) {
            return param4;
        }
        return param3 + " - " + param0.b(param2, (byte) 115) + "%";
    }

    rh(int param0) {
        ((rh) this).field_q = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new dg();
        field_p = new sc();
    }
}
