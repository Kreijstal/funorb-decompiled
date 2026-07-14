/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String field_f;
    private wf[] field_d;
    private wf field_c;
    private int field_b;
    private wf field_a;
    private int field_e;

    final wf a(boolean param0) {
        if (param0) {
            return (wf) null;
        }
        ((ph) this).field_e = 0;
        return ((ph) this).a(0);
    }

    final wf a(byte param0, long param1) {
        wf var5 = null;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        wf var4 = ((ph) this).field_d[(int)((long)(((ph) this).field_b + -1) & param1)];
        ((ph) this).field_a = ((wf) var4).field_a;
        while (var4 != ((ph) this).field_a) {
            if (!((param1 ^ -1L) != (((ph) this).field_a.field_b ^ -1L))) {
                var5 = ((ph) this).field_a;
                ((ph) this).field_a = ((ph) this).field_a.field_a;
                return var5;
            }
            ((ph) this).field_a = ((ph) this).field_a.field_a;
        }
        if (param0 != 106) {
            String var7 = (String) null;
            String discarded$0 = ph.a((String) null, 95);
        }
        ((ph) this).field_a = null;
        return null;
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        for (var4 = param1; var2 > var4; var4++) {
            var3[-1 + var2 - var4] = param0.charAt(var4);
        }
        return new String(var3);
    }

    final void b(int param0) {
        int var2 = 0;
        wf var3 = null;
        wf var4 = null;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        for (var2 = param0; var2 < ((ph) this).field_b; var2++) {
            var3 = ((ph) this).field_d[var2];
            while (true) {
                var4 = ((wf) var3).field_a;
                if (var3 == var4) {
                    break;
                }
                var4.c(-123);
            }
        }
        ((ph) this).field_c = null;
        ((ph) this).field_a = null;
    }

    final void a(int param0, long param1, wf param2) {
        if (!(null == ((wf) param2).field_c)) {
            param2.c(-123);
        }
        wf var5 = ((ph) this).field_d[(int)(param1 & (long)(-1 + ((ph) this).field_b))];
        param2.field_a = var5;
        int var6 = -19 / ((param0 - 43) / 54);
        param2.field_c = ((wf) var5).field_c;
        ((wf) param2).field_c.field_a = param2;
        ((wf) param2).field_a.field_c = param2;
        param2.field_b = param1;
    }

    final wf a(int param0) {
        wf var2 = null;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (((ph) this).field_e > param0) {
            if (((ph) this).field_c != ((ph) this).field_d[((ph) this).field_e - 1]) {
                var2 = ((ph) this).field_c;
                ((ph) this).field_c = ((wf) var2).field_a;
                return var2;
            }
        }
        do {
            if (((ph) this).field_e >= ((ph) this).field_b) {
                return null;
            }
            ((ph) this).field_e = ((ph) this).field_e + 1;
            var2 = ((ph) this).field_d[((ph) this).field_e].field_a;
        } while (((ph) this).field_d[((ph) this).field_e - 1] == var2);
        ((ph) this).field_c = ((wf) var2).field_a;
        return var2;
    }

    public static void c(int param0) {
        field_f = null;
        if (param0 <= 67) {
            field_f = (String) null;
        }
    }

    ph(int param0) {
        int var2 = 0;
        wf var3 = null;
        ((ph) this).field_e = 0;
        ((ph) this).field_b = param0;
        ((ph) this).field_d = new wf[param0];
        for (var2 = 0; param0 > var2; var2++) {
            var3 = new wf();
            ((ph) this).field_d[var2] = new wf();
            var3.field_a = (wf) var3;
            var3.field_c = (wf) var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
