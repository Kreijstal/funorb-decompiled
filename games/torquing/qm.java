/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qm {
    static la field_a;
    static String field_b;

    public static void a(int param0) {
        int var1 = -65 / ((-66 - param0) / 43);
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int[] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var15 = Torquing.field_u;
        try {
          L0: {
            var8_int = param5 + param2;
            var11 = -126 / ((-11 - param1) / 36);
            var9 = param0 + -param5;
            var13 = param2;
            L1: while (true) {
              if (var8_int <= var13) {
                var13 = param0;
                L2: while (true) {
                  if (var9 >= var13) {
                    var12 = -param5 + param4;
                    var10 = param5 + param6;
                    var13 = var8_int;
                    L3: while (true) {
                      if (var9 < var13) {
                        break L0;
                      } else {
                        var19 = qd.field_a[var13];
                        di.a(param6, (byte) -110, param7, var19, var10);
                        di.a(var10, (byte) -120, param3, var19, var12);
                        di.a(var12, (byte) 57, param7, var19, param4);
                        var13++;
                        continue L3;
                      }
                    }
                  } else {
                    di.a(param6, (byte) 75, param7, qd.field_a[var13], param4);
                    var13--;
                    continue L2;
                  }
                }
              } else {
                di.a(param6, (byte) -115, param7, qd.field_a[var13], param4);
                var13++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var8, "qm.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static int a(byte param0, int param1) {
        param1--;
        if (param0 != -106) {
          field_a = null;
          param1 = param1 | param1 >>> 1;
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        } else {
          param1 = param1 | param1 >>> 1;
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        }
    }

    final static ae a(String param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ae var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        ae stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_16_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = Torquing.field_u;
        try {
          if (null != sh.field_a) {
            if (param0 != null) {
              if (0 != param0.length()) {
                var6 = (CharSequence) (Object) param0;
                var2 = hf.a(var6, 118);
                if (var2 != null) {
                  var3 = (ae) (Object) sh.field_a.a((long)var2.hashCode(), -43);
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_ob;
                      var4 = hf.a(var7, 113);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3 = (ae) (Object) sh.field_a.b(-1);
                        continue L0;
                      } else {
                        stackOut_16_0 = (ae) var3;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (ae) (Object) stackIn_11_0;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (ae) (Object) stackIn_7_0;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2_ref;
            stackOut_20_1 = new StringBuilder().append("qm.E(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L1;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + 45 + 41);
        }
    }

    final static int a(boolean param0, int param1, int param2, int param3, int[] param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var6_int = param4[5 + param3] * (param5 - param4[param3 + 2]) + (-param4[param3] + param2) * param4[param3 - -3] + (param1 + -param4[param3 + 1]) * param4[param3 + 4];
            if (param0) {
              L1: {
                if (0 < var6_int) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  if (var6_int != 0) {
                    stackOut_6_0 = -1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_8_0 = stackOut_5_0;
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 67;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("qm.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param5 + 41);
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Retry";
    }
}
