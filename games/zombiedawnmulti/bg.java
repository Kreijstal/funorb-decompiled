/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg implements nl {
    static lh field_k;
    private int field_i;
    private int field_c;
    static String field_o;
    static String field_q;
    private int field_l;
    static String field_m;
    private int field_f;
    private fm field_g;
    static of field_e;
    private int field_b;
    static String field_d;
    private int field_j;
    static String field_p;
    static String field_n;
    private int field_h;
    static String field_a;

    public static void a(byte param0) {
        field_p = null;
        field_a = null;
        field_q = null;
        field_d = null;
        field_e = null;
        field_k = null;
        field_m = null;
        field_n = null;
        if (param0 != -104) {
          bg.a((byte) -90);
          field_o = null;
          return;
        } else {
          field_o = null;
          return;
        }
    }

    final static void a(int param0, byte param1, boolean param2) {
        ml var3 = null;
        jb var4 = null;
        String var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        if (param1 <= 43) {
          L0: {
            boolean discarded$1 = bg.a(-59);
            var3 = mp.a(param0, param2, (byte) -119);
            if (var3 != null) {
              pk.field_b.a(false, (byte) -110);
              var4 = pk.field_b;
              var5_ref = dg.field_I;
              var4.field_j.a((byte) -118, var5_ref, 5);
              var4 = pk.field_b;
              var5 = vb.field_f;
              var6 = ka.field_t;
              var4.field_j.b(4542, var5, 0, var6, 0);
              break L0;
            } else {
              break L0;
            }
          }
          uf.a(param0, param2, (byte) 39);
          return;
        } else {
          L1: {
            var3 = mp.a(param0, param2, (byte) -119);
            if (var3 != null) {
              pk.field_b.a(false, (byte) -110);
              var4 = pk.field_b;
              var5_ref = dg.field_I;
              var4.field_j.a((byte) -118, var5_ref, 5);
              var4 = pk.field_b;
              var5 = vb.field_f;
              var6 = ka.field_t;
              var4.field_j.b(4542, var5, 0, var6, 0);
              break L1;
            } else {
              break L1;
            }
          }
          uf.a(param0, param2, (byte) 39);
          return;
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        ud var15 = null;
        cf stackIn_3_0 = null;
        cf stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param4 instanceof ud) {
            stackOut_2_0 = (cf) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (cf) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var15 = (ud) (Object) stackIn_3_0;
          oo.e(param4.field_y + param3, param4.field_i + param1, param4.field_n, param4.field_w, ((bg) this).field_j);
          if (var15 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = var15.field_R + (param4.field_y + param3);
        var8 = param1 - -param4.field_i + var15.field_bb;
        oo.d(var7, var8, var15.field_X, ((bg) this).field_f);
        if (param2 != -15112) {
          L2: {
            var14 = null;
            ((bg) this).a(true, 88, 109, -117, (cf) null);
            if (-1 != var15.field_W) {
              var9 = 3.141592653589793 * (double)var15.field_W * 2.0 / (double)var15.field_U;
              var11 = (int)(-Math.sin(var9) * (double)var15.field_X);
              var12 = (int)(Math.cos(var9) * (double)var15.field_X);
              oo.d(var11 + var7, var12 + var8, 1, ((bg) this).field_b);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            oo.d(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var15.field_T * 2.0 / (double)var15.field_U;
            var11 = (int)(-Math.sin(var9) * (double)var15.field_X);
            var12 = (int)(Math.cos(var9) * (double)var15.field_X);
            oo.g(var7, var8, var11 + var7, var8 - -var12, 1);
            if (((bg) this).field_g == null) {
              break L3;
            } else {
              var13 = ((bg) this).field_h + (var15.field_X + var15.field_R);
              int discarded$2 = ((bg) this).field_g.a(param4.field_j, var13 + (param4.field_y + param3), ((bg) this).field_l + (param1 - -param4.field_i), param4.field_n + -((bg) this).field_h + -var13, -(((bg) this).field_h << 1287508609) + param4.field_w, ((bg) this).field_c, ((bg) this).field_i, 1, 1, 0);
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (-1 != var15.field_W) {
              var9 = 3.141592653589793 * (double)var15.field_W * 2.0 / (double)var15.field_U;
              var11 = (int)(-Math.sin(var9) * (double)var15.field_X);
              var12 = (int)(Math.cos(var9) * (double)var15.field_X);
              oo.d(var11 + var7, var12 + var8, 1, ((bg) this).field_b);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            oo.d(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var15.field_T * 2.0 / (double)var15.field_U;
            var11 = (int)(-Math.sin(var9) * (double)var15.field_X);
            var12 = (int)(Math.cos(var9) * (double)var15.field_X);
            oo.g(var7, var8, var11 + var7, var8 - -var12, 1);
            if (((bg) this).field_g == null) {
              break L5;
            } else {
              var13 = ((bg) this).field_h + (var15.field_X + var15.field_R);
              int discarded$3 = ((bg) this).field_g.a(param4.field_j, var13 + (param4.field_y + param3), ((bg) this).field_l + (param1 - -param4.field_i), param4.field_n + -((bg) this).field_h + -var13, -(((bg) this).field_h << 1287508609) + param4.field_w, ((bg) this).field_c, ((bg) this).field_i, 1, 1, 0);
              break L5;
            }
          }
          return;
        }
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 2) {
          L0: {
            bg.a(-5, (byte) 74, true);
            if (dj.field_k != ta.field_hb) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (dj.field_k != ta.field_hb) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    bg(fm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((bg) this).field_c = param3;
        ((bg) this).field_f = param5;
        ((bg) this).field_h = param1;
        ((bg) this).field_j = param7;
        ((bg) this).field_i = param4;
        ((bg) this).field_g = param0;
        ((bg) this).field_l = param2;
        ((bg) this).field_b = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Names should contain a maximum of 12 characters";
        field_m = "<%0> must play <%1> more rated games before playing with the current options.";
        field_p = "Select a location!";
        field_d = "Unable to add name - system busy";
        field_o = "TAB - hide chat temporarily";
        field_n = "Only show game chat from my friends";
        field_a = "No options available";
        th discarded$0 = new th();
    }
}
