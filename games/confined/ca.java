/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends rk {
    static bi field_r;
    int[] field_p;
    int field_m;
    static String field_q;
    static int[] field_n;
    static Boolean field_o;
    static String field_s;

    public static void b(int param0) {
        field_r = null;
        if (param0 != -1635) {
            return;
        }
        field_s = null;
        field_q = null;
        field_o = null;
        field_n = null;
    }

    private ca() throws Throwable {
        throw new Error();
    }

    final static void c(int param0) {
        if ((da.field_h ^ -1) < -1) {
            ti.c(nl.field_c, nl.field_c + 64);
            nl.field_c = 64 + nl.field_c & 511;
            da.field_h = da.field_h - 64;
        }
        if (param0 != 511) {
            field_s = null;
        }
    }

    final static void a(int param0, int param1) {
        int discarded$4 = oc.b(1);
        if (param1 != -1856653215) {
            ca.a(19, -59);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_q = "CONFINED";
        field_n = new int[256];
        var1 = 0;
        L0: while (true) {
          if (var1 <= -257) {
            field_s = "Normal Difficulty";
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_n[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (-2 != (1 & var0)) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> -1856653215 ^ -306674912;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
