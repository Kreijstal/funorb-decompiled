/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends lk {
    private ng field_m;
    private ng field_l;
    private int field_o;
    private int field_n;

    private final void e() {
        hg var1 = null;
        if (this.field_o > 0) {
          var1 = (hg) (this.field_l.a(true));
          while (var1 != null) {
            var1.field_h = var1.field_h - this.field_o;
            var1 = (hg) (this.field_l.f(2));
          }
          this.field_n = this.field_n - this.field_o;
          this.field_o = 0;
        }
    }

    final lk b() {
        return (lk) (this.field_m.f(2));
    }

    private final void a(kd param0, hg param1) {
        while (true) {
          if (param0 == this.field_l.field_b) {
            vf.a(param0, 0, param1);
            this.field_n = ((hg) (this.field_l.field_b.field_f)).field_h;
            return;
          }
          if (((hg) (param0)).field_h <= param1.field_h) {
            param0 = param0.field_f;
            continue;
          }
          break;
        }
        vf.a(param0, 0, param1);
        this.field_n = ((hg) (this.field_l.field_b.field_f)).field_h;
        return;
    }

    private final void b(int param0) {
        lk var2 = (lk) (this.field_m.a(true));
        while (var2 != null) {
          var2.a(param0);
          var2 = (lk) (this.field_m.f(2));
        }
    }

    final synchronized void a(lk param0) {
        this.field_m.a(-68, param0);
    }

    final void a(ke param0, int param1, int param2) {
        this.a(cc.a(param0, param1, param2));
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        hg var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_n < 0) {
            this.b(param0);
            return;
          }
          if (this.field_o + param0 < this.field_n) {
            this.field_o = this.field_o + param0;
            this.b(param0);
            return;
          }
          var2 = this.field_n - this.field_o;
          this.b(var2);
          param0 = param0 - var2;
          this.field_o = this.field_o + var2;
          this.e();
          var3 = (hg) (this.field_l.a(true));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_h = var5;
              this.a(var3.field_f, var3);
            } else {
              var3.field_h = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final int a() {
        return 0;
    }

    final lk d() {
        return (lk) (this.field_m.a(true));
    }

    private final void c(int[] param0, int param1, int param2) {
        lk var4 = (lk) (this.field_m.a(true));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (lk) (this.field_m.f(2));
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        hg var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_n < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_o + param2 < this.field_n) {
            this.field_o = this.field_o + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_n - this.field_o;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_o = this.field_o + var4;
          this.e();
          var5 = (hg) (this.field_l.a(true));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_h = var7;
              this.a(var5.field_f, var5);
            } else {
              var5.field_h = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void a(hg param0) {
        param0.b((byte) -119);
        param0.a();
        kd var2 = this.field_l.field_b.field_f;
        if (var2 == this.field_l.field_b) {
          this.field_n = -1;
        } else {
          this.field_n = ((hg) (var2)).field_h;
        }
    }

    public hk() {
        this.field_m = new ng();
        this.field_l = new ng();
        this.field_o = 0;
        this.field_n = -1;
    }
}
