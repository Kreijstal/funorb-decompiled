/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends kd {
    private oj field_o;
    private oj field_r;
    private int field_q;
    private int field_p;

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        p var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_q < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_p + param2 < this.field_q) {
            this.field_p = this.field_p + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_q - this.field_p;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_p = this.field_p + var4;
          this.e();
          var5 = (p) (this.field_r.b(-102));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_l = var7;
              this.a(var5.field_g, var5);
            } else {
              var5.field_l = 0;
              this.c(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void d(int param0) {
        kd var2 = (kd) (this.field_o.b(-92));
        while (var2 != null) {
          var2.a(param0);
          var2 = (kd) (this.field_o.b((byte) -57));
        }
    }

    final synchronized void b(p param0) {
        if (param0.field_k == null) {
          return;
        }
        if (param0.field_k == this) {
          this.e();
          this.c(param0);
          return;
        }
        throw new RuntimeException();
    }

    final synchronized void a(p param0) {
        if (param0.field_k == null) {
          this.e();
          param0.field_k = this;
          param0.b();
          this.a(this.field_r.field_d.field_g, param0);
          return;
        }
        throw new RuntimeException();
    }

    private final void e() {
        p var1 = null;
        if (this.field_p > 0) {
          var1 = (p) (this.field_r.b(-101));
          while (var1 != null) {
            var1.field_l = var1.field_l - this.field_p;
            var1 = (p) (this.field_r.b((byte) 101));
          }
          this.field_q = this.field_q - this.field_p;
          this.field_p = 0;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        p var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_q < 0) {
            this.d(param0);
            return;
          }
          if (this.field_p + param0 < this.field_q) {
            this.field_p = this.field_p + param0;
            this.d(param0);
            return;
          }
          var2 = this.field_q - this.field_p;
          this.d(var2);
          param0 = param0 - var2;
          this.field_p = this.field_p + var2;
          this.e();
          var3 = (p) (this.field_r.b(-115));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_l = var5;
              this.a(var3.field_g, var3);
            } else {
              var3.field_l = 0;
              this.c(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final kd c() {
        return (kd) (this.field_o.b((byte) 124));
    }

    final synchronized void b(kd param0) {
        param0.c(20);
    }

    final int b() {
        return 0;
    }

    final synchronized void a(kd param0) {
        this.field_o.a(-1, param0);
    }

    private final void c(p param0) {
        param0.c(20);
        param0.a();
        param0.field_k = null;
        gg var2 = this.field_r.field_d.field_g;
        if (var2 == this.field_r.field_d) {
          this.field_q = -1;
        } else {
          this.field_q = ((p) (var2)).field_l;
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        kd var4 = (kd) (this.field_o.b(-81));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (kd) (this.field_o.b((byte) 77));
        }
    }

    final kd d() {
        return (kd) (this.field_o.b(-125));
    }

    private final void a(gg param0, p param1) {
        while (true) {
          if (param0 == this.field_r.field_d) {
            kk.a(103, param1, param0);
            this.field_q = ((p) (this.field_r.field_d.field_g)).field_l;
            return;
          }
          if (((p) (param0)).field_l <= param1.field_l) {
            param0 = param0.field_g;
            continue;
          }
          break;
        }
        kk.a(103, param1, param0);
        this.field_q = ((p) (this.field_r.field_d.field_g)).field_l;
        return;
    }

    final void a(ud param0, int param1, int param2) {
        this.a(gd.a(param0, param1, param2));
    }

    public hl() {
        this.field_o = new oj();
        this.field_r = new oj();
        this.field_q = -1;
        this.field_p = 0;
    }
}
