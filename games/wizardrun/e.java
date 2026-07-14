/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static vd field_b;
    static int field_d;
    static boolean field_a;
    static String field_c;
    static String field_e;

    final static boolean a(int param0) {
        if (param0 >= -71) {
            Object var2 = null;
            e.a((o[]) null, 123, 6, (byte) 67, 68, 39);
            return qb.field_p;
        }
        return qb.field_p;
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 != -2) {
            field_c = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(o[] param0, int param1, int param2, byte param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = wizardrun.field_H;
          if (param0 == null) {
            break L0;
          } else {
            if (param5 > 0) {
              if (param3 <= 27) {
                boolean discarded$1 = e.a(59);
                var6 = param0[0].field_x;
                var7 = param0[2].field_x;
                var8 = param0[1].field_x;
                param0[0].d(param4, param1, param2);
                param0[2].d(param4 - -param5 + -var7, param1, param2);
                ed.b(ac.field_q);
                ed.b(var6 + param4, param1, param4 - -param5 + -var7, param1 + param0[1].field_s);
                var9 = param4 + var6;
                var10 = -var7 + param5 + param4;
                param4 = var9;
                L1: while (true) {
                  if (param4 >= var10) {
                    ed.a(ac.field_q);
                    return;
                  } else {
                    param0[1].d(param4, param1, param2);
                    param4 = param4 + var8;
                    continue L1;
                  }
                }
              } else {
                var6 = param0[0].field_x;
                var7 = param0[2].field_x;
                var8 = param0[1].field_x;
                param0[0].d(param4, param1, param2);
                param0[2].d(param4 - -param5 + -var7, param1, param2);
                ed.b(ac.field_q);
                ed.b(var6 + param4, param1, param4 - -param5 + -var7, param1 + param0[1].field_s);
                var9 = param4 + var6;
                var10 = -var7 + param5 + param4;
                param4 = var9;
                L2: while (true) {
                  if (param4 >= var10) {
                    ed.a(ac.field_q);
                    return;
                  } else {
                    param0[1].d(param4, param1, param2);
                    param4 = param4 + var8;
                    continue L2;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Continue";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
