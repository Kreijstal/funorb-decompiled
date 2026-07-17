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
        ((fb) this).field_f = true;
        try {
            while (!((fb) this).field_h) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((fb) this).field_i[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.a();
                    }
                }
                kk.a(10L, true);
                Object var5 = null;
                oh.a(((fb) this).field_d, 1, (Object) null);
            }
        } catch (Exception exception) {
            Object var6 = null;
            gb.a((Throwable) (Object) exception, (String) null, 10);
        } finally {
            ((fb) this).field_f = false;
        }
    }

    public static void a() {
        field_a = null;
        field_c = null;
        field_e = null;
        field_g = null;
        field_b = null;
    }

    fb() {
        ((fb) this).field_i = new id[2];
        ((fb) this).field_h = false;
        ((fb) this).field_f = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[4];
        field_c = new int[]{256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 65280, 65280, 65280, 65280, 256, 256, 0, 256, 256, 256, 256, 256, 0, 256, 256, 256, 256, 256, 256, 0, 256, 256, 256, 256, 256, 256, 256, 0, 256, 256, 256, 256, 0, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256};
        field_a = "Loading extra data";
    }
}
