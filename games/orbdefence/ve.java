/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends ej {
    private String field_P;
    private boolean field_R;
    static int[] field_N;
    static int field_Q;
    private String field_S;
    static jc field_O;
    private dg field_T;
    static int[] field_V;
    private boolean field_U;

    public static void f() {
        field_N = null;
        field_V = null;
        field_O = null;
    }

    ve(sk param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((ve) this).field_P = param1;
            if (null != ((ve) this).field_P) {
                var3_int = qc.field_b.a(((ve) this).field_P, 260, qc.field_b.field_H);
                ((ve) this).a(150 + var3_int, (byte) -81, 300);
            }
            ((ve) this).field_T = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ve) this).field_R = false;
            ((ve) this).field_T.field_z = true;
            ((ve) this).field_U = false;
            ((ve) this).a((pj) (Object) ((ve) this).field_T, (byte) 74);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ve.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void p(int param0) {
        ((ve) this).field_U = true;
        ((ve) this).field_T.field_z = false;
        if (param0 != 1) {
            Object var3 = null;
            ve.a(62, -4, (hj) null, -58, 98, -124, (byte) 124, -112);
        }
    }

    final static void a(int param0, int param1, hj param2, int param3, int param4, int param5, byte param6, int param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        hj var22 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var29 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var19 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ul.field_i > param5) {
                param3 = param3 - (ul.field_i + -param5);
                param5 = ul.field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (ul.field_d > param7) {
                param1 = param1 - (ul.field_d - param7);
                param7 = ul.field_d;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (ul.field_e < param5 - -param3) {
                param3 = ul.field_e + -param5;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param7 - -param1 > ul.field_a) {
                param1 = ul.field_a + -param7;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param3 <= 0) {
                break L5;
              } else {
                if (param1 <= 0) {
                  break L5;
                } else {
                  L6: {
                    var22 = param2.f();
                    var33 = ul.field_b;
                    var10 = ul.field_f;
                    var11 = ul.field_l;
                    var31 = new int[4];
                    ul.a(var31);
                    param2.d();
                    ul.i(var31[0], var31[1], var31[2], var31[3]);
                    var13 = param5 - -(param7 * param2.field_o);
                    var14 = -param3 + param2.field_o;
                    var32 = var22.field_v;
                    var29 = var32;
                    var26 = var29;
                    var23 = var26;
                    var15 = var23;
                    if (param6 >= 52) {
                      break L6;
                    } else {
                      var20 = null;
                      ve.a(69, -127, (hj) null, 0, -117, 43, (byte) -101, -90);
                      break L6;
                    }
                  }
                  var16 = param7;
                  L7: while (true) {
                    if (var16 >= param1 + param7) {
                      var22.c(-param2.field_p, -param2.field_u);
                      ul.a(var33, var10, var11);
                      ul.b(var31);
                      break L0;
                    } else {
                      var17 = param5;
                      L8: while (true) {
                        if (param5 + param3 <= var17) {
                          var13 = var13 + var14;
                          var16++;
                          continue L7;
                        } else {
                          L9: {
                            var18 = var32[var13];
                            if (var18 == 0) {
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var13++;
                          var17++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var8 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var8;
            stackOut_29_1 = new StringBuilder().append("ve.K(").append(param0).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(boolean param0, String param1, float param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param3 == 2113632) {
              L1: {
                if (param0 != ((ve) this).field_R) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param0) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  L3: {
                    ((ve) this).field_R = stackIn_7_1 != 0;
                    if (!((ve) this).field_R) {
                      ((ve) this).field_T.a(16711422, 2113632, 4210752);
                      if (!((ve) this).field_U) {
                        break L3;
                      } else {
                        ((ve) this).field_T.field_z = false;
                        break L3;
                      }
                    } else {
                      ((ve) this).field_T.a(16711422, 8405024, 4210752);
                      ((ve) this).field_T.field_z = true;
                      break L3;
                    }
                  }
                  ((ve) this).field_T.field_J = (int)(65536.0f * (param2 / 100.0f));
                  ((ve) this).field_S = param1;
                  break L1;
                } else {
                  ((ve) this).field_T.field_J = (int)(65536.0f * (param2 / 100.0f));
                  ((ve) this).field_S = param1;
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("ve.N(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        super.a(param0, param1, param2);
        qc.field_b.c(((ve) this).field_S, param0 - -(((ve) this).field_m >> 1), param1 + 103, 16777215, -1);
        if (!(null == ((ve) this).field_P)) {
            ul.d(param0 + 20, param1 - -113, 260, 8421504);
            int discarded$0 = qc.field_b.a(((ve) this).field_P, param0 + 20, 120 + param1 + 8, 260, 100, 16777215, -1, 1, 0, qc.field_b.field_H);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = new int[12];
        field_N = new int[8192];
    }
}
