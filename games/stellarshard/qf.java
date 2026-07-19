/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf implements Runnable {
    volatile ba[] field_e;
    volatile boolean field_b;
    static ql field_d;
    ej field_h;
    static java.awt.Color field_a;
    volatile boolean field_c;
    static int[] field_g;
    static byte[][][] field_i;
    static String field_f;

    final static void a(byte param0) {
        fk var3 = null;
        int var2 = stellarshard.field_B;
        try {
            var3 = (fk) ((Object) tf.field_a.b(-92));
            while (var3 != null) {
                hf.a(var3, 58, 5);
                var3 = (fk) ((Object) tf.field_a.b((byte) 109));
            }
            if (param0 != -125) {
                qf.a((byte) 102);
            }
            gg.field_f = ee.a(5, 0, (byte) -124, 1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "qf.B(" + param0 + ')');
        }
    }

    public final void run() {
        int var1_int = 0;
        ba var2 = null;
        int var4 = stellarshard.field_B;
        this.field_c = true;
        try {
            while (!this.field_b) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = this.field_e[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.a();
                    }
                }
                jj.a((byte) -117, 10L);
                Object var5 = (Object) null;
                ni.a(this.field_h, (Object) null, -117);
            }
        } catch (Exception exception) {
            String var6 = (String) null;
            qe.a(68, (String) null, (Throwable) ((Object) exception));
        } finally {
            this.field_c = false;
        }
    }

    qf() {
        this.field_e = new ba[2];
        this.field_b = false;
        this.field_c = false;
    }

    public static void a(int param0) {
        if (param0 != -15967) {
            return;
        }
        field_i = (byte[][][]) null;
        field_g = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_a = new java.awt.Color(10040319);
        field_f = "Level              ";
    }
}
