/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends eb {
    private je field_s;
    private je field_t;
    private int field_r;
    private int field_u;

    final synchronized void a(int param0) {
        int var2 = 0;
        ln var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_r >= 0) {
            if (this.field_u + param0 >= this.field_r) {
              var2 = this.field_r - this.field_u;
              this.c(var2);
              param0 = param0 - var2;
              this.field_u = this.field_u + var2;
              this.e();
              var3 = (ln) ((Object) this.field_t.c(false));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((fg) (this));
                    if (var5 >= 0) {
                      var3.field_n = var5;
                      this.a(var3.field_j, var3);
                      break L2;
                    } else {
                      var3.field_n = 0;
                      this.a(var3);
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
              this.field_u = this.field_u + param0;
              this.c(param0);
              return;
            }
          } else {
            this.c(param0);
            return;
          }
        }
    }

    final synchronized void a(eb param0) {
        this.field_s.a(param0, 127);
    }

    private final void c(int[] param0, int param1, int param2) {
        eb var4 = (eb) ((Object) this.field_s.c(false));
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (eb) ((Object) this.field_s.a((byte) -70));
        }
    }

    final eb b() {
        return (eb) ((Object) this.field_s.c(false));
    }

    private final void a(mc param0, ln param1) {
        L0: while (true) {
          if (param0 != this.field_t.field_c) {
            if (((ln) ((Object) param0)).field_n <= param1.field_n) {
              param0 = param0.field_j;
              continue L0;
            } else {
              cl.a(param0, -71, param1);
              this.field_r = ((ln) ((Object) this.field_t.field_c.field_j)).field_n;
              return;
            }
          } else {
            cl.a(param0, -71, param1);
            this.field_r = ((ln) ((Object) this.field_t.field_c.field_j)).field_n;
            return;
          }
        }
    }

    private final void c(int param0) {
        eb var2 = (eb) ((Object) this.field_s.c(false));
        while (var2 != null) {
            var2.a(param0);
            var2 = (eb) ((Object) this.field_s.a((byte) -70));
        }
    }

    private final void a(ln param0) {
        param0.b(false);
        param0.a();
        mc var2 = this.field_t.field_c.field_j;
        if (var2 == this.field_t.field_c) {
            this.field_r = -1;
        } else {
            this.field_r = ((ln) ((Object) var2)).field_n;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        ln var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_r >= 0) {
            if (this.field_u + param2 >= this.field_r) {
              var4 = this.field_r - this.field_u;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_u = this.field_u + var4;
              this.e();
              var5 = (ln) ((Object) this.field_t.c(false));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((fg) (this));
                    if (var7 >= 0) {
                      var5.field_n = var7;
                      this.a(var5.field_j, var5);
                      break L2;
                    } else {
                      var5.field_n = 0;
                      this.a(var5);
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
              this.field_u = this.field_u + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final int a() {
        return 0;
    }

    private final void e() {
        ln var1 = null;
        if (this.field_u > 0) {
            var1 = (ln) ((Object) this.field_t.c(false));
            while (var1 != null) {
                var1.field_n = var1.field_n - this.field_u;
                var1 = (ln) ((Object) this.field_t.a((byte) -70));
            }
            this.field_r = this.field_r - this.field_u;
            this.field_u = 0;
        }
    }

    final eb c() {
        return (eb) ((Object) this.field_s.a((byte) -70));
    }

    public fg() {
        this.field_s = new je();
        this.field_t = new je();
        this.field_r = -1;
        this.field_u = 0;
    }
}
