/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    private int field_b;
    static char field_c;
    private wm field_e;
    private int field_f;
    static int field_i;
    static volatile boolean field_d;
    private ii field_g;
    static int field_h;
    static ec field_a;
    static vn[] field_k;
    static int field_j;

    private final void a(long param0, int param1, int param2, Object param3) {
        bj var8 = null;
        int var7 = ZombieDawn.field_J;
        if (param1 > ((lc) this).field_f) {
            throw new IllegalStateException();
        }
        if (param2 != 32500) {
            this.a((byte) 73, -37L);
        }
        this.a((byte) -20, param0);
        ((lc) this).field_b = ((lc) this).field_b - param1;
        while (0 > ((lc) this).field_b) {
            var8 = (bj) (Object) ((lc) this).field_g.a(78);
            this.a(var8, 108);
        }
        jl var6 = new jl(param3, param1);
        ((lc) this).field_e.a(param0, true, (le) (Object) var6);
        ((lc) this).field_g.a(0, (nb) (Object) var6);
        ((bj) (Object) var6).field_n = 0L;
    }

    private final void a(bj param0, int param1) {
        if (param1 <= 100) {
            return;
        }
        if (!(param0 == null)) {
            param0.b(-27598);
            param0.c((byte) -79);
            ((lc) this).field_b = ((lc) this).field_b + param0.field_r;
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        if (!param0) {
            field_c = 'D';
        }
        uh.field_g = !param1 ? true : false;
        if (param1) {
            b.field_p = new int[100];
            for (var2 = 0; var2 < b.field_p.length; var2++) {
                b.field_p[var2] = 256 / b.field_p.length * (var2 * 65793);
            }
            oe.field_c = jp.a((byte) 125, 48);
        }
    }

    private final void a(byte param0, long param1) {
        bj var4 = (bj) (Object) ((lc) this).field_e.a(false, param1);
        this.a(var4, param0 + 143);
        if (param0 != -20) {
            field_k = null;
        }
    }

    final void a(long param0, Object param1, int param2) {
        if (param2 != -16709) {
            ((lc) this).field_b = 11;
        }
        this.a(param0, 1, 32500, param1);
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(rc.a(-1, param0, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (param1 != -2895) {
                Object var3 = null;
                lc.a((java.applet.Applet) null, 6);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(dj param0, dj param1, byte param2) {
        ge.field_b = param1;
        int var3 = -117 / ((-21 - param2) / 34);
        nl.field_t = param0;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_k = null;
        }
        field_a = null;
        field_k = null;
    }

    final static int a(int param0, byte param1) {
        param0 = (1431655765 & param0) + ((param0 & -1431655765) >>> -610893823);
        param0 = ((param0 & -858993458) >>> -37361598) + (858993459 & param0);
        param0 = (param0 >>> -1213389148) + param0 & 252645135;
        param0 = param0 + (param0 >>> -1126194424);
        param0 = param0 + (param0 >>> -1622272272);
        if (param1 < 70) {
            return 61;
        }
        return 255 & param0;
    }

    final Object a(long param0, int param1) {
        jl var6 = null;
        bj var8 = (bj) (Object) ((lc) this).field_e.a(false, param0);
        if (var8 == null) {
            return null;
        }
        if (param1 != 1431655765) {
            Object var7 = null;
            this.a((bj) null, 58);
        }
        Object var5 = var8.d((byte) 87);
        if (var5 == null) {
            var8.b(param1 ^ -1431649945);
            var8.c((byte) -21);
            ((lc) this).field_b = ((lc) this).field_b + var8.field_r;
            return null;
        }
        if (var8.b(true)) {
            var6 = new jl(var5, var8.field_r);
            ((lc) this).field_e.a(var8.field_f, true, (le) (Object) var6);
            ((lc) this).field_g.a(0, (nb) (Object) var6);
            ((bj) (Object) var6).field_n = 0L;
            var8.b(-27598);
            var8.c((byte) -60);
        } else {
            ((lc) this).field_g.a(0, (nb) (Object) var8);
            var8.field_n = 0L;
        }
        return var5;
    }

    private lc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 1;
        field_i = -1;
        field_d = true;
        field_j = 15;
    }
}
