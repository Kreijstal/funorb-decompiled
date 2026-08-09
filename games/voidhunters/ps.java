/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ps {
    static phb[] field_a;

    final static byte[] a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
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
                ij.a(var7, param1 + -10389, 0, param0);
                stackIn_15_0 = (byte[]) (var5);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_13_0 = (byte[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = new byte[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("ps.G(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
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
