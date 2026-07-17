/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static String field_c;
    static String field_b;
    static int field_a;
    static String field_e;
    static String field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static er[] a(int param0, byte param1, int param2, int param3) {
        if (param1 < 72) {
            return null;
        }
        return nr.a(param3, 1, param2, param0, -33);
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        field_e = null;
    }

    final static ig a(String param0, byte param1, int param2) {
        aj var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        aj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        aj stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            var3 = new aj();
            ((ig) (Object) var3).field_b = param2;
            ((ig) (Object) var3).field_a = param0;
            if (param1 == -109) {
              stackOut_3_0 = (aj) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ig) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("wp.C(");
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
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
        }
        return (ig) (Object) stackIn_4_0;
    }

    final static void a(int param0) {
        if (param0 != hn.field_w) {
          if (ne.j(param0 + -10)) {
            nq.field_E = true;
            return;
          } else {
            or.b(4);
            hn.field_w = 11;
            nq.field_E = true;
            return;
          }
        } else {
          or.b(4);
          hn.field_w = 11;
          nq.field_E = true;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Auto-respond to <%0>";
        field_c = "Connection lost - attempting to reconnect";
        field_e = "level complete";
        field_d = "Log in";
    }
}
