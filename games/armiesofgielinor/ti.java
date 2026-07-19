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
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        pc stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 104 % ((16 - param1) / 61);
            var4 = new pc();
            ((du) ((Object) var4)).field_a = param0;
            ((du) ((Object) var4)).field_c = param2;
            stackOut_0_0 = (pc) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("ti.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
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
        Boolean stackIn_2_0 = null;
        Boolean stackIn_2_1 = null;
        Boolean stackIn_3_0 = null;
        Boolean stackIn_3_1 = null;
        Boolean stackIn_4_0 = null;
        Boolean stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        Boolean stackIn_6_0 = null;
        Boolean stackIn_6_1 = null;
        Boolean stackIn_7_0 = null;
        Boolean stackIn_7_1 = null;
        Boolean stackIn_8_0 = null;
        Boolean stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        Boolean stackOut_5_0 = null;
        Boolean stackOut_5_1 = null;
        Boolean stackOut_7_0 = null;
        Boolean stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        Boolean stackOut_6_0 = null;
        Boolean stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        Boolean stackOut_1_0 = null;
        Boolean stackOut_1_1 = null;
        Boolean stackOut_3_0 = null;
        Boolean stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        Boolean stackOut_2_0 = null;
        Boolean stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        if (param0 > -117) {
          L0: {
            field_b = (String) null;
            stackOut_5_0 = null;
            stackOut_5_1 = null;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (ms.field_o) {
              stackOut_7_0 = null;
              stackOut_7_1 = null;
              stackOut_7_2 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackOut_6_1 = null;
              stackOut_6_2 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          ms.field_o = stackIn_8_2 != 0;
          return new Boolean(stackIn_8_2 != 0).toString();
        } else {
          L1: {
            stackOut_1_0 = null;
            stackOut_1_1 = null;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (ms.field_o) {
              stackOut_3_0 = null;
              stackOut_3_1 = null;
              stackOut_3_2 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackOut_2_1 = null;
              stackOut_2_2 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
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
