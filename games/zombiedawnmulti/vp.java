/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp extends gq {
    private th field_l;
    private th field_k;
    private int field_j;
    private int field_m;

    final synchronized void a(int param0) {
        int var2 = 0;
        rc var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_m >= 0) {
            if (this.field_j + param0 >= this.field_m) {
              var2 = this.field_m - this.field_j;
              this.c(var2);
              param0 = param0 - var2;
              this.field_j = this.field_j + var2;
              this.e();
              var3 = (rc) ((Object) this.field_k.c(126));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((vp) (this));
                    if (var5 >= 0) {
                      var3.field_f = var5;
                      this.a(var3.field_d, var3);
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
              this.c(param0);
              return;
            }
          } else {
            this.c(param0);
            return;
          }
        }
    }

    private final void a(br param0, rc param1) {
        L0: while (true) {
          if (param0 != this.field_k.field_b) {
            if (((rc) ((Object) param0)).field_f <= param1.field_f) {
              param0 = param0.field_d;
              continue L0;
            } else {
              vc.a(param0, param1, true);
              this.field_m = ((rc) ((Object) this.field_k.field_b.field_d)).field_f;
              return;
            }
          } else {
            vc.a(param0, param1, true);
            this.field_m = ((rc) ((Object) this.field_k.field_b.field_d)).field_f;
            return;
          }
        }
    }

    final gq d() {
        return (gq) ((Object) this.field_l.b(6));
    }

    private final void a(rc param0) {
        param0.a(true);
        param0.a();
        br var2 = this.field_k.field_b.field_d;
        if (var2 == this.field_k.field_b) {
            this.field_m = -1;
        } else {
            this.field_m = ((rc) ((Object) var2)).field_f;
        }
    }

    final int a() {
        return 0;
    }

    final synchronized void b(gq param0) {
        this.field_l.a(-25612, param0);
    }

    final gq b() {
        return (gq) ((Object) this.field_l.c(44));
    }

    final synchronized void a(gq param0) {
        param0.a(true);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        rc var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_m >= 0) {
            if (this.field_j + param2 >= this.field_m) {
              var4 = this.field_m - this.field_j;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_j = this.field_j + var4;
              this.e();
              var5 = (rc) ((Object) this.field_k.c(84));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((vp) (this));
                    if (var7 >= 0) {
                      var5.field_f = var7;
                      this.a(var5.field_d, var5);
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

    private final void e() {
        rc var1 = null;
        if (this.field_j > 0) {
            var1 = (rc) ((Object) this.field_k.c(39));
            while (var1 != null) {
                var1.field_f = var1.field_f - this.field_j;
                var1 = (rc) ((Object) this.field_k.b(6));
            }
            this.field_m = this.field_m - this.field_j;
            this.field_j = 0;
        }
    }

    private final void c(int param0) {
        gq var2 = (gq) ((Object) this.field_l.c(67));
        while (var2 != null) {
            var2.a(param0);
            var2 = (gq) ((Object) this.field_l.b(6));
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        gq var4 = (gq) ((Object) this.field_l.c(97));
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (gq) ((Object) this.field_l.b(6));
        }
    }

    public vp() {
        this.field_l = new th();
        this.field_k = new th();
        this.field_j = 0;
        this.field_m = -1;
    }
}
