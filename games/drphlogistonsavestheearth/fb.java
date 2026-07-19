/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb implements Runnable {
    static el field_e;
    static int[] field_b;
    static String field_a;
    static vd field_g;
    bl field_d;
    static int[] field_c;
    volatile boolean field_h;
    volatile boolean field_f;
    volatile id[] field_i;

    public final void run() {
        int var1_int = 0;
        id var2 = null;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.field_f = true;
        try {
            while (!this.field_h) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = this.field_i[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.a();
                    }
                }
                kk.a(10L, true);
                Object var5 = (Object) null;
                oh.a(this.field_d, 1, (Object) null);
            }
        } catch (Exception exception) {
            String var6 = (String) null;
            gb.a((Throwable) ((Object) exception), (String) null, 10);
        } finally {
            this.field_f = false;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        if (param0 != 256) {
            field_c = (int[]) null;
        }
        field_g = null;
        field_b = null;
    }

    fb() {
        this.field_i = new id[2];
        this.field_h = false;
        this.field_f = false;
    }

    static {
        field_b = new int[4];
        field_c = new int[]{256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 65280, 65280, 65280, 65280, 256, 256, 0, 256, 256, 256, 256, 256, 0, 256, 256, 256, 256, 256, 256, 0, 256, 256, 256, 256, 256, 256, 256, 0, 256, 256, 256, 256, 0, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256};
        field_a = "Loading extra data";
    }
}
