/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends gn {
    static String field_h;
    int field_j;
    static String field_m;
    int field_g;
    int field_f;
    int field_i;
    static int field_l;
    int field_e;
    int field_k;

    final static void b(int param0) {
        int var1_int = 0;
        eg var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              ad.field_c = new ut[je.field_g.length];
              if (param0 == 65280) {
                break L1;
              } else {
                field_l = -68;
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (var1_int >= je.field_g.length) {
                break L0;
              } else {
                ad.field_c[var1_int] = new ut(94, 84);
                var2 = df.a(var1_int, (int) wk.a(255, 63), true, (int) wk.a(65280, param0 + -65217)).b(100, 728, 20, -56, -20);
                pe.a(var2, ad.field_c[var1_int], var1_int, 40);
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "ii.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 84) {
            field_m = (String) null;
            field_m = null;
            return;
        }
        field_m = null;
    }

    final static void a(hn param0, int param1) {
        try {
            ic.field_h.a(param0, cq.e(15137), 0);
            da.field_h.a(param0, 3);
            if (param1 < 47) {
                field_h = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ii.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0) {
        sp.c(48, 36);
        if (param0 >= -116) {
            field_h = (String) null;
        }
    }

    private ii() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "MY KIT";
        field_m = "Connection restored.";
        field_l = 0;
    }
}
