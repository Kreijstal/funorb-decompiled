/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rga {
    static int[] field_b;
    int field_a;
    private int field_c;

    public static void a() {
        field_b = null;
    }

    final static String[] a(int param0, String param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var11 = (CharSequence) (Object) param1;
              var3_int = sd.a(param2, (byte) 93, var11);
              var4 = new String[1 + var3_int];
              var5 = 0;
              var6 = 0;
              if (param0 == 32287) {
                break L1;
              } else {
                var10 = null;
                String[] discarded$4 = rga.a(65, (String) null, 'ﾭ');
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= var3_int) {
                var4[var3_int] = param1.substring(var6);
                stackOut_9_0 = (String[]) var4;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param2 == param1.charAt(var8)) {
                    int incrementValue$5 = var5;
                    var5++;
                    var4[incrementValue$5] = param1.substring(var6, var8);
                    var6 = var8 + 1;
                    var7++;
                    continue L2;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("rga.F(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var9 = param7 + -param0;
            var8_int = param0 + param4;
            var12 = param4;
            L1: while (true) {
              if (var8_int <= var12) {
                var12 = param7;
                L2: while (true) {
                  if (var12 <= var9) {
                    var11 = param6 - param0;
                    var10 = param3 + param0;
                    var12 = var8_int;
                    L3: while (true) {
                      if (var9 < var12) {
                        break L0;
                      } else {
                        var18 = vaa.field_a[var12];
                        nra.a((byte) -55, param5, var10, var18, param3);
                        nra.a((byte) -55, param2, var11, var18, var10);
                        nra.a((byte) -55, param5, param6, var18, var11);
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    nra.a((byte) -55, param5, param6, vaa.field_a[var12], param3);
                    var12--;
                    continue L2;
                  }
                }
              } else {
                nra.a((byte) -55, param5, param6, vaa.field_a[var12], param3);
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var8, "rga.A(" + param0 + ',' + 107 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static ka a(ka param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ka stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_3_0 = null;
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
            var3_int = -57 % ((param2 - -32) / 49);
            if (param0 != null) {
              stackOut_3_0 = param0.a(param1, 654255, false);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("rga.B(");
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
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final rga a(int param0, int param1) {
        if (param0 != 0) {
            Object var4 = null;
            ka discarded$0 = rga.a((ka) null, (byte) 71, 47);
        }
        return new rga(((rga) this).field_c, param1);
    }

    final static int b(int param0, int param1) {
        if (!(cm.field_a != null)) {
            return 0;
        }
        g[] var3 = cm.field_a[param1].field_c;
        g[] var2 = var3;
        return var3.length;
    }

    rga(int param0, int param1) {
        ((rga) this).field_c = param0;
        ((rga) this).field_a = param1;
    }

    static {
    }
}
