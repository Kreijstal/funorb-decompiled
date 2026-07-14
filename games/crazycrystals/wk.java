/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wk implements Iterator {
    private ij field_e;
    private be field_d;
    static int field_b;
    static String[] field_c;
    private ij field_a;

    public final boolean hasNext() {
        return ((wk) this).field_e != ((wk) this).field_d.field_f;
    }

    public static void a(boolean param0) {
        if (param0) {
            Object var2 = null;
            wk.a((String) null, true, (String) null, false);
            field_c = null;
            return;
        }
        field_c = null;
    }

    public final void remove() {
        if (((wk) this).field_a == null) {
            throw new IllegalStateException();
        }
        ((wk) this).field_a.a(1);
        ((wk) this).field_a = null;
    }

    final static void a(String param0, boolean param1, String param2, boolean param3) {
        jd.field_G = param0;
        ig.field_p = param2;
        ke.a(no.field_i, param1, -13);
        if (param3) {
            Object var5 = null;
            wk.a((String) null, true, (String) null, true);
        }
    }

    public final Object next() {
        ij var1 = ((wk) this).field_e;
        if (var1 != ((wk) this).field_d.field_f) {
            ((wk) this).field_e = var1.field_j;
        } else {
            var1 = null;
            ((wk) this).field_e = null;
        }
        ((wk) this).field_a = var1;
        return (Object) (Object) var1;
    }

    wk(be param0) {
        ((wk) this).field_a = null;
        ((wk) this).field_d = param0;
        ((wk) this).field_e = ((wk) this).field_d.field_f.field_j;
        ((wk) this).field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"idle", "", "", "", "walk", "", "", "", "cross_arms", "tap_foot", null, "wave", "push_rock_up", "punch_ball", null, "sticky_feet", "prod_spider_playertile", null, "prod_spider_spidertile", null, "death_crushed", "death_blown_up", "death_got_by_spider"};
    }
}
