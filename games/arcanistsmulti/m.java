/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends sg {
    private vn field_l;
    private vn field_m;
    private int field_k;
    private int field_n;

    private final void a(d param0) {
        param0.a(true);
        param0.a();
        pg var2 = this.field_m.field_e.field_b;
        if (var2 == this.field_m.field_e) {
          this.field_k = -1;
        } else {
          this.field_k = ((d) (var2)).field_g;
        }
    }

    final synchronized void a(sg param0) {
        param0.a(true);
    }

    final synchronized void b(sg param0) {
        this.field_l.a((pg) (param0), (byte) -58);
    }

    private final void c(int[] param0, int param1, int param2) {
        sg var4 = (sg) (this.field_l.b(12623));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (sg) (this.field_l.a(0));
        }
    }

    final sg a() {
        return (sg) (this.field_l.b(12623));
    }

    private final void c(int param0) {
        sg var2 = (sg) (this.field_l.b(12623));
        while (var2 != null) {
          var2.a(param0);
          var2 = (sg) (this.field_l.a(0));
        }
    }

    final sg b() {
        return (sg) (this.field_l.a(0));
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        d var5 = null;
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
          var5 = (d) (this.field_m.b(12623));
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

    final int c() {
        return 0;
    }

    private final void e() {
        d var1 = null;
        if (this.field_n > 0) {
          var1 = (d) (this.field_m.b(12623));
          while (var1 != null) {
            var1.field_g = var1.field_g - this.field_n;
            var1 = (d) (this.field_m.a(0));
          }
          this.field_k = this.field_k - this.field_n;
          this.field_n = 0;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        d var3 = null;
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
          var3 = (d) (this.field_m.b(12623));
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

    private final void a(pg param0, d param1) {
        while (true) {
          if (param0 == this.field_m.field_e) {
            da.a(param0, 20, param1);
            this.field_k = ((d) (this.field_m.field_e.field_b)).field_g;
            return;
          }
          if (((d) (param0)).field_g <= param1.field_g) {
            param0 = param0.field_b;
            continue;
          }
          break;
        }
        da.a(param0, 20, param1);
        this.field_k = ((d) (this.field_m.field_e.field_b)).field_g;
        return;
    }

    public m() {
        this.field_l = new vn();
        this.field_m = new vn();
        this.field_k = -1;
        this.field_n = 0;
    }
}
