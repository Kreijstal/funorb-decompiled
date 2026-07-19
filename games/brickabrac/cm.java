/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends bo {
    static String field_u;
    static String field_q;
    static int field_o;
    static String field_n;
    static boolean field_s;
    static String field_t;
    static String field_p;
    static jp[] field_r;

    cm(long param0, String param1) {
        super(param0, param1);
    }

    public static void b(byte param0) {
        field_q = null;
        field_u = null;
        field_r = null;
        field_n = null;
        field_t = null;
        if (param0 != -121) {
          field_o = -51;
          field_p = null;
          return;
        } else {
          field_p = null;
          return;
        }
    }

    final cd a(int param0) {
        if (param0 != 13) {
            field_r = (jp[]) null;
            return bj.field_Y;
        }
        return bj.field_Y;
    }

    static {
        field_q = "No spectators";
        field_u = "Similar rating";
        field_t = "Loading...";
        field_n = "Waiting for instruments";
        field_p = "Level: <%0>";
    }
}
