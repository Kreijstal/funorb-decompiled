/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dpa implements fo {
    int field_i;
    boolean field_g;
    kva field_e;
    dpa field_b;
    int field_j;
    int field_a;
    int field_h;
    int field_f;
    int field_d;
    static String field_c;

    public final int e(byte param0) {
        if (param0 > -86) {
          dpa.a(-37);
          return this.field_e.e((byte) -99) + -(this.field_h << -1850429168);
        } else {
          return this.field_e.e((byte) -99) + -(this.field_h << -1850429168);
        }
    }

    public final int b(byte param0) {
        int var2 = 36 / ((-23 - param0) / 53);
        return this.field_e.b((byte) 95) - -this.field_i;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            this.d((byte) -51);
            return this.field_e.d((byte) 48);
        }
        return this.field_e.d((byte) 48);
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            return 115;
        }
        return this.field_e.c((byte) 125) + this.field_a;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            dpa.a(92);
            field_c = null;
            return;
        }
        field_c = null;
    }

    public final void a(int param0, iq param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ka var4 = null;
        gr var3 = this.field_e.c(-85);
        if (var3 != null && !var3.a(-102)) {
            return;
        }
        if (param0 <= 103) {
            return;
        }
        try {
            if (-1 != (this.field_h ^ -1)) {
                var4 = this.field_e.a(107, (dpa) (this));
            } else {
                var4 = this.field_e.a((dpa) (this), 44);
            }
            var5 = dfa.a(this.field_f, 2048, -54);
            var6 = this.b((byte) -95);
            var7 = this.c((byte) 117);
            var8 = this.e((byte) -106);
            gqa.a(var5, -83584144, var7, var6, var4, var8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dpa.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            dpa.a(103);
        }
    }

    final dpa b(int param0) {
        dpa var2;
        var2 = new dpa();
        var2.field_h = this.field_h;
        var2.field_f = this.field_f;
        if (param0 < 8) {
          return (dpa) null;
        } else {
          var2.field_j = this.field_j;
          var2.field_e = this.field_e;
          var2.field_d = this.field_d;
          var2.field_i = this.field_i;
          var2.field_a = this.field_a;
          return var2;
        }
    }

    static {
        field_c = "Spectator";
    }
}
