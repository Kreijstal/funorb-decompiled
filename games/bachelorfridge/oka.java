/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oka extends gha {
    static String field_t;

    public static void b(byte param0) {
        field_t = null;
        if (param0 < 105) {
            field_t = null;
        }
    }

    oka(po param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_u, -1, 2147483647, false);
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        Object var7 = null;
        L0: {
          if (param4) {
            oka.a(param1.field_s + param0, param1.field_p, param1.field_v + param3, false, param1.field_q);
            break L0;
          } else {
            break L0;
          }
        }
        this.a(param0, param1, param2 + 0, param3, param4);
        if (param2 != 32679) {
          var7 = null;
          ((oka) this).a(-73, (wj) null, 81, 95, false);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = BachelorFridge.field_y;
          dg.e(param0, param2, param1 - -1, 10000536);
          dg.e(param0, param2 - -param4, param1 - -1, 12105912);
          var5 = 1;
          var6 = param4;
          if (dg.field_j <= param2 - -var5) {
            break L0;
          } else {
            var5 = dg.field_j - param2;
            break L0;
          }
        }
        if (param3) {
          return;
        } else {
          L1: {
            if (var6 + param2 <= dg.field_k) {
              break L1;
            } else {
              var6 = -param2 + dg.field_k;
              break L1;
            }
          }
          var7 = var5;
          L2: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 48 * var7 / param4 + 152;
              var9 = var8 | (var8 << 1736065960 | var8 << -1227475056);
              dg.field_e[(var7 + param2) * dg.field_i + param0] = var9;
              dg.field_e[param1 + ((var7 + param2) * dg.field_i + param0)] = var9;
              var7++;
              continue L2;
            }
          }
        }
    }

    oka(int param0) {
        this(jca.field_a, param0);
    }

    final static String a(lu param0, int param1, byte param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        Object var6 = null;
        String stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        L0: {
          if (param2 < -65) {
            break L0;
          } else {
            var6 = null;
            String discarded$2 = oka.a((lu) null, -126, (byte) 4);
            break L0;
          }
        }
        try {
          L1: {
            var3_int = param0.h(16711935);
            if (var3_int <= param1) {
              break L1;
            } else {
              var3_int = param1;
              break L1;
            }
          }
          var4 = new byte[var3_int];
          param0.field_g = param0.field_g + jka.field_l.a(var3_int, param0.field_h, 0, var4, (byte) -69, param0.field_g);
          var5 = gt.a(0, var4, (byte) 104, var3_int);
          stackOut_4_0 = (String) var5;
          stackIn_5_0 = stackOut_4_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return (String) (Object) stackIn_5_0;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Send private message";
    }
}
