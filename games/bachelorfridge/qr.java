/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr extends ana {
    private boolean field_v;
    private taa field_w;
    private tba field_x;

    private final void e(int param0) {
        Object var3;
        pp var3_ref;
        int var5;
        aga var6;
        ad var7;
        aga var8;
        ad var9;
        var3 = null;
        var5 = BachelorFridge.field_y;
        if (param0 > 9) {
          var8 = this.field_x.field_l.a(8, this.field_q.field_h);
          if (var8.i(-79)) {
            return;
          }
          var3_ref = (pp) (this.field_x.field_o.b((byte) 90));
          while (var3_ref != null) {
            var9 = var3_ref.field_h.a(-27449, this.field_q);
            var9.b(-1, 6);
            var3_ref.a(var8, this.field_q.field_h, 12);
            if (var3_ref instanceof iv) {
              this.a(27799, new ek(this.field_q, var9, var3_ref.field_f));
            }
            var3_ref = (pp) (this.field_x.field_o.c(0));
          }
          return;
        }
        this.f(104);
        var6 = this.field_x.field_l.a(8, this.field_q.field_h);
        if (var6.i(-79)) {
          return;
        }
        var3_ref = (pp) (this.field_x.field_o.b((byte) 90));
        while (var3_ref != null) {
          var7 = var3_ref.field_h.a(-27449, this.field_q);
          var7.b(-1, 6);
          var3_ref.a(var6, this.field_q.field_h, 12);
          if (var3_ref instanceof iv) {
            this.a(27799, new ek(this.field_q, var7, var3_ref.field_f));
          }
          var3_ref = (pp) (this.field_x.field_o.c(0));
        }
        return;
    }

    final boolean c(byte param0) {
        if (this.field_m.a((byte) -106)) {
          return false;
        }
        if (this.field_w.a((byte) -106)) {
          return false;
        }
        if (!this.field_v) {
          this.d(-1);
          this.field_v = true;
        }
        int var2 = 93 / ((71 - param0) / 47);
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 < 0) {
          this.f(-1);
          return true;
        }
        return false;
    }

    qr(gj param0, tba param1) {
        super(param0, param1);
        try {
          this.field_x = param1;
          this.field_w = new taa(this.field_q, this.field_x.field_q, this.field_x.field_s);
          this.a(27799, this.field_w);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "qr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        int var3;
        int var4;
        int var5;
        gf var6;
        int var7;
        op var8;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        gf var6Lifetime1;
        var7 = BachelorFridge.field_y;
        var8 = this.field_q.field_h;
        if (param0 == -1) {
          this.field_x.e(param0 ^ -7);
          for (var3 = 0; this.field_x.field_t.length > var3; var3++) {
            var4 = this.field_x.field_t[var3][0];
            var5 = this.field_x.field_t[var3][1];
            if (var4 >= 0 &&
              var4 < var8.field_z &&
              var5 >= 0 &&
              var8.field_B > var5) {
              var6 = new gf(this.field_q, var4, var5);
              ((kj) ((Object) var6)).a(0);
            }
          }
          return;
        }
        this.field_v = false;
        this.field_x.e(param0 ^ -7);
        for (var3Lifetime1 = 0; this.field_x.field_t.length > var3Lifetime1; var3Lifetime1++) {
          var4Lifetime1 = this.field_x.field_t[var3Lifetime1][0];
          var5Lifetime1 = this.field_x.field_t[var3Lifetime1][1];
          if (var4Lifetime1 >= 0 &&
            var4Lifetime1 < var8.field_z &&
            var5Lifetime1 >= 0 &&
            var8.field_B > var5Lifetime1) {
            var6Lifetime1 = new gf(this.field_q, var4Lifetime1, var5Lifetime1);
            ((kj) ((Object) var6Lifetime1)).a(0);
          }
        }
    }

    private final void f(int param0) {
        if (param0 != -1) {
          this.d(-112);
          this.e(75);
          return;
        }
        this.e(75);
    }

    static {
    }
}
