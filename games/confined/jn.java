/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends ga implements el {
    private String field_Q;
    private rg[] field_L;
    private int[] field_H;
    static String field_R;
    static String field_O;
    private int field_P;
    private ok field_T;
    static bi field_U;
    private dh field_S;

    final rg a(String param0, uk param1, boolean param2) {
        if (param2) {
            return null;
        }
        rg var4 = new rg(param0, param1);
        var4.field_n = (fe) (Object) new je();
        int var5 = ((jn) this).field_z + -2;
        ((jn) this).a(-114, ((jn) this).field_F, 0, ((jn) this).field_z - -34, 0);
        var4.a(-121, -14 + ((jn) this).field_F, var5, 30, 7);
        ((jn) this).b((fj) (Object) var4, 10);
        return var4;
    }

    public static void j(int param0) {
        if (param0 < 94) {
            field_U = null;
        }
        field_O = null;
        field_U = null;
        field_R = null;
    }

    jn(dh param0, ok param1, String param2) {
        super(0, 0, 288, 0, (fe) null);
        ((jn) this).field_P = 0;
        ((jn) this).field_Q = param2;
        ((jn) this).field_S = param0;
        ((jn) this).field_T = param1;
        int var4 = null != ((jn) this).field_Q ? ((jn) this).field_T.b(((jn) this).field_Q, 260, ((jn) this).field_T.field_C) : 0;
        ((jn) this).a(-125, 288, 0, var4 + 22, 0);
    }

    private final void a(boolean param0, int param1) {
        int var6 = Confined.field_J ? 1 : 0;
        if (!(param1 > ((jn) this).field_P)) {
            return;
        }
        rg[] var7 = new rg[param1];
        rg[] var3 = var7;
        int[] var4 = new int[param1];
        int var5 = 0;
        if (param0) {
            return;
        }
        while (var5 < ((jn) this).field_P) {
            var7[var5] = ((jn) this).field_L[var5];
            var4[var5] = ((jn) this).field_H[var5];
            var5++;
        }
        ((jn) this).field_L = var3;
        ((jn) this).field_H = var4;
        ((jn) this).field_P = param1;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 <= 36) {
            Object var6 = null;
            ((jn) this).a(111, (String) null, -98);
        }
        super.a(param0, param1, (byte) 125, param3);
        int discarded$0 = ((jn) this).field_T.a(((jn) this).field_Q, param3 - -((jn) this).field_q + 14, 10 + (((jn) this).field_m + param0), ((jn) this).field_F - 28, ((jn) this).field_z, 16777215, -1, 0, 0, ((jn) this).field_T.field_C);
    }

    final void a(int param0, String param1, int param2) {
        if (param0 != 0) {
            return;
        }
        int var4 = ((jn) this).field_P;
        this.a(false, 1 + var4);
        ((jn) this).field_L[var4] = ((jn) this).a(param1, (uk) this, false);
        ((jn) this).field_H[var4] = param2;
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Confined.field_J ? 1 : 0;
        if (param0 < 68) {
            ((jn) this).field_H = null;
        }
        for (var6 = 0; ((jn) this).field_P > var6; var6++) {
            if (!(param3 != ((jn) this).field_L[var6])) {
                var7 = ((jn) this).field_H[var6];
                if (0 != (var7 ^ -1)) {
                    vf.a((byte) -114, ((jn) this).field_H[var6]);
                    break;
                }
                ((jn) this).field_S.n(10);
                break;
            }
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(pn.a(var2, (byte) -33, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Names can only contain letters, numbers, spaces and underscores";
        field_O = "Distance";
    }
}
