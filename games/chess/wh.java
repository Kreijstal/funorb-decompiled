/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static sa field_b;
    static String[][] field_g;
    static String field_e;
    static rk field_c;
    static String[] field_a;
    static String field_d;
    static int field_f;

    final static int a(int param0, ld param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var3 = Chess.field_G;
        try {
          L0: {
            L1: {
              var2_int = uh.field_l;
              if (param1.field_k != 2) {
                if (4 != param1.field_k) {
                  if (~gb.field_t == ~param1.field_m) {
                    var2_int = vm.field_i[param1.field_k];
                    break L1;
                  } else {
                    var2_int = kg.field_P[param1.field_k];
                    break L1;
                  }
                } else {
                  var2_int = kg.field_P[param1.field_k];
                  break L1;
                }
              } else {
                if (!param1.field_d) {
                  L2: {
                    if (param1.field_e != 0) {
                      break L2;
                    } else {
                      if (param1.field_q == 0) {
                        var2_int = vm.field_i[param1.field_k];
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = kg.field_P[param1.field_k];
                  break L1;
                } else {
                  var2_int = uh.field_l;
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == -1) {
                break L3;
              } else {
                field_c = null;
                break L3;
              }
            }
            stackOut_16_0 = var2_int;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("wh.A(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0;
    }

    final static km[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        km var10 = null;
        km var11 = null;
        km var12 = null;
        km var13 = null;
        km var14 = null;
        Object var15 = null;
        int[] var16 = null;
        km var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        L0: {
          var21 = wb.field_d;
          var20 = var21;
          var19 = var20;
          var18 = var19;
          var16 = var18;
          var6 = var16;
          var7 = wb.field_h;
          var8 = 7 % ((param0 - -10) / 58);
          var9 = wb.field_c;
          var10 = new km(param2, param1 + -(2 * param2));
          var10.e();
          wb.c(0, 0, param2, -(2 * param2) + param1, param3, param4);
          var11 = new km(param2, param2);
          var11.e();
          wb.f(0, 0, param2, param2, param3);
          var12 = new km(16, param2);
          var12.e();
          wb.f(0, 0, 16, param2, param3);
          var13 = new km(param2, param2);
          var13.e();
          wb.f(0, 0, param2, param2, param4);
          var14 = new km(16, param2);
          var14.e();
          wb.f(0, 0, 16, param2, param4);
          var15 = null;
          if (param5 <= 0) {
            break L0;
          } else {
            var17 = new km(16, 16);
            var15 = (Object) (Object) var17;
            var17.e();
            wb.f(0, 0, 16, 16, param5);
            break L0;
          }
        }
        wb.a(var21, var7, var9);
        return new km[]{var11, var12, var11, var10, (km) var15, var10, var13, var14, var13};
    }

    public static void a() {
        field_e = null;
        field_a = null;
        field_b = null;
        field_g = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_e = "Email (Login):";
        field_g = new String[][]{new String[7]};
        field_d = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = 0;
        field_b = new sa();
    }
}
