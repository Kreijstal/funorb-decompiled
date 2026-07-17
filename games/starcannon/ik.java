/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ik extends uh {
    volatile boolean field_r;
    boolean field_o;
    boolean field_n;
    static String field_q;
    static char[] field_s;
    static long field_p;

    final static hh a(String param0, int param1, long param2, String param3) {
        RuntimeException var6 = null;
        vd stackIn_7_0 = null;
        od stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        vd stackOut_6_0 = null;
        od stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (0L != param2) {
                break L1;
              } else {
                if (null != param3) {
                  stackOut_6_0 = new vd(param3, param0);
                  stackIn_7_0 = stackOut_6_0;
                  return (hh) (Object) stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_10_0 = new od(param2, param0);
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("ik.F(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(-66).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + 0 + 41);
        }
        return (hh) (Object) stackIn_11_0;
    }

    abstract int e(int param0);

    final static void g() {
        fd.a(17, 0);
    }

    final static long a(CharSequence param0, byte param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_18_0 = 0L;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_17_0 = 0L;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            var6 = 14 % ((-35 - param1) / 34);
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var7 = param0.charAt(var5);
                      if (var7 < 65) {
                        break L4;
                      } else {
                        if (90 < var7) {
                          break L4;
                        } else {
                          var2_long = var2_long + (long)(-65 + (var7 + 1));
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var7 < 97) {
                        break L5;
                      } else {
                        if (122 < var7) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(1 + (var7 - 97));
                          break L3;
                        }
                      }
                    }
                    if (var7 < 48) {
                      break L3;
                    } else {
                      if (var7 > 57) {
                        break L3;
                      } else {
                        var2_long = var2_long + (long)(27 - (-var7 + 48));
                        break L3;
                      }
                    }
                  }
                  if (177917621779460413L <= var2_long) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              L6: while (true) {
                L7: {
                  if (var2_long % 37L != 0L) {
                    break L7;
                  } else {
                    if (var2_long == 0L) {
                      break L7;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L6;
                    }
                  }
                }
                stackOut_17_0 = var2_long;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("ik.H(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
        return stackIn_18_0;
    }

    abstract byte[] f(int param0);

    ik() {
        ((ik) this).field_r = true;
    }

    public static void d() {
        field_q = null;
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new char[128];
    }
}
