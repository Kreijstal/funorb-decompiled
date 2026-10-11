/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends sh {
    private vc field_n;
    private vc field_p;
    private int field_o;
    private int field_m;

    private final void a(lh param0, vl param1) {
        while (true) {
          if (param0 == this.field_p.field_e) {
            nl.a(100, param0, param1);
            this.field_m = ((vl) (this.field_p.field_e.field_h)).field_i;
            return;
          }
          if (((vl) (param0)).field_i <= param1.field_i) {
            param0 = param0.field_h;
            continue;
          }
          break;
        }
        nl.a(100, param0, param1);
        this.field_m = ((vl) (this.field_p.field_e.field_h)).field_i;
        return;
    }

    private final void c(int[] param0, int param1, int param2) {
        sh var4 = (sh) (this.field_n.c((byte) 47));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (sh) (this.field_n.b((byte) -105));
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        vl var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_m < 0) {
            this.d(param0);
            return;
          }
          if (this.field_o + param0 < this.field_m) {
            this.field_o = this.field_o + param0;
            this.d(param0);
            return;
          }
          var2 = this.field_m - this.field_o;
          this.d(var2);
          param0 = param0 - var2;
          this.field_o = this.field_o + var2;
          this.e();
          var3 = (vl) (this.field_p.c((byte) 47));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_i = var5;
              this.a(var3.field_h, var3);
            } else {
              var3.field_i = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void d(int param0) {
        sh var2 = (sh) (this.field_n.c((byte) 47));
        while (var2 != null) {
          var2.a(param0);
          var2 = (sh) (this.field_n.b((byte) -105));
        }
    }

    final synchronized void a(sh param0) {
        this.field_n.b(true, param0);
    }

    final sh d() {
        return (sh) (this.field_n.c((byte) 47));
    }

    final int a() {
        return 0;
    }

    private final void e() {
        vl var1 = null;
        if (this.field_o > 0) {
          var1 = (vl) (this.field_p.c((byte) 47));
          while (var1 != null) {
            var1.field_i = var1.field_i - this.field_o;
            var1 = (vl) (this.field_p.b((byte) -105));
          }
          this.field_m = this.field_m - this.field_o;
          this.field_o = 0;
        }
    }

    private final void a(vl param0) {
        param0.c(-1);
        param0.a();
        lh var2 = this.field_p.field_e.field_h;
        if (var2 == this.field_p.field_e) {
          this.field_m = -1;
        } else {
          this.field_m = ((vl) (var2)).field_i;
        }
    }

    final sh c() {
        return (sh) (this.field_n.b((byte) -105));
    }

    public ke() {
        this.field_n = new vc();
        this.field_p = new vc();
        this.field_o = 0;
        this.field_m = -1;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        vl var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_m < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_o + param2 < this.field_m) {
            this.field_o = this.field_o + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_m - this.field_o;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_o = this.field_o + var4;
          this.e();
          var5 = (vl) (this.field_p.c((byte) 47));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_i = var7;
              this.a(var5.field_h, var5);
            } else {
              var5.field_i = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }
}
