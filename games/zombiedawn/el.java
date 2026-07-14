/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el implements io {
    static int field_d;
    private int field_l;
    static String field_h;
    private int field_e;
    private rb field_j;
    static int field_n;
    private int field_a;
    static String field_m;
    private int field_f;
    static int field_k;
    private int field_b;
    static int field_g;
    private int field_c;
    static String field_i;

    public static void a(int param0) {
        Object var2 = null;
        field_m = null;
        if (param0 != -1) {
          var2 = null;
          Object discarded$2 = el.a((byte) 20, false, (byte[]) null);
          field_i = null;
          field_h = null;
          return;
        } else {
          field_i = null;
          field_h = null;
          return;
        }
    }

    final static Object a(byte param0, boolean param1, byte[] param2) {
        kp var3 = null;
        if (param2 != null) {
          if (param2.length <= 136) {
            if (param0 == 94) {
              if (param1) {
                return (Object) (Object) jl.a(param2, (byte) 45);
              } else {
                return (Object) (Object) param2;
              }
            } else {
              return null;
            }
          } else {
            var3 = new kp();
            ((rf) (Object) var3).a(4, param2);
            return (Object) (Object) var3;
          }
        } else {
          return null;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = ZombieDawn.field_J;
        int var3 = 1;
        while ((param0 ^ -1) < -2) {
            if (!(0 == (1 & param0))) {
                var3 = var3 * param2;
            }
            param2 = param2 * param2;
            param0 = param0 >> 1;
        }
        if (param1 != 28913) {
            return 91;
        }
        if (!(param0 != 1)) {
            return var3 * param2;
        }
        return var3;
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hf var12 = null;
        ga stackIn_3_0 = null;
        ga stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = ZombieDawn.field_J;
          if (param3 instanceof hf) {
            stackOut_2_0 = (ga) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ga) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (hf) (Object) stackIn_3_0;
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          bi.b(param4 + param3.field_k, param3.field_j + param2, param3.field_i, param3.field_n, ((el) this).field_b);
          if (param0 == 16777215) {
            break L2;
          } else {
            el.a(-79);
            break L2;
          }
        }
        var7 = -(var12.field_K * 2) + param3.field_i;
        var8 = param3.field_k + (param4 - -var12.field_K);
        var9 = var12.field_G + (param2 - -param3.field_j);
        bi.e(var8, var9, var8 - -var7, var9, ((el) this).field_l);
        var10 = var12.a(-85) + -1;
        L3: while (true) {
          if (-1 < (var10 ^ -1)) {
            if (null == ((el) this).field_j) {
              return;
            } else {
              ((el) this).field_j.a(var12.field_o, var8 + var7 / 2, ((el) this).field_j.field_C + (var9 - -var12.field_G), ((el) this).field_a, ((el) this).field_c);
              return;
            }
          } else {
            bi.g(var8 + var12.a((byte) 58, var10) * var7 / var12.b(false), var9, ((el) this).field_e, ((el) this).field_f);
            var10--;
            continue L3;
          }
        }
    }

    el(rb param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((el) this).field_c = param2;
        ((el) this).field_e = param5;
        ((el) this).field_j = param0;
        ((el) this).field_l = param3;
        ((el) this).field_f = param6;
        ((el) this).field_a = param1;
        ((el) this).field_b = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
        field_m = "Loading graphics";
        field_i = "Retry";
    }
}
