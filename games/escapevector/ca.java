/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca {
    static String field_d;
    static String field_a;
    static lk field_c;
    static String field_b;

    abstract void a(java.awt.Component param0, boolean param1);

    abstract int a(int param0);

    final static void b(byte param0) {
        if (!(null == bk.field_r)) {
            bk.field_r.a((byte) -34);
        }
    }

    final static void a(int param0, int param1, bd param2) {
        try {
            rd.field_b.a(-12328, (hg) (Object) param2);
            r.a(-110, param2, param1);
            if (param0 != 1) {
                field_a = null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ca.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final static String a(int param0, char param1, String param2, String param3) {
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
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = param0 + var5;
              if (var7 != 0) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param2.indexOf((int) param1, var8_int);
                  if (var8_int >= 0) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param2.indexOf((int) param1, var9);
              if (var10 >= 0) {
                StringBuilder discarded$3 = var8.append(param2.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$4 = var8.append(param3);
                continue L3;
              } else {
                StringBuilder discarded$5 = var8.append(param2.substring(var9));
                stackOut_11_0 = var8.toString();
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ca.D(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_12_0;
    }

    abstract void a(int param0, java.awt.Component param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = null;
    }
}
