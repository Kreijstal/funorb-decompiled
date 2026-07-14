/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends hfa {
    static ck field_C;
    static String field_D;
    static int[][] field_F;
    static int field_E;

    final static void a(int param0, hn param1, vr param2, boolean param3) {
        fa.field_l = param0 * fda.a(0) / 1000;
        id.a(param2, 64);
        kg.a(param2, 112);
        sha.a(param2, param3);
        pr.c(-95);
        uw.e(65536);
        ur.field_d = 0 + -fa.field_l;
    }

    public static void h(int param0) {
        if (param0 >= -121) {
            field_C = null;
            field_D = null;
            field_F = null;
            return;
        }
        field_D = null;
        field_F = null;
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        raa var7 = null;
        this.a(param0, param1, param2, param3, param4, param5);
        var7 = cea.field_b;
        if (var7 != null) {
          if (((re) this).a(param4, param1, 0, param0, param5)) {
            if (!(((re) this).field_k instanceof mo)) {
              if (!(var7.field_k instanceof mo)) {
                return;
              } else {
                ((mo) (Object) var7.field_k).a((re) this, var7, (byte) -34);
                cea.field_b = null;
                return;
              }
            } else {
              ((mo) (Object) ((re) this).field_k).a((re) this, var7, (byte) -128);
              cea.field_b = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private re(int param0, int param1, int param2, int param3, qda param4, pl param5, wj param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((re) this).field_A = param6;
    }

    final static boolean a(int param0, nea param1, nea param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          var3 = -param1.field_wb + param2.field_wb;
          if (sja.field_gb != param2.field_vb) {
            if (null == param2.field_vb) {
              // wide iinc 3 200
              break L0;
            } else {
              break L0;
            }
          } else {
            // wide iinc 3 -200
            break L0;
          }
        }
        if (sja.field_gb == param1.field_vb) {
          // wide iinc 3 200
          if (param0 == 29706) {
            L1: {
              if (-1 <= var3) {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L1;
              } else {
                stackOut_26_0 = 1;
                stackIn_28_0 = stackOut_26_0;
                break L1;
              }
            }
            return stackIn_28_0 != 0;
          } else {
            L2: {
              field_D = null;
              if (-1 >= var3) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L2;
              } else {
                stackOut_22_0 = 1;
                stackIn_24_0 = stackOut_22_0;
                break L2;
              }
            }
            return stackIn_24_0 != 0;
          }
        } else {
          if (param1.field_vb != null) {
            L3: {
              if (param0 == 29706) {
                break L3;
              } else {
                field_D = null;
                break L3;
              }
            }
            L4: {
              if (-1 <= var3) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L4;
              } else {
                stackOut_16_0 = 1;
                stackIn_18_0 = stackOut_16_0;
                break L4;
              }
            }
            return stackIn_18_0 != 0;
          } else {
            L5: {
              // wide iinc 3 -200
              if (param0 == 29706) {
                break L5;
              } else {
                field_D = null;
                break L5;
              }
            }
            L6: {
              if (-1 >= var3) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L6;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L6;
              }
            }
            return stackIn_12_0 != 0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = null;
        field_D = null;
    }
}
