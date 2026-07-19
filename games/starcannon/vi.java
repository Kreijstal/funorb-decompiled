/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends c {
    private rk field_k;
    private rk field_j;
    private int field_m;
    private int field_l;

    final int b() {
        return 0;
    }

    final synchronized void a(c param0) {
        param0.b(4);
    }

    final void a(ud param0, int param1, int param2, int param3) {
        this.a(fj.a(param0, param1, param2), param3);
    }

    private final void d(int param0) {
        c var2 = (c) ((Object) this.field_k.c(-3905));
        while (var2 != null) {
            var2.a(param0);
            var2 = (c) ((Object) this.field_k.a(-16913));
        }
    }

    private final void a(c param0, int param1) {
        ed var1 = null;
        if (param1 > 0) {
            var1 = eg.a(29723, param1, param0);
        }
        this.b(var1);
    }

    final synchronized void a(oa param0) {
        if (param0.field_g != null) {
          if (param0.field_g != this) {
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

    final void a(ud param0, int param1, int param2) {
        this.b(fj.a(param0, param1, param2));
    }

    final c c() {
        return (c) ((Object) this.field_k.c(-3905));
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        oa var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_l >= 0) {
            if (this.field_m + param0 >= this.field_l) {
              var2 = this.field_l - this.field_m;
              this.d(var2);
              param0 = param0 - var2;
              this.field_m = this.field_m + var2;
              this.e();
              var3 = (oa) ((Object) this.field_j.c(-3905));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((vi) (this));
                    if (var5 >= 0) {
                      var3.field_f = var5;
                      this.a(var3.field_a, var3);
                      break L2;
                    } else {
                      var3.field_f = 0;
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
              this.field_m = this.field_m + param0;
              this.d(param0);
              return;
            }
          } else {
            this.d(param0);
            return;
          }
        }
    }

    final c a() {
        return (c) ((Object) this.field_k.a(-16913));
    }

    final synchronized void b(c param0) {
        this.field_k.a(-97, param0);
    }

    private final void c(int[] param0, int param1, int param2) {
        c var4 = (c) ((Object) this.field_k.c(-3905));
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (c) ((Object) this.field_k.a(-16913));
        }
    }

    final synchronized void b(oa param0) {
        if (param0.field_g != null) {
          throw new RuntimeException();
        } else {
          this.e();
          param0.field_g = (vi) (this);
          param0.b();
          this.a(this.field_j.field_c.field_a, param0);
          return;
        }
    }

    private final void c(oa param0) {
        param0.b(4);
        param0.a();
        param0.field_g = null;
        rf var2 = this.field_j.field_c.field_a;
        if (var2 == this.field_j.field_c) {
            this.field_l = -1;
        } else {
            this.field_l = ((oa) ((Object) var2)).field_f;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        oa var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_l >= 0) {
            if (this.field_m + param2 >= this.field_l) {
              var4 = this.field_l - this.field_m;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_m = this.field_m + var4;
              this.e();
              var5 = (oa) ((Object) this.field_j.c(-3905));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((vi) (this));
                    if (var7 >= 0) {
                      var5.field_f = var7;
                      this.a(var5.field_a, var5);
                      break L2;
                    } else {
                      var5.field_f = 0;
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
              this.field_m = this.field_m + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    private final void e() {
        oa var1 = null;
        if (this.field_m > 0) {
            var1 = (oa) ((Object) this.field_j.c(-3905));
            while (var1 != null) {
                var1.field_f = var1.field_f - this.field_m;
                var1 = (oa) ((Object) this.field_j.a(-16913));
            }
            this.field_l = this.field_l - this.field_m;
            this.field_m = 0;
        }
    }

    private final void a(rf param0, oa param1) {
        L0: while (true) {
          if (param0 != this.field_j.field_c) {
            if (((oa) ((Object) param0)).field_f <= param1.field_f) {
              param0 = param0.field_a;
              continue L0;
            } else {
              fe.a(param0, param1, false);
              this.field_l = ((oa) ((Object) this.field_j.field_c.field_a)).field_f;
              return;
            }
          } else {
            fe.a(param0, param1, false);
            this.field_l = ((oa) ((Object) this.field_j.field_c.field_a)).field_f;
            return;
          }
        }
    }

    public vi() {
        this.field_k = new rk();
        this.field_j = new rk();
        this.field_m = 0;
        this.field_l = -1;
    }
}
