/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static String field_a;
    static String field_b;

    final static du a(String param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        pc var4 = null;
        pc stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 104 % ((16 - param1) / 61);
            var4 = new pc();
            ((du) ((Object) var4)).field_a = param0;
            ((du) ((Object) var4)).field_c = param2;
            stackIn_1_0 = (pc) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ti.A(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (du) ((Object) stackIn_1_0);
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 <= 17) {
            return;
        }
        field_a = null;
    }

    final static String b(byte param0) {
        Boolean stackIn_3_0 = null;
        Boolean stackIn_3_1 = null;
        Boolean stackIn_4_0 = null;
        Boolean stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        Boolean stackIn_7_0 = null;
        Boolean stackIn_7_1 = null;
        Boolean stackIn_8_0 = null;
        Boolean stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        if (param0 > -117) {
          L0: {
            field_b = (String) null;
            stackIn_7_0 = null;

            stackIn_7_1 = null;

            if (ms.field_o) {
              stackIn_8_0 = null;
              stackIn_8_1 = null;
              stackIn_8_2 = 0;
              break L0;
            } else {
              stackIn_8_0 = null;
              stackIn_8_1 = null;
              stackIn_8_2 = 1;
              break L0;
            }
          }
          ms.field_o = stackIn_8_2 != 0;
          return new Boolean(stackIn_8_2 != 0).toString();
        } else {
          L1: {
            stackIn_3_0 = null;

            stackIn_3_1 = null;

            if (ms.field_o) {
              stackIn_4_0 = null;
              stackIn_4_1 = null;
              stackIn_4_2 = 0;
              break L1;
            } else {
              stackIn_4_0 = null;
              stackIn_4_1 = null;
              stackIn_4_2 = 1;
              break L1;
            }
          }
          ms.field_o = stackIn_4_2 != 0;
          return new Boolean(stackIn_4_2 != 0).toString();
        }
    }

    static {
        field_a = "Cancel unrated rematch";
        field_b = "This unit already has <%0>";
    }
}
