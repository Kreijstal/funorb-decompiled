/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends tj {
    private ah field_m;
    private ah field_o;
    private int field_p;
    private int field_n;

    private final void a(pl param0) {
        param0.d(0);
        param0.a();
        hl var2 = this.field_o.field_e.field_h;
        if (var2 == this.field_o.field_e) {
          this.field_p = -1;
        } else {
          this.field_p = ((pl) (var2)).field_i;
        }
    }

    private final void e(int param0) {
        tj var2 = (tj) (this.field_m.b((byte) 114));
        while (var2 != null) {
          var2.a(param0);
          var2 = (tj) (this.field_m.c((byte) 90));
        }
    }

    final tj a() {
        return (tj) (this.field_m.b((byte) 118));
    }

    final synchronized void b(tj param0) {
        param0.d(0);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        pl var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_p < 0) {
            this.e(param0);
            return;
          }
          if (this.field_n + param0 < this.field_p) {
            this.field_n = this.field_n + param0;
            this.e(param0);
            return;
          }
          var2 = this.field_p - this.field_n;
          this.e(var2);
          param0 = param0 - var2;
          this.field_n = this.field_n + var2;
          this.e();
          var3 = (pl) (this.field_o.b((byte) 119));
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

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        pl var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_p < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_n + param2 < this.field_p) {
            this.field_n = this.field_n + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_p - this.field_n;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_n = this.field_n + var4;
          this.e();
          var5 = (pl) (this.field_o.b((byte) 91));
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

    private final void a(hl param0, pl param1) {
        while (true) {
          if (param0 == this.field_o.field_e) {
            ah.a(param0, 0, param1);
            this.field_p = ((pl) (this.field_o.field_e.field_h)).field_i;
            return;
          }
          if (((pl) (param0)).field_i <= param1.field_i) {
            param0 = param0.field_h;
            continue;
          }
          break;
        }
        ah.a(param0, 0, param1);
        this.field_p = ((pl) (this.field_o.field_e.field_h)).field_i;
        return;
    }

    private final void e() {
        pl var1 = null;
        if (this.field_n > 0) {
          var1 = (pl) (this.field_o.b((byte) 86));
          while (var1 != null) {
            var1.field_i = var1.field_i - this.field_n;
            var1 = (pl) (this.field_o.c((byte) -52));
          }
          this.field_p = this.field_p - this.field_n;
          this.field_n = 0;
        }
    }

    final tj b() {
        return (tj) (this.field_m.c((byte) -114));
    }

    final synchronized void a(tj param0) {
        this.field_m.a(param0, false);
    }

    private final void c(int[] param0, int param1, int param2) {
        tj var4 = (tj) (this.field_m.b((byte) 115));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (tj) (this.field_m.c((byte) 120));
        }
    }

    final int c() {
        return 0;
    }

    public fg() {
        this.field_m = new ah();
        this.field_o = new ah();
        this.field_n = 0;
        this.field_p = -1;
    }
}
