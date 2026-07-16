/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static hh field_a;
    private int field_f;
    private int field_i;
    ut[] field_g;
    private int field_h;
    private int field_b;
    static bu field_e;
    private boolean field_d;
    ut field_j;
    private int field_c;

    final void a(int param0) {
        ((hf) this).field_h = 0;
        ((hf) this).field_i = 256;
        ((hf) this).field_j = null;
        ((hf) this).field_g = null;
        ((hf) this).field_b = 0;
        if (param0 != -13136) {
            return;
        }
        ((hf) this).field_f = 0;
        ((hf) this).field_c = -1;
    }

    final hf a(boolean param0, ut[] param1) {
        if (!param0) {
            Object var4 = null;
            ((hf) this).a((hf) null, -70);
        }
        ((hf) this).field_g = param1;
        return (hf) this;
    }

    final hf b(byte param0, int param1) {
        if (param0 < 89) {
            hf.a(true);
        }
        ((hf) this).field_h = param1;
        return (hf) this;
    }

    final hf a(int param0, boolean param1) {
        if (!param1) {
            ((hf) this).field_j = null;
        }
        ((hf) this).field_c = param0;
        return (hf) this;
    }

    final static String a(byte param0, int param1, int param2, byte[] param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        char[] var12 = new char[param1];
        char[] var11 = var12;
        char[] var4 = var11;
        int var5 = 0;
        for (var6 = 0; (param1 ^ -1) < (var6 ^ -1); var6++) {
            var7 = param3[param2 + var6] & 255;
            if (!(-1 == (var7 ^ -1))) {
                if (-129 >= (var7 ^ -1)) {
                    if ((var7 ^ -1) > -161) {
                        var8 = ts.field_c[var7 - 128];
                        if (var8 == 0) {
                            var8 = 63;
                        }
                        var7 = var8;
                    }
                }
                int incrementValue$0 = var5;
                var5++;
                var4[incrementValue$0] = (char)var7;
            }
        }
        if (param0 >= -119) {
            Object var10 = null;
            boolean discarded$1 = hf.a((String) null, 99);
        }
        return new String(var12, 0, var5);
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_e = null;
        }
        field_e = null;
        field_a = null;
    }

    final hf a(byte param0, int param1) {
        ((hf) this).field_b = param1;
        if (param0 >= -26) {
            ((hf) this).field_d = true;
        }
        return (hf) this;
    }

    final hf a(boolean param0, byte param1) {
        int var3 = 19 / ((41 - param1) / 47);
        ((hf) this).field_d = param0 ? true : false;
        return (hf) this;
    }

    final void a(int param0, int param1, id param2, fd param3, int param4, hf param5) {
        if (!(!((hf) this).field_d)) {
            param5.a(param3, param2, param0, param4, 0);
            param5.a(-13136);
        }
        if (!(((hf) this).field_i == param1)) {
            param5.field_i = ((hf) this).field_i;
        }
        if (!(((hf) this).field_g == null)) {
            param5.field_g = ((hf) this).field_g;
        }
        if (((hf) this).field_c >= -1) {
            param5.field_c = ((hf) this).field_c;
        }
        if (((hf) this).field_j != null) {
            param5.field_j = ((hf) this).field_j;
        }
        if (!(2147483647 == (((hf) this).field_h ^ -1))) {
            param5.field_h = ((hf) this).field_h;
        }
        if (((hf) this).field_f >= -1) {
            param5.field_f = ((hf) this).field_f;
        }
        if (!(2147483647 == (((hf) this).field_b ^ -1))) {
            param5.field_b = ((hf) this).field_b;
        }
    }

    final hf b(int param0, int param1) {
        if (param0 != -2) {
            return null;
        }
        ((hf) this).field_f = param1;
        return (hf) this;
    }

    final void a(hf param0, int param1) {
        param0.field_h = ((hf) this).field_h;
        param0.field_b = ((hf) this).field_b;
        param0.field_d = ((hf) this).field_d;
        param0.field_g = ((hf) this).field_g;
        param0.field_j = ((hf) this).field_j;
        param0.field_c = ((hf) this).field_c;
        if (param1 != -2147483648) {
            ((hf) this).field_i = -81;
        }
        param0.field_i = ((hf) this).field_i;
        param0.field_f = ((hf) this).field_f;
    }

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Kickabout.field_G;
          var2 = 0;
          if (param1 == -3) {
            break L0;
          } else {
            hf.a(false);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= param0.length()) {
            return false;
          } else {
            var3 = param0.charAt(var2);
            if (!se.a((byte) -113, (char) var3)) {
              if (!gn.a(12105, (char) var3)) {
                return true;
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

    final static int a(int param0, nu param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var8 = Kickabout.field_G;
          if (1 != param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if (param2 >= 26) {
            break L1;
          } else {
            var9 = null;
            boolean discarded$2 = hf.a((String) null, 97);
            break L1;
          }
        }
        L2: {
          if (var3 != 0) {
            stackOut_7_0 = -1;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 1345;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        var4 = stackIn_8_0;
        var5 = -1;
        var6 = 1;
        L3: while (true) {
          if (5 <= var6) {
            return var5;
          } else {
            L4: {
              L5: {
                var7 = param1.field_P[param0][var6].a(true);
                if (var3 == 0) {
                  break L5;
                } else {
                  if (var7 >= var4) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (var3 == 0) {
                if (var4 >= var7) {
                  break L4;
                } else {
                  var6++;
                  continue L3;
                }
              } else {
                var6++;
                continue L3;
              }
            }
            var4 = var7;
            var5 = var6;
            var6++;
            continue L3;
          }
        }
    }

    final void a(fd param0, id param1, int param2, int param3, int param4) {
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        Object var8 = null;
        hu stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        hu stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        hu stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        hu stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        hu stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        hu stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        hu stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        hu stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        hu stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        int stackIn_28_8 = 0;
        hu stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        hu stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        hu stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        hu stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        hu stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        hu stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        hu stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        hu stackOut_27_0 = null;
        String stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        hu stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        L0: {
          if (param4 == 0) {
            break L0;
          } else {
            var8 = null;
            ((hf) this).a((hf) null, 96);
            break L0;
          }
        }
        L1: {
          ea.a(param2 + param0.field_g, param0.field_i, param0.field_t + param3, (byte) 79, ((hf) this).field_g, param0.field_n);
          if (null != ((hf) this).field_j) {
            L2: {
              var6_int = ((hf) this).field_b + param0.field_t + param3;
              if (-2 == (param1.field_e ^ -1)) {
                var6_int = var6_int + (-((hf) this).field_j.field_o + param0.field_n) / 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = param2 - -param0.field_g - -((hf) this).field_h;
              if (1 != param1.field_m) {
                break L3;
              } else {
                var7 = var7 + (-((hf) this).field_j.field_v + param0.field_i) / 2;
                break L3;
              }
            }
            L4: {
              if (-3 == (param1.field_e ^ -1)) {
                var6_int = var6_int + (param0.field_n + -((hf) this).field_j.field_o);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((param1.field_m ^ -1) != -3) {
                break L5;
              } else {
                var7 = var7 + (param0.field_i - ((hf) this).field_j.field_v);
                break L5;
              }
            }
            ((hf) this).field_j.c(var6_int, var7);
            break L1;
          } else {
            break L1;
          }
        }
        L6: {
          var6 = param1.b((byte) -83, param0);
          if (var6 == null) {
            break L6;
          } else {
            if (null == param1.field_a) {
              break L6;
            } else {
              if ((((hf) this).field_f ^ -1) <= -1) {
                L7: {
                  stackOut_19_0 = param1.field_a;
                  stackOut_19_1 = (String) var6;
                  stackOut_19_2 = param1.field_h;
                  stackOut_19_3 = param0.field_t;
                  stackOut_19_4 = param3;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  stackIn_21_3 = stackOut_19_3;
                  stackIn_21_4 = stackOut_19_4;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  stackIn_20_3 = stackOut_19_3;
                  stackIn_20_4 = stackOut_19_4;
                  if (((hf) this).field_b != -2147483648) {
                    stackOut_21_0 = (hu) (Object) stackIn_21_0;
                    stackOut_21_1 = (String) (Object) stackIn_21_1;
                    stackOut_21_2 = stackIn_21_2;
                    stackOut_21_3 = stackIn_21_3;
                    stackOut_21_4 = stackIn_21_4;
                    stackOut_21_5 = ((hf) this).field_b;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    stackIn_22_3 = stackOut_21_3;
                    stackIn_22_4 = stackOut_21_4;
                    stackIn_22_5 = stackOut_21_5;
                    break L7;
                  } else {
                    stackOut_20_0 = (hu) (Object) stackIn_20_0;
                    stackOut_20_1 = (String) (Object) stackIn_20_1;
                    stackOut_20_2 = stackIn_20_2;
                    stackOut_20_3 = stackIn_20_3;
                    stackOut_20_4 = stackIn_20_4;
                    stackOut_20_5 = 0;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_22_2 = stackOut_20_2;
                    stackIn_22_3 = stackOut_20_3;
                    stackIn_22_4 = stackOut_20_4;
                    stackIn_22_5 = stackOut_20_5;
                    break L7;
                  }
                }
                L8: {
                  stackOut_22_0 = (hu) (Object) stackIn_22_0;
                  stackOut_22_1 = (String) (Object) stackIn_22_1;
                  stackOut_22_2 = stackIn_22_2 + (stackIn_22_3 + (stackIn_22_4 - -stackIn_22_5));
                  stackOut_22_3 = param1.field_q + param0.field_g + param2;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  stackIn_24_3 = stackOut_22_3;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  stackIn_23_3 = stackOut_22_3;
                  if (-2147483648 != ((hf) this).field_h) {
                    stackOut_24_0 = (hu) (Object) stackIn_24_0;
                    stackOut_24_1 = (String) (Object) stackIn_24_1;
                    stackOut_24_2 = stackIn_24_2;
                    stackOut_24_3 = stackIn_24_3;
                    stackOut_24_4 = ((hf) this).field_h;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    stackIn_25_3 = stackOut_24_3;
                    stackIn_25_4 = stackOut_24_4;
                    break L8;
                  } else {
                    stackOut_23_0 = (hu) (Object) stackIn_23_0;
                    stackOut_23_1 = (String) (Object) stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = stackIn_23_3;
                    stackOut_23_4 = 0;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_25_2 = stackOut_23_2;
                    stackIn_25_3 = stackOut_23_3;
                    stackIn_25_4 = stackOut_23_4;
                    break L8;
                  }
                }
                L9: {
                  stackOut_25_0 = (hu) (Object) stackIn_25_0;
                  stackOut_25_1 = (String) (Object) stackIn_25_1;
                  stackOut_25_2 = stackIn_25_2;
                  stackOut_25_3 = stackIn_25_3 - -stackIn_25_4;
                  stackOut_25_4 = -param1.field_l + (param0.field_n + -param1.field_h);
                  stackOut_25_5 = -param1.field_o + (param0.field_i - param1.field_q);
                  stackOut_25_6 = ((hf) this).field_f;
                  stackOut_25_7 = ((hf) this).field_c;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  stackIn_27_3 = stackOut_25_3;
                  stackIn_27_4 = stackOut_25_4;
                  stackIn_27_5 = stackOut_25_5;
                  stackIn_27_6 = stackOut_25_6;
                  stackIn_27_7 = stackOut_25_7;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  stackIn_26_3 = stackOut_25_3;
                  stackIn_26_4 = stackOut_25_4;
                  stackIn_26_5 = stackOut_25_5;
                  stackIn_26_6 = stackOut_25_6;
                  stackIn_26_7 = stackOut_25_7;
                  if (-2147483648 == ((hf) this).field_i) {
                    stackOut_27_0 = (hu) (Object) stackIn_27_0;
                    stackOut_27_1 = (String) (Object) stackIn_27_1;
                    stackOut_27_2 = stackIn_27_2;
                    stackOut_27_3 = stackIn_27_3;
                    stackOut_27_4 = stackIn_27_4;
                    stackOut_27_5 = stackIn_27_5;
                    stackOut_27_6 = stackIn_27_6;
                    stackOut_27_7 = stackIn_27_7;
                    stackOut_27_8 = 256;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    stackIn_28_3 = stackOut_27_3;
                    stackIn_28_4 = stackOut_27_4;
                    stackIn_28_5 = stackOut_27_5;
                    stackIn_28_6 = stackOut_27_6;
                    stackIn_28_7 = stackOut_27_7;
                    stackIn_28_8 = stackOut_27_8;
                    break L9;
                  } else {
                    stackOut_26_0 = (hu) (Object) stackIn_26_0;
                    stackOut_26_1 = (String) (Object) stackIn_26_1;
                    stackOut_26_2 = stackIn_26_2;
                    stackOut_26_3 = stackIn_26_3;
                    stackOut_26_4 = stackIn_26_4;
                    stackOut_26_5 = stackIn_26_5;
                    stackOut_26_6 = stackIn_26_6;
                    stackOut_26_7 = stackIn_26_7;
                    stackOut_26_8 = ((hf) this).field_i;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_28_1 = stackOut_26_1;
                    stackIn_28_2 = stackOut_26_2;
                    stackIn_28_3 = stackOut_26_3;
                    stackIn_28_4 = stackOut_26_4;
                    stackIn_28_5 = stackOut_26_5;
                    stackIn_28_6 = stackOut_26_6;
                    stackIn_28_7 = stackOut_26_7;
                    stackIn_28_8 = stackOut_26_8;
                    break L9;
                  }
                }
                int discarded$1 = ((hu) (Object) stackIn_28_0).a(stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param1.field_e, param1.field_m, param1.field_p);
                break L6;
              } else {
                break L6;
              }
            }
          }
        }
    }

    hf() {
        ((hf) this).field_i = -2147483648;
        ((hf) this).field_f = -2;
        ((hf) this).field_d = false;
        ((hf) this).field_h = -2147483648;
        ((hf) this).field_b = -2147483648;
        ((hf) this).field_g = null;
        ((hf) this).field_c = -2;
        ((hf) this).field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new hh();
    }
}
