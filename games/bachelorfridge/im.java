/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static boolean[][] field_c;
    static String field_a;
    static String field_b;

    public static void a(byte param0) {
        field_a = null;
        int var1 = -48 / ((34 - param0) / 57);
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        un.field_a[ut.field_l] = param0;
        fn.field_k[ut.field_l] = ut.field_l;
        gk.field_a[ut.field_l] = param1;
        if (param1 >= waa.field_a) {
          L0: {
            if (wt.field_u < param1) {
              af.field_c = param1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            mba.field_a[ut.field_l] = param5;
            sc.field_o[ut.field_l] = param4;
            uda.field_X[ut.field_l] = param2;
            var6 = param4 + param5 - -param2;
            if (var6 != 0) {
              stackOut_33_0 = 1000 * param5 / var6;
              stackIn_34_0 = stackOut_33_0;
              break L1;
            } else {
              stackOut_32_0 = 0;
              stackIn_34_0 = stackOut_32_0;
              break L1;
            }
          }
          var7 = stackIn_34_0;
          uc.field_k[ut.field_l] = var7;
          if (var7 >= mt.field_r) {
            if (param3) {
              L2: {
                im.a(-109, 3, 88, true, 30, 109);
                ut.field_l = ut.field_l + 1;
                if (var7 > af.field_c) {
                  af.field_c = var7;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                ut.field_l = ut.field_l + 1;
                if (var7 > af.field_c) {
                  af.field_c = var7;
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            mt.field_r = var7;
            if (param3) {
              L4: {
                im.a(-109, 3, 88, true, 30, 109);
                ut.field_l = ut.field_l + 1;
                if (var7 > af.field_c) {
                  af.field_c = var7;
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              L5: {
                ut.field_l = ut.field_l + 1;
                if (var7 > af.field_c) {
                  af.field_c = var7;
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            }
          }
        } else {
          L6: {
            mt.field_r = param1;
            if (wt.field_u < param1) {
              af.field_c = param1;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            mba.field_a[ut.field_l] = param5;
            sc.field_o[ut.field_l] = param4;
            uda.field_X[ut.field_l] = param2;
            var6 = param4 + param5 - -param2;
            if (var6 != 0) {
              stackOut_6_0 = 1000 * param5 / var6;
              stackIn_7_0 = stackOut_6_0;
              break L7;
            } else {
              stackOut_5_0 = 0;
              stackIn_7_0 = stackOut_5_0;
              break L7;
            }
          }
          var7 = stackIn_7_0;
          uc.field_k[ut.field_l] = var7;
          if (var7 >= mt.field_r) {
            if (param3) {
              L8: {
                im.a(-109, 3, 88, true, 30, 109);
                ut.field_l = ut.field_l + 1;
                if (var7 > af.field_c) {
                  af.field_c = var7;
                  break L8;
                } else {
                  break L8;
                }
              }
              return;
            } else {
              L9: {
                ut.field_l = ut.field_l + 1;
                if (var7 > af.field_c) {
                  af.field_c = var7;
                  break L9;
                } else {
                  break L9;
                }
              }
              return;
            }
          } else {
            mt.field_r = var7;
            if (!param3) {
              L10: {
                ut.field_l = ut.field_l + 1;
                if (var7 > af.field_c) {
                  af.field_c = var7;
                  break L10;
                } else {
                  break L10;
                }
              }
              return;
            } else {
              L11: {
                im.a(-109, 3, 88, true, 30, 109);
                ut.field_l = ut.field_l + 1;
                if (var7 > af.field_c) {
                  af.field_c = var7;
                  break L11;
                } else {
                  break L11;
                }
              }
              return;
            }
          }
        }
    }

    final static pp a(int param0, lu param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var2 = param1.e((byte) 73);
        if (param0 != -22833) {
          var5 = null;
          pp discarded$2 = im.a(9, (lu) null);
          var3 = param1.b(param0 ^ -16734672);
          var4 = param1.b(16711935);
          return (pp) (Object) new sl(var2, var3, var4);
        } else {
          var3 = param1.b(param0 ^ -16734672);
          var4 = param1.b(16711935);
          return (pp) (Object) new sl(var2, var3, var4);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please log in as a subscribing member to access this feature.";
        field_b = "Reject";
    }
}
