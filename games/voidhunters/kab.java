/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kab extends bob {
    static String field_p;
    private caa[] field_q;

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        caa var15 = null;
        caa var16 = null;
        caa var17 = null;
        caa var29 = null;
        caa var30 = null;
        caa var31 = null;
        caa var31_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        dma.b(param2 - -param1.field_g, param1.field_r + param3, param1.field_h, param1.field_f, 10197915);
        if (param4) {
          if (!((htb) (Object) param1).field_u) {
            L0: {
              var6 = 0;
              if (param4) {
                if (param1.e((byte) -120)) {
                  stackOut_29_0 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  break L0;
                } else {
                  stackOut_28_0 = 0;
                  stackIn_31_0 = stackOut_28_0;
                  break L0;
                }
              } else {
                stackOut_26_0 = 0;
                stackIn_31_0 = stackOut_26_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_31_0;
              var8 = 0;
              if (var6 != 0) {
                stackOut_33_0 = 2394342;
                stackIn_34_0 = stackOut_33_0;
                break L1;
              } else {
                stackOut_32_0 = 16777215;
                stackIn_34_0 = stackOut_32_0;
                break L1;
              }
            }
            L2: {
              var9 = stackIn_34_0;
              if (var7 == 0) {
                break L2;
              } else {
                var8 = var8 | 2;
                break L2;
              }
            }
            L3: {
              if (var6 == 0) {
                break L3;
              } else {
                var8 = var8 | 1;
                break L3;
              }
            }
            var30 = ((kab) this).field_q[var8];
            var31 = var30;
            var31 = var30;
            var12 = -89 % ((-27 - param0) / 35);
            var11 = param2 - (-param1.field_g - (-var30.field_h + param1.field_h) / 2);
            var13 = param3 + (param1.field_r + (-var30.field_e + param1.field_f) / 2);
            var14 = param1.field_g + param2 + param1.field_h / 2;
            var30.a(var11, var13);
            ((kab) this).field_d.a(((kab) this).b((byte) -82, param1), var14, param3, var9, -1);
            return;
          } else {
            L4: {
              var6 = 1;
              if (param4) {
                if (param1.e((byte) -120)) {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = 0;
                  stackIn_17_0 = stackOut_14_0;
                  break L4;
                }
              } else {
                stackOut_12_0 = 0;
                stackIn_17_0 = stackOut_12_0;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_17_0;
              var8 = 0;
              if (var6 != 0) {
                stackOut_19_0 = 2394342;
                stackIn_20_0 = stackOut_19_0;
                break L5;
              } else {
                stackOut_18_0 = 16777215;
                stackIn_20_0 = stackOut_18_0;
                break L5;
              }
            }
            L6: {
              var9 = stackIn_20_0;
              if (var7 == 0) {
                break L6;
              } else {
                var8 = var8 | 2;
                break L6;
              }
            }
            L7: {
              if (var6 == 0) {
                break L7;
              } else {
                var8 = var8 | 1;
                break L7;
              }
            }
            var31_ref = ((kab) this).field_q[var8];
            var12 = -89 % ((-27 - param0) / 35);
            var11 = param2 - (-param1.field_g - (-var31_ref.field_h + param1.field_h) / 2);
            var13 = param3 + (param1.field_r + (-var31_ref.field_e + param1.field_f) / 2);
            var14 = param1.field_g + param2 + param1.field_h / 2;
            var31_ref.a(var11, var13);
            ((kab) this).field_d.a(((kab) this).b((byte) -82, param1), var14, param3, var9, -1);
            return;
          }
        } else {
          L8: {
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (var6 != 0) {
              stackOut_3_0 = 2394342;
              stackIn_4_0 = stackOut_3_0;
              break L8;
            } else {
              stackOut_2_0 = 16777215;
              stackIn_4_0 = stackOut_2_0;
              break L8;
            }
          }
          L9: {
            var9 = stackIn_4_0;
            if (var7 == 0) {
              break L9;
            } else {
              var8 = var8 | 2;
              break L9;
            }
          }
          L10: {
            if (var6 == 0) {
              break L10;
            } else {
              var8 = var8 | 1;
              break L10;
            }
          }
          var15 = ((kab) this).field_q[var8];
          var16 = var15;
          var17 = var16;
          var29 = var17;
          var16 = var15;
          var12 = -89 % ((-27 - param0) / 35);
          var11 = param2 - (-param1.field_g - (-var15.field_h + param1.field_h) / 2);
          var13 = param3 + (param1.field_r + (-var15.field_e + param1.field_f) / 2);
          var14 = param1.field_g + param2 + param1.field_h / 2;
          var15.a(var11, var13);
          ((kab) this).field_d.a(((kab) this).b((byte) -82, param1), var14, param3, var9, -1);
          return;
        }
    }

    kab(caa[] param0) {
        ((kab) this).field_d = loa.field_o;
        ((kab) this).field_q = param0;
    }

    public static void c(int param0) {
        field_p = null;
        if (param0 != 777) {
            field_p = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Hull beam";
    }
}
