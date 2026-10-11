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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!tc.a(param2, param0, param3 + 34170, param1)) {
            return null;
          }
          if (param3 != -8691) {
            field_c = -28;
          }
          stackIn_6_0 = vc.b(0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("oj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
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
