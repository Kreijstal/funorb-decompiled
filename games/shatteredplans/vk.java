/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends tn {
    private pf field_l;
    private pf field_o;
    private int field_m;
    private int field_n;

    final tn b() {
        return (tn) ((Object) this.field_l.d(0));
    }

    private final void e() {
        bm var1 = null;
        if (this.field_n > 0) {
            var1 = (bm) ((Object) this.field_o.d(0));
            while (var1 != null) {
                var1.field_h = var1.field_h - this.field_n;
                var1 = (bm) ((Object) this.field_o.a((byte) -71));
            }
            this.field_m = this.field_m - this.field_n;
            this.field_n = 0;
        }
    }

    final int a() {
        return 0;
    }

    private final void a(bm param0) {
        param0.b((byte) -122);
        param0.a();
        oh var2 = this.field_o.field_h.field_f;
        if (var2 == this.field_o.field_h) {
            this.field_m = -1;
        } else {
            this.field_m = ((bm) ((Object) var2)).field_h;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        bm var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_m >= 0) {
            if (this.field_n + param0 >= this.field_m) {
              var2 = this.field_m - this.field_n;
              this.d(var2);
              param0 = param0 - var2;
              this.field_n = this.field_n + var2;
              this.e();
              var3 = (bm) ((Object) this.field_o.d(0));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((vk) (this));
                    if (var5 >= 0) {
                      var3.field_h = var5;
                      this.a(var3.field_f, var3);
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
              this.field_n = this.field_n + param0;
              this.d(param0);
              return;
            }
          } else {
            this.d(param0);
            return;
          }
        }
    }

    final synchronized void a(tn param0) {
        this.field_l.a(param0, 0);
    }

    final tn d() {
        return (tn) ((Object) this.field_l.a((byte) -71));
    }

    private final void a(oh param0, bm param1) {
        L0: while (true) {
          if (param0 != this.field_o.field_h) {
            if (((bm) ((Object) param0)).field_h <= param1.field_h) {
              param0 = param0.field_f;
              continue L0;
            } else {
              wp.a((byte) -128, param1, param0);
              this.field_m = ((bm) ((Object) this.field_o.field_h.field_f)).field_h;
              return;
            }
          } else {
            wp.a((byte) -128, param1, param0);
            this.field_m = ((bm) ((Object) this.field_o.field_h.field_f)).field_h;
            return;
          }
        }
    }

    private final void d(int param0) {
        tn var2 = (tn) ((Object) this.field_l.d(0));
        while (var2 != null) {
            var2.a(param0);
            var2 = (tn) ((Object) this.field_l.a((byte) -71));
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        tn var4 = (tn) ((Object) this.field_l.d(0));
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (tn) ((Object) this.field_l.a((byte) -71));
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        bm var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_m >= 0) {
            if (this.field_n + param2 >= this.field_m) {
              var4 = this.field_m - this.field_n;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_n = this.field_n + var4;
              this.e();
              var5 = (bm) ((Object) this.field_o.d(0));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((vk) (this));
                    if (var7 >= 0) {
                      var5.field_h = var7;
                      this.a(var5.field_f, var5);
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

    public vk() {
        this.field_l = new pf();
        this.field_o = new pf();
        this.field_m = -1;
        this.field_n = 0;
    }
}
