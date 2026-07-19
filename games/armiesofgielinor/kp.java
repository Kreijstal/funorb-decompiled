/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp implements kh {
    private int field_f;
    private ka field_a;
    static String field_k;
    private int field_g;
    static String field_c;
    static String field_j;
    private int field_b;
    private int field_d;
    static String field_e;
    private int field_i;
    private int field_h;

    final static int a(int param0, int param1) {
        int var2 = -125 / ((param1 - -11) / 51);
        int var3 = 0;
        if (0 == param0) {
            var3 = ol.field_B;
        }
        if ((param0 ^ -1) == -2) {
            var3 = va.field_D;
        }
        if (!((param0 ^ -1) != -3)) {
            var3 = cd.field_c;
        }
        return var3;
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        pi var12 = null;
        kb stackIn_4_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kb stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 instanceof pi) {
                stackOut_3_0 = (kb) (param0);
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (kb) ((Object) stackOut_2_0);
                break L1;
              }
            }
            L2: {
              var12 = (pi) ((Object) stackIn_4_0);
              qn.f(param0.field_B + param1, param4 + param0.field_p, param0.field_l, param0.field_w, this.field_d);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = param0.field_l - 2 * var12.field_R;
            var8 = param0.field_B + param1 - -var12.field_R;
            if (param2 <= -79) {
              var9 = param4 - (-param0.field_p + -var12.field_S);
              qn.h(var8, var9, var7 + var8, var9, this.field_b);
              var10 = var12.d((byte) -39) + -1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (var10 < 0) {
                      break L5;
                    } else {
                      qn.a(var7 * var12.a(var10, (byte) -47) / var12.a(-1) + var8, var9, this.field_h, this.field_f);
                      var10--;
                      if (var11 != 0) {
                        break L4;
                      } else {
                        if (var11 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (null != this.field_a) {
                    break L4;
                  } else {
                    return;
                  }
                }
                this.field_a.c(var12.field_v, var8 - -(var7 / 2), this.field_a.field_v + var9 + var12.field_S, this.field_g, this.field_i);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var6);
            stackOut_16_1 = new StringBuilder().append("kp.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_e = null;
        if (param0 != 2) {
          field_c = (String) null;
          field_j = null;
          field_c = null;
          return;
        } else {
          field_j = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(boolean param0, int param1, kl param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                kp.a(81);
                break L1;
              }
            }
            var5 = param2.a((byte) 72, param3, param1);
            var4 = var5;
            if (var5 == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              b.a(var5, -1);
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4_ref);
            stackOut_8_1 = new StringBuilder().append("kp.D(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    kp(ka param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_b = param3;
            this.field_a = param0;
            this.field_f = param6;
            this.field_g = param1;
            this.field_d = param4;
            this.field_i = param2;
            this.field_h = param5;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_c = "You cannot use equipment on portals.";
        field_j = "Prayer";
        field_e = "There are no valid types of game that match your preferences.";
    }
}
