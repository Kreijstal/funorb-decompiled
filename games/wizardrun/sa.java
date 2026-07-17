/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    kl field_a;
    String field_f;
    String field_h;
    static String field_b;
    static java.awt.Color field_e;
    String field_d;
    static kd field_g;
    int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_g = null;
    }

    final static short[] a(int param0, byte param1, mg param2, short[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_10_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_18_0 = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            var4_int = param2.g(param0, -11719);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new short[var4_int];
                break L1;
              }
              var5 = param2.g(4, -11719);
              var6 = (short)param2.g(16, -11719);
              if (param1 == -48) {
                L3: {
                  if (var5 <= 0) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param3[var7] = (short)var6;
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param3[var7] = (short)(param2.g(var5, -11719) + var6);
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackOut_18_0 = (short[]) param3;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (short[]) (Object) stackIn_10_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("sa.B(").append(param0).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_19_0;
    }

    private sa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Connection timed out. Please try using a different server.";
        field_e = new java.awt.Color(10040319);
        field_g = new kd();
    }
}
