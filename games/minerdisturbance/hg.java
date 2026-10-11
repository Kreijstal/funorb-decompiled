/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends um {
    private ta field_u;
    private ta field_r;
    private int field_s;
    private int field_t;

    private final void a(rl param0) {
        param0.b(34);
        param0.a();
        pi var2 = this.field_r.field_c.field_f;
        if (var2 == this.field_r.field_c) {
          this.field_s = -1;
        } else {
          this.field_s = ((rl) (var2)).field_n;
        }
    }

    final synchronized void b(um param0) {
        this.field_u.a(param0, 27862);
    }

    private final void c(int[] param0, int param1, int param2) {
        um var4 = (um) (this.field_u.b(73));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (um) (this.field_u.b((byte) 56));
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        rl var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_s < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_t + param2 < this.field_s) {
            this.field_t = this.field_t + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_s - this.field_t;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_t = this.field_t + var4;
          this.e();
          var5 = (rl) (this.field_r.b(91));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_n = var7;
              this.a(var5.field_f, var5);
            } else {
              var5.field_n = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void a(um param0) {
        param0.b(34);
    }

    final um b() {
        return (um) (this.field_u.b(123));
    }

    final um c() {
        return (um) (this.field_u.b((byte) 56));
    }

    private final void e() {
        rl var1 = null;
        if (this.field_t > 0) {
          var1 = (rl) (this.field_r.b(96));
          while (var1 != null) {
            var1.field_n = var1.field_n - this.field_t;
            var1 = (rl) (this.field_r.b((byte) 56));
          }
          this.field_s = this.field_s - this.field_t;
          this.field_t = 0;
        }
    }

    private final void a(pi param0, rl param1) {
        while (true) {
          if (param0 == this.field_r.field_c) {
            oj.$cfr$intArgs$a$c5042ffd0615(param1, param0, -117);
            this.field_s = ((rl) (this.field_r.field_c.field_f)).field_n;
            return;
          }
          if (((rl) (param0)).field_n <= param1.field_n) {
            param0 = param0.field_f;
            continue;
          }
          break;
        }
        oj.$cfr$intArgs$a$c5042ffd0615(param1, param0, -117);
        this.field_s = ((rl) (this.field_r.field_c.field_f)).field_n;
        return;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        rl var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_s < 0) {
            this.e(param0);
            return;
          }
          if (this.field_t + param0 < this.field_s) {
            this.field_t = this.field_t + param0;
            this.e(param0);
            return;
          }
          var2 = this.field_s - this.field_t;
          this.e(var2);
          param0 = param0 - var2;
          this.field_t = this.field_t + var2;
          this.e();
          var3 = (rl) (this.field_r.b(125));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_n = var5;
              this.a(var3.field_f, var3);
            } else {
              var3.field_n = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final int d() {
        return 0;
    }

    private final void e(int param0) {
        um var2 = (um) (this.field_u.b(111));
        while (var2 != null) {
          var2.a(param0);
          var2 = (um) (this.field_u.b((byte) 56));
        }
    }

    public hg() {
        this.field_u = new ta();
        this.field_r = new ta();
        this.field_s = -1;
        this.field_t = 0;
    }
}
