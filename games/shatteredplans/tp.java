/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp implements iq {
    private int field_l;
    private int field_m;
    private int field_f;
    private int field_h;
    static int field_g;
    private nq field_c;
    static bi field_e;
    private int field_a;
    private int field_i;
    static int field_b;
    static String field_k;
    static int field_j;
    static String field_d;

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        td var12 = null;
        vg stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        vg stackOut_1_0 = null;
        L0: {
          var11 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!(param0 instanceof td)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (vg) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (vg) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (td) (Object) stackIn_3_0;
          gf.d(param1 - -param0.field_m, param3 + param0.field_q, param0.field_x, param0.field_n, ((tp) this).field_l);
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = -(2 * var12.field_M) + param0.field_x;
        var8 = param1 - -param0.field_m + var12.field_M;
        var9 = param0.field_q + param3 + var12.field_I;
        if (param4 != 12) {
          return;
        } else {
          gf.g(var8, var9, var7 + var8, var9, ((tp) this).field_f);
          var10 = -1 + var12.g((byte) 93);
          L2: while (true) {
            if (-1 < (var10 ^ -1)) {
              L3: {
                if (null != ((tp) this).field_c) {
                  ((tp) this).field_c.c(var12.field_s, var8 - -(var7 / 2), var9 - -((tp) this).field_c.field_L - -var12.field_I, ((tp) this).field_m, ((tp) this).field_i);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              gf.g(var8 - -(var12.a(var10, (byte) -58) * var7 / var12.a((byte) -13)), var9, ((tp) this).field_a, ((tp) this).field_h);
              var10--;
              continue L2;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_k = null;
        if (param0 != 49) {
            field_g = 72;
        }
    }

    final static nk[] a(String param0, bc param1, String param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param1.a(126, param0);
        if (param3 != -118) {
          field_j = -121;
          var5 = param1.a(var4, (byte) 106, param2);
          return lg.a(param3 ^ 20391, param1, var5, var4);
        } else {
          var5 = param1.a(var4, (byte) 106, param2);
          return lg.a(param3 ^ 20391, param1, var5, var4);
        }
    }

    final static void a(int[] param0, long param1, String param2, String param3, int param4, ub param5, qr param6, int param7, int param8) {
        if (param4 != 293) {
          field_k = null;
          hp.field_l = param5;
          hp.field_m = new fc(param6, param1, param3, param2, param8, param7, param0);
          return;
        } else {
          hp.field_l = param5;
          hp.field_m = new fc(param6, param1, param3, param2, param8, param7, param0);
          return;
        }
    }

    tp(nq param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((tp) this).field_c = param0;
        ((tp) this).field_a = param5;
        ((tp) this).field_m = param1;
        ((tp) this).field_l = param4;
        ((tp) this).field_f = param3;
        ((tp) this).field_i = param2;
        ((tp) this).field_h = param6;
    }

    final static void b(byte param0) {
        int var1 = 0;
        if (um.field_k >= vc.field_c.length) {
          sd.field_t = null;
          var1 = -8 % ((-21 - param0) / 42);
          return;
        } else {
          um.field_k = um.field_k + 1;
          sd.field_t = vc.field_c[um.field_k];
          var1 = -8 % ((-21 - param0) / 42);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = -1;
        field_k = "Rules: Streamlined";
        field_d = "Unable to add name - system busy";
    }
}
