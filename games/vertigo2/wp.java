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
        if (param0 == 10) {
          field_b = null;
          field_e = null;
          return;
        }
        field_a = 94;
        field_b = null;
        field_e = null;
    }

    final static ig a(String param0, byte param1, int param2) {
        aj var3 = null;
        RuntimeException var3_ref = null;
        ig stackIn_2_0 = null;
        aj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new aj();
          ((ig) ((Object) var3)).field_b = param2;
          ((ig) ((Object) var3)).field_a = param0;
          if (param1 == -109) {
            stackIn_4_0 = var3;
            return (ig) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (ig) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("wp.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 == hn.field_w) {
          or.b(4);
          hn.field_w = 11;
          nq.field_E = true;
          return;
        }
        if (!ne.j(param0 - 10)) {
          or.b(4);
          hn.field_w = 11;
          nq.field_E = true;
          return;
        }
        nq.field_E = true;
    }

    static {
        field_b = "Auto-respond to <%0>";
        field_c = "Connection lost - attempting to reconnect";
        field_e = "level complete";
        field_d = "Log in";
    }
}
