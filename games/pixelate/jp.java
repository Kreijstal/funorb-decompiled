/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jp {
    static String field_b;
    static int[] field_a;
    static String field_d;
    static String field_c;

    abstract byte[] a(int param0, int param1);

    abstract kj a(byte param0);

    public static void b(byte param0) {
        if (param0 >= -42) {
            return;
        }
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 > 110) {
          bn.field_I.a(0, param0, 5, 256, 640);
          if (null != bo.field_h) {
            bo.field_h.a(param0, param6 + -di.field_a, param3, param6, (byte) -94, param0);
            return;
          } else {
            return;
          }
        } else {
          jp.b((byte) -3);
          bn.field_I.a(0, param0, 5, 256, 640);
          if (null == bo.field_h) {
            return;
          } else {
            bo.field_h.a(param0, param6 + -di.field_a, param3, param6, (byte) -94, param0);
            return;
          }
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (null != eg.field_n) {
          if (null == eg.field_n.field_o) {
            eg.field_n = null;
            bj.field_d = null;
            var1 = -128 / ((-64 - param0) / 33);
            return;
          } else {
            eg.field_n.field_o.field_U = false;
            eg.field_n = null;
            bj.field_d = null;
            var1 = -128 / ((-64 - param0) / 33);
            return;
          }
        } else {
          eg.field_n = null;
          bj.field_d = null;
          var1 = -128 / ((-64 - param0) / 33);
          return;
        }
    }

    final static int a(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param2) {
              stackOut_3_0 = lm.field_o.c(param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = ie.field_G.c(param0);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jp.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 8192 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    abstract int b(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_d = "You have not yet unlocked this option for use.";
        field_b = "Please remove <%0> from your friend list first.";
    }
}
