/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static String field_d;
    static mg[] field_c;
    static String[] field_e;
    static jc field_b;
    static String field_h;
    int field_g;
    static String field_f;
    int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_c = null;
        field_d = null;
        field_h = null;
        if (param0 != -26834) {
          lc.a(57);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final static ck a(int param0, String param1, int param2) {
        ck var3 = null;
        if (param2 != 29493) {
          return null;
        } else {
          var3 = new ck(false);
          var3.field_e = param1;
          var3.field_g = param0;
          return var3;
        }
    }

    lc(int param0, int param1, int param2, int param3) {
        ((lc) this).field_a = param0;
        ((lc) this).field_g = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> is already on your ignore list.";
        field_h = "Invite players";
        field_f = "Enter name of player to delete from list";
    }
}
