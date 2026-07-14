/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk implements gl {
    private int field_f;
    private int field_j;
    private int field_o;
    static int field_k;
    static String field_i;
    static int field_n;
    private int field_d;
    static um field_p;
    private int field_a;
    private int field_r;
    private int field_g;
    private int field_s;
    static int field_e;
    private mm field_h;
    private int field_c;
    private int field_m;
    private int field_b;
    static String field_q;
    static byte[] field_l;

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!param3) {
          L0: {
            field_p = null;
            var4 = 0;
            if (param2) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param1) {
              var4++;
              break L2;
            } else {
              break L2;
            }
          }
          return qk.field_e[var4];
        } else {
          L3: {
            var4 = 0;
            if (param2) {
              var4 += 4;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param0) {
              var4 += 2;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (param1) {
              var4++;
              break L5;
            } else {
              break L5;
            }
          }
          return qk.field_e[var4];
        }
    }

    final static void a(int param0, int param1, ki param2) {
        int var4 = 0;
        uf var5 = null;
        var5 = we.field_b;
        var5.f(param0, -4);
        var5.field_n = var5.field_n + 1;
        var4 = var5.field_n;
        var5.a(true, 1);
        var5.a(true, param2.field_v);
        if (param1 != -15016) {
          return;
        } else {
          var5.a(true, param2.field_p);
          var5.a(param2.field_s, false);
          var5.a(param2.field_r, false);
          var5.a(param2.field_o, false);
          var5.a(param2.field_q, false);
          int discarded$1 = var5.a((byte) -15, var4);
          var5.b(var5.field_n - var4, true);
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 > -54) {
          field_q = null;
          field_l = null;
          field_i = null;
          field_q = null;
          field_p = null;
          return;
        } else {
          field_l = null;
          field_i = null;
          field_q = null;
          field_p = null;
          return;
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dl var12 = null;
        dl var13 = null;
        ce stackIn_4_0 = null;
        ce stackIn_18_0 = null;
        Object stackOut_17_0 = null;
        ce stackOut_16_0 = null;
        Object stackOut_3_0 = null;
        ce stackOut_2_0 = null;
        if (param3 > -60) {
          L0: {
            kk.a((byte) -80);
            if (!(param4 instanceof dl)) {
              stackOut_17_0 = null;
              stackIn_18_0 = (ce) (Object) stackOut_17_0;
              break L0;
            } else {
              stackOut_16_0 = (ce) param4;
              stackIn_18_0 = stackOut_16_0;
              break L0;
            }
          }
          L1: {
            var12 = (dl) (Object) stackIn_18_0;
            if (var12 == null) {
              break L1;
            } else {
              param0 = param0 & var12.field_I;
              break L1;
            }
          }
          L2: {
            var7 = 5592405;
            hk.a(param1 + param4.field_u, param2 - -param4.field_D, param4.field_t, param4.field_y, ((kk) this).field_o);
            if (!param0) {
              break L2;
            } else {
              var7 = 16777215;
              break L2;
            }
          }
          L3: {
            var8 = param1 + param4.field_u - -((kk) this).field_s;
            var9 = param4.field_D + param2 - -((kk) this).field_j;
            hk.d(var8, var9, ((kk) this).field_m, ((kk) this).field_f, 5592405);
            hk.a(var8, var9, ((kk) this).field_m, ((kk) this).field_f, var7);
            if (var12.field_H) {
              hk.b(var8, var9, ((kk) this).field_m + var8, var9 + ((kk) this).field_f, 1);
              hk.b(var8 - -((kk) this).field_m, var9, var8, ((kk) this).field_f + var9, 1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (((kk) this).field_h != null) {
              var10 = ((kk) this).field_m - -((kk) this).field_s + ((kk) this).field_g;
              int discarded$2 = ((kk) this).field_h.a(param4.field_E, param1 + param4.field_u - -var10, ((kk) this).field_r + param2 + param4.field_D, param4.field_t - (((kk) this).field_g + var10), -(((kk) this).field_g << 254703425) + param4.field_y, ((kk) this).field_d, ((kk) this).field_b, ((kk) this).field_c, ((kk) this).field_a, 0);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        } else {
          L5: {
            if (!(param4 instanceof dl)) {
              stackOut_3_0 = null;
              stackIn_4_0 = (ce) (Object) stackOut_3_0;
              break L5;
            } else {
              stackOut_2_0 = (ce) param4;
              stackIn_4_0 = stackOut_2_0;
              break L5;
            }
          }
          L6: {
            var13 = (dl) (Object) stackIn_4_0;
            if (var13 == null) {
              break L6;
            } else {
              param0 = param0 & var13.field_I;
              break L6;
            }
          }
          L7: {
            var7 = 5592405;
            hk.a(param1 + param4.field_u, param2 - -param4.field_D, param4.field_t, param4.field_y, ((kk) this).field_o);
            if (!param0) {
              break L7;
            } else {
              var7 = 16777215;
              break L7;
            }
          }
          L8: {
            var8 = param1 + param4.field_u - -((kk) this).field_s;
            var9 = param4.field_D + param2 - -((kk) this).field_j;
            hk.d(var8, var9, ((kk) this).field_m, ((kk) this).field_f, 5592405);
            hk.a(var8, var9, ((kk) this).field_m, ((kk) this).field_f, var7);
            if (var13.field_H) {
              hk.b(var8, var9, ((kk) this).field_m + var8, var9 + ((kk) this).field_f, 1);
              hk.b(var8 - -((kk) this).field_m, var9, var8, ((kk) this).field_f + var9, 1);
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (((kk) this).field_h != null) {
              var10 = ((kk) this).field_m - -((kk) this).field_s + ((kk) this).field_g;
              int discarded$3 = ((kk) this).field_h.a(param4.field_E, param1 + param4.field_u - -var10, ((kk) this).field_r + param2 + param4.field_D, param4.field_t - (((kk) this).field_g + var10), -(((kk) this).field_g << 254703425) + param4.field_y, ((kk) this).field_d, ((kk) this).field_b, ((kk) this).field_c, ((kk) this).field_a, 0);
              break L9;
            } else {
              break L9;
            }
          }
          return;
        }
    }

    kk(mm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((kk) this).field_c = 1;
        ((kk) this).field_a = 1;
        ((kk) this).field_j = param6;
        ((kk) this).field_g = param1;
        ((kk) this).field_m = param8;
        ((kk) this).field_b = param4;
        ((kk) this).field_d = param3;
        ((kk) this).field_r = param2;
        ((kk) this).field_o = param9;
        ((kk) this).field_f = param7;
        ((kk) this).field_h = param0;
        ((kk) this).field_s = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Hide chat";
        field_q = "<%0>: ";
        field_p = new um();
    }
}
