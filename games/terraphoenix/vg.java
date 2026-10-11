/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends lj {
    private jj field_m;
    private jj field_o;
    private int field_n;
    private int field_l;

    final lj a() {
        return (lj) (this.field_m.e((byte) -119));
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        we var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_l < 0) {
            this.c(param0);
            return;
          }
          if (this.field_n + param0 < this.field_l) {
            this.field_n = this.field_n + param0;
            this.c(param0);
            return;
          }
          var2 = this.field_l - this.field_n;
          this.c(var2);
          param0 = param0 - var2;
          this.field_n = this.field_n + var2;
          this.e();
          var3 = (we) (this.field_o.d(9272));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_h = var5;
              this.a(var3.field_d, var3);
            } else {
              var3.field_h = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void a(uf param0, we param1) {
        while (true) {
          if (param0 == this.field_o.field_a) {
            ha.a(127, param0, param1);
            this.field_l = ((we) (this.field_o.field_a.field_d)).field_h;
            return;
          }
          if (((we) (param0)).field_h <= param1.field_h) {
            param0 = param0.field_d;
            continue;
          }
          break;
        }
        ha.a(127, param0, param1);
        this.field_l = ((we) (this.field_o.field_a.field_d)).field_h;
        return;
    }

    private final void e() {
        we var1 = null;
        if (this.field_n > 0) {
          var1 = (we) (this.field_o.d(9272));
          while (var1 != null) {
            var1.field_h = var1.field_h - this.field_n;
            var1 = (we) (this.field_o.e((byte) -119));
          }
          this.field_l = this.field_l - this.field_n;
          this.field_n = 0;
        }
    }

    private final void a(we param0) {
        param0.b((byte) 12);
        param0.a();
        uf var2 = this.field_o.field_a.field_d;
        if (var2 == this.field_o.field_a) {
          this.field_l = -1;
        } else {
          this.field_l = ((we) (var2)).field_h;
        }
    }

    final synchronized void a(lj param0) {
        this.field_m.a((uf) (param0), (byte) 0);
    }

    final int d() {
        return 0;
    }

    private final void c(int[] param0, int param1, int param2) {
        lj var4 = (lj) (this.field_m.d(9272));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (lj) (this.field_m.e((byte) -119));
        }
    }

    final void a(gg param0, int param1, int param2) {
        this.a(lh.a(param0, param1, param2));
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        we var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_l < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_n + param2 < this.field_l) {
            this.field_n = this.field_n + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_l - this.field_n;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_n = this.field_n + var4;
          this.e();
          var5 = (we) (this.field_o.d(9272));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_h = var7;
              this.a(var5.field_d, var5);
            } else {
              var5.field_h = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void c(int param0) {
        lj var2 = (lj) (this.field_m.d(9272));
        while (var2 != null) {
          var2.a(param0);
          var2 = (lj) (this.field_m.e((byte) -119));
        }
    }

    final lj c() {
        return (lj) (this.field_m.d(9272));
    }

    public vg() {
        this.field_m = new jj();
        this.field_o = new jj();
        this.field_n = 0;
        this.field_l = -1;
    }
}
