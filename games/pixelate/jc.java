/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc implements eb {
    static id field_f;
    static long field_c;
    static tf field_a;
    static String field_e;
    static boolean field_d;
    static int field_b;

    final static void a(byte param0, int param1, m param2) {
        pc var3 = null;
        if (param0 != -31) {
          jc.a(-63);
          var3 = aa.field_f;
          var3.g(param1, 15514);
          var3.e(160, param2.field_m);
          var3.b(param0 + 1276387975, param2.field_k);
          return;
        } else {
          var3 = aa.field_f;
          var3.g(param1, 15514);
          var3.e(160, param2.field_m);
          var3.b(param0 + 1276387975, param2.field_k);
          return;
        }
    }

    final static void a(String param0, int param1) {
        int var2 = 31 % ((param1 - -78) / 35);
        oo.field_a = param0;
        te.a(12, -2671);
    }

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        tf var9 = null;
        tf var10 = null;
        if (param1 == -124) {
          L0: {
            var6 = param0.field_z + param3;
            var7 = param2 - -param0.field_p;
            kk.a(var6, param0.field_C, var7, param0.field_E, (byte) -51);
            var10 = ha.field_g[1];
            if (!(param0 instanceof qm)) {
              break L0;
            } else {
              if (((qm) (Object) param0).field_M) {
                var10.b((-var10.field_A + param0.field_E >> 1628434529) + var6 - -1, var7 + (1 + (-var10.field_B + param0.field_C >> -1661029663)), 256);
                break L0;
              } else {
                if (param0.b(true)) {
                  gk.a(var6 + 2, 2 + var7, (byte) -128, param0.field_E + -4, param0.field_C + -4);
                  return;
                } else {
                  return;
                }
              }
            }
          }
          if (param0.b(true)) {
            gk.a(var6 + 2, 2 + var7, (byte) -128, param0.field_E + -4, param0.field_C + -4);
            return;
          } else {
            return;
          }
        } else {
          field_e = null;
          var6 = param0.field_z + param3;
          var7 = param2 - -param0.field_p;
          kk.a(var6, param0.field_C, var7, param0.field_E, (byte) -51);
          var9 = ha.field_g[1];
          if (param0 instanceof qm) {
            L1: {
              if (((qm) (Object) param0).field_M) {
                var9.b((-var9.field_A + param0.field_E >> 1628434529) + var6 - -1, var7 + (1 + (-var9.field_B + param0.field_C >> -1661029663)), 256);
                break L1;
              } else {
                break L1;
              }
            }
            if (!param0.b(true)) {
              return;
            } else {
              gk.a(var6 + 2, 2 + var7, (byte) -128, param0.field_E + -4, param0.field_C + -4);
              return;
            }
          } else {
            if (param0.b(true)) {
              gk.a(var6 + 2, 2 + var7, (byte) -128, param0.field_E + -4, param0.field_C + -4);
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 14518) {
            return;
        }
        field_e = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = true;
        field_e = "Email address is unavailable";
    }
}
