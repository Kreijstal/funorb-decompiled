/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static java.security.SecureRandom field_b;
    static java.awt.Image field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2 = param0 * (param0 * param0 >> 12) >> 12;
        int var3 = param0 * 6 + -61440;
        int var4 = 40960 - -(var3 * param0 >> 12);
        return var2 * var4 >> 12;
    }

    final static int a(int param0, byte param1) {
        param0 = (param0 & 1431655765) + ((-1431655765 & param0) >>> 1);
        param0 = (param0 & 858993459) + (param0 >>> 2 & -214748365);
        param0 = param0 - -(param0 >>> 4) & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    final static String a(char param0, String param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_3_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param1.length();
            if (!param2) {
              L1: {
                var5 = param3.length();
                var6 = var4_int;
                var7 = var5 + -1;
                if (var7 != 0) {
                  var8_int = 0;
                  L2: while (true) {
                    var8_int = param1.indexOf('_', var8_int);
                    if (var8_int < 0) {
                      break L1;
                    } else {
                      var6 = var6 + var7;
                      var8_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var8 = new StringBuilder(var6);
              var9 = 0;
              L3: while (true) {
                var10 = param1.indexOf('_', var9);
                if (var10 >= 0) {
                  StringBuilder discarded$7 = var8.append(param1.substring(var9, var10));
                  StringBuilder discarded$8 = var8.append(param3);
                  var9 = 1 + var10;
                  continue L3;
                } else {
                  StringBuilder discarded$9 = var8.append(param1.substring(var9));
                  stackOut_13_0 = var8.toString();
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("gf.A(").append('_').append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_14_0;
    }

    static {
    }
}
