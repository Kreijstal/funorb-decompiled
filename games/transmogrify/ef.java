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
        this.field_d = true;
        try {
            while (!this.field_a) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = this.field_f[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.a();
                    }
                }
                pg.a(10L, -108);
                Object var5 = (Object) null;
                db.a(this.field_b, (Object) null, -125);
            }
        } catch (Exception exception) {
            String var6 = (String) null;
            d.a((Throwable) ((Object) exception), -14, (String) null);
        } finally {
            this.field_d = false;
        }
    }

    ef() {
        this.field_f = new qh[2];
        this.field_a = false;
        this.field_d = false;
    }

    static {
        field_e = new tf(6, 0, 4, 2);
        field_c = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
