/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends tda {
    private eaa field_k;
    private eaa field_m;
    private int field_j;
    private int field_l;

    final synchronized void a(int param0) {
        int var2 = 0;
        lea var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_j < 0) {
            this.b(param0);
            return;
          }
          if (this.field_l + param0 < this.field_j) {
            this.field_l = this.field_l + param0;
            this.b(param0);
            return;
          }
          var2 = this.field_j - this.field_l;
          this.b(var2);
          param0 = param0 - var2;
          this.field_l = this.field_l + var2;
          this.e();
          var3 = (lea) (this.field_m.b((byte) 90));
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
        tda var4 = (tda) (this.field_k.b((byte) 90));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (tda) (this.field_k.c(0));
        }
    }

    final tda b() {
        return (tda) (this.field_k.b((byte) 90));
    }

    final synchronized void a(tda param0) {
        this.field_k.a(-80, param0);
    }

    final int d() {
        return 0;
    }

    final tda a() {
        return (tda) (this.field_k.c(0));
    }

    private final void a(lea param0) {
        param0.a(false);
        param0.a();
        bw var2 = this.field_m.field_g.field_b;
        if (var2 == this.field_m.field_g) {
          this.field_j = -1;
        } else {
          this.field_j = ((lea) (var2)).field_f;
        }
    }

    final synchronized void b(tda param0) {
        param0.a(false);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        lea var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_j < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_l + param2 < this.field_j) {
            this.field_l = this.field_l + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_j - this.field_l;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_l = this.field_l + var4;
          this.e();
          var5 = (lea) (this.field_m.b((byte) 90));
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

    private final void b(int param0) {
        tda var2 = (tda) (this.field_k.b((byte) 90));
        while (var2 != null) {
          var2.a(param0);
          var2 = (tda) (this.field_k.c(0));
        }
    }

    private final void e() {
        lea var1 = null;
        if (this.field_l > 0) {
          var1 = (lea) (this.field_m.b((byte) 90));
          while (var1 != null) {
            var1.field_f = var1.field_f - this.field_l;
            var1 = (lea) (this.field_m.c(0));
          }
          this.field_j = this.field_j - this.field_l;
          this.field_l = 0;
        }
    }

    private final void a(bw param0, lea param1) {
        while (true) {
          if (param0 == this.field_m.field_g) {
            nr.$cfr$intArgs$a$94cfdbf41ae0(115, param0, param1);
            this.field_j = ((lea) (this.field_m.field_g.field_b)).field_f;
            return;
          }
          if (((lea) (param0)).field_f <= param1.field_f) {
            param0 = param0.field_b;
            continue;
          }
          break;
        }
        nr.$cfr$intArgs$a$94cfdbf41ae0(115, param0, param1);
        this.field_j = ((lea) (this.field_m.field_g.field_b)).field_f;
        return;
    }

    public hn() {
        this.field_k = new eaa();
        this.field_m = new eaa();
        this.field_j = -1;
        this.field_l = 0;
    }
}
