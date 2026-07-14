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
        aj var3 = new aj();
        ((ig) (Object) var3).field_b = param2;
        ((ig) (Object) var3).field_a = param0;
        if (param1 != -109) {
            return null;
        }
        return (ig) (Object) var3;
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
