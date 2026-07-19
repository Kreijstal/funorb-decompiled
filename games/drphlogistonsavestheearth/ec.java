/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends ic {
    private vd field_o;
    private vd field_m;
    private int field_n;
    private int field_l;

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        ak var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_n >= 0) {
            if (this.field_l + param2 >= this.field_n) {
              var4 = this.field_n - this.field_l;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_l = this.field_l + var4;
              this.e();
              var5 = (ak) ((Object) this.field_m.h(-11151));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((ec) (this));
                    if (var7 >= 0) {
                      var5.field_h = var7;
                      this.a(var5.field_e, var5);
                      break L2;
                    } else {
                      var5.field_h = 0;
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
              this.field_l = this.field_l + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final ic c() {
        return (ic) ((Object) this.field_o.e(0));
    }

    final int d() {
        return 0;
    }

    final synchronized void a(ic param0) {
        this.field_o.a(79, param0);
    }

    private final void e() {
        ak var1 = null;
        if (this.field_l > 0) {
            var1 = (ak) ((Object) this.field_m.h(-11151));
            while (var1 != null) {
                var1.field_h = var1.field_h - this.field_l;
                var1 = (ak) ((Object) this.field_m.e(0));
            }
            this.field_n = this.field_n - this.field_l;
            this.field_l = 0;
        }
    }

    final ic a() {
        return (ic) ((Object) this.field_o.h(-11151));
    }

    private final void e(int param0) {
        ic var2 = (ic) ((Object) this.field_o.h(-11151));
        while (var2 != null) {
            var2.d(param0);
            var2 = (ic) ((Object) this.field_o.e(0));
        }
    }

    private final void a(ak param0) {
        param0.a(-16175);
        param0.a();
        gi var2 = this.field_m.field_c.field_e;
        if (var2 == this.field_m.field_c) {
            this.field_n = -1;
        } else {
            this.field_n = ((ak) ((Object) var2)).field_h;
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        ic var4 = (ic) ((Object) this.field_o.h(-11151));
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (ic) ((Object) this.field_o.e(0));
        }
    }

    final synchronized void b(ic param0) {
        param0.a(-16175);
    }

    private final void a(gi param0, ak param1) {
        L0: while (true) {
          if (param0 != this.field_m.field_c) {
            if (((ak) ((Object) param0)).field_h <= param1.field_h) {
              param0 = param0.field_e;
              continue L0;
            } else {
              tf.a(param1, 16709, param0);
              this.field_n = ((ak) ((Object) this.field_m.field_c.field_e)).field_h;
              return;
            }
          } else {
            tf.a(param1, 16709, param0);
            this.field_n = ((ak) ((Object) this.field_m.field_c.field_e)).field_h;
            return;
          }
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        ak var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_n >= 0) {
            if (this.field_l + param0 >= this.field_n) {
              var2 = this.field_n - this.field_l;
              this.e(var2);
              param0 = param0 - var2;
              this.field_l = this.field_l + var2;
              this.e();
              var3 = (ak) ((Object) this.field_m.h(-11151));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((ec) (this));
                    if (var5 >= 0) {
                      var3.field_h = var5;
                      this.a(var3.field_e, var3);
                      break L2;
                    } else {
                      var3.field_h = 0;
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
              this.field_l = this.field_l + param0;
              this.e(param0);
              return;
            }
          } else {
            this.e(param0);
            return;
          }
        }
    }

    public ec() {
        this.field_o = new vd();
        this.field_m = new vd();
        this.field_n = -1;
        this.field_l = 0;
    }
}
