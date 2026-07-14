/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends oh {
    byte[] field_n;
    static rs field_i;
    static String field_m;
    static int[] field_h;
    static String field_o;
    static String field_l;
    static sg[][] field_p;
    static int field_k;
    int field_j;

    final static void a(String param0, int param1, boolean param2) {
        jh.field_D = param2 ? true : false;
        mg.field_C = true;
        ji.field_G = new ns(le.field_e, sl.field_p, param0, el.field_b, jh.field_D);
        le.field_e.a(true, (vg) (Object) ji.field_G);
        int var3 = -116 / ((-1 - param1) / 54);
    }

    public static void a(byte param0) {
        field_o = null;
        field_l = null;
        if (param0 < 76) {
          fk.a((byte) 91);
          field_m = null;
          field_p = null;
          field_h = null;
          field_i = null;
          return;
        } else {
          field_m = null;
          field_p = null;
          field_h = null;
          field_i = null;
          return;
        }
    }

    fk(byte[] param0) {
        ((fk) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Remove <%0> from ignore list";
        field_l = "C: Show Chat";
        field_h = new int[8192];
        field_o = "Spectate <%0>'s game";
    }
}
