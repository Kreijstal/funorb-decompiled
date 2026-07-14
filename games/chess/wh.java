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
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Chess.field_G;
          var2 = uh.field_l;
          if (param1.field_k != -3) {
            if (4 != param1.field_k) {
              if ((gb.field_t ^ -1L) == (param1.field_m ^ -1L)) {
                var2 = vm.field_i[param1.field_k];
                break L0;
              } else {
                var2 = kg.field_P[param1.field_k];
                if (param0 != -1) {
                  field_c = null;
                  return var2;
                } else {
                  return var2;
                }
              }
            } else {
              var2 = kg.field_P[param1.field_k];
              if (param0 != -1) {
                field_c = null;
                return var2;
              } else {
                return var2;
              }
            }
          } else {
            if (!param1.field_d) {
              if (-1 != param1.field_e) {
                var2 = kg.field_P[param1.field_k];
                if (param0 == -1) {
                  return var2;
                } else {
                  field_c = null;
                  return var2;
                }
              } else {
                if (param1.field_q == 0) {
                  var2 = vm.field_i[param1.field_k];
                  if (param0 != -1) {
                    field_c = null;
                    return var2;
                  } else {
                    return var2;
                  }
                } else {
                  var2 = kg.field_P[param1.field_k];
                  if (param0 == -1) {
                    return var2;
                  } else {
                    field_c = null;
                    return var2;
                  }
                }
              }
            } else {
              var2 = uh.field_l;
              break L0;
            }
          }
        }
        if (param0 != -1) {
          field_c = null;
          return var2;
        } else {
          return var2;
        }
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
        km var15 = null;
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
          if ((param5 ^ -1) >= -1) {
            break L0;
          } else {
            var17 = new km(16, 16);
            var15 = var17;
            var17.e();
            wb.f(0, 0, 16, 16, param5);
            break L0;
          }
        }
        wb.a(var21, var7, var9);
        return new km[]{var11, var12, var11, var10, var15, var10, var13, var14, var13};
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -46) {
          field_b = null;
          field_a = null;
          field_b = null;
          field_g = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_g = null;
          field_d = null;
          field_c = null;
          return;
        }
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
