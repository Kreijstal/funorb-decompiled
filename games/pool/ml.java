/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static String field_f;
    static int field_d;
    static String[] field_c;
    static vh field_e;
    static String field_g;
    private String field_i;
    static int[] field_l;
    static char field_b;
    static int[] field_k;
    static int field_j;
    static String field_a;
    static int[][] field_h;

    final static int b(int param0) {
        return -kk.field_z + gp.field_c;
    }

    final boolean a(String param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
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
            if (param1 >= 46) {
              stackOut_3_0 = ((ml) this).field_i.equals((Object) (Object) param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ml.D(");
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
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(java.applet.Applet param0, boolean param1) {
        try {
            if (!param1) {
                field_a = null;
            }
            nn.a(31536000L, (byte) -120, param0, ((ml) this).field_i, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ml.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_k = null;
        field_g = null;
        field_e = null;
        field_h = null;
        field_f = null;
        field_l = null;
    }

    ml(String param0) {
        try {
            ((ml) this).field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ml.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, dd param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var20 = Pool.field_O;
        try {
          L0: {
            L1: {
              var6_int = (param5 + -param0 << 8) / param4.field_w;
              var7 = (param0 << 8) + param4.field_G * var6_int;
              param2 = param2 + param4.field_G;
              param3 = param3 + param4.field_B;
              var8 = param2 - -(qh.field_l * param3);
              var9 = 0;
              var10 = param4.field_A;
              var11 = param4.field_z;
              var12 = qh.field_l + -var11;
              var13 = 0;
              if (param3 < qh.field_c) {
                var14 = -param3 + qh.field_c;
                var8 = var8 + var14 * qh.field_l;
                var9 = var9 + var11 * var14;
                param3 = qh.field_c;
                var10 = var10 - var14;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var10 + param3 <= qh.field_g) {
                break L2;
              } else {
                var10 = var10 - (-qh.field_g + (var10 + param3));
                break L2;
              }
            }
            L3: {
              if (param2 < qh.field_b) {
                var14 = -param2 + qh.field_b;
                param2 = qh.field_b;
                var8 = var8 + var14;
                var13 = var13 + var14;
                var9 = var9 + var14;
                var11 = var11 - var14;
                var7 = var7 + var6_int * var14;
                var12 = var12 + var14;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2 + var11 > qh.field_j) {
                var14 = param2 + (var11 + -qh.field_j);
                var12 = var12 + var14;
                var13 = var13 + var14;
                var11 = var11 - var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 >= var11) {
                break L5;
              } else {
                if (var10 > 0) {
                  L6: {
                    if (param1 >= 44) {
                      break L6;
                    } else {
                      var21 = null;
                      ml.a(26, (byte) 106, -29, 66, (dd) null, 59);
                      break L6;
                    }
                  }
                  param3 = -var10;
                  L7: while (true) {
                    if (param3 >= 0) {
                      break L0;
                    } else {
                      var14 = var7;
                      param2 = -var11;
                      L8: while (true) {
                        if (param2 >= 0) {
                          var9 = var9 + var13;
                          var8 = var8 + var12;
                          param3++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> 8;
                            var14 = var14 + var6_int;
                            var16 = 256 - var15;
                            if (var15 < 0) {
                              var9++;
                              var8++;
                              break L9;
                            } else {
                              L10: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param4.field_D[incrementValue$1];
                                if (0 != var17) {
                                  if (var15 <= 255) {
                                    var18 = qh.field_d[var8];
                                    var19 = 16711935 & var16 * (var18 & 16711935) - -((var17 & 16711935) * var15) >> 8;
                                    qh.field_d[var8] = var19 - -rb.b(65280, rb.b(var17, 65280) * var15 + var16 * rb.b(var18, 65280) >> 8);
                                    break L10;
                                  } else {
                                    qh.field_d[var8] = var17;
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var8++;
                              break L9;
                            }
                          }
                          param2++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var6;
            stackOut_34_1 = new StringBuilder().append("ml.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param4 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L11;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L11;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, oj param1, int param2) {
        ta.field_i.b((byte) -31, (ma) (Object) param1);
        try {
            ch.a(false, param1, 3);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ml.C(" + 25756 + ',' + (param1 != null ? "{...}" : "null") + ',' + 3 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Elapsed time";
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_g = "<%0>, would you like to <u>play</u> the next shot or <u>pass</u> and make your opponent play?";
        field_l = new int[12];
        field_k = new int[]{8};
        field_a = "Show";
        field_h = new int[][]{new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4]};
    }
}
