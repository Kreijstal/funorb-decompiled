/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends di {
    private im field_m;
    private im field_l;
    private int field_j;
    private int field_k;

    private final void a(rk param0) {
        param0.b(57);
        param0.a();
        ca var2 = this.field_l.field_d.field_e;
        if (var2 == this.field_l.field_d) {
          this.field_k = -1;
        } else {
          this.field_k = ((rk) (var2)).field_f;
        }
    }

    final synchronized void a(di param0) {
        this.field_m.a(param0, 9);
    }

    private final void e() {
        rk var1 = null;
        if (this.field_j > 0) {
          var1 = (rk) (this.field_l.b((byte) -68));
          while (var1 != null) {
            var1.field_f = var1.field_f - this.field_j;
            var1 = (rk) (this.field_l.d(853));
          }
          this.field_k = this.field_k - this.field_j;
          this.field_j = 0;
        }
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        rk var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_k < 0) {
            this.d(param0);
            return;
          }
          if (this.field_j + param0 < this.field_k) {
            this.field_j = this.field_j + param0;
            this.d(param0);
            return;
          }
          var2 = this.field_k - this.field_j;
          this.d(var2);
          param0 = param0 - var2;
          this.field_j = this.field_j + var2;
          this.e();
          var3 = (rk) (this.field_l.b((byte) 114));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_f = var5;
              this.a(var3.field_e, var3);
            } else {
              var3.field_f = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void c(int[] param0, int param1, int param2) {
        di var4 = (di) (this.field_m.b((byte) 120));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (di) (this.field_m.d(853));
        }
    }

    final di d() {
        return (di) (this.field_m.d(853));
    }

    private final void a(ca param0, rk param1) {
        while (true) {
          if (param0 == this.field_l.field_d) {
            vk.$cfr$intArgs$a$0b89e0d19fbb(param1, -65, param0);
            this.field_k = ((rk) (this.field_l.field_d.field_e)).field_f;
            return;
          }
          if (((rk) (param0)).field_f <= param1.field_f) {
            param0 = param0.field_e;
            continue;
          }
          break;
        }
        vk.$cfr$intArgs$a$0b89e0d19fbb(param1, -65, param0);
        this.field_k = ((rk) (this.field_l.field_d.field_e)).field_f;
        return;
    }

    final int c() {
        return 0;
    }

    private final void d(int param0) {
        di var2 = (di) (this.field_m.b((byte) 118));
        while (var2 != null) {
          var2.c(param0);
          var2 = (di) (this.field_m.d(853));
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        rk var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_k < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_j + param2 < this.field_k) {
            this.field_j = this.field_j + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_k - this.field_j;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_j = this.field_j + var4;
          this.e();
          var5 = (rk) (this.field_l.b((byte) 126));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_f = var7;
              this.a(var5.field_e, var5);
            } else {
              var5.field_f = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final di a() {
        return (di) (this.field_m.b((byte) 127));
    }

    public v() {
        this.field_m = new im();
        this.field_l = new im();
        this.field_j = 0;
        this.field_k = -1;
    }
}
