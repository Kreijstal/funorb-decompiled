/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends qb {
    private md field_o;
    private md field_n;
    private int field_m;
    private int field_p;

    private final void c(int[] param0, int param1, int param2) {
        qb var4 = (qb) (this.field_o.e(-24172));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (qb) (this.field_o.a(4));
        }
    }

    private final void e() {
        kb var1 = null;
        if (this.field_m > 0) {
          var1 = (kb) (this.field_n.e(-24172));
          while (var1 != null) {
            var1.field_i = var1.field_i - this.field_m;
            var1 = (kb) (this.field_n.a(4));
          }
          this.field_p = this.field_p - this.field_m;
          this.field_m = 0;
        }
    }

    private final void a(ne param0, kb param1) {
        while (true) {
          if (param0 == this.field_n.field_c) {
            so.$cfr$intArgs$a$d4f67f19bfc6(89, param0, param1);
            this.field_p = ((kb) (this.field_n.field_c.field_e)).field_i;
            return;
          }
          if (((kb) (param0)).field_i <= param1.field_i) {
            param0 = param0.field_e;
            continue;
          }
          break;
        }
        so.$cfr$intArgs$a$d4f67f19bfc6(89, param0, param1);
        this.field_p = ((kb) (this.field_n.field_c.field_e)).field_i;
        return;
    }

    final int a() {
        return 0;
    }

    final qb c() {
        return (qb) (this.field_o.a(4));
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        kb var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_p < 0) {
            this.d(param0);
            return;
          }
          if (this.field_m + param0 < this.field_p) {
            this.field_m = this.field_m + param0;
            this.d(param0);
            return;
          }
          var2 = this.field_p - this.field_m;
          this.d(var2);
          param0 = param0 - var2;
          this.field_m = this.field_m + var2;
          this.e();
          var3 = (kb) (this.field_n.e(-24172));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_i = var5;
              this.a(var3.field_e, var3);
            } else {
              var3.field_i = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final synchronized void a(qb param0) {
        param0.a(false);
    }

    final synchronized void b(qb param0) {
        this.field_o.b(param0, false);
    }

    private final void a(kb param0) {
        param0.a(false);
        param0.a();
        ne var2 = this.field_n.field_c.field_e;
        if (var2 == this.field_n.field_c) {
          this.field_p = -1;
        } else {
          this.field_p = ((kb) (var2)).field_i;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        kb var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_p < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_m + param2 < this.field_p) {
            this.field_m = this.field_m + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_p - this.field_m;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_m = this.field_m + var4;
          this.e();
          var5 = (kb) (this.field_n.e(-24172));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_i = var7;
              this.a(var5.field_e, var5);
            } else {
              var5.field_i = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void d(int param0) {
        qb var2 = (qb) (this.field_o.e(-24172));
        while (var2 != null) {
          var2.a(param0);
          var2 = (qb) (this.field_o.a(4));
        }
    }

    final qb d() {
        return (qb) (this.field_o.e(-24172));
    }

    public mb() {
        this.field_o = new md();
        this.field_n = new md();
        this.field_m = 0;
        this.field_p = -1;
    }
}
