/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc implements db {
    private int field_f;
    private int field_i;
    private wl field_e;
    private int field_a;
    private int field_j;
    private int field_c;
    private int field_b;
    private int field_d;
    static int[] field_h;
    static Boolean field_g;

    final static void a(qd param0, int param1, int param2) {
        mi.field_l.a(-12328, (hg) (Object) param0);
        sm.a(param0, param1, true);
        if (param2 != 1) {
            sc.b((byte) 98);
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        Object var16 = null;
        eb var16_ref = null;
        Object var17 = null;
        eb var17_ref = null;
        hm stackIn_4_0 = null;
        hm stackIn_14_0 = null;
        Object stackOut_13_0 = null;
        hm stackOut_12_0 = null;
        Object stackOut_3_0 = null;
        hm stackOut_2_0 = null;
        var16 = null;
        var17 = null;
        if (param2 <= -14) {
          L0: {
            if (!(param3 instanceof eb)) {
              stackOut_13_0 = null;
              stackIn_14_0 = (hm) (Object) stackOut_13_0;
              break L0;
            } else {
              stackOut_12_0 = (hm) param3;
              stackIn_14_0 = stackOut_12_0;
              break L0;
            }
          }
          L1: {
            var17_ref = (eb) (Object) stackIn_14_0;
            em.a(param3.field_k + param0, param3.field_j + param1, param3.field_g, param3.field_x, ((sc) this).field_a);
            if (var17_ref != null) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var7 = var17_ref.field_D + (param0 + param3.field_k);
            var8 = param3.field_j + (param1 - -var17_ref.field_I);
            em.d(var7, var8, var17_ref.field_N, ((sc) this).field_c);
            if (var17_ref.field_G == -1) {
              break L2;
            } else {
              var9 = 2.0 * (3.141592653589793 * (double)var17_ref.field_G) / (double)var17_ref.field_M;
              var11 = (int)(-Math.sin(var9) * (double)var17_ref.field_N);
              var12 = (int)(Math.cos(var9) * (double)var17_ref.field_N);
              em.d(var7 - -var11, var12 + var8, 1, ((sc) this).field_b);
              break L2;
            }
          }
          L3: {
            em.d(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var17_ref.field_F * 2.0 / (double)var17_ref.field_M;
            var11 = (int)(-Math.sin(var9) * (double)var17_ref.field_N);
            var12 = (int)(Math.cos(var9) * (double)var17_ref.field_N);
            em.d(var7, var8, var11 + var7, var8 - -var12, 1);
            if (null != ((sc) this).field_e) {
              var13 = ((sc) this).field_i + (var17_ref.field_D - -var17_ref.field_N);
              int discarded$2 = ((sc) this).field_e.a(param3.field_l, var13 + param3.field_k + param0, param1 + (param3.field_j + ((sc) this).field_f), param3.field_g - (var13 - -((sc) this).field_i), param3.field_x - (((sc) this).field_i << 211472609), ((sc) this).field_j, ((sc) this).field_d, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            var14 = null;
            sc.a((byte) 67, (java.awt.Component) null);
            if (!(param3 instanceof eb)) {
              stackOut_3_0 = null;
              stackIn_4_0 = (hm) (Object) stackOut_3_0;
              break L4;
            } else {
              stackOut_2_0 = (hm) param3;
              stackIn_4_0 = stackOut_2_0;
              break L4;
            }
          }
          L5: {
            var16_ref = (eb) (Object) stackIn_4_0;
            em.a(param3.field_k + param0, param3.field_j + param1, param3.field_g, param3.field_x, ((sc) this).field_a);
            if (var16_ref != null) {
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            var7 = var16_ref.field_D + (param0 + param3.field_k);
            var8 = param3.field_j + (param1 - -var16_ref.field_I);
            em.d(var7, var8, var16_ref.field_N, ((sc) this).field_c);
            if (var16_ref.field_G == -1) {
              break L6;
            } else {
              var9 = 2.0 * (3.141592653589793 * (double)var16_ref.field_G) / (double)var16_ref.field_M;
              var11 = (int)(-Math.sin(var9) * (double)var16_ref.field_N);
              var12 = (int)(Math.cos(var9) * (double)var16_ref.field_N);
              em.d(var7 - -var11, var12 + var8, 1, ((sc) this).field_b);
              break L6;
            }
          }
          L7: {
            em.d(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var16_ref.field_F * 2.0 / (double)var16_ref.field_M;
            var11 = (int)(-Math.sin(var9) * (double)var16_ref.field_N);
            var12 = (int)(Math.cos(var9) * (double)var16_ref.field_N);
            em.d(var7, var8, var11 + var7, var8 - -var12, 1);
            if (null != ((sc) this).field_e) {
              var13 = ((sc) this).field_i + (var16_ref.field_D - -var16_ref.field_N);
              int discarded$3 = ((sc) this).field_e.a(param3.field_l, var13 + param3.field_k + param0, param1 + (param3.field_j + ((sc) this).field_f), param3.field_g - (var13 - -((sc) this).field_i), param3.field_x - (((sc) this).field_i << 211472609), ((sc) this).field_j, ((sc) this).field_d, 1, 1, 0);
              break L7;
            } else {
              break L7;
            }
          }
          return;
        }
    }

    final static void b(byte param0) {
        Object var2 = null;
        if (ff.field_e == 10) {
          fe.a(-84);
          ff.field_e = 11;
          pb.field_d = true;
          if (param0 < -81) {
            return;
          } else {
            var2 = null;
            sc.a((byte) -55, (java.awt.Component) null);
            return;
          }
        } else {
          if (!g.i(56)) {
            fe.a(-84);
            ff.field_e = 11;
            pb.field_d = true;
            if (param0 >= -81) {
              var2 = null;
              sc.a((byte) -55, (java.awt.Component) null);
              return;
            } else {
              return;
            }
          } else {
            pb.field_d = true;
            if (param0 < -81) {
              return;
            } else {
              var2 = null;
              sc.a((byte) -55, (java.awt.Component) null);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -15) {
            return;
        }
        field_g = null;
        field_h = null;
    }

    sc(wl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((sc) this).field_j = param3;
        ((sc) this).field_b = param6;
        ((sc) this).field_e = param0;
        ((sc) this).field_d = param4;
        ((sc) this).field_f = param2;
        ((sc) this).field_c = param5;
        ((sc) this).field_a = param7;
        ((sc) this).field_i = param1;
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) ck.field_v);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) ck.field_v);
        if (param0 != -58) {
            return;
        }
        sb.field_b = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{0, 16384, 32768, 49152};
    }
}
