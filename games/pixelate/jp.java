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
          bn.field_I.a(param5, param0, param4, 256, param2);
          if (null != bo.field_h) {
            bo.field_h.a(param0, param6 + -di.field_a, param3, param6, (byte) -94, param0);
            return;
          } else {
            return;
          }
        } else {
          jp.b((byte) -3);
          bn.field_I.a(param5, param0, param4, 256, param2);
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
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 8192) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            if (!param2) {
              stackOut_5_0 = lm.field_o.c(param0);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = ie.field_G.c(param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("jp.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    abstract int b(int param0, int param1);

    static {
        field_a = new int[8192];
        field_d = "You have not yet unlocked this option for use.";
        field_b = "Please remove <%0> from your friend list first.";
    }
}
