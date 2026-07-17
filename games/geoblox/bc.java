/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_a;

    final static void a(int param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if (param1 % 10L == (long)param0) {
            ji.a(-1L + param1, (byte) -33);
            ji.a(1L, (byte) -33);
        } else {
            ji.a(param1, (byte) -33);
        }
    }

    final static String a(int param0, byte[] param1, int param2, int param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              var13 = new char[param3];
              var12 = var13;
              var11 = var12;
              var10 = var11;
              var9 = var10;
              var4 = var9;
              if (param0 <= 0) {
                break L1;
              } else {
                field_a = 49;
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (param3 <= var6) {
                stackOut_16_0 = new String(var13, 0, var5);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L3: {
                  var7 = param1[param2 + var6] & 255;
                  if (var7 == 0) {
                    var6++;
                    var6++;
                    break L3;
                  } else {
                    L4: {
                      if (var7 < 128) {
                        break L4;
                      } else {
                        if (var7 >= 160) {
                          break L4;
                        } else {
                          L5: {
                            var8 = lf.field_e[-128 + var7];
                            if (var8 != 0) {
                              break L5;
                            } else {
                              var8 = 63;
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        }
                      }
                    }
                    int incrementValue$25 = var5;
                    var5++;
                    var9[incrementValue$25] = (char)var7;
                    var6++;
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
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4_ref;
            stackOut_18_1 = new StringBuilder().append("bc.B(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_17_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
