/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    private jb field_a;
    private jb[] field_e;
    private jb field_d;
    private int field_c;
    private int field_b;

    final jb a(byte param0) {
        if (param0 > -69) {
            ((fc) this).field_b = -120;
        }
        ((fc) this).field_b = 0;
        return ((fc) this).a(15);
    }

    final jb a(long param0, int param1) {
        jb var5 = null;
        int var6 = CrazyCrystals.field_B;
        jb var4 = ((fc) this).field_e[(int)(param0 & (long)(-1 + ((fc) this).field_c))];
        ((fc) this).field_d = var4.field_b;
        while (((fc) this).field_d != var4) {
            if (~param0 == ~((fc) this).field_d.field_e) {
                var5 = ((fc) this).field_d;
                ((fc) this).field_d = ((fc) this).field_d.field_b;
                return var5;
            }
            ((fc) this).field_d = ((fc) this).field_d.field_b;
        }
        if (param1 != 0) {
            ((fc) this).field_c = 112;
        }
        ((fc) this).field_d = null;
        return null;
    }

    final void a(int param0, long param1, jb param2) {
        jb var5 = null;
        try {
            if (null != param2.field_d) {
                param2.a(false);
            }
            var5 = ((fc) this).field_e[(int)((long)(-1 + ((fc) this).field_c) & param1)];
            param2.field_b = var5;
            param2.field_d = var5.field_d;
            param2.field_d.field_b = param2;
            if (param0 != -22072) {
                ((fc) this).field_d = null;
            }
            param2.field_e = param1;
            param2.field_b.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "fc.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final jb a(int param0) {
        jb var3 = null;
        int var4 = CrazyCrystals.field_B;
        int var2 = -42 % ((param0 - -70) / 47);
        if (((fc) this).field_b > 0) {
            if (((fc) this).field_a != ((fc) this).field_e[-1 + ((fc) this).field_b]) {
                var3 = ((fc) this).field_a;
                ((fc) this).field_a = var3.field_b;
                return var3;
            }
        }
        do {
            if (((fc) this).field_b >= ((fc) this).field_c) {
                return null;
            }
            int fieldTemp$0 = ((fc) this).field_b;
            ((fc) this).field_b = ((fc) this).field_b + 1;
            var3 = ((fc) this).field_e[fieldTemp$0].field_b;
        } while (((fc) this).field_e[((fc) this).field_b + -1] == var3);
        ((fc) this).field_a = var3.field_b;
        return var3;
    }

    fc(int param0) {
        int var2 = 0;
        jb var3 = null;
        ((fc) this).field_b = 0;
        ((fc) this).field_e = new jb[param0];
        ((fc) this).field_c = param0;
        for (var2 = 0; var2 < param0; var2++) {
            jb dupTemp$0 = new jb();
            var3 = dupTemp$0;
            ((fc) this).field_e[var2] = dupTemp$0;
            var3.field_b = var3;
            var3.field_d = var3;
        }
    }

    static {
    }
}
