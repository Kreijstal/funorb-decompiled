/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    static int field_b;
    static int field_c;
    static char[] field_a;

    final static boolean c(byte param0) {
        if (param0 <= -115) {
          if (-11 >= (hi.field_k ^ -1)) {
            if (-14 < (vh.field_n ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, pf param2, pf param3, int param4, int param5) {
        try {
            gj.field_g = param3;
            ol.field_b = param1;
            mj.field_f = param4;
            gg.field_N = param0;
            lc.field_v = param2;
            if (param5 > -36) {
                fe.a((byte) 54);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "fe.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String b(byte param0) {
        String var1 = "";
        int var2 = 31 % ((-45 - param0) / 46);
        if (ig.field_ib != null) {
            var1 = ig.field_ib.a((byte) 85);
        }
        if (var1.length() == 0) {
            var1 = jj.l(-112);
        }
        if (var1.length() == 0) {
            var1 = ec.field_F;
        }
        return var1;
    }

    final static void a(boolean param0) {
        cc.field_f = new od();
        if (!param0) {
            fe.a(false);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -55 % ((88 - param0) / 35);
    }

    final static void a(int param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            dm.a(param0, am.field_e, param1, hc.field_j, rc.field_d, 0, -128);
            var2_int = 0;
            L1: while (true) {
              if (rc.field_d <= var2_int) {
                dm.a(param0 + param0, qh.field_a, false, jl.field_d, param0 + rc.field_d, param0, -116);
                if (rc.field_d > param0) {
                  rc.field_d = param0;
                  break L0;
                } else {
                  return;
                }
              } else {
                bc.field_o[var2_int - -param0] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "fe.E(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = -1;
        field_a = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
