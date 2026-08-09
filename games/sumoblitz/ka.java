/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ka {
    static String field_a;
    static int field_b;

    final static int a(mp param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 8 % ((param1 - -40) / 46);
            if (wn.field_b != param0) {
              if (nl.field_n == param0) {
                stackIn_9_0 = 34065;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (param0 == rt.field_C) {
                  stackIn_7_0 = 34066;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            } else {
              stackIn_2_0 = 9216;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("ka.F(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -59) {
            mp var2 = (mp) null;
            ka.a((mp) null, 4);
        }
    }

    static {
        field_a = "Password is valid";
    }
}
