/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static int[] field_b;
    static char[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -78) {
            field_b = (int[]) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, ka[] param8, int param9, int param10, int param11, int param12, int param13) {
        int var14_int = 0;
        RuntimeException var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var14_int = ef.field_j[0];
              var15 = ef.field_j[1];
              var16 = var14_int - param0 >> 849703361;
              if (null == de.field_a) {
                de.field_a = new ka(var14_int, var15);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var17 = -param4 + var15 >> -877073887;
              de.field_a.d();
              qg.b();
              hd.a(param8, param4, param0, (byte) -96, var17, var16);
              qg.a(param7 + var16, param6 + var17, param5, param12, param1, 9186335, 240);
              if (gf.field_n == null) {
                gf.field_n = new ka(var14_int, var15);
                break L2;
              } else {
                break L2;
              }
            }
            gf.field_n.d();
            qg.b();
            qg.b(param3 + var16, param2 + var17, param9, param10, param11, 16777215);
            de.field_a.d();
            od.b(gf.field_n, 0, 0, 0, param13);
            la.field_f.a(-97);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var14 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var14);
            stackOut_8_1 = new StringBuilder().append("ne.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param8 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
        }
    }

    static {
        field_a = new char[]{(char)91, (char)93, (char)35};
        field_b = new int[16];
    }
}
