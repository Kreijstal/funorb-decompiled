/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class su {
    cea[][] field_b;
    static String field_e;
    private cda[] field_c;
    gw[][] field_d;
    gw[][] field_f;
    static String field_a;

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        cda var4 = null;
        cda var5 = null;
        int var6 = BachelorFridge.field_y;
        for (var2 = 0; var2 < 11; var2++) {
            for (var3 = 0; var3 < -1 + ((su) this).field_c.length; var3++) {
                var4 = ((su) this).field_c[var3];
                var5 = ((su) this).field_c[1 + var3];
                ((su) this).field_b[var2][var3] = new cea(var4.field_b[var2].field_j, var5.field_b[var2].field_j, -var4.field_a + var5.field_a);
            }
        }
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        cda var4 = null;
        cda var5 = null;
        dha var6 = null;
        dha var7 = null;
        int var8 = 0;
        int var9 = 0;
        dha var10 = null;
        dha var11 = null;
        int var12 = BachelorFridge.field_y;
        for (var2 = 0; 11 > var2; var2++) {
            for (var3 = 0; -1 + ((su) this).field_c.length > var3; var3++) {
                var4 = ((su) this).field_c[var3];
                var5 = ((su) this).field_c[var3 - -1];
                var6 = new dha(var4.field_b[var2].field_d, var4.field_b[var2].field_e);
                var7 = new dha(var5.field_b[var2].field_d, var5.field_b[var2].field_e);
                var8 = -var6.field_c + var7.field_c >> 2;
                var9 = -var6.field_a + var7.field_a >> 2;
                var10 = new dha(var6.field_c + var8, var9 + var6.field_a);
                var11 = new dha(-var8 + var7.field_c, var7.field_a - var9);
                ((su) this).field_d[var2][var3] = new gw(var6, var10, var11, var7, 0);
            }
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_a = null;
        if (!param0) {
            field_e = null;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        cda var4 = null;
        cda var5 = null;
        dha var6 = null;
        dha var7 = null;
        int var8 = 0;
        int var9 = 0;
        dha var10 = null;
        dha var11 = null;
        int var12 = BachelorFridge.field_y;
        for (var2 = 0; 11 > var2; var2++) {
            for (var3 = 0; var3 < -1 + ((su) this).field_c.length; var3++) {
                var4 = ((su) this).field_c[var3];
                var5 = ((su) this).field_c[var3 - -1];
                var6 = new dha(var4.field_b[var2].field_h, var4.field_b[var2].field_l);
                var7 = new dha(var5.field_b[var2].field_h, var5.field_b[var2].field_l);
                var8 = -var6.field_c + var7.field_c >> 2;
                var9 = -var6.field_a + var7.field_a >> 2;
                var10 = new dha(var6.field_c - -var8, var6.field_a - -var9);
                var11 = new dha(-var8 + var7.field_c, var7.field_a - var9);
                ((su) this).field_f[var2][var3] = new gw(var6, var10, var11, var7, 0);
            }
        }
    }

    su(cda[] param0) {
        try {
            ((su) this).field_c = param0;
            ((su) this).field_f = new gw[11][((su) this).field_c.length + -1];
            ((su) this).field_d = new gw[11][-1 + ((su) this).field_c.length];
            ((su) this).field_b = new cea[11][((su) this).field_c.length + -1];
            this.a(123);
            this.b(true);
            this.b(-12);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "su.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Name is available";
        field_e = "Click the walk action to activate it.";
    }
}
