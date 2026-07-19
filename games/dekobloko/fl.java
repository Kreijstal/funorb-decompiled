/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int[][] field_d;
    static String field_c;
    static ck field_f;
    static String field_a;
    static w field_b;
    static String field_e;

    final static boolean a(char param0, byte param1) {
        if (param1 == 23) {
          if (48 <= param0) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          fl.a(-17);
          if (48 <= param0) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_d = (int[][]) null;
        if (param0 != 29047) {
          field_c = (String) null;
          field_c = null;
          field_e = null;
          field_f = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_f = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var5 = 255 & param3 >> 1441470864;
        var6 = 255 & param3 >> 625963720;
        var7 = 255 & param3;
        var8 = param0 >> 2103927024 & 255;
        var9 = (param0 & 65512) >> 869977736;
        var10 = param0 & 255;
        if (param4 <= 100) {
          return 39;
        } else {
          L0: {
            L1: {
              if ((param2 ^ -1) == -257) {
                break L1;
              } else {
                var11 = param2 * ((-param1 + 256) * var5 + var8 * param1) >> -58785616;
                var13 = (var10 * param1 + (-param1 + 256) * var7) * param2 >> 1520454800;
                var12 = param2 * (var9 * param1 + var6 * (256 + -param1)) >> 1169540304;
                if (!client.field_A) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var12 = param1 * var9 + var6 * (256 + -param1) >> -1790237528;
            var13 = (256 - param1) * var7 + param1 * var10 >> -785939032;
            var11 = param1 * var8 + var5 * (-param1 + 256) >> 1045223560;
            break L0;
          }
          return var11 << 757731664 | var12 << 364164456 | var13;
        }
    }

    final static ck[] a(int param0, int param1, int param2, int param3) {
        int discarded$2 = 0;
        if (param3 != 32140) {
          discarded$2 = fl.a(-57, -94, 1, 10, -127);
          return ce.a(1, -109, param0, param2, param1);
        } else {
          return ce.a(1, -109, param0, param2, param1);
        }
    }

    final static void a(int param0, tj param1, nm param2, int param3, int param4, int param5, int param6) {
        int discarded$0 = 0;
        pf var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            sl.a(param1.field_Rb, (int[]) null, (byte) 89, param2, param1, param1.field_Yb, param1.field_cc, -1, -1);
            w.field_H.a(true, 29072);
            w.field_H.a(0, (byte) -43, (int[]) null);
            if (param5 >= -53) {
                discarded$0 = fl.a((byte) 105);
            }
            w.field_H.a(17);
            var12 = w.field_H;
            var8 = param3;
            var9 = param6;
            var10 = param4;
            var11 = param0;
            var12.field_h.b(var9, var8, 101, var11, var10);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "fl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 0) {
            return;
        }
        vb.field_V = param1;
        hb.field_Wb = param0;
        pa.field_fb = param4;
        ma.field_I = param2;
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, mm param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              var6_int = 2;
              if (se.field_S == param5) {
                var6_int = 1;
                break L1;
              } else {
                break L1;
              }
            }
            param5.a(param3, -var6_int + param4, param0 - var6_int, 0, -1);
            param5.a(param3, -var6_int + param4, param0, 0, -1);
            param5.a(param3, -var6_int + param4, param0 + var6_int, 0, -1);
            param5.a(param3, param4, param0 + -var6_int, 0, -1);
            param5.a(param3, param4, param0 - -var6_int, 0, -1);
            if (param1 == 256) {
              L2: {
                param5.a(param3, param4 - -var6_int, -var6_int + param0, 0, -1);
                param5.a(param3, var6_int + param4, param0, 0, -1);
                param5.a(param3, param4 + var6_int, param0 - -var6_int, 0, -1);
                if (w.field_kb != param5) {
                  break L2;
                } else {
                  param5.a(param3, param4 + 1, -var6_int + param0, 0, -1);
                  param5.a(param3, -1 + param4, -var6_int + param0, 0, -1);
                  param5.a(param3, param4 - -var6_int, param0 + -1, 0, -1);
                  param5.a(param3, param4 + -var6_int, -1 + param0, 0, -1);
                  param5.a(param3, param4 + var6_int, param0 + 1, 0, -1);
                  param5.a(param3, param4 + -var6_int, param0 + 1, 0, -1);
                  param5.a(param3, param4 - -1, var6_int + param0, 0, -1);
                  param5.a(param3, -1 + param4, var6_int + param0, 0, -1);
                  break L2;
                }
              }
              param5.a(param3, param4, param0, param2, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6);
            stackOut_9_1 = new StringBuilder().append("fl.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param4).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(byte param0) {
        int discarded$0 = 0;
        if (param0 != -108) {
            discarded$0 = fl.a(29, -113, -26, -55, -110);
            return om.field_d;
        }
        return om.field_d;
    }

    static {
        field_a = "(<%0> players want to join)";
        field_d = new int[][]{null, new int[]{0, 0, 0, 1500, 2000}, null, null, null};
        field_c = "Join <%0>'s game";
        field_e = "Remove friend";
    }
}
