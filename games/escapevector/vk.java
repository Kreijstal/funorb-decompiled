/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends sh {
    static String field_v;
    static int field_t;
    private Object field_u;

    final Object e(byte param0) {
        if (param0 != 97) {
            vk.g(24);
        }
        return ((vk) this).field_u;
    }

    public static void g(int param0) {
        int var1 = 93 % ((param0 - -35) / 38);
        field_v = null;
    }

    final static char a(byte param0, int param1, ih param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var4_int = 119;
              var5 = param2.a((char) var4_int);
              var6 = param1;
              if (param0 <= -47) {
                break L1;
              } else {
                vk.g(-66);
                break L1;
              }
            }
            L2: while (true) {
              if (param3 < var6) {
                stackOut_10_0 = var4_int;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L3: {
                  if (ml.a((char)var6, 21654)) {
                    var7 = param2.a((char)var6);
                    if (var5 < var7) {
                      var4_int = (char)var6;
                      var5 = var7;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("vk.F(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
        return (char) stackIn_11_0;
    }

    vk(Object param0, int param1) {
        super(param1);
        try {
            ((vk) this).field_u = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "vk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static tk a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tk stackIn_4_0 = null;
        tk stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        tk stackIn_19_0 = null;
        tk stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        tk stackOut_3_0 = null;
        tk stackOut_21_0 = null;
        tk stackOut_18_0 = null;
        Object stackOut_9_0 = null;
        tk stackOut_6_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = EscapeVector.field_A;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_3_0 = mf.field_d;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int <= 63) {
              if (param1 < -8) {
                var3 = 0;
                L0: while (true) {
                  if (var3 < var2_int) {
                    L1: {
                      var4 = param0.charAt(var3);
                      if (45 != var4) {
                        if (jd.field_b.indexOf(var4) != -1) {
                          break L1;
                        } else {
                          stackOut_21_0 = wh.field_p;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        }
                      } else {
                        L2: {
                          if (0 == var3) {
                            break L2;
                          } else {
                            if (var3 == -1 + var2_int) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        }
                        stackOut_18_0 = wh.field_p;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    }
                    var3++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (tk) (Object) stackIn_10_0;
              }
            } else {
              stackOut_6_0 = d.field_c;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("vk.G(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L3;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ')');
        }
    }

    final boolean d(byte param0) {
        if (param0 != 120) {
            field_v = null;
            return false;
        }
        return false;
    }

    static {
    }
}
