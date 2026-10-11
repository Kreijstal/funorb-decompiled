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
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 8 % ((param1 + 40) / 46);
          if (wn.field_b == param0) {
            stackIn_2_0 = 9216;
            return stackIn_2_0;
          }
          if (nl.field_n == param0) {
            stackIn_9_0 = 34065;
            return stackIn_9_0;
          }
          if (param0 != rt.field_C) {
            throw new IllegalArgumentException();
          }
          stackIn_7_0 = 34066;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ka.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
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
