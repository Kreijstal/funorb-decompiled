/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends gf {
    private mn field_s;
    private mn field_q;
    private int field_r;
    private int field_t;

    final synchronized void a(bl param0) {
        if (param0.field_n == null) {
          this.e();
          param0.field_n = this;
          param0.b();
          this.a(this.field_q.field_a.field_h, param0);
          return;
        }
        throw new RuntimeException();
    }

    final synchronized void a(gf param0) {
        this.field_s.a(param0, -1);
    }

    final synchronized void b(gf param0) {
        param0.a(true);
    }

    final int c() {
        return 0;
    }

    final synchronized void b(bl param0) {
        if (param0.field_n == null) {
          return;
        }
        if (param0.field_n == this) {
          this.e();
          this.c(param0);
          return;
        }
        throw new RuntimeException();
    }

    private final void c(int[] param0, int param1, int param2) {
        gf var4 = (gf) (this.field_s.a(86));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (gf) (this.field_s.d(2123));
        }
    }

    private final void c(bl param0) {
        param0.a(true);
        param0.a();
        param0.field_n = null;
        rk var2 = this.field_q.field_a.field_h;
        if (var2 == this.field_q.field_a) {
          this.field_t = -1;
        } else {
          this.field_t = ((bl) (var2)).field_m;
        }
    }

    private final void e() {
        bl var1 = null;
        if (this.field_r > 0) {
          var1 = (bl) (this.field_q.a(-119));
          while (var1 != null) {
            var1.field_m = var1.field_m - this.field_r;
            var1 = (bl) (this.field_q.d(2123));
          }
          this.field_t = this.field_t - this.field_r;
          this.field_r = 0;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        bl var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_t < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_r + param2 < this.field_t) {
            this.field_r = this.field_r + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_t - this.field_r;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_r = this.field_r + var4;
          this.e();
          var5 = (bl) (this.field_q.a(-125));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_m = var7;
              this.a(var5.field_h, var5);
            } else {
              var5.field_m = 0;
              this.c(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final void a(bi param0, int param1, int param2) {
        this.a(vc.b(param0, param1, param2));
    }

    final gf a() {
        return (gf) (this.field_s.a(-123));
    }

    private final void a(rk param0, bl param1) {
        while (true) {
          if (param0 == this.field_q.field_a) {
            ri.a(param0, 0, param1);
            this.field_t = ((bl) (this.field_q.field_a.field_h)).field_m;
            return;
          }
          if (((bl) (param0)).field_m <= param1.field_m) {
            param0 = param0.field_h;
            continue;
          }
          break;
        }
        ri.a(param0, 0, param1);
        this.field_t = ((bl) (this.field_q.field_a.field_h)).field_m;
        return;
    }

    private final void c(int param0) {
        gf var2 = (gf) (this.field_s.a(-119));
        while (var2 != null) {
          var2.b(param0);
          var2 = (gf) (this.field_s.d(2123));
        }
    }

    final gf d() {
        return (gf) (this.field_s.d(2123));
    }

    final synchronized void b(int param0) {
        int var2 = 0;
        bl var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_t < 0) {
            this.c(param0);
            return;
          }
          if (this.field_r + param0 < this.field_t) {
            this.field_r = this.field_r + param0;
            this.c(param0);
            return;
          }
          var2 = this.field_t - this.field_r;
          this.c(var2);
          param0 = param0 - var2;
          this.field_r = this.field_r + var2;
          this.e();
          var3 = (bl) (this.field_q.a(22));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_m = var5;
              this.a(var3.field_h, var3);
            } else {
              var3.field_m = 0;
              this.c(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    public be() {
        this.field_s = new mn();
        this.field_q = new mn();
        this.field_r = 0;
        this.field_t = -1;
    }
}
