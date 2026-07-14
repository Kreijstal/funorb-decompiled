/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends l {
    static String field_r;
    int field_o;
    static String field_k;
    int field_n;
    int field_q;
    static String field_j;
    int field_m;
    int field_p;
    int field_l;
    static int field_i;
    static il field_s;
    static String field_g;
    int field_h;

    public static void a(int param0) {
        field_k = null;
        field_s = null;
        if (param0 != -24488) {
          fl.a(-64);
          field_r = null;
          field_j = null;
          field_g = null;
          return;
        } else {
          field_r = null;
          field_j = null;
          field_g = null;
          return;
        }
    }

    fl(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((fl) this).field_h = param5;
        ((fl) this).field_p = param1;
        ((fl) this).field_m = param2;
        ((fl) this).field_o = param6;
        ((fl) this).field_l = param4;
        ((fl) this).field_q = param3;
        ((fl) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Kick <%0> from this game";
        field_r = "You are offering a rematch.";
        field_g = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_j = "Achieved";
    }
}
