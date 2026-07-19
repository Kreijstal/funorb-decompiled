/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static String field_g;
    private static int field_h;
    static dd field_b;
    static vh field_f;
    static int field_e;
    static int field_a;
    static String field_d;
    static int field_c;

    public static void a(int param0) {
        gi discarded$0 = null;
        field_b = null;
        if (param0 != 0) {
            ko var2 = (ko) null;
            discarded$0 = ag.a(105, (ko) null, -112, 90);
        }
        field_g = null;
        field_d = null;
        field_f = null;
    }

    final static void a(int[] param0, float[] param1, int param2) {
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            param1[0] = param1[0] - (float)param0[0];
            param1[1] = param1[1] - (float)param0[1];
            param1[2] = param1[2] - (float)param0[2];
            var3_float = param1[1] * (float)param0[4] / 65536.0f + param1[0] * (float)param0[3] / 65536.0f + (float)param0[5] * param1[2] / 65536.0f;
            var4 = param1[0] * (float)param0[6] / 65536.0f + param1[1] * (float)param0[7] / 65536.0f + (float)param0[8] * param1[2] / 65536.0f;
            var5 = param1[0] * (float)param0[param2] / 65536.0f + param1[1] * (float)param0[10] / 65536.0f + param1[2] * (float)param0[11] / 65536.0f;
            param1[0] = (float)fb.field_q + 512.0f * var3_float / var5;
            param1[1] = 512.0f * var4 / var5 + (float)fb.field_d;
            param1[2] = var5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("ag.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
    }

    final static gi a(int param0, ko param1, int param2, int param3) {
        gi discarded$2 = null;
        RuntimeException var4 = null;
        gi var5 = null;
        gi var6 = null;
        int var7 = 0;
        ko var8 = null;
        aa var9 = null;
        gi stackIn_10_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        gi stackOut_9_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            var9 = new aa(param1);
            var5 = (gi) ((Object) var9.b((byte) -92));
            L1: while (true) {
              if (var5 == null) {
                if (param3 != 15395) {
                  var8 = (ko) null;
                  discarded$2 = ag.a(15, (ko) null, 110, 38);
                  stackOut_15_0 = null;
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return null;
                }
              } else {
                var6 = var5;
                L2: while (true) {
                  if (var5 == null) {
                    var5 = (gi) ((Object) var9.b(-81));
                    continue L1;
                  } else {
                    L3: {
                      if (var6.field_m > param2) {
                        break L3;
                      } else {
                        if (param2 >= var6.field_l + var6.field_m) {
                          break L3;
                        } else {
                          if (param0 < var6.field_q) {
                            break L3;
                          } else {
                            if (var6.field_q - -var6.field_r <= param0) {
                              break L3;
                            } else {
                              stackOut_9_0 = (gi) (var5);
                              stackIn_10_0 = stackOut_9_0;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                    var5 = var5.field_s;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("ag.A(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return (gi) ((Object) stackIn_16_0);
        }
    }

    final static dd a(byte param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var6 = 0;
        int var7 = 0;
        dd var8 = null;
        dd var10 = null;
        int[] var16 = null;
        int[] var17 = null;
        dd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd stackOut_2_0 = null;
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
              var10 = new dd(4 + ni.field_Z.b(param2), 4 + ni.field_Z.field_C - -ni.field_Z.field_w);
              var10.field_G = -2;
              var10.field_B = -2;
              var16 = new int[4];
              var17 = qh.field_d;
              var6 = qh.field_l;
              var7 = qh.field_f;
              qh.a(var16);
              var10.e();
              ni.field_Z.d(param2, 2, 2 + ni.field_Z.field_C, param1, -1);
              var10.e(4144959);
              qh.a(var17, var6, var7);
              qh.b(var16);
              var10.field_y = var10.field_A;
              var10.field_w = var10.field_z;
              var10.field_B = 0;
              var8 = var10;
              var8.field_G = 0;
              if (param0 == 89) {
                break L1;
              } else {
                ag.a(-120);
                break L1;
              }
            }
            stackOut_2_0 = (dd) (var10);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ag.C(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_h = 7;
        field_e = 1 << field_h;
        field_g = "Connection restored.";
        field_d = "Add name";
    }
}
