/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends sg {
    private vn field_l;
    private vn field_m;
    private int field_k;
    private int field_n;

    private final void a(d param0) {
        param0.a(true);
        param0.a();
        pg var2 = this.field_m.field_e.field_b;
        if (var2 == this.field_m.field_e) {
            this.field_k = -1;
        } else {
            this.field_k = ((d) ((Object) var2)).field_g;
        }
    }

    final synchronized void a(sg param0) {
        param0.a(true);
    }

    final synchronized void b(sg param0) {
        this.field_l.a((pg) (param0), (byte) -58);
    }

    private final void c(int[] param0, int param1, int param2) {
        sg var4 = (sg) ((Object) this.field_l.b(12623));
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (sg) ((Object) this.field_l.a(0));
        }
    }

    final sg a() {
        return (sg) ((Object) this.field_l.b(12623));
    }

    private final void c(int param0) {
        sg var2 = (sg) ((Object) this.field_l.b(12623));
        while (var2 != null) {
            var2.a(param0);
            var2 = (sg) ((Object) this.field_l.a(0));
        }
    }

    final sg b() {
        return (sg) ((Object) this.field_l.a(0));
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        d var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_k >= 0) {
            if (this.field_n + param2 >= this.field_k) {
              var4 = this.field_k - this.field_n;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_n = this.field_n + var4;
              this.e();
              var5 = (d) ((Object) this.field_m.b(12623));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((m) (this));
                    if (var7 >= 0) {
                      var5.field_g = var7;
                      this.a(var5.field_b, var5);
                      break L2;
                    } else {
                      var5.field_g = 0;
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
              this.field_n = this.field_n + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final int c() {
        return 0;
    }

    private final void e() {
        d var1 = null;
        if (this.field_n > 0) {
            var1 = (d) ((Object) this.field_m.b(12623));
            while (var1 != null) {
                var1.field_g = var1.field_g - this.field_n;
                var1 = (d) ((Object) this.field_m.a(0));
            }
            this.field_k = this.field_k - this.field_n;
            this.field_n = 0;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        d var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_k >= 0) {
            if (this.field_n + param0 >= this.field_k) {
              var2 = this.field_k - this.field_n;
              this.c(var2);
              param0 = param0 - var2;
              this.field_n = this.field_n + var2;
              this.e();
              var3 = (d) ((Object) this.field_m.b(12623));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((m) (this));
                    if (var5 >= 0) {
                      var3.field_g = var5;
                      this.a(var3.field_b, var3);
                      break L2;
                    } else {
                      var3.field_g = 0;
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
              this.field_n = this.field_n + param0;
              this.c(param0);
              return;
            }
          } else {
            this.c(param0);
            return;
          }
        }
    }

    private final void a(pg param0, d param1) {
        L0: while (true) {
          if (param0 != this.field_m.field_e) {
            if (((d) ((Object) param0)).field_g <= param1.field_g) {
              param0 = param0.field_b;
              continue L0;
            } else {
              da.a(param0, 20, param1);
              this.field_k = ((d) ((Object) this.field_m.field_e.field_b)).field_g;
              return;
            }
          } else {
            da.a(param0, 20, param1);
            this.field_k = ((d) ((Object) this.field_m.field_e.field_b)).field_g;
            return;
          }
        }
    }

    public m() {
        this.field_l = new vn();
        this.field_m = new vn();
        this.field_k = -1;
        this.field_n = 0;
    }
}
