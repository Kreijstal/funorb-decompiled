/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static bi field_c;
    static String field_b;
    static bc field_a;

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = param0.length();
            param0.setLength(param1);
            var5 = var4_int;
            L1: while (true) {
              if (var5 >= param1) {
                L2: {
                  if (param2 == -1046) {
                    break L2;
                  } else {
                    ol.a(81, 67, -16, -58, 110);
                    break L2;
                  }
                }
                stackOut_6_0 = (StringBuilder) (param0);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param0.setCharAt(var5, param3);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ol.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 30613) {
            field_b = (String) null;
        }
        nn.field_t[param3].d(param0, param4);
        pn.field_a.a(Integer.toString(param2), param0 + 39, 38 + param4, 16777215, -1);
    }

    final static void a(byte param0) {
        int var1 = -89 / ((param0 - -59) / 35);
        if (!(fd.field_j)) {
            throw new IllegalStateException();
        }
        qf.field_g = true;
        aa.a((byte) -113, true);
        rk.field_e = 0;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 0) {
            field_c = (bi) null;
        }
        field_a = null;
    }

    final static void a(int param0, byte param1, boolean param2) {
        fi.field_a = param0;
        li.field_l = param2 ? true : false;
        if (param1 < 84) {
            field_a = (bc) null;
        }
        cj.field_d = true;
    }

    static {
        field_b = "Use the keyboard for your upgrades.";
    }
}
