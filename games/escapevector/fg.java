/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static hh field_a;
    static int field_b;

    final static int a(boolean param0, int param1, int param2) {
        int var3 = param1 >> 16;
        int var4 = param1 & 65535;
        int var5 = param2 >> 16;
        int var6 = param2 & 65535;
        return var4 * var5 + param2 * var3 - -(var6 * var4 >> 16);
    }

    final static boolean c() {
        int var1 = mm.a(4, 5) ? 1 : 0;
        sl.field_b[6][0] = uj.field_a;
        return var1 != 0;
    }

    final static te[] a(int param0) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        te[] var1 = new te[qk.field_j];
        for (var2 = 0; qk.field_j > var2; var2++) {
            var1[var2] = new te(on.field_e, hd.field_c, gn.field_k[var2], gi.field_e[var2], qh.field_k[var2], bc.field_a[var2], qe.field_a[var2], qk.field_f);
        }
        of.a(false);
        return var1;
    }

    public static void a() {
        field_a = null;
    }

    final static void b() {
        String[] var2 = null;
        int var3_int = 0;
        String var4 = null;
        ed var5 = null;
        String var3 = null;
        int var6 = EscapeVector.field_A;
        if (!(bj.e((byte) 118))) {
            return;
        }
        String var1 = "simulator";
        if (!(fi.field_j.a(0, var1))) {
            return;
        }
        try {
            ob.field_b = new ed[17];
            var2 = pl.field_k;
            for (var3_int = 0; var2.length > var3_int; var3_int++) {
                var4 = var2[var3_int];
                int discarded$0 = 1;
                var5 = fe.a(var1, fi.field_j, var4);
                ob.field_b[var3_int] = var5;
            }
            var3 = "infrastructure_virtual";
            v.field_a = kh.a(fi.field_j, (byte) 126, var1, var3);
            var3 = "seeker_mine";
            int discarded$1 = 1;
            ka.field_a = fe.a(var1, fi.field_j, var3);
            var3 = "rock_buster";
            int discarded$2 = 1;
            ej.field_a = fe.a(var1, fi.field_j, var3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "fg.B(" + 0 + 41);
        }
    }

    static {
    }
}
