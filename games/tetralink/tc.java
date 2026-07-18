/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends mc {
    long field_r;
    int field_u;
    static je field_p;
    byte[] field_o;
    static String field_n;
    static String field_q;
    static long field_s;
    static int field_v;
    static String field_t;
    static int[] field_w;

    public static void a(boolean param0) {
        field_t = null;
        field_q = null;
        if (!param0) {
          tc.a(false);
          field_p = null;
          field_w = null;
          field_n = null;
          return;
        } else {
          field_p = null;
          field_w = null;
          field_n = null;
          return;
        }
    }

    tc(long param0, int param1, byte[] param2) {
        try {
            ((tc) this).field_r = param0;
            ((tc) this).field_u = param1;
            ((tc) this).field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "tc.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Accept rematch";
        field_n = "<%0> is already on your friend list.";
        field_p = new je();
        field_v = 0;
        field_t = "Names can only contain letters, numbers, spaces and underscores";
    }
}
