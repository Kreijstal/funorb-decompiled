/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends wg {
    private cn field_k;
    private cn field_n;
    private int field_l;
    private int field_m;

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        il var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_l < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_m + param2 < this.field_l) {
            this.field_m = this.field_m + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_l - this.field_m;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_m = this.field_m + var4;
          this.e();
          var5 = (il) (this.field_n.a(false));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_g = var7;
              this.a(var5.field_b, var5);
            } else {
              var5.field_g = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void c(int[] param0, int param1, int param2) {
        wg var4 = (wg) (this.field_k.a(false));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (wg) (this.field_k.b((byte) 70));
        }
    }

    final void a(hh param0, int param1, int param2, int param3) {
        this.a(hl.c(param0, param1, param2, param3));
    }

    final synchronized void b(il param0) {
        if (param0.field_h == null) {
          return;
        }
        if (param0.field_h == this) {
          this.e();
          this.a(param0);
          return;
        }
        throw new RuntimeException();
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        il var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_l < 0) {
            this.e(param0);
            return;
          }
          if (this.field_m + param0 < this.field_l) {
            this.field_m = this.field_m + param0;
            this.e(param0);
            return;
          }
          var2 = this.field_l - this.field_m;
          this.e(var2);
          param0 = param0 - var2;
          this.field_m = this.field_m + var2;
          this.e();
          var3 = (il) (this.field_n.a(false));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_g = var5;
              this.a(var3.field_b, var3);
            } else {
              var3.field_g = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final synchronized void a(wg param0) {
        this.field_k.a(param0, 8364);
    }

    private final void e() {
        il var1 = null;
        if (this.field_m > 0) {
          var1 = (il) (this.field_n.a(false));
          while (var1 != null) {
            var1.field_g = var1.field_g - this.field_m;
            var1 = (il) (this.field_n.b((byte) 70));
          }
          this.field_l = this.field_l - this.field_m;
          this.field_m = 0;
        }
    }

    private final void a(hg param0, il param1) {
        while (true) {
          if (param0 == this.field_n.field_d) {
            EscapeVector.$cfr$intArgs$a$aafaec74e55e(param1, param0, -7);
            this.field_l = ((il) (this.field_n.field_d.field_b)).field_g;
            return;
          }
          if (((il) (param0)).field_g <= param1.field_g) {
            param0 = param0.field_b;
            continue;
          }
          break;
        }
        EscapeVector.$cfr$intArgs$a$aafaec74e55e(param1, param0, -7);
        this.field_l = ((il) (this.field_n.field_d.field_b)).field_g;
        return;
    }

    final synchronized void c(il param0) {
        if (param0.field_h == null) {
          this.e();
          param0.field_h = this;
          param0.a();
          this.a(this.field_n.field_d.field_b, param0);
          return;
        }
        throw new RuntimeException();
    }

    final wg c() {
        return (wg) (this.field_k.a(false));
    }

    private final void e(int param0) {
        wg var2 = (wg) (this.field_k.a(false));
        while (var2 != null) {
          var2.d(param0);
          var2 = (wg) (this.field_k.b((byte) 70));
        }
    }

    final synchronized void b(wg param0) {
        param0.c((byte) -32);
    }

    final void a(hh param0, int param1, int param2) {
        this.a(hl.a(param0, param1, param2));
    }

    final wg b() {
        return (wg) (this.field_k.b((byte) 70));
    }

    final int a() {
        return 0;
    }

    private final void a(il param0) {
        param0.c((byte) -31);
        param0.b();
        param0.field_h = null;
        hg var2 = this.field_n.field_d.field_b;
        if (var2 == this.field_n.field_d) {
          this.field_l = -1;
        } else {
          this.field_l = ((il) (var2)).field_g;
        }
    }

    public hj() {
        this.field_k = new cn();
        this.field_n = new cn();
        this.field_l = -1;
        this.field_m = 0;
    }
}
