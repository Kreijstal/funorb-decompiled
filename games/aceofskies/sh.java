/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends to {
    static String[] field_v;
    static int field_u;

    public static void d(byte param0) {
        int var1 = 81 / ((19 - param0) / 47);
        field_v = null;
    }

    private sh(int param0, int param1, int param2, int param3, ir param4, no param5, ea param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_s = param6;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "sh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        hg var7 = null;
        RuntimeException var7_ref = null;
        hg var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              super.a(param0, param1, param2, param3, param4, param5);
              var8 = mm.field_a;
              var7 = var8;
              if (var8 == null) {
                break L1;
              } else {
                if (this.a(param2, param1, param5 ^ -122, param0, param3)) {
                  if (this.field_o instanceof ma) {
                    ((ma) ((Object) this.field_o)).a(var8, -16073, (sh) (this));
                    mm.field_a = null;
                    break L1;
                  } else {
                    if (!(var8.field_o instanceof ma)) {
                      break L1;
                    } else {
                      ((ma) ((Object) var8.field_o)).a(var8, -16073, (sh) (this));
                      mm.field_a = null;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var7_ref);
            stackOut_8_1 = new StringBuilder().append("sh.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param5 + ')');
        }
    }

    final static wu a(dl param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        wu var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        wu stackIn_5_0 = null;
        wu stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wu stackOut_22_0 = null;
        wu stackOut_4_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.b((byte) 81, 8);
            if (var2_int <= 0) {
              if (param1 == -14) {
                L1: {
                  var3 = tn.a(83, param0) ? 1 : 0;
                  var4 = tn.a(-64, param0) ? 1 : 0;
                  var5 = new wu();
                  var5.field_r = (short)param0.b((byte) 87, 16);
                  var5.field_z = ua.a(param0, var5.field_z, 0, 16);
                  var5.field_P = ua.a(param0, var5.field_P, param1 + 14, 16);
                  var5.field_F = ua.a(param0, var5.field_F, 0, 16);
                  var5.field_K = (short)param0.b((byte) 119, 16);
                  var5.field_I = ua.a(param0, var5.field_I, param1 + 14, 16);
                  var5.field_t = ua.a(param0, var5.field_t, 0, 16);
                  var5.field_m = ua.a(param0, var5.field_m, 0, 16);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    var5.field_q = (short)param0.b((byte) 83, 16);
                    var5.field_H = ua.a(param0, var5.field_H, 0, 16);
                    var5.field_L = ua.a(param0, var5.field_L, 0, 16);
                    var5.field_n = ua.a(param0, var5.field_n, param1 ^ -14, 16);
                    var5.field_B = ua.a(param0, var5.field_B, 0, 16);
                    var5.field_g = ua.a(param0, var5.field_g, param1 + 14, 16);
                    var5.field_D = ua.a(param0, var5.field_D, 0, 16);
                    break L1;
                  }
                }
                L2: {
                  if (var4 == 0) {
                    break L2;
                  } else {
                    discarded$1 = param0.b((byte) 84, 16);
                    var5.field_G = ua.a(param0, var5.field_G, param1 ^ -14, 16);
                    var5.field_d = ua.a(param0, var5.field_d, 0, 16);
                    var5.field_y = ua.a(param0, var5.field_y, 0, 16);
                    var5.field_C = ua.a(param0, var5.field_C, param1 + 14, 16);
                    var5.field_v = ua.a(param0, var5.field_v, 0, 16);
                    break L2;
                  }
                }
                L3: {
                  if (!tn.a(122, param0)) {
                    break L3;
                  } else {
                    var5.field_u = ua.a(param0, var5.field_u, param1 + 14, 16);
                    break L3;
                  }
                }
                L4: {
                  if (!tn.a(83, param0)) {
                    break L4;
                  } else {
                    var5.field_x = ao.a(param0, var5.field_x, true, 16);
                    var6 = 0;
                    var7 = 0;
                    L5: while (true) {
                      if (var7 >= var5.field_x.length) {
                        if (0 == var6) {
                          var5.field_x = null;
                          break L4;
                        } else {
                          var5.field_f = (byte)(var6 + 1);
                          break L4;
                        }
                      } else {
                        L6: {
                          if (var6 < (var5.field_x[var7] & 255)) {
                            var6 = 255 & var5.field_x[var7];
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackOut_22_0 = (wu) (var5);
                stackIn_23_0 = stackOut_22_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_4_0 = (wu) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("sh.W(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_23_0;
        }
    }

    static {
        field_v = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_u = 640;
    }
}
