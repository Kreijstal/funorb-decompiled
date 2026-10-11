/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rca extends me {
    private bua field_o;
    private taa field_m;
    private boolean field_k;
    static int field_n;
    static boolean field_p;
    private boolean field_j;
    static boolean field_l;

    final boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return true;
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = -94 % ((29 - param2) / 57);
        if (param0 == 83) {
          this.field_j = true;
          return true;
        }
        if (param0 == 84) {
          this.field_j = true;
          return true;
        }
        if (param0 == 82) {
          this.field_j = true;
          return true;
        }
        if (param0 == 13) {
          this.field_j = true;
          return true;
        }
        if (param0 == 81) {
          this.field_j = true;
          return true;
        }
        if (83 != param0) {
          return false;
        }
        this.field_j = true;
        return true;
    }

    final boolean d(byte param0) {
        if (param0 != -75) {
          this.a(false);
          return this.field_j;
        }
        return this.field_j;
    }

    final void a(byte param0) {
        if (param0 > -107) {
          this.b((byte) 103);
        }
        if (!this.field_k) {
          v.a(100, (byte) -76, 128, 222, 0, 96);
          this.field_k = true;
        }
        if (hf.field_b == 1) {
          this.field_j = true;
        }
        if (this.field_o != null) {
          this.field_o.a(0);
          this.field_o.a(this.field_m.a(-13939), false, 0, 37, false);
        }
    }

    rca(qh param0, taa param1) {
        super(param0);
        this.field_k = false;
        try {
          this.field_m = param1;
          if (0 == param1.c(16)) {
            this.field_o = new bua(0, param1.a(-13939), 1);
            this.field_o.a(param1.a(-13939), false, 0, 37, true);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rca.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        ik.field_h.a(0, 0);
        if (param0 > -13) {
          this.d((byte) 83);
          var2 = aaa.a(false) - kq.field_a.a() >> 1;
          var3 = koa.b(0) - kq.field_a.c() >> 1;
          if (this.field_m.c(16) == 0) {
            var6 = gv.field_v;
            var7 = la.field_m[this.field_m.a(-13939)];
            oka.a(var6.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
            ura.a(-10985);
            hp.a(1024, 0, 0, this.field_o.b((byte) 74), -1918106173, 300, 320);
            se.f((byte) -6);
            kq.field_a.a(var2, var3 + 85);
            oka.a(var7.toUpperCase(), 65793, eda.field_f, -1, (koa.b(0) >> 1) + 92, aaa.a(false) >> 1, -1);
            return;
          }
          if (this.field_m.c(16) == 1) {
            var4 = this.field_m.a(-13939);
            oka.a(r.field_k.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
            cb.field_i[var4].a((aaa.a(false) >> 1) - cb.field_i[var4].a() / 2, (koa.b(0) >> 1) - cb.field_i[var4].c() / 2 - 20);
            kq.field_a.a(var2, var3 + 60);
            oka.a(vj.field_d[var4].toUpperCase(), 65793, eda.field_f, -1, 92 + var3, aaa.a(false) >> 1, -1);
            return;
          }
          return;
        }
        var2Lifetime1 = aaa.a(false) - kq.field_a.a() >> 1;
        var3Lifetime1 = koa.b(0) - kq.field_a.c() >> 1;
        if (this.field_m.c(16) == 0) {
          var8 = gv.field_v;
          var9 = la.field_m[this.field_m.a(-13939)];
          oka.a(var8.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
          ura.a(-10985);
          hp.a(1024, 0, 0, this.field_o.b((byte) 74), -1918106173, 300, 320);
          se.f((byte) -6);
          kq.field_a.a(var2Lifetime1, var3Lifetime1 + 85);
          oka.a(var9.toUpperCase(), 65793, eda.field_f, -1, (koa.b(0) >> 1) + 92, aaa.a(false) >> 1, -1);
          return;
        }
        if (this.field_m.c(16) == 1) {
          var4Lifetime1 = this.field_m.a(-13939);
          oka.a(r.field_k.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
          cb.field_i[var4Lifetime1].a((aaa.a(false) >> 1) - cb.field_i[var4Lifetime1].a() / 2, (koa.b(0) >> 1) - cb.field_i[var4Lifetime1].c() / 2 - 20);
          kq.field_a.a(var2Lifetime1, var3Lifetime1 + 60);
          oka.a(vj.field_d[var4Lifetime1].toUpperCase(), 65793, eda.field_f, -1, 92 + var3Lifetime1, aaa.a(false) >> 1, -1);
          return;
        }
    }

    static {
        field_n = 0;
        field_p = true;
    }
}
