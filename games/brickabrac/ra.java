/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends qd {
    private vl field_o;
    private vl field_m;
    private int field_p;
    private int field_n;

    final qd d() {
        return (qd) (this.field_o.a((byte) 116));
    }

    final synchronized void b(qd param0) {
        this.field_o.a(true, param0);
    }

    final qd a() {
        return (qd) (this.field_o.d(-112));
    }

    final int b() {
        return 0;
    }

    final synchronized void a(qd param0) {
        param0.b((byte) 111);
    }

    private final void a(nm param0, wf param1) {
        while (true) {
          if (param0 == this.field_m.field_e) {
            il.a(param1, 113, param0);
            this.field_n = ((wf) (this.field_m.field_e.field_e)).field_i;
            return;
          }
          if (((wf) (param0)).field_i <= param1.field_i) {
            param0 = param0.field_e;
            continue;
          }
          break;
        }
        il.a(param1, 113, param0);
        this.field_n = ((wf) (this.field_m.field_e.field_e)).field_i;
        return;
    }

    private final void c(int param0) {
        qd var2 = (qd) (this.field_o.d(-21));
        while (var2 != null) {
          var2.a(param0);
          var2 = (qd) (this.field_o.a((byte) 116));
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        qd var4 = (qd) (this.field_o.d(-96));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (qd) (this.field_o.a((byte) 116));
        }
    }

    private final void a(wf param0) {
        param0.b((byte) 111);
        param0.a();
        nm var2 = this.field_m.field_e.field_e;
        if (var2 == this.field_m.field_e) {
          this.field_n = -1;
        } else {
          this.field_n = ((wf) (var2)).field_i;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        wf var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_n < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_p + param2 < this.field_n) {
            this.field_p = this.field_p + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_n - this.field_p;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_p = this.field_p + var4;
          this.e();
          var5 = (wf) (this.field_m.d(-90));
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

    final synchronized void a(int param0) {
        int var2 = 0;
        wf var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_n < 0) {
            this.c(param0);
            return;
          }
          if (this.field_p + param0 < this.field_n) {
            this.field_p = this.field_p + param0;
            this.c(param0);
            return;
          }
          var2 = this.field_n - this.field_p;
          this.c(var2);
          param0 = param0 - var2;
          this.field_p = this.field_p + var2;
          this.e();
          var3 = (wf) (this.field_m.d(-40));
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

    private final void e() {
        wf var1 = null;
        if (this.field_p > 0) {
          var1 = (wf) (this.field_m.d(-127));
          while (var1 != null) {
            var1.field_i = var1.field_i - this.field_p;
            var1 = (wf) (this.field_m.a((byte) 116));
          }
          this.field_n = this.field_n - this.field_p;
          this.field_p = 0;
        }
    }

    public ra() {
        this.field_o = new vl();
        this.field_m = new vl();
        this.field_n = -1;
        this.field_p = 0;
    }
}
