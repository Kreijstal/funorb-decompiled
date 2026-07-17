/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static gj field_c;
    static boolean field_a;
    static boolean[][] field_b;

    final static int a(int param0, aba param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          if (param1 != et.field_c) {
            if (param1 != asa.field_a) {
              if (param1 != df.field_o) {
                if (param1 != je.field_c) {
                  if (feb.field_a != param1) {
                    throw new IllegalArgumentException();
                  } else {
                    stackOut_13_0 = 34023;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                } else {
                  stackOut_10_0 = 260;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_7_0 = 34165;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_4_0 = 8448;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          } else {
            stackOut_1_0 = 7681;
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("tc.A(").append(8448).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L0;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L0;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        be var3 = new be();
        var3.field_a = param1;
        var3.field_b = 31 + param2;
        rkb.a(0, (tv) (Object) var3, dpa.field_p, 70);
    }

    public static void a() {
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[][]{new boolean[3]};
    }
}
