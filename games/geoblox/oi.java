/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String[] field_a;
    static String field_e;
    static String field_d;
    static dm field_b;
    static String field_c;

    final synchronized static byte[] a(boolean param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param1 != 100) {
            break L0;
          } else {
            if (hb.field_b > 0) {
              int fieldTemp$6 = hb.field_b - 1;
              hb.field_b = hb.field_b - 1;
              var2_ref_byte__ = dj.field_I[fieldTemp$6];
              dj.field_I[hb.field_b] = null;
              return var2_ref_byte__;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param1 != 5000) {
            break L1;
          } else {
            if (0 < ah.field_d) {
              int fieldTemp$7 = ah.field_d - 1;
              ah.field_d = ah.field_d - 1;
              var2_ref_byte__ = rd.field_s[fieldTemp$7];
              rd.field_s[ah.field_d] = null;
              return var2_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        if (!param0) {
          L2: {
            if (param1 != 30000) {
              break L2;
            } else {
              if (ag.field_i <= 0) {
                break L2;
              } else {
                int fieldTemp$8 = ag.field_i - 1;
                ag.field_i = ag.field_i - 1;
                var2_ref_byte__ = sd.field_C[fieldTemp$8];
                sd.field_C[ag.field_i] = null;
                return var2_ref_byte__;
              }
            }
          }
          L3: {
            if (sg.field_c == null) {
              break L3;
            } else {
              var2 = 0;
              L4: while (true) {
                if (var2 >= nk.field_c.length) {
                  break L3;
                } else {
                  if (nk.field_c[var2] == param1) {
                    if (0 < oa.field_b[var2]) {
                      oa.field_b[var2] = oa.field_b[var2] - 1;
                      var3 = sg.field_c[var2][oa.field_b[var2] - 1];
                      sg.field_c[var2][oa.field_b[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      continue L4;
                    }
                  } else {
                    var2++;
                    continue L4;
                  }
                }
              }
            }
          }
          return new byte[param1];
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        se var4 = null;
        ea var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            var4 = (se) (Object) sj.field_g.g(0);
            L1: while (true) {
              if (var4 == null) {
                var5 = (ea) (Object) ea.field_g.g(0);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    gj.a((byte) -88, param0, var5);
                    var5 = (ea) (Object) ea.field_g.d(1);
                    continue L2;
                  }
                }
              } else {
                tj.a(param0, 86, var4);
                var4 = (se) (Object) sj.field_g.d(1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "oi.B(" + param0 + 44 + 116 + 41);
        }
    }

    final static dm[] a(byte param0, String param1, String param2, rh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        dm[] stackIn_1_0 = null;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        dm[] stackOut_0_0 = null;
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
            var5 = -59 % ((41 - param0) / 39);
            var4_int = param3.a((byte) 127, param2);
            var6 = param3.a(param1, -101, var4_int);
            stackOut_0_0 = rd.a(var4_int, -122, var6, param3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("oi.C(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 59;
        field_e = null;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[255];
        field_d = "The objective of Geoblox is to stack geoblox on your avatar in patterns of three in a row, by shape, colour, or both shape AND colour. Matching both shape and colour simultaneously will earn you even more points!<br>Try connecting three of a kind by colour now. Press <img=2> once you are ready to continue.";
        field_c = "Type your password again to make sure it's correct";
    }
}
