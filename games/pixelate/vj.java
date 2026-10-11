/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends sj {
    private bb field_r;
    private bb field_p;
    private int field_o;
    private int field_q;

    final synchronized void a(sj param0) {
        this.field_r.b(1392503105, param0);
    }

    final sj d() {
        return (sj) (this.field_r.f(1504642273));
    }

    final sj b() {
        return (sj) (this.field_r.c(1504642273));
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        hl var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_q < 0) {
            this.e(param0);
            return;
          }
          if (this.field_o + param0 < this.field_q) {
            this.field_o = this.field_o + param0;
            this.e(param0);
            return;
          }
          var2 = this.field_q - this.field_o;
          this.e(var2);
          param0 = param0 - var2;
          this.field_o = this.field_o + var2;
          this.e();
          var3 = (hl) (this.field_p.c(1504642273));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_k = var5;
              this.a(var3.field_a, var3);
            } else {
              var3.field_k = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        hl var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_q < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_o + param2 < this.field_q) {
            this.field_o = this.field_o + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_q - this.field_o;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_o = this.field_o + var4;
          this.e();
          var5 = (hl) (this.field_p.c(1504642273));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_k = var7;
              this.a(var5.field_a, var5);
            } else {
              var5.field_k = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void e() {
        hl var1 = null;
        if (this.field_o > 0) {
          var1 = (hl) (this.field_p.c(1504642273));
          while (var1 != null) {
            var1.field_k = var1.field_k - this.field_o;
            var1 = (hl) (this.field_p.f(1504642273));
          }
          this.field_q = this.field_q - this.field_o;
          this.field_o = 0;
        }
    }

    private final void e(int param0) {
        sj var2 = (sj) (this.field_r.c(1504642273));
        while (var2 != null) {
          var2.a(param0);
          var2 = (sj) (this.field_r.f(1504642273));
        }
    }

    final int a() {
        return 0;
    }

    private final void a(fa param0, hl param1) {
        while (true) {
          if (param0 == this.field_p.field_f) {
            jj.$cfr$intArgs$a$2d0b7bdf67eb(98, param0, param1);
            this.field_q = ((hl) (this.field_p.field_f.field_a)).field_k;
            return;
          }
          if (((hl) (param0)).field_k <= param1.field_k) {
            param0 = param0.field_a;
            continue;
          }
          break;
        }
        jj.$cfr$intArgs$a$2d0b7bdf67eb(98, param0, param1);
        this.field_q = ((hl) (this.field_p.field_f.field_a)).field_k;
        return;
    }

    private final void a(hl param0) {
        param0.c(2779);
        param0.a();
        fa var2 = this.field_p.field_f.field_a;
        if (var2 == this.field_p.field_f) {
          this.field_q = -1;
        } else {
          this.field_q = ((hl) (var2)).field_k;
        }
    }

    public vj() {
        this.field_r = new bb();
        this.field_p = new bb();
        this.field_o = 0;
        this.field_q = -1;
    }

    private final void c(int[] param0, int param1, int param2) {
        sj var4 = (sj) (this.field_r.c(1504642273));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (sj) (this.field_r.f(1504642273));
        }
    }
}
