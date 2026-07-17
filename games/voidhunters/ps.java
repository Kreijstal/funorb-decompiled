/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ps {
    static phb[] field_a;

    final static byte[] a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_13_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              L1: {
                L2: {
                  var3 = -4 & var2_int - -3;
                  var4 = 3 * (var3 / 4);
                  if (var2_int <= var3 - 2) {
                    break L2;
                  } else {
                    if (mwa.a(param0.charAt(-2 + var3), -82) != -1) {
                      L3: {
                        if (var3 - 1 >= var2_int) {
                          break L3;
                        } else {
                          if (mwa.a(param0.charAt(var3 + -1), -46) != -1) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4--;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 -= 2;
                break L1;
              }
              var5 = new byte[var4];
              int discarded$1 = ij.a(var5, -10388, 0, param0);
              stackOut_13_0 = (byte[]) var5;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              stackOut_1_0 = new byte[]{};
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("ps.G(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + 1 + 41);
        }
        return stackIn_14_0;
    }

    abstract void a(byte param0, byte[] param1);

    abstract byte[] a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_a = null;
    }

    abstract byte[] b(int param0);

    static {
    }
}
