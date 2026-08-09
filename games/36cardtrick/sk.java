/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static String field_a;
    static int[][] field_b;
    static int field_d;
    static int field_e;
    static kc field_c;

    final static int a(int param0, int param1, int param2) {
        int var3;
        if (param0 <= 17) {
          field_b = (int[][]) null;
          var3 = param2 >> -1364724737 & -1 + param1;
          return var3 + ((param2 >>> -1789106177) + param2) % param1;
        } else {
          var3 = param2 >> -1364724737 & -1 + param1;
          return var3 + ((param2 >>> -1789106177) + param2) % param1;
        }
    }

    final static boolean a(byte param0, qk param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 33) {
              stackIn_4_0 = param1.a((byte) 20);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("sk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_b = (int[][]) null;
        field_c = null;
        if (param0 != -12865) {
            field_c = (kc) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static rc a(int param0, byte param1) {
        rc var2;
        if (param1 != 125) {
          return (rc) null;
        } else {
          var2 = new rc();
          ue.field_b.a(var2, param1 + 27237);
          fl.b(1, param0);
          return var2;
        }
    }

    static {
        field_d = 0;
        field_e = 0;
        field_a = "To server list";
    }
}
