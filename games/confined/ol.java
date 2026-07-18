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
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = param0.length();
            param0.setLength(0);
            var5 = var4_int;
            L1: while (true) {
              if (var5 >= 0) {
                stackOut_4_0 = (StringBuilder) param0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                param0.setCharAt(var5, ' ');
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ol.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 0 + ',' + -1046 + ',' + ' ' + ')');
        }
        return stackIn_5_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 30613) {
            field_b = null;
        }
        nn.field_t[param3].d(param0, param4);
        pn.field_a.a(Integer.toString(param2), param0 + 39, 38 + param4, 16777215, -1);
    }

    final static void a(byte param0) {
        int var1 = -89;
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
        field_a = null;
    }

    final static void a(int param0, byte param1, boolean param2) {
        fi.field_a = param0;
        li.field_l = param2 ? true : false;
        if (param1 < 84) {
            field_a = null;
        }
        cj.field_d = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Use the keyboard for your upgrades.";
    }
}
