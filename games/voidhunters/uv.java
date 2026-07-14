/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uv implements wwa {
    private int field_c;
    private int field_m;
    private int field_l;
    private int field_n;
    private no field_j;
    private int field_e;
    private int field_k;
    private int field_b;
    private int field_d;
    private int field_i;
    static String field_f;
    static int[] field_a;
    private int field_g;
    private int field_h;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = kba.field_a.a(param1, (byte) 121) + -kba.field_a.field_d;
        var3 = param0 - -(var2 / 4);
        if (var3 <= 250) {
          if (-7 < (var3 ^ -1)) {
            var3 = 6;
            return var3;
          } else {
            return var3;
          }
        } else {
          var3 = 250;
          return var3;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (li.field_i) {
          if (fua.field_o) {
            og.field_r.a(-83, param3, param5, -16777216 | param4, param1, param2);
            if (param0 < 106) {
              field_f = null;
              return;
            } else {
              return;
            }
          } else {
            if (param0 >= 106) {
              return;
            } else {
              field_f = null;
              return;
            }
          }
        } else {
          dma.b(param1, param3, param5, param2, param4);
          if (param0 >= 106) {
            return;
          } else {
            field_f = null;
            return;
          }
        }
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jla var12 = null;
        shb stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        shb stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof jla)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (shb) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (shb) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (jla) (Object) stackIn_3_0;
          if (var12 != null) {
            param4 = param4 & var12.field_x;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          if (param4) {
            var7 = 16777215;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          dma.d(param2 + param1.field_g, param3 + param1.field_r, param1.field_h, param1.field_f, ((uv) this).field_k);
          var8 = ((uv) this).field_d + (param2 + param1.field_g);
          var9 = param1.field_r + param3 + ((uv) this).field_n;
          dma.c(var8, var9, ((uv) this).field_l, ((uv) this).field_i, 5592405);
          dma.d(var8, var9, ((uv) this).field_l, ((uv) this).field_i, var7);
          if (var12.field_u) {
            dma.a(var8, var9, var8 + ((uv) this).field_l, ((uv) this).field_i + var9, 1);
            dma.a(var8 + ((uv) this).field_l, var9, var8, ((uv) this).field_i + var9, 1);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var10 = 49 % ((param0 - -27) / 35);
          if (null != ((uv) this).field_j) {
            var11 = ((uv) this).field_l + ((uv) this).field_d + ((uv) this).field_m;
            int discarded$1 = ((uv) this).field_j.a(param1.field_j, var11 + (param2 - -param1.field_g), ((uv) this).field_c + param3 - -param1.field_r, -((uv) this).field_m + (-var11 + param1.field_h), -(((uv) this).field_m << -1325802399) + param1.field_f, ((uv) this).field_g, ((uv) this).field_h, ((uv) this).field_b, ((uv) this).field_e, 0);
            break L4;
          } else {
            break L4;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 22089) {
            field_f = null;
        }
    }

    uv(no param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((uv) this).field_e = 1;
        ((uv) this).field_b = 1;
        ((uv) this).field_m = param1;
        ((uv) this).field_n = param6;
        ((uv) this).field_c = param2;
        ((uv) this).field_l = param8;
        ((uv) this).field_j = param0;
        ((uv) this).field_h = param4;
        ((uv) this).field_d = param5;
        ((uv) this).field_g = param3;
        ((uv) this).field_k = param9;
        ((uv) this).field_i = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Error connecting to server. Please try using a different server.";
        field_a = new int[8192];
    }
}
