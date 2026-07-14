/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    boolean field_f;
    String[] field_h;
    static String field_c;
    static String field_j;
    String field_i;
    boolean field_b;
    static nd field_g;
    int field_d;
    static long field_k;
    static int field_e;
    static boolean field_a;

    final static byte[] a(String param0, int param1) {
        if (param1 != -1) {
            return null;
        }
        return bl.field_Nb.a("", param0, true);
    }

    final static boolean a(long param0, String param1, int[] param2, int param3, int param4) {
        if (!(fi.a(param0, param4, param1, (byte) -94, param2))) {
            return false;
        }
        if ((param4 ^ -1) == -2) {
            param4 = 0;
        }
        ka.field_m = param1;
        sf.field_d = param4;
        CharSequence var8 = (CharSequence) (Object) param1;
        qj.field_a = cc.a(var8, (byte) 115);
        if (param3 < 55) {
            Object var7 = null;
            oh discarded$0 = sj.a(-34, (ah) null, 19, 68);
        }
        vj.field_o = param0;
        le var6 = lk.a(-29, ec.field_b, wa.field_a, hc.field_n, param2);
        kb.a(false, var6);
        return true;
    }

    public static void a(int param0) {
        field_j = null;
        field_c = null;
        field_g = null;
        if (param0 != 0) {
            field_a = true;
        }
    }

    final static boolean a(int param0, String param1, String param2, ho param3, String param4, int param5, boolean param6) {
        if (!(ma.field_d == fk.field_Q)) {
            return false;
        }
        if (param5 != -1) {
            return false;
        }
        fi var8 = new fi(mf.field_s, param3);
        mf.field_s.a((na) (Object) var8, false);
        if (wm.d(2)) {
            var8.s(param5 + 45);
        } else {
            ma.field_d = ll.field_C;
            ek.field_s = param2;
            wh.field_k = param0;
            jl.field_c = param4;
            vj.field_q = param6 ? true : false;
            pl.field_e = param1;
            va.field_n = null;
            return true;
        }
        return true;
    }

    final static oh a(int param0, ah param1, int param2, int param3) {
        if (param0 != -2) {
            Object var5 = null;
            boolean discarded$0 = sj.a(54L, (String) null, (int[]) null, -74, -128);
        }
        if (!ia.a(param3, param1, param2, param0 + -49)) {
            return null;
        }
        return nl.a(0);
    }

    sj(boolean param0) {
        ((sj) this).field_f = param0 ? true : false;
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = TetraLink.field_J;
        if (!(!Character.isISOControl(param1))) {
            return false;
        }
        if (!(!ka.a(65, param1))) {
            return true;
        }
        char[] var9 = fh.field_b;
        char[] var7 = var9;
        char[] var6 = var7;
        char[] var2 = var6;
        for (var3 = 0; var3 < var9.length; var3++) {
            var4 = var9[var3];
            if (!(param1 != var4)) {
                return true;
            }
        }
        char[] var10 = bg.field_g;
        for (var3 = 0; var3 < var10.length; var3++) {
            var4 = var10[var3];
            if (!(param1 != var4)) {
                return true;
            }
        }
        if (param0 != 3010) {
            field_e = -93;
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Played";
        field_c = null;
        field_e = -1;
    }
}
