/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static String field_d;
    static ak field_e;
    static dj field_a;
    static String field_b;
    static String field_c;

    final static void a(int param0, tf param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jf.field_a = param1;
              if (param0 < -45) {
                break L1;
              } else {
                sk.a((byte) -101);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("sk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
        field_a = null;
        int var1 = -34 % ((40 - param0) / 58);
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, int param6, byte param7, boolean param8, int param9, boolean param10, int param11, boolean param12, int param13) {
        tf var15;
        up.field_o = null;
        ug.a(2586);
        param12 = bq.a((byte) -124, param2, param6, param12, param13, param11, param5);
        i.a(param5, param10, param8, param0, param3, param1, -28362, param12, param4, param9);
        oh.a(param0, 0, param4);
        bd.a((byte) -64, param12, param4, param11);
        if (param7 > -112) {
          var15 = (tf) null;
          sk.a(75, (tf) null);
          return;
        } else {
          return;
        }
    }

    static {
        field_d = "This entry doesn't match";
        field_b = "Return to game";
        field_c = "From <%0>: ";
        field_a = new dj();
    }
}
