/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef implements Runnable {
    volatile boolean field_a;
    volatile qh[] field_f;
    static tf field_e;
    fe field_b;
    volatile boolean field_d;
    static String field_c;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 >= -99) {
            ef.a(-74);
        }
    }

    public final void run() {
        int var1_int = 0;
        qh var2 = null;
        int var4 = Transmogrify.field_A ? 1 : 0;
        ((ef) this).field_d = true;
        try {
            while (!((ef) this).field_a) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((ef) this).field_f[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.a();
                    }
                }
                pg.a(10L, -108);
                Object var5 = null;
                db.a(((ef) this).field_b, (Object) null, -125);
            }
        } catch (Exception exception) {
            Object var6 = null;
            d.a((Throwable) (Object) exception, -14, (String) null);
        } finally {
            ((ef) this).field_d = false;
        }
    }

    ef() {
        ((ef) this).field_f = new qh[2];
        ((ef) this).field_a = false;
        ((ef) this).field_d = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new tf(6, 0, 4, 2);
        field_c = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
