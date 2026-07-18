/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    private boolean field_i;
    private int field_h;
    static ao field_g;
    private int field_m;
    private int field_f;
    static String[] field_c;
    private int field_a;
    ja field_k;
    private int field_j;
    ja[] field_e;
    static String field_n;
    static int field_d;
    static ul field_b;
    static String field_l;

    final mk a(int param0, int param1) {
        ((mk) this).field_f = param0;
        if (param1 != 2147483647) {
            ((mk) this).field_a = 30;
            return (mk) this;
        }
        return (mk) this;
    }

    final mk a(boolean param0, int param1) {
        ((mk) this).field_i = param0 ? true : false;
        if (param1 != 2521) {
            return null;
        }
        return (mk) this;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_l = null;
        field_g = null;
        field_n = null;
        int var1 = 1;
    }

    final mk a(ja[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ((mk) this).field_e = param0;
            if (param1 == 2147483647) {
              stackOut_3_0 = this;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mk) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("mk.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return (mk) this;
    }

    final static String[] a(char param0, boolean param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) (Object) param2;
            var3_int = ro.a(-125, param0, var10);
            var4 = new String[var3_int + 1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var3_int <= var7) {
                var4[var3_int] = param2.substring(var6);
                stackOut_9_0 = (String[]) var4;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var8 = var6;
                L2: while (true) {
                  if (param2.charAt(var8) == param0) {
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param2.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("mk.C(").append(param0).append(',').append(false).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final void a(byte param0) {
        Object var3 = null;
        if (param0 != 11) {
          var3 = null;
          ((mk) this).a(14, true, (jl) null, (cf) null, -114);
          ((mk) this).field_f = 0;
          ((mk) this).field_j = 0;
          ((mk) this).field_m = 0;
          ((mk) this).field_e = null;
          ((mk) this).field_a = 256;
          ((mk) this).field_k = null;
          ((mk) this).field_h = -1;
          return;
        } else {
          ((mk) this).field_f = 0;
          ((mk) this).field_j = 0;
          ((mk) this).field_m = 0;
          ((mk) this).field_e = null;
          ((mk) this).field_a = 256;
          ((mk) this).field_k = null;
          ((mk) this).field_h = -1;
          return;
        }
    }

    final mk a(byte param0, int param1) {
        ((mk) this).field_h = param1;
        int var3 = 73 / ((param0 - -40) / 34);
        return (mk) this;
    }

    final void a(int param0, boolean param1, jl param2, cf param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
        int var7 = 0;
        fm stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        fm stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        fm stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        fm stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        fm stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        fm stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        fm stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        fm stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        fm stackIn_29_0 = null;
        String stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        int stackIn_29_7 = 0;
        int stackIn_29_8 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        fm stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        fm stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        fm stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        fm stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        fm stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        fm stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        fm stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        fm stackOut_28_0 = null;
        String stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        int stackOut_28_6 = 0;
        int stackOut_28_7 = 0;
        int stackOut_28_8 = 0;
        fm stackOut_27_0 = null;
        String stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        try {
          L0: {
            L1: {
              s.a(param3.field_i + param4, 0, ((mk) this).field_e, param3.field_y + param0, param3.field_w, param3.field_n);
              if (!param1) {
                break L1;
              } else {
                ((mk) this).field_m = -63;
                break L1;
              }
            }
            L2: {
              if (((mk) this).field_k != null) {
                L3: {
                  var6_int = param3.field_y + (param0 - -((mk) this).field_f);
                  if (param2.field_d != 1) {
                    break L3;
                  } else {
                    var6_int = var6_int + (-((mk) this).field_k.field_z + param3.field_n) / 2;
                    break L3;
                  }
                }
                L4: {
                  var7 = ((mk) this).field_j + (param3.field_i + param4);
                  if (param2.field_a == 1) {
                    var7 = var7 + (param3.field_w - ((mk) this).field_k.field_u) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param2.field_d == 2) {
                    var6_int = var6_int + (param3.field_n - ((mk) this).field_k.field_z);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param2.field_a == 2) {
                    var7 = var7 + (-((mk) this).field_k.field_u + param3.field_w);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ((mk) this).field_k.g(var6_int, var7);
                break L2;
              } else {
                break L2;
              }
            }
            L7: {
              var6_ref = param2.d(param3, -9327);
              if (var6_ref == null) {
                break L7;
              } else {
                if (param2.field_j == null) {
                  break L7;
                } else {
                  if (((mk) this).field_m >= 0) {
                    L8: {
                      stackOut_20_0 = param2.field_j;
                      stackOut_20_1 = (String) var6_ref;
                      stackOut_20_2 = param0 - -param3.field_y;
                      stackOut_20_3 = param2.field_r;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      stackIn_22_3 = stackOut_20_3;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      stackIn_21_3 = stackOut_20_3;
                      if (((mk) this).field_f == -2147483648) {
                        stackOut_22_0 = (fm) (Object) stackIn_22_0;
                        stackOut_22_1 = (String) (Object) stackIn_22_1;
                        stackOut_22_2 = stackIn_22_2;
                        stackOut_22_3 = stackIn_22_3;
                        stackOut_22_4 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        stackIn_23_3 = stackOut_22_3;
                        stackIn_23_4 = stackOut_22_4;
                        break L8;
                      } else {
                        stackOut_21_0 = (fm) (Object) stackIn_21_0;
                        stackOut_21_1 = (String) (Object) stackIn_21_1;
                        stackOut_21_2 = stackIn_21_2;
                        stackOut_21_3 = stackIn_21_3;
                        stackOut_21_4 = ((mk) this).field_f;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        stackIn_23_3 = stackOut_21_3;
                        stackIn_23_4 = stackOut_21_4;
                        break L8;
                      }
                    }
                    L9: {
                      stackOut_23_0 = (fm) (Object) stackIn_23_0;
                      stackOut_23_1 = (String) (Object) stackIn_23_1;
                      stackOut_23_2 = stackIn_23_2 + (stackIn_23_3 - -stackIn_23_4);
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      stackIn_24_2 = stackOut_23_2;
                      if (((mk) this).field_j != -2147483648) {
                        stackOut_25_0 = (fm) (Object) stackIn_25_0;
                        stackOut_25_1 = (String) (Object) stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = ((mk) this).field_j;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        stackIn_26_3 = stackOut_25_3;
                        break L9;
                      } else {
                        stackOut_24_0 = (fm) (Object) stackIn_24_0;
                        stackOut_24_1 = (String) (Object) stackIn_24_1;
                        stackOut_24_2 = stackIn_24_2;
                        stackOut_24_3 = 0;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackIn_26_2 = stackOut_24_2;
                        stackIn_26_3 = stackOut_24_3;
                        break L9;
                      }
                    }
                    L10: {
                      stackOut_26_0 = (fm) (Object) stackIn_26_0;
                      stackOut_26_1 = (String) (Object) stackIn_26_1;
                      stackOut_26_2 = stackIn_26_2;
                      stackOut_26_3 = stackIn_26_3 + (param2.field_g + (param3.field_i + param4));
                      stackOut_26_4 = -param2.field_r + param3.field_n - param2.field_n;
                      stackOut_26_5 = param3.field_w - param2.field_g - param2.field_p;
                      stackOut_26_6 = ((mk) this).field_m;
                      stackOut_26_7 = ((mk) this).field_h;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackIn_28_2 = stackOut_26_2;
                      stackIn_28_3 = stackOut_26_3;
                      stackIn_28_4 = stackOut_26_4;
                      stackIn_28_5 = stackOut_26_5;
                      stackIn_28_6 = stackOut_26_6;
                      stackIn_28_7 = stackOut_26_7;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      stackIn_27_2 = stackOut_26_2;
                      stackIn_27_3 = stackOut_26_3;
                      stackIn_27_4 = stackOut_26_4;
                      stackIn_27_5 = stackOut_26_5;
                      stackIn_27_6 = stackOut_26_6;
                      stackIn_27_7 = stackOut_26_7;
                      if (((mk) this).field_a != -2147483648) {
                        stackOut_28_0 = (fm) (Object) stackIn_28_0;
                        stackOut_28_1 = (String) (Object) stackIn_28_1;
                        stackOut_28_2 = stackIn_28_2;
                        stackOut_28_3 = stackIn_28_3;
                        stackOut_28_4 = stackIn_28_4;
                        stackOut_28_5 = stackIn_28_5;
                        stackOut_28_6 = stackIn_28_6;
                        stackOut_28_7 = stackIn_28_7;
                        stackOut_28_8 = ((mk) this).field_a;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        stackIn_29_2 = stackOut_28_2;
                        stackIn_29_3 = stackOut_28_3;
                        stackIn_29_4 = stackOut_28_4;
                        stackIn_29_5 = stackOut_28_5;
                        stackIn_29_6 = stackOut_28_6;
                        stackIn_29_7 = stackOut_28_7;
                        stackIn_29_8 = stackOut_28_8;
                        break L10;
                      } else {
                        stackOut_27_0 = (fm) (Object) stackIn_27_0;
                        stackOut_27_1 = (String) (Object) stackIn_27_1;
                        stackOut_27_2 = stackIn_27_2;
                        stackOut_27_3 = stackIn_27_3;
                        stackOut_27_4 = stackIn_27_4;
                        stackOut_27_5 = stackIn_27_5;
                        stackOut_27_6 = stackIn_27_6;
                        stackOut_27_7 = stackIn_27_7;
                        stackOut_27_8 = 256;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        stackIn_29_2 = stackOut_27_2;
                        stackIn_29_3 = stackOut_27_3;
                        stackIn_29_4 = stackOut_27_4;
                        stackIn_29_5 = stackOut_27_5;
                        stackIn_29_6 = stackOut_27_6;
                        stackIn_29_7 = stackOut_27_7;
                        stackIn_29_8 = stackOut_27_8;
                        break L10;
                      }
                    }
                    int discarded$1 = ((fm) (Object) stackIn_29_0).a(stackIn_29_1, stackIn_29_2, stackIn_29_3, stackIn_29_4, stackIn_29_5, stackIn_29_6, stackIn_29_7, stackIn_29_8, param2.field_d, param2.field_a, param2.field_f);
                    break L7;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("mk.D(").append(param0).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          L12: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param3 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, jl param3, cf param4, mk param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (((mk) this).field_i) {
                param5.a(param1, false, param3, param4, param2);
                param5.a((byte) 11);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((mk) this).field_h < -1) {
                break L2;
              } else {
                param5.field_h = ((mk) this).field_h;
                break L2;
              }
            }
            L3: {
              if (((mk) this).field_k == null) {
                break L3;
              } else {
                param5.field_k = ((mk) this).field_k;
                break L3;
              }
            }
            L4: {
              if (((mk) this).field_j != -2147483648) {
                param5.field_j = ((mk) this).field_j;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (((mk) this).field_a != -2147483648) {
                param5.field_a = ((mk) this).field_a;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-2147483648 == ((mk) this).field_f) {
                break L6;
              } else {
                param5.field_f = ((mk) this).field_f;
                break L6;
              }
            }
            L7: {
              if (param0 == -11108) {
                break L7;
              } else {
                mk discarded$1 = ((mk) this).b(-59, -41);
                break L7;
              }
            }
            L8: {
              if (null == ((mk) this).field_e) {
                break L8;
              } else {
                param5.field_e = ((mk) this).field_e;
                break L8;
              }
            }
            if (-1 <= ((mk) this).field_m) {
              param5.field_m = ((mk) this).field_m;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("mk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param5 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
    }

    final void a(int param0, mk param1) {
        param1.field_m = ((mk) this).field_m;
        param1.field_h = ((mk) this).field_h;
        param1.field_i = ((mk) this).field_i;
        if (param0 <= 72) {
            return;
        }
        try {
            param1.field_a = ((mk) this).field_a;
            param1.field_j = ((mk) this).field_j;
            param1.field_f = ((mk) this).field_f;
            param1.field_k = ((mk) this).field_k;
            param1.field_e = ((mk) this).field_e;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "mk.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final mk b(int param0, int param1) {
        if (param1 != 0) {
            mk discarded$0 = ((mk) this).b(92, -13);
            ((mk) this).field_m = param0;
            return (mk) this;
        }
        ((mk) this).field_m = param0;
        return (mk) this;
    }

    final mk a(int param0, byte param1) {
        ((mk) this).field_j = param0;
        if (param1 != 47) {
            return null;
        }
        return (mk) this;
    }

    mk() {
        ((mk) this).field_h = -2;
        ((mk) this).field_a = -2147483648;
        ((mk) this).field_i = false;
        ((mk) this).field_m = -2;
        ((mk) this).field_k = null;
        ((mk) this).field_j = -2147483648;
        ((mk) this).field_f = -2147483648;
        ((mk) this).field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Showing by rating", "Showing by win percentage"};
        field_g = new ao(6, 0, 4, 2);
        field_n = "Tips";
        field_d = 64;
        field_l = "Rated game";
    }
}
