/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp implements Runnable {
    volatile id[] field_c;
    un field_e;
    volatile boolean field_b;
    static String field_a;
    volatile boolean field_d;

    final static sj[] a() {
        int var1 = -1;
        return new sj[]{mn.field_j, og.field_x, cc.field_c, lm.field_e, jl.field_g, qn.field_g, sb.field_E, cm.field_a, tn.field_q, md.field_u, vg.field_a, qj.field_a, cn.field_b, sp.field_f};
    }

    rp() {
        ((rp) this).field_c = new id[2];
        ((rp) this).field_d = false;
        ((rp) this).field_b = false;
    }

    public static void b() {
        field_a = null;
    }

    public final void run() {
        int var1_int = 0;
        id var2 = null;
        int var4 = CrazyCrystals.field_B;
        ((rp) this).field_b = true;
        try {
            while (!((rp) this).field_d) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((rp) this).field_c[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.c();
                    }
                }
                fh.a(true, 10L);
                int discarded$0 = 1;
                so.a((Object) null, ((rp) this).field_e);
            }
        } catch (Exception exception) {
            int discarded$1 = 21862;
            wp.a((Throwable) (Object) exception, (String) null);
        } finally {
            ((rp) this).field_b = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Achievements This Game";
    }
}
