/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends we {
    private ul field_u;
    private ul field_s;
    private int field_t;
    private int field_v;

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        w var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_v < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_t + param2 < this.field_v) {
            this.field_t = this.field_t + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_v - this.field_t;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_t = this.field_t + var4;
          this.e();
          var5 = (w) (this.field_s.e(13058));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_o = var7;
              this.a(var5.field_k, var5);
            } else {
              var5.field_o = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void b(we param0) {
        this.field_u.a(param0, -21459);
    }

    final we d() {
        return (we) (this.field_u.e(13058));
    }

    private final void a(w param0) {
        param0.b(4);
        param0.a();
        ck var2 = this.field_s.field_e.field_k;
        if (var2 == this.field_s.field_e) {
          this.field_v = -1;
        } else {
          this.field_v = ((w) (var2)).field_o;
        }
    }

    final we b() {
        return (we) (this.field_u.a((byte) -25));
    }

    private final void a(ck param0, w param1) {
        while (true) {
          if (param0 == this.field_s.field_e) {
            ie.a(param0, 30, param1);
            this.field_v = ((w) (this.field_s.field_e.field_k)).field_o;
            return;
          }
          if (((w) (param0)).field_o <= param1.field_o) {
            param0 = param0.field_k;
            continue;
          }
          break;
        }
        ie.a(param0, 30, param1);
        this.field_v = ((w) (this.field_s.field_e.field_k)).field_o;
        return;
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        w var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_v < 0) {
            this.e(param0);
            return;
          }
          if (this.field_t + param0 < this.field_v) {
            this.field_t = this.field_t + param0;
            this.e(param0);
            return;
          }
          var2 = this.field_v - this.field_t;
          this.e(var2);
          param0 = param0 - var2;
          this.field_t = this.field_t + var2;
          this.e();
          var3 = (w) (this.field_s.e(13058));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_o = var5;
              this.a(var3.field_k, var3);
            } else {
              var3.field_o = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void e() {
        w var1 = null;
        if (this.field_t > 0) {
          var1 = (w) (this.field_s.e(13058));
          while (var1 != null) {
            var1.field_o = var1.field_o - this.field_t;
            var1 = (w) (this.field_s.a((byte) -75));
          }
          this.field_v = this.field_v - this.field_t;
          this.field_t = 0;
        }
    }

    final int a() {
        return 0;
    }

    final synchronized void a(we param0) {
        param0.b(4);
    }

    private final void e(int param0) {
        we var2 = (we) (this.field_u.e(13058));
        while (var2 != null) {
          var2.d(param0);
          var2 = (we) (this.field_u.a((byte) -58));
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        we var4 = (we) (this.field_u.e(13058));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (we) (this.field_u.a((byte) -29));
        }
    }

    public wg() {
        this.field_u = new ul();
        this.field_s = new ul();
        this.field_t = 0;
        this.field_v = -1;
    }
}
