/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg implements de {
    private int field_e;
    static int field_l;
    private int field_d;
    private qe field_k;
    private int field_m;
    static String field_i;
    static int[] field_a;
    private int field_c;
    static boolean field_h;
    private int field_j;
    static wd field_f;
    private int field_g;
    private int field_b;

    final static void a(java.awt.Frame param0, byte param1, ka param2) {
        bk var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: while (true) {
              var3 = param2.a(param0, param1 + 12297);
              L2: while (true) {
                if (var3.field_b != 0) {
                  if ((var3.field_b ^ -1) == -2) {
                    param0.setVisible(false);
                    param0.dispose();
                    if (param1 == -47) {
                      break L0;
                    } else {
                      eg.a((byte) -82);
                      return;
                    }
                  } else {
                    uc.a(param1 + -51, 100L);
                    continue L1;
                  }
                } else {
                  uc.a(-121, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("eg.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
    }

    final static ed a(int param0, int param1, c param2) {
        RuntimeException var3 = null;
        ed stackIn_2_0 = null;
        ed stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 29723) {
              stackIn_4_0 = new ed(param2, param1 * df.field_n / 1000);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ed) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("eg.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        RuntimeException runtimeException = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        el var15 = null;
        uj stackIn_3_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof el)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (uj) (param4);
                break L1;
              }
            }
            L2: {
              var15 = (el) ((Object) stackIn_3_0);
              ki.d(param0 + param4.field_s, param4.field_j + param3, param4.field_i, param4.field_f, this.field_b);
              if (var15 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = var15.field_K + (param4.field_s + param0);
              var8 = var15.field_G + param4.field_j + param3;
              ki.e(var7, var8, var15.field_I, this.field_g);
              if (var15.field_E == -1) {
                break L3;
              } else {
                var9 = (double)var15.field_E * 3.141592653589793 * 2.0 / (double)var15.field_B;
                var11 = (int)(-Math.sin(var9) * (double)var15.field_I);
                var12 = (int)(Math.cos(var9) * (double)var15.field_I);
                ki.e(var7 + var11, var8 + var12, 1, this.field_j);
                break L3;
              }
            }
            L4: {
              ki.e(var7, var8, 2, 1);
              var9 = (double)var15.field_F * 3.141592653589793 * 2.0 / (double)var15.field_B;
              var11 = (int)(-Math.sin(var9) * (double)var15.field_I);
              var13 = -54 / ((param2 - 2) / 54);
              var12 = (int)(Math.cos(var9) * (double)var15.field_I);
              ki.a(var7, var8, var11 + var7, var12 + var8, 1);
              if (this.field_k == null) {
                break L4;
              } else {
                var14 = var15.field_I + var15.field_K - -this.field_d;
                this.field_k.a(param4.field_k, var14 + param4.field_s + param0, this.field_e + param4.field_j + param3, -this.field_d + (-var14 + param4.field_i), param4.field_f - (this.field_d << -2004493151), this.field_c, this.field_m, 1, 1, 0);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("eg.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        if (param2 >= -47) {
          eg.b((byte) 99);
          ig.field_b = param1;
          sb.field_m = param3;
          sd.field_a = param0;
          return;
        } else {
          ig.field_b = param1;
          sb.field_m = param3;
          sd.field_a = param0;
          return;
        }
    }

    final static void b(byte param0) {
        if (param0 >= -20) {
            return;
        }
        jb.field_c = null;
        nh.field_h = null;
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 > -11) {
            return;
        }
        field_i = null;
        field_a = null;
    }

    eg(qe param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_k = param0;
            this.field_m = param4;
            this.field_j = param6;
            this.field_d = param1;
            this.field_e = param2;
            this.field_g = param5;
            this.field_c = param3;
            this.field_b = param7;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "eg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_h = false;
        field_i = "Level 1<br>Defeat the Paragulan fleet<br>attacking our solar system";
    }
}
