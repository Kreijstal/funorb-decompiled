/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends k {
    private oi field_n;
    private oi field_p;
    private int field_o;
    private int field_m;

    private final void e() {
        nb var1 = null;
        if (this.field_m > 0) {
          var1 = (nb) (this.field_p.b((byte) 84));
          while (var1 != null) {
            var1.field_i = var1.field_i - this.field_m;
            var1 = (nb) (this.field_p.d(8192));
          }
          this.field_o = this.field_o - this.field_m;
          this.field_m = 0;
        }
    }

    final k a() {
        return (k) (this.field_n.b((byte) 106));
    }

    final void a(je param0, int param1, int param2) {
        this.a(uj.a(param0, param1, param2));
    }

    final synchronized void a(k param0) {
        this.field_n.a(param0, -5441);
    }

    private final void a(nb param0) {
        param0.a(false);
        param0.a();
        wl var2 = this.field_p.field_a.field_b;
        if (var2 == this.field_p.field_a) {
          this.field_o = -1;
        } else {
          this.field_o = ((nb) (var2)).field_i;
        }
    }

    final int d() {
        return 0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        nb var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_o < 0) {
            this.c(param0);
            return;
          }
          if (this.field_m + param0 < this.field_o) {
            this.field_m = this.field_m + param0;
            this.c(param0);
            return;
          }
          var2 = this.field_o - this.field_m;
          this.c(var2);
          param0 = param0 - var2;
          this.field_m = this.field_m + var2;
          this.e();
          var3 = (nb) (this.field_p.b((byte) 106));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_i = var5;
              this.a(var3.field_b, var3);
            } else {
              var3.field_i = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void a(wl param0, nb param1) {
        while (true) {
          if (param0 == this.field_p.field_a) {
            u.$cfr$intArgs$a$894bb1585d61(74, param0, param1);
            this.field_o = ((nb) (this.field_p.field_a.field_b)).field_i;
            return;
          }
          if (((nb) (param0)).field_i <= param1.field_i) {
            param0 = param0.field_b;
            continue;
          }
          break;
        }
        u.$cfr$intArgs$a$894bb1585d61(74, param0, param1);
        this.field_o = ((nb) (this.field_p.field_a.field_b)).field_i;
        return;
    }

    final k c() {
        return (k) (this.field_n.d(8192));
    }

    private final void c(int[] param0, int param1, int param2) {
        k var4 = (k) (this.field_n.b((byte) 87));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (k) (this.field_n.d(8192));
        }
    }

    private final void c(int param0) {
        k var2 = (k) (this.field_n.b((byte) 98));
        while (var2 != null) {
          var2.a(param0);
          var2 = (k) (this.field_n.d(8192));
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        nb var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_o < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_m + param2 < this.field_o) {
            this.field_m = this.field_m + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_o - this.field_m;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_m = this.field_m + var4;
          this.e();
          var5 = (nb) (this.field_p.b((byte) 99));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_i = var7;
              this.a(var5.field_b, var5);
            } else {
              var5.field_i = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    public vi() {
        this.field_n = new oi();
        this.field_p = new oi();
        this.field_o = -1;
        this.field_m = 0;
    }
}
