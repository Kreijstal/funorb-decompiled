/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends in {
    private p field_m;
    private p field_l;
    private int field_k;
    private int field_n;

    final in c() {
        return (in) (this.field_m.a((byte) -115));
    }

    final in b() {
        return (in) (this.field_m.a(16213));
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        cl var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_k < 0) {
            this.c(param0);
            return;
          }
          if (this.field_n + param0 < this.field_k) {
            this.field_n = this.field_n + param0;
            this.c(param0);
            return;
          }
          var2 = this.field_k - this.field_n;
          this.c(var2);
          param0 = param0 - var2;
          this.field_n = this.field_n + var2;
          this.e();
          var3 = (cl) (this.field_l.a((byte) -124));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_g = var5;
              this.a(var3.field_f, var3);
            } else {
              var3.field_g = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void c(int param0) {
        in var2 = (in) (this.field_m.a((byte) -106));
        while (var2 != null) {
          var2.a(param0);
          var2 = (in) (this.field_m.a(16213));
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        cl var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_k < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_n + param2 < this.field_k) {
            this.field_n = this.field_n + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_k - this.field_n;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_n = this.field_n + var4;
          this.e();
          var5 = (cl) (this.field_l.a((byte) -74));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_g = var7;
              this.a(var5.field_f, var5);
            } else {
              var5.field_g = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void a(cl param0) {
        param0.a(false);
        param0.a();
        l var2 = this.field_l.field_i.field_f;
        if (var2 == this.field_l.field_i) {
          this.field_k = -1;
        } else {
          this.field_k = ((cl) (var2)).field_g;
        }
    }

    private final void a(l param0, cl param1) {
        while (true) {
          if (param0 == this.field_l.field_i) {
            td.a(param0, (byte) 120, param1);
            this.field_k = ((cl) (this.field_l.field_i.field_f)).field_g;
            return;
          }
          if (((cl) (param0)).field_g <= param1.field_g) {
            param0 = param0.field_f;
            continue;
          }
          break;
        }
        td.a(param0, (byte) 120, param1);
        this.field_k = ((cl) (this.field_l.field_i.field_f)).field_g;
        return;
    }

    private final void c(int[] param0, int param1, int param2) {
        in var4 = (in) (this.field_m.a((byte) -44));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (in) (this.field_m.a(16213));
        }
    }

    final int d() {
        return 0;
    }

    private final void e() {
        cl var1 = null;
        if (this.field_n > 0) {
          var1 = (cl) (this.field_l.a((byte) -116));
          while (var1 != null) {
            var1.field_g = var1.field_g - this.field_n;
            var1 = (cl) (this.field_l.a(16213));
          }
          this.field_k = this.field_k - this.field_n;
          this.field_n = 0;
        }
    }

    final synchronized void a(in param0) {
        this.field_m.b(param0, (byte) -45);
    }

    public r() {
        this.field_m = new p();
        this.field_l = new p();
        this.field_n = 0;
        this.field_k = -1;
    }
}
