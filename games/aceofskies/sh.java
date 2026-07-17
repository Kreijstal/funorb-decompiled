/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends to {
    static String[] field_v;
    static int field_u;

    public static void d(byte param0) {
        int var1 = 81;
        field_v = null;
    }

    private sh(int param0, int param1, int param2, int param3, ir param4, no param5, ea param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((sh) this).field_s = param6;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "sh.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
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
                if (((sh) this).a(param2, param1, param5 ^ -122, param0, param3)) {
                  if (((sh) this).field_o instanceof ma) {
                    ((ma) (Object) ((sh) this).field_o).a(var8, -16073, (sh) this);
                    mm.field_a = null;
                    break L1;
                  } else {
                    if (!(var8.field_o instanceof ma)) {
                      break L1;
                    } else {
                      ((ma) (Object) var8.field_o).a(var8, -16073, (sh) this);
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
            stackOut_8_0 = (RuntimeException) var7_ref;
            stackOut_8_1 = new StringBuilder().append("sh.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param5 + 41);
        }
    }

    final static wu a(dl param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        wu var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        wu stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        wu stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.b((byte) 81, 8);
            if (var2_int <= 0) {
              L1: {
                var3 = tn.a(83, param0) ? 1 : 0;
                var4 = tn.a(-64, param0) ? 1 : 0;
                var5 = new wu();
                var5.field_r = (short)param0.b((byte) 87, 16);
                var5.field_z = ua.a(param0, var5.field_z, 0, 16);
                var5.field_P = ua.a(param0, var5.field_P, 0, 16);
                var5.field_F = ua.a(param0, var5.field_F, 0, 16);
                var5.field_K = (short)param0.b((byte) 119, 16);
                var5.field_I = ua.a(param0, var5.field_I, 0, 16);
                var5.field_t = ua.a(param0, var5.field_t, 0, 16);
                var5.field_m = ua.a(param0, var5.field_m, 0, 16);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_q = (short)param0.b((byte) 83, 16);
                  var5.field_H = ua.a(param0, var5.field_H, 0, 16);
                  var5.field_L = ua.a(param0, var5.field_L, 0, 16);
                  var5.field_n = ua.a(param0, var5.field_n, 0, 16);
                  var5.field_B = ua.a(param0, var5.field_B, 0, 16);
                  var5.field_g = ua.a(param0, var5.field_g, 0, 16);
                  var5.field_D = ua.a(param0, var5.field_D, 0, 16);
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  int discarded$1 = param0.b((byte) 84, 16);
                  var5.field_G = ua.a(param0, var5.field_G, 0, 16);
                  var5.field_d = ua.a(param0, var5.field_d, 0, 16);
                  var5.field_y = ua.a(param0, var5.field_y, 0, 16);
                  var5.field_C = ua.a(param0, var5.field_C, 0, 16);
                  var5.field_v = ua.a(param0, var5.field_v, 0, 16);
                  break L2;
                }
              }
              L3: {
                if (!tn.a(122, param0)) {
                  break L3;
                } else {
                  var5.field_u = ua.a(param0, var5.field_u, 0, 16);
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
              stackOut_20_0 = (wu) var5;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("sh.W(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + -14 + 41);
        }
        return stackIn_21_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_u = 640;
    }
}
