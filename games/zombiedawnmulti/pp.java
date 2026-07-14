/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pp extends ic {
    private long field_p;
    static ri[] field_q;
    static boolean field_n;
    static String field_o;
    private String field_m;

    public static void a(boolean param0) {
        field_o = null;
        field_q = null;
        if (param0) {
            pp.a(true);
        }
    }

    pi b(int param0) {
        if (param0 != 7) {
            field_o = null;
            return pl.field_G;
        }
        return pl.field_G;
    }

    pp(long param0, String param1) {
        ((pp) this).field_p = param0;
        ((pp) this).field_m = param1;
    }

    final void a(k param0, int param1) {
        param0.a(((pp) this).field_p, true);
        if (param1 != -1) {
          pi discarded$2 = ((pp) this).b(-111);
          param0.a(13066, ((pp) this).field_m);
          return;
        } else {
          param0.a(13066, ((pp) this).field_m);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Make humans or enemy zombies heavy with their burdens, slowing them down. Then, move in for the kill!";
    }
}
