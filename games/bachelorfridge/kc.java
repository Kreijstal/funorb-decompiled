/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc implements Runnable {
    volatile pb[] field_b;
    ht field_c;
    volatile boolean field_e;
    static String field_a;
    volatile boolean field_d;

    public final void run() {
        int var1_int = 0;
        pb var2 = null;
        int var4 = BachelorFridge.field_y;
        this.field_d = true;
        try {
            while (!this.field_e) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = this.field_b[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.f();
                    }
                }
                gda.a(false, 10L);
                Object var5 = (Object) null;
                he.a(this.field_c, false, (Object) null);
            }
        } catch (Exception exception) {
            String var6 = (String) null;
            cv.a(1, (String) null, (Throwable) ((Object) exception));
        } finally {
            this.field_d = false;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 94) {
            field_a = (String) null;
        }
    }

    kc() {
        this.field_b = new pb[2];
        this.field_e = false;
        this.field_d = false;
    }

    static {
        field_a = "<%0> has dropped out.";
    }
}
