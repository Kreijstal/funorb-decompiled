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
        field_c = (boolean[][]) null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int stackIn_7_0 = 0;
        int stackIn_34_0 = 0;
        int var6;
        int var7;
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
              stackIn_34_0 = 1000 * param5 / var6;
              break L1;
            } else {
              stackIn_34_0 = 0;
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
              stackIn_7_0 = 1000 * param5 / var6;
              break L7;
            } else {
              stackIn_7_0 = 0;
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
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        lu var5 = null;
        sl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.e((byte) 73);
              if (param0 == -22833) {
                break L1;
              } else {
                var5 = (lu) null;
                im.a(9, (lu) null);
                break L1;
              }
            }
            var3 = param1.b(param0 ^ -16734672);
            var4 = param1.b(16711935);
            stackIn_3_0 = new sl(var2_int, var3, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("im.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (pp) ((Object) stackIn_3_0);
    }

    static {
        field_a = "Please log in as a subscribing member to access this feature.";
        field_b = "Reject";
    }
}
