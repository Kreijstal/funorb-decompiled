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
            this.field_k = ((rk) ((Object) var2)).field_f;
        }
    }

    final synchronized void a(di param0) {
        this.field_m.a(param0, 9);
    }

    private final void e() {
        rk var1 = null;
        if (this.field_j > 0) {
            var1 = (rk) ((Object) this.field_l.b((byte) -68));
            while (var1 != null) {
                var1.field_f = var1.field_f - this.field_j;
                var1 = (rk) ((Object) this.field_l.d(853));
            }
            this.field_k = this.field_k - this.field_j;
            this.field_j = 0;
        }
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        rk var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_k >= 0) {
            if (this.field_j + param0 >= this.field_k) {
              var2 = this.field_k - this.field_j;
              this.d(var2);
              param0 = param0 - var2;
              this.field_j = this.field_j + var2;
              this.e();
              var3 = (rk) ((Object) this.field_l.b((byte) 114));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((v) (this));
                    if (var5 >= 0) {
                      var3.field_f = var5;
                      this.a(var3.field_e, var3);
                      break L2;
                    } else {
                      var3.field_f = 0;
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
              this.field_j = this.field_j + param0;
              this.d(param0);
              return;
            }
          } else {
            this.d(param0);
            return;
          }
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        di var4 = (di) ((Object) this.field_m.b((byte) 120));
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (di) ((Object) this.field_m.d(853));
        }
    }

    final di d() {
        return (di) ((Object) this.field_m.d(853));
    }

    private final void a(ca param0, rk param1) {
        L0: while (true) {
          if (param0 != this.field_l.field_d) {
            if (((rk) ((Object) param0)).field_f <= param1.field_f) {
              param0 = param0.field_e;
              continue L0;
            } else {
              vk.a(param1, (byte) -65, param0);
              this.field_k = ((rk) ((Object) this.field_l.field_d.field_e)).field_f;
              return;
            }
          } else {
            vk.a(param1, (byte) -65, param0);
            this.field_k = ((rk) ((Object) this.field_l.field_d.field_e)).field_f;
            return;
          }
        }
    }

    final int c() {
        return 0;
    }

    private final void d(int param0) {
        di var2 = (di) ((Object) this.field_m.b((byte) 118));
        while (var2 != null) {
            var2.c(param0);
            var2 = (di) ((Object) this.field_m.d(853));
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        rk var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_k >= 0) {
            if (this.field_j + param2 >= this.field_k) {
              var4 = this.field_k - this.field_j;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_j = this.field_j + var4;
              this.e();
              var5 = (rk) ((Object) this.field_l.b((byte) 126));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((v) (this));
                    if (var7 >= 0) {
                      var5.field_f = var7;
                      this.a(var5.field_e, var5);
                      break L2;
                    } else {
                      var5.field_f = 0;
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
              this.field_j = this.field_j + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final di a() {
        return (di) ((Object) this.field_m.b((byte) 127));
    }

    public v() {
        this.field_m = new im();
        this.field_l = new im();
        this.field_j = 0;
        this.field_k = -1;
    }
}
