/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ps {
    static phb[] field_a;

    final static byte[] a(String param0, int param1) {
        int discarded$1 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_14_0 = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
              var7 = new byte[var4];
              var6 = var7;
              var5 = var6;
              if (param1 == 1) {
                discarded$1 = ij.a(var7, param1 + -10389, 0, param0);
                stackOut_14_0 = (byte[]) (var5);
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_12_0 = (byte[]) null;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = new byte[]{};
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("ps.G(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    abstract void a(byte param0, byte[] param1);

    abstract byte[] a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
            field_a = (phb[]) null;
        }
    }

    abstract byte[] b(int param0);

    static {
    }
}
