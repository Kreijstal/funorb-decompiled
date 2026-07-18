/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    Runnable field_c;
    boolean field_f;
    private sob field_d;
    private int[] field_b;
    daa field_e;
    float[] field_a;

    final void a(Runnable param0, int param1) {
        try {
            if (param1 != 0) {
                ((co) this).field_b = null;
            }
            ((co) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "co.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        ((co) this).field_e = new daa(((co) this).field_d, (co) this);
        if (param0 != 3) {
            ((co) this).field_f = false;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, float[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 <= 0) {
                break L1;
              } else {
                int discarded$2 = -95;
                if (!bd.a(param2)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param4 <= 0) {
                break L2;
              } else {
                int discarded$3 = -95;
                if (!bd.a(param4)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var7_int = pu.a((byte) -104, param0);
              var8 = 0;
              if (param2 >= param4) {
                stackOut_11_0 = param4;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = param2;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            var9 = stackIn_12_0;
            var10 = param2 >> 1;
            var11 = param4 >> 1;
            var12 = param5;
            var13 = new float[var7_int * var10 * var11];
            L4: while (true) {
              jaggl.OpenGL.glTexImage2Df(param3, var8, param1, param2, param4, 0, param0, 5126, var12, 0);
              if (var9 <= 1) {
                break L0;
              } else {
                var16 = param2 * var7_int;
                var17 = 0;
                L5: while (true) {
                  if (var7_int <= var17) {
                    var14 = var13;
                    var13 = var12;
                    var12 = var14;
                    param4 = var11;
                    param2 = var10;
                    var11 = var11 >> 1;
                    var8++;
                    var10 = var10 >> 1;
                    var9 = var9 >> 1;
                    continue L4;
                  } else {
                    var18 = var17;
                    var19 = var17;
                    var20 = var19 - -var16;
                    var21 = 0;
                    L6: while (true) {
                      if (var11 <= var21) {
                        var17++;
                        continue L5;
                      } else {
                        var22 = 0;
                        L7: while (true) {
                          if (var10 <= var22) {
                            var19 = var19 + var16;
                            var20 = var20 + var16;
                            var21++;
                            continue L6;
                          } else {
                            var15 = param5[var19];
                            var19 = var19 + var7_int;
                            var15 = var15 + param5[var19];
                            var15 = var15 + param5[var20];
                            var19 = var19 + var7_int;
                            var20 = var20 + var7_int;
                            var15 = var15 + param5[var20];
                            var13[var18] = 0.25f * var15;
                            var20 = var20 + var7_int;
                            var18 = var18 + var7_int;
                            var22++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var7;
            stackOut_27_1 = new StringBuilder().append("co.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + -29702 + ')');
        }
    }

    co(sob param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        ((co) this).field_f = true;
        lia discarded$22 = new lia();
        ((co) this).field_a = new float[2];
        try {
          L0: {
            ((co) this).field_d = param0;
            ((co) this).field_e = new daa(param0, (co) this);
            b discarded$23 = new b(((co) this).field_d);
            b discarded$24 = new b(((co) this).field_d);
            b discarded$25 = new b(((co) this).field_d);
            b discarded$26 = new b(((co) this).field_d);
            b discarded$27 = new b(((co) this).field_d);
            b discarded$28 = new b(((co) this).field_d);
            b discarded$29 = new b(((co) this).field_d);
            b discarded$30 = new b(((co) this).field_d);
            b discarded$31 = new b(((co) this).field_d);
            b discarded$32 = new b(((co) this).field_d);
            ((co) this).field_b = new int[b.field_v];
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= b.field_v) {
                break L0;
              } else {
                ((co) this).field_b[var2_int] = -1;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("co.<init>(");
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        pv discarded$0 = new pv();
    }
}
