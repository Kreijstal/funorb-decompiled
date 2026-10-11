/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends je {
    private bk field_n;
    private bk field_m;
    private int field_k;
    private int field_l;

    private final void d(int param0) {
        je var2 = (je) (this.field_n.a((byte) 74));
        while (var2 != null) {
          var2.a(param0);
          var2 = (je) (this.field_n.b((byte) -121));
        }
    }

    final synchronized void b(sf param0) {
        if (param0.field_h == null) {
          this.e();
          param0.field_h = this;
          param0.b();
          this.a(this.field_m.field_a.field_d, param0);
          return;
        }
        throw new RuntimeException();
    }

    final je a() {
        return (je) (this.field_n.b((byte) -95));
    }

    final synchronized void a(sf param0) {
        if (param0.field_h == null) {
          return;
        }
        if (param0.field_h == this) {
          this.e();
          this.c(param0);
          return;
        }
        throw new RuntimeException();
    }

    final synchronized void b(je param0) {
        this.field_n.a(-126, param0);
    }

    private final void c(int[] param0, int param1, int param2) {
        je var4 = (je) (this.field_n.a((byte) 74));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (je) (this.field_n.b((byte) -95));
        }
    }

    private final void e() {
        sf var1 = null;
        if (this.field_k > 0) {
          var1 = (sf) (this.field_m.a((byte) 74));
          while (var1 != null) {
            var1.field_g = var1.field_g - this.field_k;
            var1 = (sf) (this.field_m.b((byte) -122));
          }
          this.field_l = this.field_l - this.field_k;
          this.field_k = 0;
        }
    }

    private final void c(sf param0) {
        param0.c(107);
        param0.a();
        param0.field_h = null;
        qb var2 = this.field_m.field_a.field_d;
        if (var2 == this.field_m.field_a) {
          this.field_l = -1;
        } else {
          this.field_l = ((sf) (var2)).field_g;
        }
    }

    final int c() {
        return 0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        sf var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_l < 0) {
            this.d(param0);
            return;
          }
          if (this.field_k + param0 < this.field_l) {
            this.field_k = this.field_k + param0;
            this.d(param0);
            return;
          }
          var2 = this.field_l - this.field_k;
          this.d(var2);
          param0 = param0 - var2;
          this.field_k = this.field_k + var2;
          this.e();
          var3 = (sf) (this.field_m.a((byte) 74));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_g = var5;
              this.a(var3.field_d, var3);
            } else {
              var3.field_g = 0;
              this.c(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void a(qb param0, sf param1) {
        while (true) {
          if (param0 == this.field_m.field_a) {
            ce.a(param0, 0, param1);
            this.field_l = ((sf) (this.field_m.field_a.field_d)).field_g;
            return;
          }
          if (((sf) (param0)).field_g <= param1.field_g) {
            param0 = param0.field_d;
            continue;
          }
          break;
        }
        ce.a(param0, 0, param1);
        this.field_l = ((sf) (this.field_m.field_a.field_d)).field_g;
        return;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        sf var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_l < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_k + param2 < this.field_l) {
            this.field_k = this.field_k + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_l - this.field_k;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_k = this.field_k + var4;
          this.e();
          var5 = (sf) (this.field_m.a((byte) 74));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_g = var7;
              this.a(var5.field_d, var5);
            } else {
              var5.field_g = 0;
              this.c(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void a(je param0) {
        param0.c(104);
    }

    public qj() {
        this.field_n = new bk();
        this.field_m = new bk();
        this.field_k = 0;
        this.field_l = -1;
    }

    final je b() {
        return (je) (this.field_n.a((byte) 74));
    }
}
