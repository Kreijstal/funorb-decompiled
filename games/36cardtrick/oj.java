/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static qa field_e;
    static int field_d;
    static pb field_a;
    static int field_c;
    static String field_b;

    final static wb a(int param0, qk param1, int param2, int param3) {
        RuntimeException var4 = null;
        wb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (tc.a(param2, param0, param3 + 34170, param1)) {
              L1: {
                if (param3 == -8691) {
                  break L1;
                } else {
                  field_c = -28;
                  break L1;
                }
              }
              stackIn_6_0 = vc.b(0);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("oj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean a(int param0) {
        if (param0 <= 84) {
            return false;
        }
        return !wh.field_a.a(640) ? true : false;
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -105) {
            field_c = 6;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_e = new qa("usename");
        field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
