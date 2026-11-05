/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends od {
    private wb field_l;
    private wb field_m;
    private int field_k;
    private int field_j;

    private final void a(jb param0, rj param1) {
        while (true) {
          if (param0 == this.field_m.field_a) {
            rf.a(param0, param1, 47);
            this.field_j = ((rj) (this.field_m.field_a.field_b)).field_f;
            return;
          }
          if (((rj) (param0)).field_f <= param1.field_f) {
            param0 = param0.field_b;
            continue;
          }
          break;
        }
        rf.a(param0, param1, 47);
        this.field_j = ((rj) (this.field_m.field_a.field_b)).field_f;
        return;
    }

    final synchronized void a(od param0) {
        param0.a(false);
    }

    final synchronized void b(od param0) {
        this.field_l.a(93, param0);
    }

    final void a(ko param0, int param1, int param2, int param3) {
        this.b(kg.a(param0, param1, param2, param3));
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        rj var5 = null;
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
          var5 = (rj) (this.field_m.g(32073));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_f = var7;
              this.a(var5.field_b, var5);
            } else {
              var5.field_f = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void a(rj param0) {
        param0.a(false);
        param0.a();
        jb var2 = this.field_m.field_a.field_b;
        if (var2 == this.field_m.field_a) {
          this.field_j = -1;
        } else {
          this.field_j = ((rj) (var2)).field_f;
        }
    }

    private final void e() {
        rj var1 = null;
        if (this.field_k > 0) {
          var1 = (rj) (this.field_m.g(32073));
          while (var1 != null) {
            var1.field_f = var1.field_f - this.field_k;
            var1 = (rj) (this.field_m.a(false));
          }
          this.field_j = this.field_j - this.field_k;
          this.field_k = 0;
        }
    }

    private final void d(int param0) {
        od var2 = (od) (this.field_l.g(32073));
        while (var2 != null) {
          var2.a(param0);
          var2 = (od) (this.field_l.a(false));
        }
    }

    final od d() {
        return (od) (this.field_l.g(32073));
    }

    final od a() {
        return (od) (this.field_l.a(false));
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        rj var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_j < 0) {
            this.d(param0);
            return;
          }
          if (this.field_k + param0 < this.field_j) {
            this.field_k = this.field_k + param0;
            this.d(param0);
            return;
          }
          var2 = this.field_j - this.field_k;
          this.d(var2);
          param0 = param0 - var2;
          this.field_k = this.field_k + var2;
          this.e();
          var3 = (rj) (this.field_m.g(32073));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_f = var5;
              this.a(var3.field_b, var3);
            } else {
              var3.field_f = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void c(int[] param0, int param1, int param2) {
        od var4 = (od) (this.field_l.g(32073));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (od) (this.field_l.a(false));
        }
    }

    final int c() {
        return 0;
    }

    public tj() {
        this.field_l = new wb();
        this.field_m = new wb();
        this.field_k = 0;
        this.field_j = -1;
    }
}
