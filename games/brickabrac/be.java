/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    private int field_m;
    static String field_e;
    private boolean field_p;
    private int field_l;
    static boolean field_a;
    static int field_c;
    static jp field_d;
    private int field_b;
    static String field_n;
    static int field_j;
    static int[] field_o;
    private int field_h;
    jp[] field_f;
    jp field_k;
    static int field_g;
    private int field_i;

    public static void b(int param0) {
        field_n = null;
        field_o = null;
        field_e = null;
        field_d = null;
    }

    final be b(int param0, byte param1) {
        if (param1 != -50) {
            be discarded$0 = ((be) this).a(true, -56);
            ((be) this).field_i = param0;
            return (be) this;
        }
        ((be) this).field_i = param0;
        return (be) this;
    }

    final be a(boolean param0, boolean param1) {
        Object var4 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((be) this).field_p = stackIn_3_1 != 0;
        if (param1) {
          var4 = null;
          String discarded$2 = be.a((mf) null, (String) null, -112, (String) null);
          return (be) this;
        } else {
          return (be) this;
        }
    }

    final be a(int param0, byte param1) {
        if (param1 != -69) {
            ((be) this).field_h = 10;
            ((be) this).field_l = param0;
            return (be) this;
        }
        ((be) this).field_l = param0;
        return (be) this;
    }

    final static String a(mf param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var4_int = 94 % ((param2 - 52) / 42);
            if (!param0.a((byte) -127)) {
              stackOut_2_0 = (String) param1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              stackOut_4_0 = param3 + " - " + param0.b(-4126) + "%";
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("be.L(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_5_0;
    }

    final void a(int param0, up param1, oc param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
        int var7 = 0;
        dh stackIn_17_0 = null;
        String stackIn_17_1 = null;
        dh stackIn_18_0 = null;
        String stackIn_18_1 = null;
        dh stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        dh stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        int stackIn_20_5 = 0;
        dh stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        dh stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        dh stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        dh stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        dh stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        int stackIn_25_8 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        dh stackOut_16_0 = null;
        String stackOut_16_1 = null;
        dh stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        dh stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        dh stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        dh stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        dh stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int stackOut_20_6 = 0;
        dh stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        dh stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        dh stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              nh.a(param2.field_t, param2.field_s, -40, param2.field_o + param4, ((be) this).field_f, param0 - -param2.field_w);
              if (null != ((be) this).field_k) {
                L2: {
                  var6_int = ((be) this).field_i + param2.field_o + param4;
                  if (param1.field_f != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (param2.field_t + -((be) this).field_k.field_x) / 2;
                    break L2;
                  }
                }
                L3: {
                  var7 = ((be) this).field_m + (param0 - -param2.field_w);
                  if (param1.field_m == 1) {
                    var7 = var7 + (-((be) this).field_k.field_z + param2.field_s) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (2 == param1.field_f) {
                    var6_int = var6_int + (param2.field_t + -((be) this).field_k.field_x);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_m != 2) {
                    break L5;
                  } else {
                    var7 = var7 + (param2.field_s + -((be) this).field_k.field_z);
                    break L5;
                  }
                }
                ((be) this).field_k.c(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              var6_ref = param1.a(param2, true);
              var7 = 3 % ((param3 - 13) / 43);
              if (var6_ref == null) {
                break L6;
              } else {
                if (param1.field_k == null) {
                  break L6;
                } else {
                  if (0 > ((be) this).field_h) {
                    break L6;
                  } else {
                    L7: {
                      stackOut_16_0 = param1.field_k;
                      stackOut_16_1 = (String) var6_ref;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if (((be) this).field_i != -2147483648) {
                        stackOut_18_0 = (dh) (Object) stackIn_18_0;
                        stackOut_18_1 = (String) (Object) stackIn_18_1;
                        stackOut_18_2 = ((be) this).field_i;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        break L7;
                      } else {
                        stackOut_17_0 = (dh) (Object) stackIn_17_0;
                        stackOut_17_1 = (String) (Object) stackIn_17_1;
                        stackOut_17_2 = 0;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L7;
                      }
                    }
                    L8: {
                      stackOut_19_0 = (dh) (Object) stackIn_19_0;
                      stackOut_19_1 = (String) (Object) stackIn_19_1;
                      stackOut_19_2 = stackIn_19_2 + param1.field_d + (param4 - -param2.field_o);
                      stackOut_19_3 = param0;
                      stackOut_19_4 = -param2.field_w;
                      stackOut_19_5 = -param1.field_q;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_21_2 = stackOut_19_2;
                      stackIn_21_3 = stackOut_19_3;
                      stackIn_21_4 = stackOut_19_4;
                      stackIn_21_5 = stackOut_19_5;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      stackIn_20_3 = stackOut_19_3;
                      stackIn_20_4 = stackOut_19_4;
                      stackIn_20_5 = stackOut_19_5;
                      if (((be) this).field_m == -2147483648) {
                        stackOut_21_0 = (dh) (Object) stackIn_21_0;
                        stackOut_21_1 = (String) (Object) stackIn_21_1;
                        stackOut_21_2 = stackIn_21_2;
                        stackOut_21_3 = stackIn_21_3;
                        stackOut_21_4 = stackIn_21_4;
                        stackOut_21_5 = stackIn_21_5;
                        stackOut_21_6 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        stackIn_22_3 = stackOut_21_3;
                        stackIn_22_4 = stackOut_21_4;
                        stackIn_22_5 = stackOut_21_5;
                        stackIn_22_6 = stackOut_21_6;
                        break L8;
                      } else {
                        stackOut_20_0 = (dh) (Object) stackIn_20_0;
                        stackOut_20_1 = (String) (Object) stackIn_20_1;
                        stackOut_20_2 = stackIn_20_2;
                        stackOut_20_3 = stackIn_20_3;
                        stackOut_20_4 = stackIn_20_4;
                        stackOut_20_5 = stackIn_20_5;
                        stackOut_20_6 = ((be) this).field_m;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        stackIn_22_3 = stackOut_20_3;
                        stackIn_22_4 = stackOut_20_4;
                        stackIn_22_5 = stackOut_20_5;
                        stackIn_22_6 = stackOut_20_6;
                        break L8;
                      }
                    }
                    L9: {
                      stackOut_22_0 = (dh) (Object) stackIn_22_0;
                      stackOut_22_1 = (String) (Object) stackIn_22_1;
                      stackOut_22_2 = stackIn_22_2;
                      stackOut_22_3 = stackIn_22_3 - (stackIn_22_4 + (stackIn_22_5 - stackIn_22_6));
                      stackOut_22_4 = param2.field_t - param1.field_d + -param1.field_i;
                      stackOut_22_5 = -param1.field_q + (param2.field_s - param1.field_a);
                      stackOut_22_6 = ((be) this).field_h;
                      stackOut_22_7 = ((be) this).field_l;
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
                      if (((be) this).field_b == -2147483648) {
                        stackOut_24_0 = (dh) (Object) stackIn_24_0;
                        stackOut_24_1 = (String) (Object) stackIn_24_1;
                        stackOut_24_2 = stackIn_24_2;
                        stackOut_24_3 = stackIn_24_3;
                        stackOut_24_4 = stackIn_24_4;
                        stackOut_24_5 = stackIn_24_5;
                        stackOut_24_6 = stackIn_24_6;
                        stackOut_24_7 = stackIn_24_7;
                        stackOut_24_8 = 256;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        stackIn_25_3 = stackOut_24_3;
                        stackIn_25_4 = stackOut_24_4;
                        stackIn_25_5 = stackOut_24_5;
                        stackIn_25_6 = stackOut_24_6;
                        stackIn_25_7 = stackOut_24_7;
                        stackIn_25_8 = stackOut_24_8;
                        break L9;
                      } else {
                        stackOut_23_0 = (dh) (Object) stackIn_23_0;
                        stackOut_23_1 = (String) (Object) stackIn_23_1;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = stackIn_23_3;
                        stackOut_23_4 = stackIn_23_4;
                        stackOut_23_5 = stackIn_23_5;
                        stackOut_23_6 = stackIn_23_6;
                        stackOut_23_7 = stackIn_23_7;
                        stackOut_23_8 = ((be) this).field_b;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        stackIn_25_3 = stackOut_23_3;
                        stackIn_25_4 = stackOut_23_4;
                        stackIn_25_5 = stackOut_23_5;
                        stackIn_25_6 = stackOut_23_6;
                        stackIn_25_7 = stackOut_23_7;
                        stackIn_25_8 = stackOut_23_8;
                        break L9;
                      }
                    }
                    int discarded$1 = ((dh) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, param1.field_f, param1.field_m, param1.field_h);
                    break L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("be.E(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          L11: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(be param0, int param1, up param2, oc param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              if (!((be) this).field_p) {
                break L1;
              } else {
                param0.a(param5, param2, param3, (byte) 99, param4);
                param0.a(-2147483648);
                break L1;
              }
            }
            L2: {
              if (((be) this).field_i != -2147483648) {
                param0.field_i = ((be) this).field_i;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((be) this).field_m == -2147483648) {
                break L3;
              } else {
                param0.field_m = ((be) this).field_m;
                break L3;
              }
            }
            L4: {
              if (null == ((be) this).field_k) {
                break L4;
              } else {
                param0.field_k = ((be) this).field_k;
                break L4;
              }
            }
            L5: {
              if (-1 <= ((be) this).field_h) {
                param0.field_h = ((be) this).field_h;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((be) this).field_l < -1) {
                break L6;
              } else {
                param0.field_l = ((be) this).field_l;
                break L6;
              }
            }
            L7: {
              if (~((be) this).field_b != param1) {
                param0.field_b = ((be) this).field_b;
                break L7;
              } else {
                break L7;
              }
            }
            if (null != ((be) this).field_f) {
              param0.field_f = ((be) this).field_f;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var7;
            stackOut_21_1 = new StringBuilder().append("be.N(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static byte[] a(boolean param0, Object param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        tl var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_13_0 = null;
        Object stackOut_10_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_5_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          if (param1 != null) {
            if (!(param1 instanceof byte[])) {
              if (!param0) {
                if (!(param1 instanceof tl)) {
                  throw new IllegalArgumentException();
                } else {
                  var4 = (tl) param1;
                  stackOut_13_0 = var4.b(16616);
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              } else {
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                return (byte[]) (Object) stackIn_11_0;
              }
            } else {
              var3 = (byte[]) param1;
              if (!param2) {
                stackOut_7_0 = (byte[]) var3;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                stackOut_5_0 = ke.a(false, var3);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("be.G(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L0;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L0;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ')');
        }
    }

    final be a(int param0, int param1) {
        if (param0 != 0) {
            ((be) this).field_h = 14;
            ((be) this).field_m = param1;
            return (be) this;
        }
        ((be) this).field_m = param1;
        return (be) this;
    }

    final be a(boolean param0, int param1) {
        ((be) this).field_h = param1;
        if (param0) {
            be discarded$0 = ((be) this).a(false, 75);
            return (be) this;
        }
        return (be) this;
    }

    final void a(boolean param0, be param1) {
        try {
            if (param0) {
                Object var4 = null;
                byte[] discarded$0 = be.a(true, (Object) null, true);
            }
            param1.field_k = ((be) this).field_k;
            param1.field_i = ((be) this).field_i;
            param1.field_p = ((be) this).field_p;
            param1.field_b = ((be) this).field_b;
            param1.field_h = ((be) this).field_h;
            param1.field_m = ((be) this).field_m;
            param1.field_f = ((be) this).field_f;
            param1.field_l = ((be) this).field_l;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "be.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        return tf.field_i;
    }

    final be a(jp[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -2147483648) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            ((be) this).field_f = param0;
            stackOut_2_0 = this;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("be.J(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return (be) this;
    }

    final void a(int param0) {
        ((be) this).field_b = 256;
        ((be) this).field_h = 0;
        if (param0 != -2147483648) {
          return;
        } else {
          ((be) this).field_i = 0;
          ((be) this).field_m = 0;
          ((be) this).field_l = -1;
          ((be) this).field_f = null;
          ((be) this).field_k = null;
          return;
        }
    }

    be() {
        ((be) this).field_m = -2147483648;
        ((be) this).field_p = false;
        ((be) this).field_l = -2;
        ((be) this).field_b = -2147483648;
        ((be) this).field_h = -2;
        ((be) this).field_f = null;
        ((be) this).field_k = null;
        ((be) this).field_i = -2147483648;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_a = true;
        field_e = "Won";
        field_n = "You can ask to join this game";
        field_o = new int[]{20, 21, 36, 6, 8};
    }
}
