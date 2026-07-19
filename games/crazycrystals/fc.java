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
            this.field_b = -120;
        }
        this.field_b = 0;
        return this.a(15);
    }

    final jb a(long param0, int param1) {
        jb var5 = null;
        int var6 = CrazyCrystals.field_B;
        jb var4 = this.field_e[(int)(param0 & (long)(-1 + this.field_c))];
        this.field_d = var4.field_b;
        while (this.field_d != var4) {
            if ((param0 ^ -1L) == (this.field_d.field_e ^ -1L)) {
                var5 = this.field_d;
                this.field_d = this.field_d.field_b;
                return var5;
            }
            this.field_d = this.field_d.field_b;
        }
        if (param1 != 0) {
            this.field_c = 112;
        }
        this.field_d = null;
        return null;
    }

    final void a(int param0, long param1, jb param2) {
        jb var5 = null;
        try {
            if (null != param2.field_d) {
                param2.a(false);
            }
            var5 = this.field_e[(int)((long)(-1 + this.field_c) & param1)];
            param2.field_b = var5;
            param2.field_d = var5.field_d;
            param2.field_d.field_b = param2;
            if (param0 != -22072) {
                this.field_d = (jb) null;
            }
            param2.field_e = param1;
            param2.field_b.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "fc.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final jb a(int param0) {
        int fieldTemp$0 = 0;
        jb var3 = null;
        int var4 = CrazyCrystals.field_B;
        int var2 = -42 % ((param0 - -70) / 47);
        if ((this.field_b ^ -1) < -1) {
            if (this.field_a != this.field_e[-1 + this.field_b]) {
                var3 = this.field_a;
                this.field_a = var3.field_b;
                return var3;
            }
        }
        do {
            if (this.field_b >= this.field_c) {
                return null;
            }
            fieldTemp$0 = this.field_b;
            this.field_b = this.field_b + 1;
            var3 = this.field_e[fieldTemp$0].field_b;
        } while (this.field_e[this.field_b + -1] == var3);
        this.field_a = var3.field_b;
        return var3;
    }

    fc(int param0) {
        int var2 = 0;
        jb dupTemp$0 = null;
        jb var3 = null;
        this.field_b = 0;
        this.field_e = new jb[param0];
        this.field_c = param0;
        for (var2 = 0; var2 < param0; var2++) {
            dupTemp$0 = new jb();
            var3 = dupTemp$0;
            this.field_e[var2] = dupTemp$0;
            var3.field_b = var3;
            var3.field_d = var3;
        }
    }

    static {
    }
}
