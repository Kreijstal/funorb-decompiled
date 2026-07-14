/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t implements io {
    private int field_a;
    private int field_l;
    private rb field_g;
    static fi field_m;
    static fi field_i;
    private int field_f;
    private int field_j;
    private int field_k;
    private int field_e;
    static int field_b;
    private int field_d;
    static int field_h;
    static int field_c;

    final static df a(boolean param0, int param1) {
        df var2 = null;
        if (param0) {
          df discarded$2 = t.a(false, 81);
          var2 = new df();
          jj.field_D.a(0, (le) (Object) var2);
          p.a(0, param1);
          return var2;
        } else {
          var2 = new df();
          jj.field_D.a(0, (le) (Object) var2);
          p.a(0, param1);
          return var2;
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 > 65) {
          param2 = ic.a("", 0, param2, '_');
          var3 = am.a(param2, 1);
          if (param0.indexOf(param2) == -1) {
            if ((param0.indexOf(var3) ^ -1) != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    public static void b(int param0) {
        if (param0 != 27803) {
            field_b = -70;
            field_i = null;
            field_m = null;
            return;
        }
        field_i = null;
        field_m = null;
    }

    final static String a(int param0) {
        if (!(null != ce.field_r)) {
            return "";
        }
        if (param0 != 1) {
            return null;
        }
        return ce.field_r;
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        fp var14 = null;
        ga stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        ga stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof fp)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (ga) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (ga) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var14 = (fp) (Object) stackIn_3_0;
        bi.b(param3.field_k + param4, param3.field_j + param2, param3.field_i, param3.field_n, ((t) this).field_a);
        if (param0 != 16777215) {
          L1: {
            ((t) this).field_g = null;
            if (var14 == null) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var7 = var14.field_K + (param4 + param3.field_k);
            var8 = var14.field_G + param3.field_j + param2;
            bi.g(var7, var8, var14.field_I, ((t) this).field_j);
            if (-1 == var14.field_E) {
              break L2;
            } else {
              var9 = 2.0 * (3.141592653589793 * (double)var14.field_E) / (double)var14.field_L;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
              var12 = (int)(Math.cos(var9) * (double)var14.field_I);
              bi.g(var11 + var7, var8 + var12, 1, ((t) this).field_d);
              break L2;
            }
          }
          L3: {
            bi.g(var7, var8, 2, 1);
            var9 = 2.0 * ((double)var14.field_J * 3.141592653589793) / (double)var14.field_L;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
            var12 = (int)(Math.cos(var9) * (double)var14.field_I);
            bi.e(var7, var8, var7 + var11, var8 - -var12, 1);
            if (null == ((t) this).field_g) {
              break L3;
            } else {
              var13 = ((t) this).field_e + (var14.field_I + var14.field_K);
              int discarded$2 = ((t) this).field_g.a(param3.field_o, var13 + param4 + param3.field_k, ((t) this).field_k + param3.field_j + param2, -((t) this).field_e - (var13 - param3.field_i), param3.field_n - (((t) this).field_e << -1077052639), ((t) this).field_l, ((t) this).field_f, 1, 1, 0);
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (var14 == null) {
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            var7 = var14.field_K + (param4 + param3.field_k);
            var8 = var14.field_G + param3.field_j + param2;
            bi.g(var7, var8, var14.field_I, ((t) this).field_j);
            if (-1 == var14.field_E) {
              break L5;
            } else {
              var9 = 2.0 * (3.141592653589793 * (double)var14.field_E) / (double)var14.field_L;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
              var12 = (int)(Math.cos(var9) * (double)var14.field_I);
              bi.g(var11 + var7, var8 + var12, 1, ((t) this).field_d);
              break L5;
            }
          }
          L6: {
            bi.g(var7, var8, 2, 1);
            var9 = 2.0 * ((double)var14.field_J * 3.141592653589793) / (double)var14.field_L;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
            var12 = (int)(Math.cos(var9) * (double)var14.field_I);
            bi.e(var7, var8, var7 + var11, var8 - -var12, 1);
            if (null == ((t) this).field_g) {
              break L6;
            } else {
              var13 = ((t) this).field_e + (var14.field_I + var14.field_K);
              int discarded$3 = ((t) this).field_g.a(param3.field_o, var13 + param4 + param3.field_k, ((t) this).field_k + param3.field_j + param2, -((t) this).field_e - (var13 - param3.field_i), param3.field_n - (((t) this).field_e << -1077052639), ((t) this).field_l, ((t) this).field_f, 1, 1, 0);
              break L6;
            }
          }
          return;
        }
    }

    t(rb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((t) this).field_g = param0;
        ((t) this).field_j = param5;
        ((t) this).field_k = param2;
        ((t) this).field_l = param3;
        ((t) this).field_d = param6;
        ((t) this).field_e = param1;
        ((t) this).field_f = param4;
        ((t) this).field_a = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 1 + (int)(9.0 * Math.sqrt(2.0));
    }
}
