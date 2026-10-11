/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static gj field_c;
    static boolean field_a;
    static boolean[][] field_b;

    final static int a(int param0, aba param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 8448) {
            field_b = (boolean[][]) null;
          }
          if (param1 == et.field_c) {
            stackIn_4_0 = 7681;
            return stackIn_4_0;
          }
          if (param1 == asa.field_a) {
            stackIn_7_0 = 8448;
            return stackIn_7_0;
          }
          if (param1 == df.field_o) {
            stackIn_10_0 = 34165;
            return stackIn_10_0;
          }
          if (param1 == je.field_c) {
            stackIn_13_0 = 260;
            return stackIn_13_0;
          }
          if (feb.field_a != param1) {
            throw new IllegalArgumentException();
          }
          stackIn_16_0 = 34023;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("tc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        be var3 = new be();
        var3.field_a = param1;
        var3.field_b = 31 + param2;
        rkb.a(0, var3, dpa.field_p, param0);
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = (boolean[][]) null;
        if (param0 != 40) {
          field_c = (gj) null;
        }
    }

    static {
        field_b = new boolean[][]{new boolean[]{false, true, true}};
    }
}
