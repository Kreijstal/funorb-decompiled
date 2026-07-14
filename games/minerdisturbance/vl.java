/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends em {
    int field_H;
    static ea field_E;
    static String field_I;
    uh field_D;
    byte[] field_F;
    static volatile int field_G;

    final byte[] c(byte param0) {
        if (((vl) this).field_C) {
            throw new RuntimeException();
        }
        if (param0 != -115) {
            return null;
        }
        return ((vl) this).field_F;
    }

    final static boolean a(pe param0, pe param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = MinerDisturbance.field_ab;
          var3 = param0.field_tb - param1.field_tb;
          if (param2 <= -66) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$2 = vl.a((pe) null, (pe) null, 95);
            break L0;
          }
        }
        L1: {
          if (param0.field_nb == bd.field_j) {
            // wide iinc 3 -200
            break L1;
          } else {
            if (param0.field_nb == null) {
              // wide iinc 3 200
              break L1;
            } else {
              break L1;
            }
          }
        }
        if (bd.field_j != param1.field_nb) {
          if (null != param1.field_nb) {
            L2: {
              if (-1 >= var3) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L2;
              }
            }
            return stackIn_20_0 != 0;
          } else {
            L3: {
              // wide iinc 3 -200
              if (-1 <= var3) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L3;
              }
            }
            return stackIn_16_0 != 0;
          }
        } else {
          L4: {
            // wide iinc 3 200
            if (-1 <= var3) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L4;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L4;
            }
          }
          return stackIn_11_0 != 0;
        }
    }

    final static void h(int param0) {
        gd.field_B = false;
        wc.field_b = false;
        oj.a(param0, 3);
        ic.field_l = mc.field_t;
        bd.field_h = mc.field_t;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
            return;
        }
        nm.field_e = param4;
        vd.field_z = param0;
        he.field_a = param1;
        nk.field_u = param3;
    }

    vl() {
    }

    final int f(int param0) {
        if (param0 != 100) {
            field_G = -118;
            if (!(!((vl) this).field_C)) {
                return 0;
            }
            return 100;
        }
        if (!(!((vl) this).field_C)) {
            return 0;
        }
        return 100;
    }

    public static void i(int param0) {
        field_I = null;
        field_E = null;
        int var1 = -60 / ((52 - param0) / 61);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Use this alternative as your account name";
        field_G = 0;
    }
}
