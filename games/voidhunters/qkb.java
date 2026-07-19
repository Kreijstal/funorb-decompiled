/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qkb extends f {
    private ij field_h;
    private ij field_k;
    private int field_j;
    private int field_i;

    final int d() {
        return 0;
    }

    private final void e() {
        wka var1 = null;
        if (this.field_j > 0) {
            var1 = (wka) ((Object) this.field_k.d(0));
            while (var1 != null) {
                var1.field_d = var1.field_d - this.field_j;
                var1 = (wka) ((Object) this.field_k.a((byte) 59));
            }
            this.field_i = this.field_i - this.field_j;
            this.field_j = 0;
        }
    }

    final f a() {
        return (f) ((Object) this.field_h.a((byte) 111));
    }

    final f c() {
        return (f) ((Object) this.field_h.d(0));
    }

    private final void a(wka param0) {
        param0.b(-3846);
        param0.a();
        ksa var2 = this.field_k.field_a.field_c;
        if (var2 == this.field_k.field_a) {
            this.field_i = -1;
        } else {
            this.field_i = ((wka) ((Object) var2)).field_d;
        }
    }

    final synchronized void b(f param0) {
        this.field_h.a(param0, (byte) -55);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        wka var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_i >= 0) {
            if (this.field_j + param2 >= this.field_i) {
              var4 = this.field_i - this.field_j;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_j = this.field_j + var4;
              this.e();
              var5 = (wka) ((Object) this.field_k.d(0));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((qkb) (this));
                    if (var7 >= 0) {
                      var5.field_d = var7;
                      this.a(var5.field_c, var5);
                      break L2;
                    } else {
                      var5.field_d = 0;
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

    private final void c(int[] param0, int param1, int param2) {
        f var4 = (f) ((Object) this.field_h.d(0));
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (f) ((Object) this.field_h.a((byte) 60));
        }
    }

    final synchronized void a(f param0) {
        param0.b(-3846);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        wka var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_i >= 0) {
            if (this.field_j + param0 >= this.field_i) {
              var2 = this.field_i - this.field_j;
              this.c(var2);
              param0 = param0 - var2;
              this.field_j = this.field_j + var2;
              this.e();
              var3 = (wka) ((Object) this.field_k.d(0));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((qkb) (this));
                    if (var5 >= 0) {
                      var3.field_d = var5;
                      this.a(var3.field_c, var3);
                      break L2;
                    } else {
                      var3.field_d = 0;
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

    private final void c(int param0) {
        f var2 = (f) ((Object) this.field_h.d(0));
        while (var2 != null) {
            var2.a(param0);
            var2 = (f) ((Object) this.field_h.a((byte) 59));
        }
    }

    private final void a(ksa param0, wka param1) {
        L0: while (true) {
          if (param0 != this.field_k.field_a) {
            if (((wka) ((Object) param0)).field_d <= param1.field_d) {
              param0 = param0.field_c;
              continue L0;
            } else {
              al.a(param1, param0, 2);
              this.field_i = ((wka) ((Object) this.field_k.field_a.field_c)).field_d;
              return;
            }
          } else {
            al.a(param1, param0, 2);
            this.field_i = ((wka) ((Object) this.field_k.field_a.field_c)).field_d;
            return;
          }
        }
    }

    public qkb() {
        this.field_h = new ij();
        this.field_k = new ij();
        this.field_i = -1;
        this.field_j = 0;
    }
}
