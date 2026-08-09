/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static String field_b;
    static String field_c;
    static String field_a;

    final static wb a(int param0, int param1, int param2, byte param3, int param4, int[] param5, int param6, int param7, int param8) {
        wb var9 = null;
        RuntimeException var9_ref = null;
        wb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -66) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var9 = new wb(param6, param1, param4, param7, param2, param0, param5);
            hj.field_k.a((byte) 91, var9);
            ab.a(param3 + -20614, param8, var9);
            stackIn_3_0 = (wb) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var9_ref);

            stackIn_6_1 = new StringBuilder().append("tj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0) {
            field_c = (String) null;
        }
    }

    static {
        field_b = "New obstacles to overcome: freezing water";
        field_c = "Superior aqualung: Extends time that can be spent underwater further.";
        field_a = "Ice bomb: Turns water into loose ice blocks and freezes ice blocks back onto the Super Volcano.";
    }
}
