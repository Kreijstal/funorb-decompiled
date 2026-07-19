/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends gf {
    private mn field_s;
    private mn field_q;
    private int field_r;
    private int field_t;

    final synchronized void a(bl param0) {
        if (param0.field_n != null) {
          throw new RuntimeException();
        } else {
          this.e();
          param0.field_n = (be) (this);
          param0.b();
          this.a(this.field_q.field_a.field_h, param0);
          return;
        }
    }

    final synchronized void a(gf param0) {
        this.field_s.a(param0, -1);
    }

    final synchronized void b(gf param0) {
        param0.a(true);
    }

    final int c() {
        return 0;
    }

    final synchronized void b(bl param0) {
        if (param0.field_n != null) {
          if (param0.field_n != this) {
            throw new RuntimeException();
          } else {
            this.e();
            this.c(param0);
            return;
          }
        } else {
          return;
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        gf var4 = (gf) ((Object) this.field_s.a(86));
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (gf) ((Object) this.field_s.d(2123));
        }
    }

    private final void c(bl param0) {
        param0.a(true);
        param0.a();
        param0.field_n = null;
        rk var2 = this.field_q.field_a.field_h;
        if (var2 == this.field_q.field_a) {
            this.field_t = -1;
        } else {
            this.field_t = ((bl) ((Object) var2)).field_m;
        }
    }

    private final void e() {
        bl var1 = null;
        if (this.field_r > 0) {
            var1 = (bl) ((Object) this.field_q.a(-119));
            while (var1 != null) {
                var1.field_m = var1.field_m - this.field_r;
                var1 = (bl) ((Object) this.field_q.d(2123));
            }
            this.field_t = this.field_t - this.field_r;
            this.field_r = 0;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        bl var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_t >= 0) {
            if (this.field_r + param2 >= this.field_t) {
              var4 = this.field_t - this.field_r;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_r = this.field_r + var4;
              this.e();
              var5 = (bl) ((Object) this.field_q.a(-125));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((be) (this));
                    if (var7 >= 0) {
                      var5.field_m = var7;
                      this.a(var5.field_h, var5);
                      break L2;
                    } else {
                      var5.field_m = 0;
                      this.c(var5);
                      break L2;
                    }
                  }
                  break L1;
                }
              }
              if (param2 != 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              this.field_r = this.field_r + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final void a(bi param0, int param1, int param2) {
        this.a(vc.b(param0, param1, param2));
    }

    final gf a() {
        return (gf) ((Object) this.field_s.a(-123));
    }

    private final void a(rk param0, bl param1) {
        L0: while (true) {
          if (param0 != this.field_q.field_a) {
            if (((bl) ((Object) param0)).field_m <= param1.field_m) {
              param0 = param0.field_h;
              continue L0;
            } else {
              ri.a(param0, 0, param1);
              this.field_t = ((bl) ((Object) this.field_q.field_a.field_h)).field_m;
              return;
            }
          } else {
            ri.a(param0, 0, param1);
            this.field_t = ((bl) ((Object) this.field_q.field_a.field_h)).field_m;
            return;
          }
        }
    }

    private final void c(int param0) {
        gf var2 = (gf) ((Object) this.field_s.a(-119));
        while (var2 != null) {
            var2.b(param0);
            var2 = (gf) ((Object) this.field_s.d(2123));
        }
    }

    final gf d() {
        return (gf) ((Object) this.field_s.d(2123));
    }

    final synchronized void b(int param0) {
        int var2 = 0;
        bl var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_t >= 0) {
            if (this.field_r + param0 >= this.field_t) {
              var2 = this.field_t - this.field_r;
              this.c(var2);
              param0 = param0 - var2;
              this.field_r = this.field_r + var2;
              this.e();
              var3 = (bl) ((Object) this.field_q.a(22));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((be) (this));
                    if (var5 >= 0) {
                      var3.field_m = var5;
                      this.a(var3.field_h, var3);
                      break L2;
                    } else {
                      var3.field_m = 0;
                      this.c(var3);
                      break L2;
                    }
                  }
                  break L1;
                }
              }
              if (param0 != 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              this.field_r = this.field_r + param0;
              this.c(param0);
              return;
            }
          } else {
            this.c(param0);
            return;
          }
        }
    }

    public be() {
        this.field_s = new mn();
        this.field_q = new mn();
        this.field_r = 0;
        this.field_t = -1;
    }
}
