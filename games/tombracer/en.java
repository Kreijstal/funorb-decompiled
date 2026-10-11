/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en extends cg {
    private vna field_l;
    private vna field_m;
    private int field_k;
    private int field_j;

    private final void b(int param0) {
        cg var2 = (cg) (this.field_l.f(-80));
        while (var2 != null) {
          var2.a(param0);
          var2 = (cg) (this.field_l.e(122));
        }
    }

    private final void e() {
        jva var1 = null;
        if (this.field_k > 0) {
          var1 = (jva) (this.field_m.f(-80));
          while (var1 != null) {
            var1.field_f = var1.field_f - this.field_k;
            var1 = (jva) (this.field_m.e(119));
          }
          this.field_j = this.field_j - this.field_k;
          this.field_k = 0;
        }
    }

    private final void a(vg param0, jva param1) {
        while (true) {
          if (param0 == this.field_m.field_e) {
            ln.a(param0, param1, (byte) -102);
            this.field_j = ((jva) (this.field_m.field_e.field_a)).field_f;
            return;
          }
          if (((jva) (param0)).field_f <= param1.field_f) {
            param0 = param0.field_a;
            continue;
          }
          break;
        }
        ln.a(param0, param1, (byte) -102);
        this.field_j = ((jva) (this.field_m.field_e.field_a)).field_f;
        return;
    }

    final cg c() {
        return (cg) (this.field_l.e(126));
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        jva var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_j < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_k + param2 < this.field_j) {
            this.field_k = this.field_k + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_j - this.field_k;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_k = this.field_k + var4;
          this.e();
          var5 = (jva) (this.field_m.f(-80));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_f = var7;
              this.a(var5.field_a, var5);
            } else {
              var5.field_f = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final int a() {
        return 0;
    }

    private final void c(int[] param0, int param1, int param2) {
        cg var4 = (cg) (this.field_l.f(-80));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (cg) (this.field_l.e(119));
        }
    }

    final synchronized void b(cg param0) {
        param0.p(80);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        jva var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_j < 0) {
            this.b(param0);
            return;
          }
          if (this.field_k + param0 < this.field_j) {
            this.field_k = this.field_k + param0;
            this.b(param0);
            return;
          }
          var2 = this.field_j - this.field_k;
          this.b(var2);
          param0 = param0 - var2;
          this.field_k = this.field_k + var2;
          this.e();
          var3 = (jva) (this.field_m.f(-80));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_f = var5;
              this.a(var3.field_a, var3);
            } else {
              var3.field_f = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void a(jva param0) {
        param0.p(54);
        param0.a();
        vg var2 = this.field_m.field_e.field_a;
        if (var2 == this.field_m.field_e) {
          this.field_j = -1;
        } else {
          this.field_j = ((jva) (var2)).field_f;
        }
    }

    final synchronized void a(cg param0) {
        this.field_l.a((byte) 110, (vg) (param0));
    }

    final cg b() {
        return (cg) (this.field_l.f(-80));
    }

    public en() {
        this.field_l = new vna();
        this.field_m = new vna();
        this.field_j = -1;
        this.field_k = 0;
    }
}
