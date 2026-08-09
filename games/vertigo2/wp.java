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
            return (er[]) null;
        }
        return nr.a(param3, 1, param2, param0, -33);
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 10) {
          field_a = 94;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static ig a(String param0, byte param1, int param2) {
        aj var3 = null;
        RuntimeException var3_ref = null;
        ig stackIn_2_0 = null;
        aj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new aj();
            ((ig) ((Object) var3)).field_b = param2;
            ((ig) ((Object) var3)).field_a = param0;
            if (param1 == -109) {
              stackIn_4_0 = (aj) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ig) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("wp.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ig) ((Object) stackIn_4_0);
        }
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
        field_b = "Auto-respond to <%0>";
        field_c = "Connection lost - attempting to reconnect";
        field_e = "level complete";
        field_d = "Log in";
    }
}
