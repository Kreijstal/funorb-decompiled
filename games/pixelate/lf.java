/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static int field_b;
    tf[] field_k;
    private int field_g;
    private int field_h;
    static String[] field_i;
    tf field_j;
    private int field_e;
    private int field_d;
    private boolean field_c;
    private int field_a;
    static fm field_f;

    final void a(lf param0, int param1, w param2, byte param3, int param4, ng param5) {
        if (((lf) this).field_c) {
            param0.a(param4, param1, param5, (byte) 116, param2);
            param0.a(true);
        }
        if (!(((lf) this).field_d == -2147483648)) {
            param0.field_d = ((lf) this).field_d;
        }
        if (2147483647 != (((lf) this).field_a ^ -1)) {
            param0.field_a = ((lf) this).field_a;
        }
        if (!(((lf) this).field_h == -2147483648)) {
            param0.field_h = ((lf) this).field_h;
        }
        if (null != ((lf) this).field_k) {
            param0.field_k = ((lf) this).field_k;
        }
        int var7 = -122 % ((-27 - param3) / 39);
        if (!((((lf) this).field_g ^ -1) > 0)) {
            param0.field_g = ((lf) this).field_g;
        }
        if ((((lf) this).field_e ^ -1) <= 0) {
            param0.field_e = ((lf) this).field_e;
        }
        if (!(((lf) this).field_j == null)) {
            param0.field_j = ((lf) this).field_j;
        }
    }

    final static boolean a(byte param0) {
        aj var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        var1 = (aj) (Object) ma.field_o.c(1504642273);
        if (var1 == null) {
          return false;
        } else {
          L0: {
            var2 = 0;
            if (param0 == -91) {
              break L0;
            } else {
              field_i = null;
              break L0;
            }
          }
          L1: while (true) {
            if (var2 >= var1.field_s) {
              return true;
            } else {
              L2: {
                if (null != var1.field_l[var2]) {
                  if (var1.field_l[var2].field_b == 0) {
                    return false;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (var1.field_v[var2] != null) {
                if (-1 == (var1.field_v[var2].field_b ^ -1)) {
                  return false;
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            }
          }
        }
    }

    final lf a(tf[] param0, byte param1) {
        ((lf) this).field_k = param0;
        if (param1 != -65) {
            return null;
        }
        return (lf) this;
    }

    final void a(int param0, int param1, ng param2, byte param3, w param4) {
        String var6 = null;
        int var6_int = 0;
        int var7 = 0;
        jl stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        jl stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        jl stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        jl stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        jl stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        jl stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        jl stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        jl stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        jl stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        int stackIn_25_8 = 0;
        jl stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        jl stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        jl stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        jl stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        jl stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        jl stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        jl stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        jl stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        jl stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        L0: {
          dk.a(param2.field_E, param1 - -param2.field_z, (byte) 75, param2.field_C, param0 - -param2.field_p, ((lf) this).field_k);
          if (null == ((lf) this).field_j) {
            break L0;
          } else {
            L1: {
              var6_int = ((lf) this).field_d + (param2.field_z + param1);
              var7 = param2.field_p + param0 - -((lf) this).field_h;
              if (param4.field_l != 1) {
                break L1;
              } else {
                var6_int = var6_int + (-((lf) this).field_j.field_A + param2.field_E) / 2;
                break L1;
              }
            }
            L2: {
              if (1 == param4.field_d) {
                var7 = var7 + (-((lf) this).field_j.field_B + param2.field_C) / 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-3 != (param4.field_l ^ -1)) {
                break L3;
              } else {
                var6_int = var6_int + (param2.field_E + -((lf) this).field_j.field_A);
                break L3;
              }
            }
            L4: {
              if (2 != param4.field_d) {
                break L4;
              } else {
                var7 = var7 + (-((lf) this).field_j.field_B + param2.field_C);
                break L4;
              }
            }
            ((lf) this).field_j.b(var6_int, var7);
            break L0;
          }
        }
        var6 = param4.b(param2, -472248767);
        if (param3 >= 115) {
          L5: {
            if (var6 == null) {
              break L5;
            } else {
              if (param4.field_a == null) {
                break L5;
              } else {
                if (-1 < (((lf) this).field_g ^ -1)) {
                  break L5;
                } else {
                  L6: {
                    stackOut_16_0 = param4.field_a;
                    stackOut_16_1 = (String) var6;
                    stackOut_16_2 = param4.field_h;
                    stackOut_16_3 = param1 + param2.field_z;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    if (((lf) this).field_d == -2147483648) {
                      stackOut_18_0 = (jl) (Object) stackIn_18_0;
                      stackOut_18_1 = (String) (Object) stackIn_18_1;
                      stackOut_18_2 = stackIn_18_2;
                      stackOut_18_3 = stackIn_18_3;
                      stackOut_18_4 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      stackIn_19_3 = stackOut_18_3;
                      stackIn_19_4 = stackOut_18_4;
                      break L6;
                    } else {
                      stackOut_17_0 = (jl) (Object) stackIn_17_0;
                      stackOut_17_1 = (String) (Object) stackIn_17_1;
                      stackOut_17_2 = stackIn_17_2;
                      stackOut_17_3 = stackIn_17_3;
                      stackOut_17_4 = ((lf) this).field_d;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_19_2 = stackOut_17_2;
                      stackIn_19_3 = stackOut_17_3;
                      stackIn_19_4 = stackOut_17_4;
                      break L6;
                    }
                  }
                  L7: {
                    stackOut_19_0 = (jl) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) (Object) stackIn_19_1;
                    stackOut_19_2 = stackIn_19_2 + (stackIn_19_3 + stackIn_19_4);
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    if (((lf) this).field_h == -2147483648) {
                      stackOut_21_0 = (jl) (Object) stackIn_21_0;
                      stackOut_21_1 = (String) (Object) stackIn_21_1;
                      stackOut_21_2 = stackIn_21_2;
                      stackOut_21_3 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      stackIn_22_3 = stackOut_21_3;
                      break L7;
                    } else {
                      stackOut_20_0 = (jl) (Object) stackIn_20_0;
                      stackOut_20_1 = (String) (Object) stackIn_20_1;
                      stackOut_20_2 = stackIn_20_2;
                      stackOut_20_3 = ((lf) this).field_h;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      stackIn_22_3 = stackOut_20_3;
                      break L7;
                    }
                  }
                  L8: {
                    stackOut_22_0 = (jl) (Object) stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = stackIn_22_3 + (param4.field_k + param0 + param2.field_p);
                    stackOut_22_4 = -param4.field_h + (param2.field_E - param4.field_c);
                    stackOut_22_5 = -param4.field_f + (param2.field_C - param4.field_k);
                    stackOut_22_6 = ((lf) this).field_g;
                    stackOut_22_7 = ((lf) this).field_e;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    stackIn_24_4 = stackOut_22_4;
                    stackIn_24_5 = stackOut_22_5;
                    stackIn_24_6 = stackOut_22_6;
                    stackIn_24_7 = stackOut_22_7;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    stackIn_23_3 = stackOut_22_3;
                    stackIn_23_4 = stackOut_22_4;
                    stackIn_23_5 = stackOut_22_5;
                    stackIn_23_6 = stackOut_22_6;
                    stackIn_23_7 = stackOut_22_7;
                    if (-2147483648 != ((lf) this).field_a) {
                      stackOut_24_0 = (jl) (Object) stackIn_24_0;
                      stackOut_24_1 = (String) (Object) stackIn_24_1;
                      stackOut_24_2 = stackIn_24_2;
                      stackOut_24_3 = stackIn_24_3;
                      stackOut_24_4 = stackIn_24_4;
                      stackOut_24_5 = stackIn_24_5;
                      stackOut_24_6 = stackIn_24_6;
                      stackOut_24_7 = stackIn_24_7;
                      stackOut_24_8 = ((lf) this).field_a;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      stackIn_25_3 = stackOut_24_3;
                      stackIn_25_4 = stackOut_24_4;
                      stackIn_25_5 = stackOut_24_5;
                      stackIn_25_6 = stackOut_24_6;
                      stackIn_25_7 = stackOut_24_7;
                      stackIn_25_8 = stackOut_24_8;
                      break L8;
                    } else {
                      stackOut_23_0 = (jl) (Object) stackIn_23_0;
                      stackOut_23_1 = (String) (Object) stackIn_23_1;
                      stackOut_23_2 = stackIn_23_2;
                      stackOut_23_3 = stackIn_23_3;
                      stackOut_23_4 = stackIn_23_4;
                      stackOut_23_5 = stackIn_23_5;
                      stackOut_23_6 = stackIn_23_6;
                      stackOut_23_7 = stackIn_23_7;
                      stackOut_23_8 = 256;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      stackIn_25_3 = stackOut_23_3;
                      stackIn_25_4 = stackOut_23_4;
                      stackIn_25_5 = stackOut_23_5;
                      stackIn_25_6 = stackOut_23_6;
                      stackIn_25_7 = stackOut_23_7;
                      stackIn_25_8 = stackOut_23_8;
                      break L8;
                    }
                  }
                  int discarded$1 = ((jl) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, param4.field_l, param4.field_d, param4.field_j);
                  break L5;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final lf a(int param0, byte param1) {
        if (param1 != -68) {
            ((lf) this).field_a = 97;
        }
        ((lf) this).field_e = param0;
        return (lf) this;
    }

    final lf a(byte param0, int param1) {
        int var3 = -32 % ((56 - param0) / 46);
        ((lf) this).field_d = param1;
        return (lf) this;
    }

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        ((lf) this).field_g = 0;
        ((lf) this).field_d = 0;
        ((lf) this).field_e = -1;
        ((lf) this).field_k = null;
        ((lf) this).field_j = null;
        ((lf) this).field_a = 256;
        ((lf) this).field_h = 0;
    }

    final void a(lf param0, byte param1) {
        param0.field_h = ((lf) this).field_h;
        param0.field_e = ((lf) this).field_e;
        param0.field_d = ((lf) this).field_d;
        param0.field_j = ((lf) this).field_j;
        param0.field_a = ((lf) this).field_a;
        int var3 = 72 / ((param1 - -43) / 41);
        param0.field_g = ((lf) this).field_g;
        param0.field_c = ((lf) this).field_c;
        param0.field_k = ((lf) this).field_k;
    }

    final lf a(boolean param0, boolean param1) {
        if (!param0) {
            return null;
        }
        ((lf) this).field_c = param1 ? true : false;
        return (lf) this;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_f = null;
        field_i = null;
    }

    final lf a(int param0, boolean param1) {
        ((lf) this).field_h = param0;
        if (param1) {
            ((lf) this).field_g = 122;
        }
        return (lf) this;
    }

    final lf a(int param0, int param1) {
        ((lf) this).field_g = param0;
        if (param1 != 15115) {
            ((lf) this).field_d = 118;
        }
        return (lf) this;
    }

    lf() {
        ((lf) this).field_j = null;
        ((lf) this).field_k = null;
        ((lf) this).field_e = -2;
        ((lf) this).field_g = -2;
        ((lf) this).field_h = -2147483648;
        ((lf) this).field_c = false;
        ((lf) this).field_d = -2147483648;
        ((lf) this).field_a = -2147483648;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
