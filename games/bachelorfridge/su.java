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
        if (param0 != -12) {
            su.a(false);
        }
        for (var2 = 0; (var2 ^ -1) > -12; var2++) {
            for (var3 = 0; var3 < -1 + this.field_c.length; var3++) {
                var4 = this.field_c[var3];
                var5 = this.field_c[1 + var3];
                this.field_b[var2][var3] = new cea(var4.field_b[var2].field_j, var5.field_b[var2].field_j, -var4.field_a + var5.field_a);
            }
        }
    }

    private final void b(boolean param0) {
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
        int var2 = 0;
        if (!param0) {
            su.a(false);
        }
        while (11 > var2) {
            for (var3 = 0; -1 + this.field_c.length > var3; var3++) {
                var4 = this.field_c[var3];
                var5 = this.field_c[var3 - -1];
                var6 = new dha(var4.field_b[var2].field_d, var4.field_b[var2].field_e);
                var7 = new dha(var5.field_b[var2].field_d, var5.field_b[var2].field_e);
                var8 = -var6.field_c + var7.field_c >> -482912830;
                var9 = -var6.field_a + var7.field_a >> 144195234;
                var10 = new dha(var6.field_c + var8, var9 + var6.field_a);
                var11 = new dha(-var8 + var7.field_c, var7.field_a - var9);
                this.field_d[var2][var3] = new gw(var6, var10, var11, var7, 0);
            }
            var2++;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_a = null;
        if (!param0) {
            field_e = (String) null;
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
        if (param0 <= 94) {
            this.field_d = (gw[][]) null;
        }
        for (var2 = 0; 11 > var2; var2++) {
            for (var3 = 0; var3 < -1 + this.field_c.length; var3++) {
                var4 = this.field_c[var3];
                var5 = this.field_c[var3 - -1];
                var6 = new dha(var4.field_b[var2].field_h, var4.field_b[var2].field_l);
                var7 = new dha(var5.field_b[var2].field_h, var5.field_b[var2].field_l);
                var8 = -var6.field_c + var7.field_c >> -1902108542;
                var9 = -var6.field_a + var7.field_a >> 1854964002;
                var10 = new dha(var6.field_c - -var8, var6.field_a - -var9);
                var11 = new dha(-var8 + var7.field_c, var7.field_a - var9);
                this.field_f[var2][var3] = new gw(var6, var10, var11, var7, 0);
            }
        }
    }

    su(cda[] param0) {
        try {
            this.field_c = param0;
            this.field_f = new gw[11][this.field_c.length + -1];
            this.field_d = new gw[11][-1 + this.field_c.length];
            this.field_b = new cea[11][this.field_c.length + -1];
            this.a(123);
            this.b(true);
            this.b(-12);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "su.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Name is available";
        field_e = "Click the walk action to activate it.";
    }
}
