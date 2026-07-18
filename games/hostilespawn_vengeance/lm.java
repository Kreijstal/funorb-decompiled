/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends ae {
    static java.math.BigInteger field_z;
    byte field_B;
    vi field_C;
    static jb[] field_A;
    int field_x;
    static bd field_y;

    final byte[] c(byte param0) {
        L0: {
          if (((lm) this).field_v) {
            break L0;
          } else {
            if (((lm) this).field_C.field_i >= -((lm) this).field_B + ((lm) this).field_C.field_n.length) {
              L1: {
                if (param0 == 127) {
                  break L1;
                } else {
                  int discarded$2 = lm.e(46);
                  break L1;
                }
              }
              return ((lm) this).field_C.field_n;
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          try {
            L0: {
              if (param0 == 26) {
                break L0;
              } else {
                int discarded$4 = lm.e(77);
                break L0;
              }
            }
            if (!fd.field_c.startsWith("win")) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              L1: {
                if (param1.startsWith("http://")) {
                  break L1;
                } else {
                  if (!param1.startsWith("https://")) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L2: while (true) {
                if (param1.length() <= var3) {
                  Process discarded$5 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0 != 0;
                } else {
                  if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  } else {
                    var3++;
                    continue L2;
                  }
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_21_0 = 0;
            stackIn_22_0 = stackOut_21_0;
            return stackIn_22_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2_ref2;
            stackOut_23_1 = new StringBuilder().append("lm.O(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    public static void b(boolean param0) {
        field_y = null;
        field_z = null;
        field_A = null;
    }

    final static int e(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            boolean discarded$0 = lm.a(-49, (String) null);
        }
        return -hg.field_f + pc.field_d;
    }

    final int d(int param0) {
        if (null == ((lm) this).field_C) {
            return 0;
        }
        if (param0 > -72) {
            ((lm) this).field_x = -24;
        }
        return 100 * ((lm) this).field_C.field_i / (-((lm) this).field_B + ((lm) this).field_C.field_n.length);
    }

    lm() {
    }

    final static boolean a(p param0, p param1, int param2) {
        RuntimeException var3 = null;
        double var3_double = 0.0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              oa.field_d.field_i = 13;
              oa.field_d.field_j.a((byte) 46, param1.field_j);
              oa.field_d.field_l.a(param1.field_l.field_a - 0.5, param1.field_l.field_f - 0.5, 1);
              if (0.0 > oa.field_d.field_l.field_a) {
                oa.field_d.field_l.field_a = oa.field_d.field_l.field_a + 1.0;
                oa.field_d.field_j.field_g = oa.field_d.field_j.field_g - 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0.0 <= oa.field_d.field_l.field_f) {
                break L2;
              } else {
                oa.field_d.field_l.field_f = oa.field_d.field_l.field_f + 1.0;
                oa.field_d.field_j.field_e = oa.field_d.field_j.field_e - 1;
                break L2;
              }
            }
            oa.field_d.field_c = nh.a(-12149, param1, param0);
            var3_double = param0.field_l.field_f + (double)param0.field_j.field_e;
            var5 = param0.field_l.field_a + (double)param0.field_j.field_g;
            oa.field_d.field_l.a(20, (byte) 94, oa.field_d.field_c);
            var7 = 0;
            var8 = param0.field_j.b(-4);
            var9 = ln.field_a.field_c[var8];
            ln.field_a.field_c[var8] = 0;
            var10 = 0;
            L3: while (true) {
              L4: {
                if (var10 >= 100) {
                  break L4;
                } else {
                  oa.field_d.a(8573);
                  var7 = ln.field_a.field_c[oa.field_d.field_j.b(-4)];
                  if (var7 == 2) {
                    break L4;
                  } else {
                    if (!oa.field_d.a(var3_double, var5, 29821)) {
                      oa.field_d.field_l.a(2, (byte) 94, oa.field_d.field_c);
                      var10++;
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L5: {
                ln.field_a.field_c[var8] = var9;
                if (var7 == 2) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L5;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("lm.F(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + -62 + ')');
        }
        return stackIn_15_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new java.math.BigInteger("65537");
        field_A = new jb[26];
    }
}
